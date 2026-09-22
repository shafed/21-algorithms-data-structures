package practice1;

import java.util.Scanner;

public class Task4 {

  public static void main(String[] args) {
    int[] b = new int[10];

    Scanner sc = new Scanner(System.in);
    for (int i = 0; i < b.length; i++) {
      System.out.print("Введите число: ");
      b[i] = sc.nextInt();
    }
    sc.close();

    int sumWhile = 0;
    int i = 0;
    while (i < b.length) {
      sumWhile += b[i];
      i++;
    }

    int sumDoWhile = 0;
    int j = 0;
    do {
      sumDoWhile += b[j];
      j++;
    } while (j < b.length);

    int max = b[0];
    int min = b[0];
    for (int k = 1; k < b.length; k++) {
      if (b[k] > max) {
        max = b[k];
      }
      if (b[k] < min) {
        min = b[k];
      }
    }

    System.out.println("Сумма (while): " + sumWhile);
    System.out.println("Сумма (do while): " + sumDoWhile);
    System.out.println("Максимум: " + max);
    System.out.println("Минимум: " + min);
  }
}
