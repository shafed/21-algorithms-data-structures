package block2.practice9;

public class Student implements Comparable<Student> {
  private int iDNumber;
  private int score;

  public Student(int iDNumber, int score) {
    this.iDNumber = iDNumber;
    this.score = score;
  }

  public int getScore() {
    return score;
  }

  @Override
  public String toString() {
    return "Student [iDNumber=" + iDNumber + ", score=" + score + "]";
  }

  @Override
  public int compareTo(Student other) {
    if (this.iDNumber < other.iDNumber) {
      return -1;

    } else if (this.iDNumber > other.iDNumber) {
      return 1;
    }
    return 0;
  }
}
