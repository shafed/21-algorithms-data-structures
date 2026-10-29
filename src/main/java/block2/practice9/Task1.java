package block2.practice9;

public class Task1 {
  public static void main(String[] args) {

    Student[] students = {
        new Student(30, 85),
        new Student(10, 92),
        new Student(20, 78)
    };

    System.out.println("Before sorting");
    for (Student student : students) {
      System.out.println(student);
    }

    System.out.println("After sorting");
    for (int i = 1; i < students.length; i++) {
      Student key = students[i];
      int j = i - 1;
      while (j >= 0 && students[j].compareTo(key) == 1) {
        students[j + 1] = students[j];
        j = j - 1;

      }
      students[j + 1] = key;

    }

    for (Student student : students) {
      System.out.println(student);
    }
  }
}
