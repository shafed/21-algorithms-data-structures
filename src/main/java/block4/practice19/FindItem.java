package block4.practice19;

import java.util.Scanner;

public class FindItem implements MenuItem {
  private LabClass labClass;
  private Scanner sc;

  public FindItem(LabClass labClass, Scanner sc) {
    this.labClass = labClass;
    this.sc = sc;
  }

  @Override
  public void execute() throws StudentNotFoundException, EmptyStringException {
    System.out.print("Enter full name: ");
    String fullName = sc.nextLine();
    Student student = labClass.findStudent(fullName);
    System.out.println(student);
  }

  @Override
  public String getName() {
    return "Find student";
  }
}
