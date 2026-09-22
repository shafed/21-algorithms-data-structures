package practice1;

public class Task7 {

  public static long factorial(int n) {
    if (n < 0) {
      return -1;
    }
    long result = 1;
    for (int i = 2; i <= n; i++) {
      result *= i;
    }
    return result;
  }

  public static void main(String[] args) {
    int[] b = { 0, 1, 5, 10, 20, -1 };

    for (int i = 0; i < b.length; i++) {
      int n = b[i];
      if (factorial(n) == -1) {
        System.out.println("Факториал определён только для n >= 0");
      } else {
        System.out.println(n + "! = " + factorial(n));
      }
    }
  }
}
