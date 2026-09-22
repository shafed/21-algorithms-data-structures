package practice1;

import java.util.Scanner;

public class Task4 {

  public static void main(String[] args) {
    int[] numbers = new int[10];

    Scanner sc = new Scanner(System.in);
    for (int i = 0; i < numbers.length; i++) {
      System.out.print("Введите число " + (i + 1) + " из " + numbers.length + ": ");
      numbers[i] = sc.nextInt();
    }
    sc.close();

    int sumWhile = 0;
    int i = 0;
    while (i < numbers.length) {
      sumWhile += numbers[i];
      i++;
    }

    int sumDoWhile = 0;
    int j = 0;
    do {
      sumDoWhile += numbers[j];
      j++;
    } while (j < numbers.length);

    int max = numbers[0];
    int min = numbers[0];
    for (int k = 1; k < numbers.length; k++) {
      if (numbers[k] > max) {
        max = numbers[k];
      }
      if (numbers[k] < min) {
        min = numbers[k];
      }
    }

    System.out.println("Сумма (while): " + sumWhile);
    System.out.println("Сумма (do while): " + sumDoWhile);
    System.out.println("Максимум: " + max);
    System.out.println("Минимум: " + min);
  }
}
