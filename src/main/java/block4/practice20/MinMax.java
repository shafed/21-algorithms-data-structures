package block4.practice20;

public class MinMax<T extends Comparable<T>> {
  private T[] array;

  public MinMax(T[] array) {
    this.array = array;
  }

  public T min() {
    T min = array[0];
    for (int i = 1; i < array.length; i++) {
      if (array[i].compareTo(min) < 0) {
        min = array[i];
      }
    }

    return min;
  }

  public T max() {
    T max = array[0];
    for (int i = 1; i < array.length; i++) {
      if (array[i].compareTo(max) > 0) {
        max = array[i];
      }
    }

    return max;
  }

  public static void main(String[] args) {
    Integer[] numbers = {4, -2, 9, 1, 9};
    MinMax<Integer> numberExample = new MinMax<>(numbers);
    System.out.println("Minimum number: " + numberExample.min());
    System.out.println("Maximum number: " + numberExample.max());

    String[] words = {"pear", "apple", "orange"};
    MinMax<String> wordExample = new MinMax<>(words);
    System.out.println("Minimum word: " + wordExample.min());
    System.out.println("Maximum word: " + wordExample.max());
  }
}
