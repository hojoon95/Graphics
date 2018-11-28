
import javax.swing.*;

import java.awt.event.*;

import java.awt.*;

public class JangGi extends JFrame
{
	public JangGi()
	{
		Container c = new MyPanel();
		setContentPane(c);
		c.addMouseListener(new myMouseListener());
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setTitle("장기알 채우기");
		setSize(720, 700);
		setVisible(true);
	}
	
	class myMouseListener extends MouseAdapter //좌표를 찾기 위한 마우스리스너(필수 아님)
	{
		
		// mousePressed로 좌표를 얻어와 이미지 그릴 때 사용하세요.
	}
	
	public static void main(String args[])
	{
		new JangGi();
	}
}

class MyPanel extends JPanel
{
	public void paintComponent(Graphics g)
	{
	super.paintComponent(g);
	
	
	
	/*
	 * 부족한 장기판은 Panel크기에 꽉 차게
	빠진 알을 이미지 그리기로 채워주세요.
	*/
	}
}

