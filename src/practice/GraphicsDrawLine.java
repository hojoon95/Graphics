package practice;
import javax.swing.*;
import java.awt.*;

public class GraphicsDrawLine extends JFrame {
	public GraphicsDrawLine() {
		setTitle("drawLine 사용 예제");
		setContentPane(new MyPanel());
		
		setSize(250,250);
		setVisible(true);
	}
	
	class MyPanel extends JPanel{
		//코드를 작성해주세요
	}
	
	public static void main(String args[]) {
		new GraphicsDrawLine();
	}
	
}
