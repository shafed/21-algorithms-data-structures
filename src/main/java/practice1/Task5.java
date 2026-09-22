package practice1;

public class Task5 {

  // Run: java src/main/java/practice1/Task5.java один два три
  public static void main(String[] args) {
    if (args.length == 0) {
      System.out.println("Аргументы командной строки не переданы.");
      return;
    }

    for (String s : args) {
      System.out.println(s);
    }
  }
}
