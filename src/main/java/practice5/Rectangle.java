package practice5;

import java.awt.Color;
import java.awt.Graphics;

public class Rectangle extends Shape {
  private int width;
  private int height;

  public Rectangle(Color color, int x, int y, int height, int width) {
    super(color, x, y);
    this.height = height;
    this.width = width;
  }

  @Override
  public void draw(Graphics graphics) {
    graphics.setColor(color);
    graphics.fillRect(x, y, width, height);

  }

}
