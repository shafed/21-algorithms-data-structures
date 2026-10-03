package practice3;

public class Employee {
  private String fullname;
  private double salary;

  Employee(String fullname, double salary) {
    this.fullname = fullname;
    this.salary = salary;
  }

  public String getFullname() {
    return fullname;
  }

  public double getSalary() {
    return salary;
  }
}
