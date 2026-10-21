package practice13;

public class Task1 {

  public void takeString(String s) {
    System.out.println(s.charAt(s.length() - 1));
    System.out.println(s.endsWith("!!!"));
    System.out.println(s.startsWith("I like"));
    System.out.println(s.contains("Java"));
    int indexOfJava = s.indexOf("Java");
    System.out.println(indexOfJava);
    System.out.println(s.replace('a', 'o'));
    System.out.println(s.toUpperCase());
    System.out.println(s.toLowerCase());
    System.out.println(s.substring(indexOfJava, indexOfJava + 4));
  }

  public static void main(String[] args) {
    Task1 task = new Task1();
    task.takeString("I like Java!!!");
  }

}
