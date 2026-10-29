package block2.practice11;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Student {
  private String firstname;
  private String surname;
  private Date birthDate;

  public Student(String firstname, String surname, Date birthDate) {
    this.firstname = firstname;
    this.surname = surname;
    this.birthDate = birthDate;
  }

  public String formatDate(String format) {
    SimpleDateFormat formatter = new SimpleDateFormat(format);
    return formatter.format(birthDate);

  }

  @Override
  public String toString() {
    return surname + " " + firstname
        + ", birth date: " + formatDate("dd.MM.yyyy");
  }
}
