
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
		setTitle("���� ä���");
		setSize(720, 700);
		setVisible(true);
	}
	
	class myMouseListener extends MouseAdapter //��ǥ�� ã�� ���� ���콺������(�ʼ� �ƴ�)
	{
		
		// mousePressed�� ��ǥ�� ���� �̹��� �׸� �� ����ϼ���.
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
	 * ������ ������� Panelũ�⿡ �� ����
	���� ���� �̹��� �׸���� ä���ּ���.
	*/
	}
}

