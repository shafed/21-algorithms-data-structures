package block2.practice8;

import java.util.Scanner;

public class Task12 {
  private static Scanner sc = new Scanner(System.in);

  public static void printOdd() {

    int n = sc.nextInt();
    if (n == 0) {
      return;
    }

    if (n % 2 != 0) {
      System.out.println(n);
    }
    printOdd();

  }

  public static void main(String[] args) {
    printOdd();
  }

}
