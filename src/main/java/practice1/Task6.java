package practice1;

public class Task6 {

  public static void main(String[] args) {
    System.out.printf("%3s %12s %12s%n", "n", "1/n", "H(n)");

    double sum = 0.0;
    for (int n = 1; n <= 10; n++) {
      double term = 1.0 / n;
      sum += term;
      System.out.printf("%3d %12.6f %12.6f%n", n, term, sum);
    }
  }
}
