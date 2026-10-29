package block3.practice17;

import java.util.Scanner;

public class Element {

  static Scanner sc = new Scanner(System.in);
  String name;
  int age;
  int course;
  Element next = null;

  void readAttributes() {
    name = sc.nextLine();
    age = sc.nextInt();
    course = sc.nextInt();
    sc.nextLine();
  }

  void printAttributes() {
    System.out.println(toString());
  }

  @Override
  public String toString() {
    return "Name: " + name + ", age: " + age + ", course: " + course;
  }
}
