package practice6;

public class Task1 {
  public static void main(String[] args) {
    Movable[] objects = {
        new MovablePoint(10, 20, 2, 3),
        new MovableCircle(10, 20, 2, 3, 5),
        new MovablePoint(-5, -10, 1, 2),
        new MovableCircle(0, 0, 0, 0, 3)
    };

    for (Movable movable : objects) {
      System.out.println("Before: " + movable);
      movable.moveUp();
      movable.moveRight();
      System.out.println("After:  " + movable);
      System.out.println();
    }
  }
}
