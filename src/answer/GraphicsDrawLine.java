package answer;
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
		public void paintComponent(Graphics g) {
			super.paintComponent(g);
			g.setColor(Color.RED);
			g.drawLine(20,  20,  200,  100);
		}
	}
	
	public static void main(String args[]) {
		new GraphicsDrawLine();
	}
	
}
