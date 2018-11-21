package answer;

import javax.swing.*;
import java.awt.*;

public class Google extends JFrame {
   Google() {
      setTitle("Google");
      setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
      setContentPane(new MyPanel()); 
      setSize(400,200);
      setVisible(true);
   }

   class MyPanel extends JPanel {
      public void paintComponent(Graphics g) {
         super.paintComponent(g);
         g.setFont(new Font("Arial", Font.BOLD, 50));
         g.setColor(Color.BLUE);
         g.drawString("G", 105, 80);
         g.setColor(Color.RED);
         g.drawString("o", 140, 80);
         g.setColor(Color.YELLOW);
         g.drawString("o", 170, 80);
         g.setColor(Color.BLUE);
         g.drawString("g", 200, 80);
         g.setColor(Color.GREEN);
         g.drawString("l", 230, 80);
         g.setColor(Color.RED);
         g.drawString("e", 240, 80);
      }
   }

   public static void main(String [] args) {
      new Google();
   }
}
