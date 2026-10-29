package block2.practice14;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Task3 {
  public static void main(String[] args) {
    String s = "Prices: 25.98 USD, 150.00 RUB, 12.50 EU, 44 ERR, 0.004 EU, 25.98 USDollar";
    Pattern pat = Pattern.compile("(?<![\\w.])\\d+\\.\\d{1,2}\\s(USD|RUB|EU)(?!\\w)");
    Matcher match = pat.matcher(s);
    while (match.find()) {
      System.out.println(match.group());
    }

  }

}
