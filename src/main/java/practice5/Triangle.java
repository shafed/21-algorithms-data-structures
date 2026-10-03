package practice5;

import java.awt.Color;
import java.awt.Graphics;

public class Triangle extends Shape {
  private int width;
  private int height;

  public Triangle(Color color, int x, int y, int height, int width) {
    super(color, x, y);
    this.height = height;
    this.width = width;
  }

  @Override
  public void draw(Graphics graphics) {
    graphics.setColor(color);
    int[] xPoints = { x + width / 2, x, x + width };
    int[] yPoints = { y, y + height, y + height };
    graphics.fillPolygon(xPoints, yPoints, 3);

  }

}
