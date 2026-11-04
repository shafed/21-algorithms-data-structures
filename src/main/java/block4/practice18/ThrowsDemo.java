package block4.practice18;

import java.util.Scanner;

public class ThrowsDemo {
  public static void main(String[] args) {
    ThrowsDemo demo = new ThrowsDemo();
    demo.getKey();
  }

  public void getKey() {
    Scanner myScanner = new Scanner(System.in);
    while (true) {
      String key = myScanner.nextLine();
      try {
        printDetails(key);
        break;
      } catch (Exception e) {
        System.err.println("Key set to empty string");
      }
    }
  }

  public void printDetails(String key) throws Exception {
    String message = getDetails(key);
    System.out.println(message);
  }

  private String getDetails(String key) throws Exception {
    if (key.equals("")) {
      throw new Exception("Key set to empty string");
    }
    return "data for " + key;
  }
}
