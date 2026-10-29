package block2.practice8;

public class Task10 {

  public static int factor(int n) {
    if (n < 10) {
      return 1;
    }
    return 10 * factor(n / 10);

  }

  public static int reverse(int n) {
    if (n < 10) {
      return n;
    }

    return factor(n) * (n % 10) + reverse(n / 10);
  }

  public static void main(String[] args) {
    System.out.println(reverse(1234));
  }

}
