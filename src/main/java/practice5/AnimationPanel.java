package practice5;

import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.image.BufferedImage;

import javax.swing.JPanel;
import javax.swing.Timer;

public class AnimationPanel extends JPanel {
  private BufferedImage spriteSheet;
  private int frameCount;
  private int frameWidth;
  private int frameHeight;
  private int currentFrame = 0;

  public AnimationPanel(BufferedImage spriteSheet, int frameCount) {
    this.spriteSheet = spriteSheet;
    this.frameCount = frameCount;
    this.frameWidth = spriteSheet.getWidth() / frameCount;
    this.frameHeight = spriteSheet.getHeight();

    setPreferredSize(new Dimension(frameWidth, frameHeight));
    Timer timer = new Timer(150, event -> {
      currentFrame = (currentFrame + 1) % frameCount;
      repaint();
    });
    timer.start();

  }

  @Override
  protected void paintComponent(Graphics graphics) {
    super.paintComponent(graphics);

    int sourceX = currentFrame * frameWidth;

    graphics.drawImage(spriteSheet, 0, 0, frameWidth, frameHeight, sourceX, 0, sourceX + frameWidth, frameHeight, this);
  }

}
