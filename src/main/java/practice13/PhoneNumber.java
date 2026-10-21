package practice13;

public class PhoneNumber {
  public String format(String number) {
    if (number.startsWith("8")) {
      number = "+7" + number.substring(1);
    }
    int codeEnd = number.length() - 10;
    String code = number.substring(0, codeEnd);
    String rest = number.substring(codeEnd);
    String formatted = code + rest.substring(0, 3) + "-" + rest.substring(3, 6) + "-" + rest.substring(6, 10);
    return formatted;
  }

  public static void main(String[] args) {
    PhoneNumber phone = new PhoneNumber();
    System.out.println(phone.format("89175655655"));
    System.out.println(phone.format("+79175655655"));
    System.out.println(phone.format("+104289652211"));
  }

}
