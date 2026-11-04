package block4.practice19;

import java.util.Scanner;

public class LabClassUI {
  private MenuItem[] items;
  private Scanner sc = new Scanner(System.in);

  public LabClassUI(Student[] students) {
    LabClass labclass = new LabClass(students);
    this.items = new MenuItem[] { new PrintItem(labclass), new SortItem(labclass), new FindItem(labclass, sc) };
  }

  private void printMenu() {
    int j = 0;
    for (MenuItem item : items) {
      j++;
      System.out.println(j + ". " + item.getName());
    }
    System.out.println("0. Exit");
  }

  public void run() {
    while (true) {
      printMenu();
      try {
        int i = Integer.parseInt(sc.nextLine());
        if (i == 0) {
          break;
        }
        items[i - 1].execute();
      } catch (StudentNotFoundException | EmptyStringException e) {
        System.err.println(e.getMessage());
      } catch (NumberFormatException e) {
        System.err.println("Enter an integer");
      } catch (ArrayIndexOutOfBoundsException ex) {
        System.err.println("Number out of range");
      }
    }

  }

}
