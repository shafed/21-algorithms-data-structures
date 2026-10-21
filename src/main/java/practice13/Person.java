package practice13;

public class Person {
  private String surname;
  private String firstName;
  private String patronymic;

  public Person(String surname, String firstName, String patronymic) {
    this.surname = surname;
    this.firstName = firstName;
    this.patronymic = patronymic;
  }

  public String getFullName() {
    StringBuilder fullName = new StringBuilder(surname);
    if (!firstName.isEmpty() || !patronymic.isEmpty())
      fullName.append(' ');
    if (!firstName.isEmpty())
      fullName.append(firstName.charAt(0)).append('.');

    if (!patronymic.isEmpty())
      fullName.append(patronymic.charAt(0)).append('.');
    return fullName.toString();
  }

  public static void main(String[] args) {
    Person person = new Person("Шапаренко", "Фёдор", "Александрович");
    System.out.println(person.getFullName());

  }

}
