package practice4_1;

public class Task7 {
  public static void main(String[] args) {
    Learner[] learners = {
        new SchoolStudent("Максим Попов", 16),
        new Student("Денис Хамидуллин", 19),
        new SchoolStudent("Эдмон Гарибян", 35),
        new Student("Леонид Васильев", 20),
        new Student("Олег Карановский", 19)
    };

    System.out.println("Школьники:");
    for (Learner learner : learners) {
      if (learner instanceof SchoolStudent) {
        System.out.println(learner);
      }
    }
    System.out.println("\nСтуденты:");
    for (Learner learner : learners) {
      if (learner instanceof Student) {
        System.out.println(learner);
      }
    }
  }
}
