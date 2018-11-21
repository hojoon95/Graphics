package answer;

import javax.swing.*;
import java.awt.*;

public class Warning extends JFrame {
   Warning() {
      setTitle("위험 경고 표지판 그리기");
      setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
      setContentPane(new MyPanel()); 
      setSize(180,200);
      setVisible(true);
   }

   class MyPanel extends JPanel {
      public void paintComponent(Graphics g) {
         super.paintComponent(g);
         g.setColor(Color.RED);
         g.fillRoundRect(10,10,140,135,25,25);
         g.setColor(Color.BLACK);
         int[] x1 = {80,20,140};
         int[] y1 = {20,120,120};
         g.fillPolygon(x1,y1,3);
         g.setColor(Color.YELLOW);
         int[] x2 = {80,30,130};
         int[] y2 = {30,115,115};
         g.fillPolygon(x2,y2,3);
         g.setColor(Color.BLACK);
         g.fillArc(50,50,60,80,80,20);
         g.fillOval(75,95,10,10);
      }
   }
   public static void main(String [] args) {
      new Warning();
   }
}
