package block4.practice19;

public class LabClassDriver {
  public static void main(String[] args) throws EmptyStringException {
    Student[] students = {
        new Student("Попов Максим", 4.5),
        new Student("Хамидуллин Денис", 3.8),
        new Student("Гарибян Эдмон", 4.9),
        new Student("Васильев Леонид", 4.1),
        new Student("Карановский Олег", 4.3)
    };
    LabClassUI ui = new LabClassUI(students);
    ui.run();
  }
}
