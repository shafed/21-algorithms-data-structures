package block2.practice8;

import java.util.Scanner;

public class Task11 {
  private static Scanner sc = new Scanner(System.in);

  public static int countOnes() {
    int n = sc.nextInt();
    if (n == 1) {
      return 1 + countOnes();
    } else if (n > 1) {
      return countOnes();
    } else { // n == 0
      int m = sc.nextInt();
      if (m == 1) {
        return 1 + countOnes();
      } else if (m > 1) {
        return countOnes();
      } else { // m == 0
        return 0;
      }
    }

  }

  public static void main(String[] args) {
    System.out.println(countOnes());
  }

}
