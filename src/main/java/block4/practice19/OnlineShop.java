package block4.practice19;

import java.util.Scanner;

public class OnlineShop {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.print("Enter your full name: ");
    String fullName = sc.nextLine();
    System.out.println();
    System.out.print("Enter your INN: ");
    String inn = sc.nextLine();
    try {
      checkINN(inn);
      System.out.println("Order placed successfully for " + fullName);
    } catch (InvalidINNException e) {
      System.err.println(e.getMessage());
    }
  }

  public static void checkINN(String inn) throws InvalidINNException {
    if (inn.length() != 12) {
      throw new InvalidINNException("Invalid length of INN");
    }
    for (int i = 0; i < inn.length(); i++) {
      char c = inn.charAt(i);
      if (c < '0' || c > '9') {
        throw new InvalidINNException("Invalid INN");
      }
    }

    // Проверка 11-ой цифры
    int[] w11 = { 7, 2, 4, 10, 3, 5, 9, 4, 6, 8 };
    int sum = 0;
    for (int i = 0; i < w11.length; i++) {
      int digit = inn.charAt(i) - '0';
      sum += digit * w11[i];
    }
    int checkDigit = sum % 11 % 10;
    int actualDigit = inn.charAt(10) - '0';
    if (checkDigit != actualDigit) {
      throw new InvalidINNException("Invalid INN checksum");
    }

    // Проверка 12-ой цифры
    int[] w12 = { 3, 7, 2, 4, 10, 3, 5, 9, 4, 6, 8 };
    sum = 0;
    for (int i = 0; i < w12.length; i++) {
      int digit = inn.charAt(i) - '0';
      sum += digit * w12[i];
    }
    checkDigit = sum % 11 % 10;
    actualDigit = inn.charAt(11) - '0';
    if (checkDigit != actualDigit) {
      throw new InvalidINNException("Invalid INN checksum");
    }
  }
}
