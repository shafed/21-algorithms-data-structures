package practice11;

import java.util.Calendar;
import java.util.Date;
import java.util.Scanner;

public class Task4 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int year = sc.nextInt();
    int month = sc.nextInt();
    int day = sc.nextInt();
    int hour = sc.nextInt();
    int minute = sc.nextInt();

    Calendar cal = Calendar.getInstance();
    cal.set(year, month - 1, day, hour, minute);
    Date date = cal.getTime();
    System.out.println(date);

  }

}
