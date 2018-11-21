package practice;

import javax.swing.*;
import java.awt.*;

public class GraphicsColorFontEx extends JFrame {
  public GraphicsColorFontEx() {
	  setTitle("Color Practice");
	  setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	  setContentPane(new MyPanel());
	  
	  setSize(500, 500);
	  setVisible(true);
  }
  
  class MyPanel extends JPanel{
	  public void paintComponent (Graphics g) {
		  //이곳을 채워주세요
	  }
  }
  
  public static void main(String[] args) {
	  new GraphicsColorFontEx();
  }
}
