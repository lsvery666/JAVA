/*
	����JFrame����
	������
		 ���췽����
		 JFrame(){}
		 JFrame(String text){}
		 ���ô��ڴ�С��
		 void pack(){}
		 void setSize(int w,int h){}
		 void setBounds(x,y,w,h){}
		 ���ñ��⣺
		 void setTitle(String s){}
		 ������ɫ��
		 void setForeground(Color c){}
		 void setBackground(Color c){}
		 ��ʾ��
		 void setVisible(boolean b){}
		 void show(){}
*/
import java.awt.*;
import javax.swing.*;
public class Test03
{
	public static void main(String[] args){
		JFrame win=new JFrame();

		//���ô��ڴ�С
		//win.setSize(200,200);
		//win.pack();
		win.setBounds(400,400,200,200);

		//���ñ���
		win.setTitle("��������");

		//������ɫ
		win.setForeground(Color.red);
		win.setBackground(Color.blue);

		//��ȡ����
		Container contentPane=win.getContentPane();
		//���������Ĳ��ֹ����������û����䣬Frame����Ĭ�ϲ���BorderLayout
		contentPane.setLayout(null);
		//�������
		JButton queding=new JButton("ȷ��");
		//�Զ��岼��
		//�������Ͻ�Ϊ����ԭ��
		queding.setBounds(10,30,80,40);
		contentPane.add(queding);

		//��ʾ
		win.setVisible(true);
		//win.show();
		win.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);

	}
}

