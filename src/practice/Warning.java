package practice;

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
    	  //write the code below
      }
   }
   public static void main(String [] args) {
      new Warning();
   }
}
