package block4.practice19;

public class LabClass {
  private Student[] students;

  public LabClass(Student[] students) {
    this.students = students;
  }

  public Student findStudent(String studentToFind) throws StudentNotFoundException, EmptyStringException {
    if (studentToFind.equals("")) {
      throw new EmptyStringException("Empty String");
    }

    for (Student student : students) {
      if (studentToFind.equals(student.getFullName())) {
        return student;
      }
    }

    throw new StudentNotFoundException("Student Not Found");
  }

  public void printStudents() {
    for (Student student : students) {
      System.out.println(student);
    }
  }

  public void sortByGpa() {
    quickSort(0, students.length - 1);
  }

  private void quickSort(int left, int right) {
    if (left >= right) {
      return;
    }
    Student pivot = students[right];
    int boundary = left;
    for (int i = left; i < right; i++) {
      if (students[i].getGpa() > pivot.getGpa()) {
        Student temp = students[i];
        students[i] = students[boundary];
        students[boundary] = temp;
        boundary++;
      }
    }

    Student temp = students[right];
    students[right] = students[boundary];
    students[boundary] = temp;

    quickSort(left, boundary - 1);
    quickSort(boundary + 1, right);
  }
}
