package practice1;

public class Task3 {

  public static void main(String[] args) {
    int[] b = {4, 8, 15, 16, 23, 42, -7, 0, 11, 5};

    int sum = 0;
    for (int i = 0; i < b.length; i++) {
      sum += b[i];
    }
    double avg = (double) sum / b.length;

    System.out.println("Сумма элементов: " + sum);
    System.out.println("Среднее арифметическое: " + avg);
  }
}
