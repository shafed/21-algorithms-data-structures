package practice10;

import java.util.Comparator;

public class SortingStudentsByGPA {
  private Student[] iDNumber;
  private final Comparator<Student> comparator;

  public SortingStudentsByGPA(Comparator<Student> comparator) {
    this.comparator = comparator;
  }

  public void quickSort(Student[] students, int left, int right) {
    if (left >= right) {
      return;
    }
    Student pivot = students[right];
    int boundary = left;
    for (int i = left; i < right; i++) {
      if (comparator.compare(students[i], pivot) < 0) {
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

  public void merge(Student[] students, int left, int mid, int right) {
    int n1 = mid - left + 1;
    int n2 = right - mid;
    Student[] L = new Student[n1];
    Student[] R = new Student[n2];

    for (int i = 0; i < n1; i++) {
      L[i] = students[left + i];
    }
    for (int j = 0; j < n2; j++) {
      R[j] = students[mid + 1 + j];
    }

    int i = 0;
    int j = 0;
    int k = left;

    while (i < n1 && j < n2) {
      if (comparator.compare(L[i], R[j]) <= 0) {
        students[k] = L[i];
        i++;
      } else {
        students[k] = R[j];
        j++;
      }
      k++;
    }

    while (i < n1) {
      students[k] = L[i];
      i++;
      k++;
    }

    while (j < n2) {
      students[k] = R[j];
      j++;
      k++;
    }

  }

  public void mergeSort(Student[] students, int left, int right) {
    if (left >= right)
      return;
    int mid = (right + left) / 2;
    mergeSort(students, left, mid);
    mergeSort(students, mid + 1, right);
    merge(students, left, mid, right);

  }

  public void setArray() {
    iDNumber = new Student[5];
    iDNumber[0] = new Student("Максим", "Попов", "ИВТ", 2, "КВБО-11-25", 4.5);
    iDNumber[1] = new Student("Денис", "Хамидуллин", "ИВТ", 2, "КВБО-11-25", 3.8);
    iDNumber[2] = new Student("Эдмон", "Гарибян", "ИВТ", 2, "КВБО-11-25", 4.9);
    iDNumber[3] = new Student("Леонид", "Васильев", "ИВТ", 2, "КВБО-11-25", 4.1);
    iDNumber[4] = new Student("Олег", "Карановский", "ИВТ", 2, "КВБО-11-25", 4.3);
  }

  public void outArray(Student[] students) {
    for (Student student : students) {
      System.out.println(student);
    }
  }

  public static void main(String[] args) {
    SortingStudentsByGPA sorter = new SortingStudentsByGPA(new GpaComparator());
    SortingStudentsByGPA sorter2 = new SortingStudentsByGPA(new SurnameComparator());

    sorter.setArray();

    System.out.println("Before sorting:");
    sorter.outArray(sorter.iDNumber);

    sorter.mergeSort(sorter.iDNumber, 0, sorter.iDNumber.length - 1);

    System.out.println("\nAfter sorting (by GPA, descending):");
    sorter.outArray(sorter.iDNumber);

    sorter2.setArray();
    sorter2.quickSort(sorter2.iDNumber, 0, sorter2.iDNumber.length - 1);
    System.out.println("\nAfter sorting (by surname):");
    sorter2.outArray(sorter2.iDNumber);
  }

}
