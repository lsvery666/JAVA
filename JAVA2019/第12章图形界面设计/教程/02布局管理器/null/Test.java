/*
	null
	���Բ��֣��������Ĳ��ֹ���������Ϊnull���ͱ�ʾʹ�þ��Բ��֣���ͨ���������������Ϳ�����������
	���Բ�����Ҫ��ȷָ��ÿһ�����������Ϳ�ߣ�������ʾ��

	����ʹ����������ʱ�������������Ϳ�ߣ�һ�����ѭ��������:

	ʹ����������ʱ������ڴ�����ʾ��setVisible)֮��������������������Ҳ�ᱻ�������Բ��ֶԴ�������Ҫ�ֶ�ָ������Ϳ�ߣ���
	ʹ����������ʱ������ڴ�����ʾ֮���޸�֮ǰ��ӵ����������Ϳ�ߣ�������Ҳ�ᱻ�������Բ��ֶԴ�������ʱ�޸�����Ϳ�߻���Ч����
	
	����һ��ʹ�þ��Բ��ֵ�����:

	// ����һ��������ָ�����ݹ�����Ϊ null, ��ʹ�þ��Բ���
	JPanel panel = new JPanel(null);

	��

	// ����һ������
	JPanel panel = new JPanel();
	// �������ݹ�����Ϊ null, ��ʹ�þ��Բ���
	panel.setLayout(null);

	�������������Ϳ����Ĺط���������������Component��������У�:

	// �������������
	void setLocation(int x, int y)
	void setLocation(Point p)

	// ��������Ŀ��
	void setSize(int width, int height)
	void setSize(Dimension d)

	// ��������Ľ��ޣ�һ������������� ���� �� ��ߣ�
	void setBounds(int x, int y, int width, int height)
	void setBounds(Rectangle rect)
*/
import javax.swing.*;
public class Test
{
	public static void main(String[] args){
		JFrame jf=new JFrame("���Դ���");
		jf.setSize(300,300);
		jf.setLocationRelativeTo(null);
		jf.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);

		//����������壬ָ������Ϊnull����ʹ�þ��Բ���
		JPanel panel=new JPanel(null);
		
		//������ť
		JButton btn1=new JButton("��ť1");
		//���ð�ť������
		btn1.setLocation(50,50);
		//���ð�ť�Ŀ��
		btn1.setSize(100,50);
		panel.add(btn1);

		//������ť
		JButton btn2=new JButton("��ť2");
		//���ð�ť�Ľ��ޣ�����Ϳ�ߣ������ð�ť������Ϊ��50,100�������Ϊ100,50
		btn2.setBounds(50,100,100,50);
		panel.add(btn2);

		//��ʾ����
		jf.setContentPane(panel);
		jf.setVisible(true);

		//setVisible(true)֮�����������ᱻ���ɾ��Բ���������
		JButton btn3 = new JButton("��ť3");
      // �Ѱ�ťλ������������������½�, �������ð�ť���Ϊ 100, 50
      btn3.setBounds(panel.getWidth() - 100, panel.getHeight() - 50, 100, 50);
      panel.add(btn3);
	
	}
}