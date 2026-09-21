package practice2;

/**
 * Практическая 2, задание 2: сущность «Мяч» по UML-диаграмме (рис. 2.5) —
 * точка на плоскости, которую можно сдвигать.
 */
public class Ball {

    // Значения по умолчанию заданы на диаграмме: -x:double = 0.0, -y:double = 0.0.
    private double x = 0.0;
    private double y = 0.0;

    public Ball(double x, double y) {
        setXY(x, y);
    }

    /** По диаграмме у мяча есть и конструктор без аргументов: координаты нулевые. */
    public Ball() {
    }

    public double getX() {
        return x;
    }

    public void setX(double x) {
        this.x = x;
    }

    public double getY() {
        return y;
    }

    public void setY(double y) {
        this.y = y;
    }

    public void setXY(double x, double y) {
        this.x = x;
        this.y = y;
    }

    /** Сдвигает мяч на смещение (xDisp, yDisp) относительно текущей позиции. */
    public void move(double xDisp, double yDisp) {
        setXY(x + xDisp, y + yDisp);
    }

    @Override
    public String toString() {
        return "Ball{x=" + x + ", y=" + y + "}";
    }
}
