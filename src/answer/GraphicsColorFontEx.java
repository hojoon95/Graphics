package answer;

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
		  super.paintComponent(g);
		  g.setColor(Color.BLACK);
		  g.drawString("야구 정말 좋다", 30, 30);
		  g.setColor(new Color(255,0,0));
		  g.setFont(new Font("Arial",  Font.ITALIC, 30));
		  g.drawString("What player do you like?", 30, 70);
		  g.setColor(new Color(0x00ff00ff));
		  
		  for(int i=1; i<=4; i++) {
			  g.setFont(new Font("고딕체", Font.ITALIC, i*10));
			  g.drawString("콜로라도의 오승환", 30, 60*i+40);
		  }
	  }
  }
  
  public static void main(String[] args) {
	  new GraphicsColorFontEx();
  }
}
