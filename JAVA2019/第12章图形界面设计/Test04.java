/*
	����JPanel����
	1.JPanel�ǿ���Ƕ��JFrame�ϵ�����
	2.JPanel��������ʾ��
	3.Ĭ�ϲ���FlowLayout
	4.����������
		Jpanel(){}
		Jpanel(LayoutManager lm){}
*/
import java.awt.*;
import javax.swing.*;
public class Test04
{
	public static void main(String[] args){
		JFrame win=new JFrame("��������");

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