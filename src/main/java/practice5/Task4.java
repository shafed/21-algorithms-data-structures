package practice5;

import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;
import javax.swing.JFrame;
import javax.swing.SwingUtilities;

public class Task4 {
  public static void main(String[] args) throws IOException {
    BufferedImage spriteSheet = ImageIO.read(new File(args[0]));
    int frameCount = Integer.parseInt(args[1]);

    SwingUtilities.invokeLater(() -> {
      JFrame frame = new JFrame("Animation");
      frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

      frame.add(new AnimationPanel(spriteSheet, frameCount));
      frame.pack();

      frame.setResizable(false);
      frame.setLocationRelativeTo(null);
      frame.setVisible(true);
    });
  }
}
