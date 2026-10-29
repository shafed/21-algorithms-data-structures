package block2.practice14;

import java.util.regex.Pattern;

public class Task1 {
  public static void main(String[] args) {
    String input = "apple,pear;plum";
    Pattern sep = Pattern.compile("[,;]\\s*");
    for (String i : sep.split(input)) {
      System.out.println(i);

    }
  }

}
