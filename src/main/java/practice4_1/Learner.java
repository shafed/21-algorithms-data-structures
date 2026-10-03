package practice4_1;

public class Learner {
  private String fullName;
  private int age;

  public Learner(String fullName, int age) {
    this.fullName = fullName;
    this.age = age;
  }

  @Override
  public String toString() {
    return fullName + ", возраст: " + age;
  }

}
