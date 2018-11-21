package practice;

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
         //코드를 작성해주세요.
      }
   }

   public static void main(String [] args) {
      new Google();
   }
}
