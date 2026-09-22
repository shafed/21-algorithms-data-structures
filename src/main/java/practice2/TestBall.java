package practice2;

public class TestBall {

  public static void main(String[] args) {
    Ball ball = new Ball();
    System.out.println("ball: " + ball);

    Ball ball2 = new Ball(10.0, 10.5);
    System.out.println("ball2: " + ball2);

    ball.setX(1.0);
    ball.setY(5.0);
    System.out.println("ball после setX/setY: " + ball);
    System.out.println("getX() = " + ball.getX() + ", getY() = " + ball.getY());

    ball.setXY(-3.0, 7.0);
    System.out.println("ball после setXY: " + ball);

    ball2.move(2.5, 1.0);
    System.out.println("ball2 после move: " + ball2);
  }
}
