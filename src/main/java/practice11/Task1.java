package practice11;

import java.util.Calendar;
import java.util.Date;

public class Task1 {
  public static void main(String[] args) {
    String surname = "Шапаренко";
    Calendar cal = Calendar.getInstance();
    cal.set(2026, Calendar.OCTOBER, 18, 14, 19, 0);
    Date startedAt = cal.getTime();
    Date submittedAt = new Date();

    System.out.println("Фамилия разработчика: " + surname + "\nВремя получения задания: " + startedAt
        + "\nВремя сдачи задания: " + submittedAt);

  }
}
