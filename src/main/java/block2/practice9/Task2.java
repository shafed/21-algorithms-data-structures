package block2.practice9;

public class Task2 {
  public static void main(String[] args) {
    Student[] students = {
        new Student(30, 85),
        new Student(10, 92),
        new Student(20, 78),
        new Student(40, 92)
    };

    System.out.println("Before sorting");
    for (Student student : students) {
      System.out.println(student);
    }

    SortingStudentsByGPA sorter = new SortingStudentsByGPA();
    sorter.quickSort(students, 0, students.length - 1);

    System.out.println("After sorting");
    for (Student student : students) {
      System.out.println(student);
    }
  }
}
