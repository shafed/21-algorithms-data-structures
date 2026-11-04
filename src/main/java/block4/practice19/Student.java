package block4.practice19;

public class Student {
  private String fullName;
  private double gpa;

  public Student(String fullName, double gpa) throws EmptyStringException {
    setFullName(fullName);
    this.gpa = gpa;
  }

  public String getFullName() {
    return fullName;
  }

  public void setFullName(String fullName) throws EmptyStringException {
    if (fullName.equals("")) {
      throw new EmptyStringException("Fullname is empty");
    }
    this.fullName = fullName;
  }

  public double getGpa() {
    return gpa;
  }

  public void setGpa(double gpa) {
    this.gpa = gpa;
  }

  @Override
  public String toString() {
    return fullName + ": GPA " + gpa;
  }
}
