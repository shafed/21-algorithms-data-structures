package practice_1;

public class TestBall {
    public static void main(String[] args) {
        Ball ball = new Ball();
        System.out.println(ball);
        Ball ball2 = new Ball(10, 10.5);
        System.out.println(ball2);

        ball.setX(1);
        ball.setY(5);
        System.out.println(ball);
        System.out.println(ball.getX());
        ball2.move(2.5, 1);
        System.out.println(ball2);



    }
}
