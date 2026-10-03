package practice5;

import javax.swing.JFrame;
import javax.swing.SwingUtilities;

public class Task2 {
  public static void main(String[] args) {
    SwingUtilities.invokeLater(() -> {
      JFrame frame = new JFrame("20 random shapes");
      frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

      frame.add(new DrawingPanel());
      frame.pack();

      frame.setResizable(false);
      frame.setLocationRelativeTo(null);
      frame.setVisible(true);
    });
  }
}
