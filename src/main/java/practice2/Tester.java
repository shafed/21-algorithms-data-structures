package practice2;

public class Tester {
  private Circle[] circles;
  private int count;

  public Tester(int len) {
    this.circles = new Circle[len];
    this.count = 0;
  }

  public boolean addCircle(Circle circle) {
    if (count < circles.length) {
      circles[count] = circle;
      count++;
    }
    return true;
  }

  public void printCircles() {
    for (int i = 0; i < count; i++) {
      System.out.println(i + ": " + circles[i]);
    }
  }

  public Circle[] getCircles() {
    return circles;
  }

  public int getCnt() {
    return count;
  }

  public static void main(String[] args) {
    Tester tester = new Tester(5);
    Point p1 = new Point(1, 2.5);
    Circle c1 = new Circle(p1, 5.5);
    tester.addCircle(c1);

    Circle c2 = new Circle(0, 0, 5);

    tester.addCircle(c2);

    tester.printCircles();

  }
}
