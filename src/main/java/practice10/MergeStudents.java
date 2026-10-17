package practice10;

public class MergeStudents {
  public static void main(String[] args) {
    Student[] first = {
        new Student("Максим", "Попов", "ИВТ", 2, "КВБО-11-25", 4.5),
        new Student("Эдмон", "Гарибян", "ИВТ", 2, "КВБО-11-25", 4.9),
        new Student("Леонид", "Васильев", "ИВТ", 2, "КВБО-11-25", 4.1)
    };

    Student[] second = {
        new Student("Денис", "Хамидуллин", "ИВТ", 2, "КВБО-11-25", 3.8),
        new Student("Олег", "Карановский", "ИВТ", 2, "КВБО-11-25", 4.3)
    };

    SortingStudentsByGPA sorter = new SortingStudentsByGPA(new GpaComparator());

    Student[] merged = new Student[first.length + second.length];
    for (int i = 0; i < first.length; i++) {
      merged[i] = first[i];
    }
    for (int i = first.length; i < merged.length; i++) {
      merged[i] = second[i - first.length];
    }

    sorter.mergeSort(merged, 0, merged.length - 1);

    System.out.println("First list:");
    sorter.outArray(first);

    System.out.println("\nSecond list:");
    sorter.outArray(second);

    System.out.println("\nMerged and sorted:");
    sorter.outArray(merged);

  }
}
