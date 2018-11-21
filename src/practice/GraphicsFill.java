package practice;

import javax.swing.*;
import java.awt.*;

import practice.GraphicsDrawLine.MyPanel;

public class GraphicsFill extends JFrame{
	public GraphicsFill() {
		setTitle("Fill 사용 예제");
		setContentPane(new MyPanel());
		
		setSize(400,400);
		setVisible(true);
	}
	
	class MyPanel extends JPanel{
		//코드를 작성해주세요
	}
	
	public static void main(String args[]) {
		new GraphicsFill();
	}
}
