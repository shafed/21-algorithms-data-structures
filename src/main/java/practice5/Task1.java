package practice5;

import java.awt.GridLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.SwingUtilities;

public class Task1 {
  private static int milanScore = 0;
  private static int madridScore = 0;

  private static void updateLabels(
      JLabel resultLabel,
      JLabel lastScorerLabel,
      JLabel winnerLabel,
      String lastScorer) {
    resultLabel.setText("Result: " + milanScore + " X " + madridScore);
    lastScorerLabel.setText("Last Scorer: " + lastScorer);

    if (milanScore > madridScore) {
      winnerLabel.setText("Winner: AC Milan");
    } else if (madridScore > milanScore) {
      winnerLabel.setText("Winner: Real Madrid");
    } else {
      winnerLabel.setText("Winner: DRAW");
    }
  }

  public static void main(String[] args) {
    SwingUtilities.invokeLater(() -> {
      JFrame frame = new JFrame("AC Milan vs Real Madrid");
      frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
      frame.setSize(400, 250);
      frame.setLocationRelativeTo(null);

      JPanel panel = new JPanel(new GridLayout(5, 1));

      JButton milanButton = new JButton("AC Milan");
      JButton madridButton = new JButton("Real Madrid");

      JLabel resultLabel = new JLabel("Result: 0 x 0", JLabel.CENTER);
      JLabel lastScorerLabel = new JLabel("Last Scorer: N/A", JLabel.CENTER);
      JLabel winnerLabel = new JLabel("Winner: DRAW", JLabel.CENTER);

      panel.add(milanButton);
      panel.add(madridButton);
      panel.add(resultLabel);
      panel.add(lastScorerLabel);
      panel.add(winnerLabel);

      frame.add(panel);

      frame.setVisible(true);

      milanButton.addActionListener(event -> {
        milanScore++;
        updateLabels(resultLabel, lastScorerLabel, winnerLabel, "AC Milan");
      });
      madridButton.addActionListener(event -> {
        madridScore++;
        updateLabels(resultLabel, lastScorerLabel, winnerLabel, "Real Madrid");
      });
    });
  }

}
