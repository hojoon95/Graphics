package answer;

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
	
	class myMouseListener extends MouseAdapter
	{
		public void mousePressed(MouseEvent e)
		{
			System.out.println(e.getX() + ", " + e.getY());
		}
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
	ImageIcon icon = new ImageIcon("images/������ �����.png");
	Image img = icon.getImage();
	g.drawImage(img, 0, 0, getWidth(), getHeight(), this);
	icon = new ImageIcon("images/�ʳ��� ��.png");
	img = icon.getImage();
	g.drawImage(img, 90, 607, 48, 48, this);
	icon = new ImageIcon("images/�ѳ��� ��.png");
	img = icon.getImage();
	g.drawImage(img, 562, 140, 48, 48, this);
	icon = new ImageIcon("images/�ѳ��� ��.png");
	img = icon.getImage();
	g.drawImage(img, 20, 215, 40, 40, this);
	icon = new ImageIcon("images/�ѳ��� ��.png");
	img = icon.getImage();
	g.drawImage(img, 90, 12, 48, 48, this);
	icon = new ImageIcon("images/�ʳ��� ��.png");
	img = icon.getImage();
	g.drawImage(img, 324, 533, 58, 58, this);
	
	}
}

