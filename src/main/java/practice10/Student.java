package practice10;

public class Student {
  private String firstname;
  private String surname;
  private String specialization;
  private int course;
  private String group;
  private double gpa;

  public Student(String firstname, String surname, String specialization,
      int course, String group, double gpa) {
    this.firstname = firstname;
    this.surname = surname;
    this.specialization = specialization;
    this.course = course;
    this.group = group;
    this.gpa = gpa;
  }

  public String getFirstname() {
    return firstname;
  }

  public String getSurname() {
    return surname;
  }

  public String getSpecialization() {
    return specialization;
  }

  public int getCourse() {
    return course;
  }

  public String getGroup() {
    return group;
  }

  public void setFirstname(String firstname) {
    this.firstname = firstname;
  }

  public void setSurname(String surname) {
    this.surname = surname;
  }

  public void setSpecialization(String specialization) {
    this.specialization = specialization;
  }

  public void setCourse(int course) {
    this.course = course;
  }

  public void setGroup(String group) {
    this.group = group;
  }

  public double getGpa() {
    return gpa;
  }

  public void setGpa(double gpa) {
    this.gpa = gpa;
  }

  @Override
  public String toString() {
    return surname + " " + firstname + ": " + specialization + ", course " + course
        + ", group " + group + ", GPA " + gpa;
  }
}
