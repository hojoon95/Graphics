package practice;

import javax.swing.*;
import java.awt.*;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.util.Arrays;
import java.util.Vector;

public class mouseDraw extends JFrame {
  public mouseDraw() {
	  setTitle("Drag Image Practice");
	  setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	  setContentPane(new MyPanel());
	  
	  setSize(500, 500);
	  setVisible(true);
  }
  
  class MyPanel extends JPanel{
	  private Vector<Point> v = new Vector<Point>();
	  
	  public MyPanel() {
		  MyMouseLisnter listener = new MyMouseLisnter();
		  addMouseListener(listener);
		  addMouseMotionListener(listener);
	  }
	  
	  
	  public void paintComponent (Graphics g) {
		  super.paintComponent(g);
		  if(v.size()!=0) {
			  int []x = {};
			  int []y = {};
			  for(int i =0; i<v.size(); i++){
				  x = addElement(x, (int)(v.elementAt(i).getX()));
				  y = addElement(y, (int)(v.elementAt(i).getY()));
			  }
			  //여기를 채워주세요
			  
		  }
	  }
	  class MyMouseLisnter extends MouseAdapter{
		  public void mousePressed(MouseEvent e) {
			  //여기를 채워주세요
			  
		  }
		  public void mouseReleased(MouseEvent e) {
			  //여기를 채워주세요
			  
		  }
	  }
	  
	  int[] addElement(int[] a, int e) {
		    a  = Arrays.copyOf(a, a.length + 1);
		    a[a.length - 1] = e;
		    return a;
	}
  }
  public static void main(String[] args) {
	  new mouseDraw();
  }
}
