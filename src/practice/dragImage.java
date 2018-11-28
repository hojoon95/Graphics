package practice;

import javax.swing.*;
import java.awt.*;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class dragImage extends JFrame {
  public dragImage() {
	  setTitle("Drag Image Practice");
	  setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	  setContentPane(new MyPanel());
	  
	  setSize(500, 500);
	  setVisible(true);
  }
  
  class MyPanel extends JPanel{
	  private Point offset = null;

	  private ImageIcon icon = new ImageIcon("images/image0.png");
	  private Image img = icon.getImage();
	  
	  public MyPanel() {
		  MyMouseLisnter listener = new MyMouseLisnter();
		  addMouseListener(listener);
		  addMouseMotionListener(listener);
	  }
	  
	  
	  public void paintComponent (Graphics g) {
		  super.paintComponent(g);
		  if(offset == null) {
			  g.drawImage(img, 50,50, 100, 200, this);  
		  }
		  else {
			  //여기를 채워주세요
			  
			  
		  }
	  }
	  class MyMouseLisnter extends MouseAdapter{
		  public void mouseClicked(MouseEvent e) {
			  //여기를 채워주세요(Click한 위치로 그림을 이동할 것입니다)
			  
			  
			  
		  }
		  public void mouseDragged(MouseEvent e) {
			  //여기를 채워주세요(Drag가 될 때 좌표를 받아 그림을 이동할 것입니다)
			  
			  
		  }
		  
	  }
  }
  public static void main(String[] args) {
	  new dragImage();
  }
}
