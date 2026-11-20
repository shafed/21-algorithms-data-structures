package block5.practice22;

import java.util.ArrayDeque;

public class RPN {

  public static double calculate(double a, double b, char operator) {
    if (operator == '/' && a == 0) {
      throw new ArithmeticException("Деление на ноль");
    }

    return switch (operator) {
      case '+' -> b + a;
      case '-' -> b - a;
      case '*' -> b * a;
      case '/' -> b / a;
      default -> throw new IllegalArgumentException("Неизвестный оператор: " + operator);
    };
  }

  public static double evaluate(String expression) {
    if (expression == null || expression.trim().isEmpty()) {
      throw new IllegalArgumentException("Пустое выражение");
    }

    ArrayDeque<Double> stack = new ArrayDeque<>();
    for (String s : expression.trim().split("\\s+")) {
      // современный switch-case
      switch (s) {
        case "+", "-", "*", "/" -> {
          if (stack.size() < 2) {
            throw new IllegalArgumentException("Для оператора `" + s + "` не хватает операндов");
          }
          double a = stack.pop();
          double b = stack.pop();
          stack.push(calculate(a, b, s.charAt(0)));
        }
        default -> {
          try {
            stack.push(Double.parseDouble(s));
          } catch (NumberFormatException e) {
            throw new IllegalArgumentException("Ожидалось число или оператор");
          }
        }
      }
    }

    if (stack.size() > 1) {
      throw new IllegalStateException("В выражении остались лишние числа");
    }
    return stack.pop();
  }

  public static void main(String[] args) {
    String[] expressions = {
      "7",
      "2 3 +",
      "2 3 -",
      "2 3 *",
      "8 2 /",
      "2 3 * 4 5 * +",
      "-2.5 4 *",
      "  2   3\t+  ",
      null,
      "",
      "   ",
      "1 abc +",
      "2 3 %",
      "2 0 /",
      "2 -0.0 /",
      "2 3",
      "1 2 + *",
      "+"
    };
    for (String expression : expressions) {
      try {
        System.out.println("\"" + expression + "\" = " + evaluate(expression));
      } catch (RuntimeException e) { // ловит все три исключения
        System.err.println("\"" + expression + "\" — ошибка: " + e.getMessage());
      }
    }
  }
}
