/*
	�Զ��岼��
	����������������Դ���
*/
import java.awt.*;
import javax.swing.*;
public class Test02
{
	public static void main(String[] args){
		//��������
		JFrame win=new JFrame("��������");
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
		win.setSize(200,200);
		win.setVisible(true);
		win.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE); 
	}
}