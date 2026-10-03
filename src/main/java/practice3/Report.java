package practice3;

public class Report {
  public static void generateReport(Employee[] employees) {
    System.out.printf("%-25s %15s%n", "ФИО", "Зарплата");
    for (Employee employee : employees) {
      System.out.printf("%-25s %15.2f%n", employee.getFullname(), employee.getSalary());
    }
  }

  public static void main(String[] args) {
    Employee[] employees = {
        new Employee("Максим Попов", 500_000),
        new Employee("Денис Хамидуллин", 999_999_999_999.01),
        new Employee("Эдмон Гарибян", 10),
        new Employee("Леонид Васильев", 1_000_000_000),
        new Employee("Олег Карановский", 1_100_000_000)
    };

    generateReport(employees);
  }
}
