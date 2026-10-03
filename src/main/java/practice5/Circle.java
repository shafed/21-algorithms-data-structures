package practice5;

import java.awt.Color;
import java.awt.Graphics;

public class Circle extends Shape {
  private int diameter;

  public Circle(Color color, int x, int y, int diameter) {
    super(color, x, y);
    this.diameter = diameter;
  }

  @Override
  public void draw(Graphics graphics) {
    graphics.setColor(color);
    graphics.fillOval(x, y, diameter, diameter);

  }

}
