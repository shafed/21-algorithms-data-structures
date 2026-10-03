package practice3;

import java.util.Arrays;
import java.util.Random;

public class MathRandomTask1 {
  public static void main(String[] args) {
    double[] x = new double[5];

    System.out.println("unsorted random()");
    for (int i = 0; i < x.length; i++) {
      x[i] = Math.random() * 10;
      System.out.println(x[i]);
    }

    System.out.println("\nsorted random()");
    Arrays.sort(x);
    for (double i : x) {
      System.out.println(i);
    }

    double[] y = new double[5];
    Random rand = new Random();
    System.out.println("\nunsorted Random");
    for (int i = 0; i < y.length; i++) {
      y[i] = rand.nextDouble(10);
      System.out.println(y[i]);
    }
    Arrays.sort(y);
    System.out.println("\nsorted Random");
    for (double i : y) {
      System.out.println(i);
    }
  }
}
