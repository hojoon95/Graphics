package practice;
import javax.swing.*;
import java.awt.*;
public class GraphicsDrawImageEx1 extends JFrame {
   public GraphicsDrawImageEx1() {
	   setTitle("원본 크기로 이미지 그리기");
	   setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	   setContentPane(new MyPanel());
    
	   setSize(300,400);
	   setVisible(true);
   }
   
   class MyPanel extends JPanel {
	   //코드를 입력해주세요
   }
   
   public static void main(String[] args) {
	   new GraphicsDrawImageEx1();
   }
}
