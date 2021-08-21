/*
	java.awt.BorderLayout
	BorderLayout���߽粼�ֹ����������� Container ����λ��Ϊ 5 �����򣨶��������ϡ������У���ÿ���������һ�������

	BorderLayout ���췽��:

	// ����һ�����֮��û�м����±߿򲼾�
	BorderLayout() 

	// ����һ������ָ��������ı߿򲼾�
	BorderLayout(int hgap, int vgap) 

   BorderLayout ��ʾ��λ�� 5 ������:

	BorderLayout.NORTH      // �����ı���
	BorderLayout.SOUTH      // �������ϱ�
	BorderLayout.WEST       // ����������
	BorderLayout.EAST       // �����Ķ���
	BorderLayout.CENTER     // ����������
*/
import java.awt.*;
import javax.swing.*;
public class Test
{
	public static void main(String[] args){
		JFrame jf=new JFrame("���Դ���");
		jf.setSize(350,250);
		jf.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);

		//�����������������ָ��ʹ�ñ߽粼��
		JPanel panel=new JPanel(new BorderLayout());

		//����5����ť
		JButton jbt1=new JButton("��ť1");
		JButton jbt2=new JButton("��ť2");
		JButton jbt3=new JButton("��ť3");
		JButton jbt4=new JButton("��ť4");
		JButton jbt5=new JButton("��ť5");

		//�������ť��ӵ�������5����λ
		panel.add(jbt1, BorderLayout.NORTH);
      panel.add(jbt2, BorderLayout.SOUTH);
      panel.add(jbt3, BorderLayout.WEST);
      panel.add(jbt4, BorderLayout.EAST);
      panel.add(jbt5, BorderLayout.CENTER);

		jf.setContentPane(panel);
		jf.setLocationRelativeTo(null);
		jf.setVisible(true);


	}
}