package practice5;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;
import java.util.Random;

import javax.swing.JPanel;

public class DrawingPanel extends JPanel {
  private Shape[] shapes = new Shape[20];

  public DrawingPanel() {
    setPreferredSize(new Dimension(600, 400));
    setBackground(Color.WHITE);

    Random random = new Random();

    for (int i = 0; i < shapes.length; i++) {
      Color color = new Color(random.nextInt(256), random.nextInt(256), random.nextInt(256));

      int width = 30 + random.nextInt(71);
      int height = 30 + random.nextInt(71);

      int x = random.nextInt(600 - width + 1);
      int y = random.nextInt(400 - height + 1);

      int type = random.nextInt(3);

      switch (type) {
        case 0:
          shapes[i] = new Circle(color, x, y, Math.min(width, height));
          break;

        case 1:
          shapes[i] = new Rectangle(color, x, y, height, width);
          break;
        case 2:
          shapes[i] = new Triangle(color, x, y, height, width);
          break;
      }
    }
  }

  @Override
  protected void paintComponent(Graphics graphics) {
    super.paintComponent(graphics);

    for (Shape shape : shapes) {
      shape.draw(graphics);
    }
  }

}
