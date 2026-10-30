package block3.practice17_1;

import java.util.Scanner;

public class Node {

  static Scanner sc = new Scanner(System.in);
  String name;
  int age;
  int course;
  Node next = null;
  Node prev = null;

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
