package practice7;

public class ProcessStrings implements StringInterface {

  @Override
  public int countChars(String text) {
    return text.length();
  }

  @Override
  public String oddChars(String text) {
    String result = "";
    for (int i = 0; i < text.length(); i += 2) {
      result += text.charAt(i);
    }
    return result;
  }

  @Override
  public String reverse(String text) {
    String result = "";
    for (int i = text.length() - 1; i >= 0; i--) {
      result += text.charAt(i);
    }
    return result;
  }

}
