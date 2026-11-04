package block4.practice18;

import java.util.Scanner;

public class Exception2 {
  public static void main(String[] args) {
    Exception2 ex = new Exception2();
    ex.exceptionDemo();
  }

  public void exceptionDemo() {
    Scanner myScanner = new Scanner(System.in);
    System.out.print("Enter an integer ");
    String intString = myScanner.next();
    try {
      int i = Integer.parseInt(intString);
      System.out.println(2 / i);
    } catch (NumberFormatException e) {
      System.err.println("Not an integer");
    } catch (ArithmeticException e) {
      System.err.println("Division by zero");
    } finally {
      System.out.println("It is a good program!");
    }
  }
}
