/*
	关于JPanel容器
	1.JPanel是可以嵌在JFrame上的容器
	2.JPanel是隐性显示的
	3.默认采用FlowLayout
	4.创建方法：
		Jpanel(){}
		Jpanel(LayoutManager lm){}
*/
import java.awt.*;
import javax.swing.*;
public class Test04
{
	public static void main(String[] args){
		JFrame win=new JFrame("帮助窗口");

		JPanel jpOne=new JPanel(new GridLayout(2,2));
		JPanel jpTwo=new JPanel(new BorderLayout());

		win.setLayout(new GridLayout(2,1));
		win.add(jpOne);
		win.add(jpTwo);
		
		win.setSize(200,200);
		win.setVisible(true);
		win.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
	}
}