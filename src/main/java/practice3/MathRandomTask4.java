package practice3;

import java.util.Random;

public class MathRandomTask4 {
  public static void main(String[] args) {

    int[] x = new int[4];
    Random rand = new Random();

    boolean flag = true;
    for (int i = 0; i < 4; i++) {
      x[i] = rand.nextInt(90) + 10;
      System.out.print(x[i] + " ");
      if (i >= 1 && x[i] <= x[i - 1])
        flag = false;
    }

    if (flag)
      System.out.println("\nстрого возрастающая");
    else
      System.out.println("\nне строго возрастающая");
  }

}
