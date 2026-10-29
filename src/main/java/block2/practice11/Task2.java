package block2.practice11;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Scanner;
import java.util.Date;

public class Task2 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    String input = sc.nextLine();
    System.out.println(input);
    SimpleDateFormat format = new SimpleDateFormat("dd.MM.yyyy HH:mm");
    Date inputedTime;
    try {

      inputedTime = format.parse(input);
    } catch (ParseException e) {
      System.out.println("Invalid date");
      return;

    }
    Date currentTime = new Date();

    if (inputedTime.before(currentTime)) {
      System.out.println("inputedTime before currentTime");
    } else if (inputedTime.after(currentTime)) {
      System.out.println("inputedTime after currentTime");
    } else {
      System.out.println("dates are equal");
    }

  }

}
