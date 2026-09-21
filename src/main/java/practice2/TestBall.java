package practice2;

public class TestBall {

    public static void main(String[] args) {
        Ball ball = new Ball();
        System.out.println("new Ball():           " + ball);

        Ball other = new Ball(10.0, 10.5);
        System.out.println("new Ball(10.0, 10.5): " + other);

        ball.setX(1.0);
        ball.setY(5.0);
        System.out.println("после setX/setY:      " + ball);
        System.out.println("getX() = " + ball.getX() + ", getY() = " + ball.getY());

        ball.setXY(-3.0, 7.0);
        System.out.println("после setXY:          " + ball);

        other.move(2.5, 1.0);
        System.out.println("после move(2.5, 1.0): " + other);
    }
}
