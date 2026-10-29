package block2.practice13;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Task6 {

  public String getLine(String[] words) {
    boolean[] used = new boolean[words.length];
    StringBuilder res = new StringBuilder(words[0]);
    used[0] = true;
    boolean found = true;

    while (found) {
      found = false;
      for (int i = 0; i < words.length && !found; i++) {
        String last = res.substring(res.length() - 1);
        if (!used[i] && last.equalsIgnoreCase(words[i].substring(0, 1))) {
          res.append(' ').append(words[i]);
          used[i] = true;
          found = true;
        }
      }
    }

    return res.toString();
  }

  public static void main(String[] args) throws FileNotFoundException {
    Scanner sc = new Scanner(System.in);
    String fileName = sc.nextLine();
    Scanner fileScanner = new Scanner(new File(fileName));
    String[] words = fileScanner.nextLine().split(" ");
    fileScanner.close();

    Task6 task = new Task6();
    System.out.println(task.getLine(words));

  }

}
