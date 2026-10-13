package practice9;

import java.util.Comparator;

public class SortingStudentsByGPA implements Comparator<Student> {

  @Override
  public int compare(Student a, Student b) {
    if (a.getScore() > b.getScore())
      return -1;
    if (a.getScore() < b.getScore())
      return 1;
    return 0;
  }

  public void quickSort(Student[] students, int left, int right) {
    if (left >= right) {
      return;
    }
    Student pivot = students[right];
    int boundary = left;
    for (int i = left; i < right; i++) {
      if (compare(students[i], pivot) == -1) {
        Student temp = students[i];
        students[i] = students[boundary];
        students[boundary] = temp;
        boundary++;
      }
    }

    Student temp = students[right];
    students[right] = students[boundary];
    students[boundary] = temp;

    quickSort(students, left, boundary - 1);
    quickSort(students, boundary + 1, right);
  }
}
