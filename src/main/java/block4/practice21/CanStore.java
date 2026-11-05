package block4.practice21;

import java.util.ArrayList;

public class CanStore<T> {
  private T[] array;

  public CanStore(T[] array) {
    this.array = array;
  }

  public T get(int index) {
    return array[index];
  }

  public ArrayList<T> toList(T[] array) {
    ArrayList<T> list = new ArrayList<T>();
    for (T t : array) {
      list.add(t);
    }

    return list;
  }

  public void printFirstFive(T[] array) {
    ArrayList<T> list = toList(array);
    for (int i = 0; i < array.length && i < 5; i++) {
      System.out.println(list.get(i));
    }

  }

  public static void main(String[] args) {
    String[] words = { "apple", "pear", "orange", "plum", "lemon", "melon" };
    Integer[] numbers = { 1, 2, 3 };

    CanStore<String> wordStorage = new CanStore<>(words);
    CanStore<Integer> numberStorage = new CanStore<>(numbers);

    System.out.println("Words: " + wordStorage.toList(words));
    System.out.println("Numbers: " + numberStorage.toList(numbers));

    System.out.println("First word: " + wordStorage.get(0));
    System.out.println("Second number: " + numberStorage.get(1));

    System.out.println("First five words:");
    wordStorage.printFirstFive(words);
    System.out.println("First five numbers:");
    numberStorage.printFirstFive(numbers);
  }

}
