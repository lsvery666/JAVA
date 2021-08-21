/*
	javax.swing.CardLayout

	CardLayout����Ƭ���ֹ����������������е�ÿ���������һ�ſ�Ƭ��һ��ֻ�ܿ���һ�ſ�Ƭ��������䵱��Ƭ�Ķ�ջ��Ĭ����ʾ��һ�ſ�Ƭ��

	CardLayout ���췽��:

	// ����һ������СΪ 0 �Ŀ�Ƭ����
	CardLayout()

	// ����һ��ָ��ˮƽ/��ֱ����С�Ŀ�Ƭ���֡�
	CardLayout(int hgap, int vgap) 

	CardLayout ���÷���:

	// ��ʾ��һ�ſ�Ƭ
	void first(Container parent);

	// ��ʾ���һ�ſ�Ƭ
	void last(Container parent);

	// ��ʾ��һ�ſ�Ƭ���Զ�ѭ����ʾ��
	void next(Container parent);

	// ��ʾ��һ�ſ�Ƭ���Զ�ѭ����ʾ��
	void previous(Container parent);

	// ��ʾָ�����Ƶ������������������ʱ����ͬʱ�����������ƣ�
	void show(Container parent, String name);
*/
import java.awt.*;
import javax.swing.*;
import java.awt.event.*;
public class Test
{
	public static void main(String[] args){
		JFrame jf=new JFrame("���Դ���");
		jf.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
		jf.setSize(300,200);

		//������Ƭ���֣���Ƭ��ˮƽ����ֱ���Ϊ100,10
		final CardLayout layout =new CardLayout(100,10);

		//�����������������ָ�����ֹ�����
		final JPanel panel=new JPanel();
		panel.setLayout(layout);

		//�������仰����д�ɣ�
		//final JPanel panel=new JPanel(new CardLayout(10,10));

		JButton jbt1=new JButton("��ť1");
		JButton jbt2=new JButton("��ť2");
		JButton jbt3=new JButton("��ť3");

		panel.add(jbt1,"1");
		panel.add(jbt2,"2");
		panel.add(jbt3,"3");

		//����ʾ�ڶ���
		layout.show(panel,"2");

		jf.setContentPane(panel);
		jf.setLocationRelativeTo(null);
		jf.setVisible(true);

		//ÿ���2���л���ʾ��һ��
		new Timer(1000,new ActionListener(){
			public void actionPerformed(ActionEvent e){
				layout.next(panel);
			}
		}).start();
	}
}