package practice14;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Task7 {
  public static void main(String[] args) {
    String[] strings = { "F032_Password", "TrySpy12", "smart_pass", "A007" };
    Pattern pat = Pattern.compile("(?=.*[0-9])(?=.*[A-Z])(?=.*[a-z])\\w{8,}");
    for (String s : strings) {
      Matcher match = pat.matcher(s);
      System.out.println(s + ": " + match.matches());
    }
  }

}
