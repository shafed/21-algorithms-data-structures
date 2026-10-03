package practice5;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.SwingUtilities;

public class Task3 {
  public static void main(String[] args) {
    if (args.length == 0) {
      System.out.println("Provide the image path");
      return;
    }

    ImageIcon image = new ImageIcon(args[0]);

    if (image.getIconWidth() == -1) {
      System.out.println("Couldn't load image " + args[0]);
      return;
    }

    SwingUtilities.invokeLater(() -> {
      JFrame frame = new JFrame("Image Viewer");
      frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
      frame.add(new JLabel(image));
      frame.pack();

      frame.setLocationRelativeTo(null);
      frame.setVisible(true);

    });
  }

}
