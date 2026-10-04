package practice7;

public class Task4 {
  public static void main(String[] args) {
    MathCalculable calculate = new MathFunc();
    MathFunc func = new MathFunc();

    System.out.println(calculate.pow(2, 3));
    System.out.println(calculate.modulus(3, 4));
    System.out.println(func.circleLen(1));
  }
}
