package practice11;

import java.util.ArrayList;
import java.util.LinkedList;

public class Task5 {
  public static void main(String[] args) {
    ArrayList<Integer> array = new ArrayList<>();
    LinkedList<Integer> linked = new LinkedList<>();

    long startTime = System.currentTimeMillis();
    for (int i = 0; i < 99999; i++) {
      array.add(i);
    }
    long endTime = System.currentTimeMillis();

    long startTime2 = System.currentTimeMillis();
    for (int i = 0; i < 99999; i++) {
      linked.add(i);
    }
    long endTime2 = System.currentTimeMillis();

    long startTime3 = System.currentTimeMillis();
    for (int i = 0; i < 99999; i++) {
      array.add(50, i);
    }
    long endTime3 = System.currentTimeMillis();

    long startTime4 = System.currentTimeMillis();
    for (int i = 0; i < 99999; i++) {
      linked.add(50, i);
    }
    long endTime4 = System.currentTimeMillis();

    long startTime5 = System.currentTimeMillis();
    for (int i = 0; i < 99999; i++) {
      array.remove(i);
    }
    long endTime5 = System.currentTimeMillis();

    long startTime6 = System.currentTimeMillis();
    for (int i = 0; i < 99999; i++) {
      linked.remove(i);
    }
    long endTime6 = System.currentTimeMillis();

    long startTime7 = System.currentTimeMillis();
    for (int i = 0; i < 1000; i++) {
      array.contains(i);
    }
    long endTime7 = System.currentTimeMillis();

    long startTime8 = System.currentTimeMillis();
    for (int i = 0; i < 1000; i++) {
      linked.contains(i);
    }
    long endTime8 = System.currentTimeMillis();

    System.out.println(endTime - startTime);
    System.out.println(endTime2 - startTime2);
    System.out.println(endTime3 - startTime3);
    System.out.println(endTime4 - startTime4);
    System.out.println(endTime5 - startTime5);
    System.out.println(endTime6 - startTime6);
    System.out.println(endTime7 - startTime7);
    System.out.println(endTime8 - startTime8);
  }
}
