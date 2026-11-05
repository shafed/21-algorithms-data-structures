package block4.practice20;

public class Calculator {
  public static <T extends Number, V extends Number> double sum(T a, V b) {
    return a.doubleValue() + b.doubleValue();
  }

  public static <T extends Number, V extends Number> double multiply(T a, V b) {
    return a.doubleValue() * b.doubleValue();
  }

  public static <T extends Number, V extends Number> double divide(T a, V b) {
    if (b.doubleValue() == 0) {
      throw new ArithmeticException("Division by zero");
    }

    return a.doubleValue() / b.doubleValue();
  }

  public static <T extends Number, V extends Number> double subtraction(T a, V b) {
    return a.doubleValue() - b.doubleValue();
  }

  public static void main(String[] args) {
    Integer a = 10;
    Double b = 2.5;
    System.out.println("Sum: " + sum(a, b));
    System.out.println("Product: " + multiply(a, b));
    System.out.println("Quotient: " + divide(a, b));
    System.out.println("Difference: " + subtraction(a, b));

    try {
      System.out.println(divide(a, 0));
    } catch (ArithmeticException e) {
      System.out.println(e.getMessage());
    }
  }

}
