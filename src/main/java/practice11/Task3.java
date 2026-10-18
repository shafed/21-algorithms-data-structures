package practice11;

import java.util.Calendar;

public class Task3 {
  public static void main(String[] args) {
    Calendar calendar = Calendar.getInstance();
    calendar.set(2007, Calendar.MARCH, 15);

    Student student = new Student("Cool", "Me", calendar.getTime());
    System.out.println(student);
    System.out.println("Short: " + student.formatDate("dd.MM.yy"));
    System.out.println("Medium: " + student.formatDate("dd MMM yyyy"));
    System.out.println("Full: " + student.formatDate("EEEE, dd MMMM yyyy"));
  }
}
