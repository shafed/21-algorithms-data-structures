package practice6;

public class Task2 {
  public static void main(String[] args) {
    MovableRectangle[] rectangles = {
        new MovableRectangle(0, 0, 10, 6, 2, 3),
        new MovableRectangle(-10, -8, -2, -1, 1, 2),
        new MovableRectangle(5, 5, 15, 12, 0, 0),
        new MovableRectangle(0, 0, 4, 8, 3, 0),
        new MovableRectangle(2, 3, 7, 9, 0, 2)
    };

    for (MovableRectangle rectangle : rectangles) {
      System.out.println("Before: " + rectangle);
      rectangle.moveDown();
      rectangle.moveRight();
      System.out.println("After:  " + rectangle);
      System.out.println();
    }
  }
}
