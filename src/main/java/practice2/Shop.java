package practice2;

import java.nio.file.CopyOption;
import java.util.Scanner;

interface ShopInterface {
  void addComputer(Computer computer);

  void deleteComputer(String brandToDelete);

  void findComputer(String searchBrand);
}

public class Shop implements ShopInterface {
  private int count;
  private Computer[] computers;

  public Shop(int len) {
    this.count = 0;
    this.computers = new Computer[len];
  }

  @Override
  public void addComputer(Computer computer) {
    if (count < computers.length) {
      computers[count] = computer;
      count++;
    }
  }

  @Override
  public void deleteComputer(String brandToDelete) {
    int computerToDelete = -1;
    for (int i = 0; i < count; i++) {
      if (brandToDelete.equals(computers[i].getBrand())) {
        computerToDelete = i;
        System.out.println("The computer " + computers[i].getBrand() + " was deleted");
        break;
      }
    }

    if (computerToDelete != -1) {
      for (int i = computerToDelete; i < count - 1; i++) {
        computers[i] = computers[i + 1];
      }
      computers[count - 1] = null;
      count--;
    } else
      System.out.println("We coulnd't find computer to delete");

  }

  @Override
  public void findComputer(String searchBrand) {
    boolean found = false;
    for (int i = 0; i < count; i++) {
      if (computers[i].getBrand().equals(searchBrand)) {
        System.out.println("We found " + computers[i]);
        found = true;
      }
    }
    if (!found) {
      System.out.println("We couldn't find computer " + searchBrand);
    }
  }

  public void printComputers() {
    if (count == 0) {
      System.out.println("Shop is empty");
    }
    for (int i = 0; i < count; i++) {
      System.out.println(i + 1 + ": " + computers[i]);
    }
  }

  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    System.out.print("Type len of shop: ");
    int len = scanner.nextInt();
    scanner.nextLine();

    Shop shop = new Shop(len);

    for (int i = 0; i < len; i++) {
      System.out.print("Enter the brand of computer " + (i + 1) + ": ");
      String brand = scanner.nextLine();
      System.out.print("Enter the price of computer " + (i + 1) + ": ");
      int price = scanner.nextInt();
      scanner.nextLine();
      Computer computer = new Computer(price, brand);
      shop.addComputer(computer);
    }

    shop.printComputers();

    System.out.print("What computer do you want find? ");
    String searchBrand = scanner.nextLine();
    shop.findComputer(searchBrand);

    System.out.print("What computer do you want delete from list? ");
    String brandToDelete = scanner.nextLine();
    shop.deleteComputer(brandToDelete);

    shop.printComputers();

  }

}
