import java.util.ArrayDeque;

public class Brackets {
  static char[] OPEN = {'(', '[', '{'};
  static char[] CLOSE = {')', ']', '}'};

  static boolean isOpen(char c) {
    for (char open : OPEN) {
      if (c == open) {
        return true;
      }
    }
    return false;
  }

  static boolean isClose(char c) {
    for (char close : CLOSE) {
      if (c == close) {
        return true;
      }
    }
    return false;
  }

  static boolean isPair(char open, char close) {
    for (int i = 0; i < CLOSE.length; i++) {
      if (open == OPEN[i] && close == CLOSE[i]) {
        return true;
      }
    }
    return false;
  }

  static boolean isBalanced(String s) {
    ArrayDeque<Character> stack = new ArrayDeque<>();
    for (char c : s.toCharArray()) {
      if (isOpen(c)) {
        stack.push(c);
      } else if (isClose(c)) {
        if (stack.isEmpty() || !isPair(stack.pop(), c)) {
          return false;
        }
      }
    }

    return stack.isEmpty();
  }

  public static void main(String[] args) {
    String[] in = {"", "()", "([]{})", "([)]", "((", "))((", "a(b[c]d)e", "}", "{[()()]}"};
    boolean[] exp = {true, true, true, false, false, false, true, false, true};
    for (int i = 0; i < in.length; i++) {
      boolean got = isBalanced(in[i]);
      System.out.printf(
          "%-12s ожидаю %-5b получил %-5b %s%n",
          "\"" + in[i] + "\"", exp[i], got, got == exp[i] ? "OK" : "<-- ОШИБКА");
    }
  }
}
