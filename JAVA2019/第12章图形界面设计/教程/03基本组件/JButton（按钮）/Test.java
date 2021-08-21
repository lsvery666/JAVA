/*
	javax.swing.JButton
	��ť
	���췽����
		// ���������������ı���ͼ��İ�ť
		JButton()

		// ����һ�����ı��İ�ť
		JButton(String text)

		// ����һ����ͼ��İ�ť
		JButton(Icon icon)
	���÷�����
		// ���ð�ť�� �ı������� �� ������ɫ
		void setText(String text)
		void setFont(Font font)
		void setForeground(Color fg)

		/���·��������� javax.swing.AbstractButton ������ 

		// ���ð�ť�Ƿ����
		void setEnabled(boolean enable)

		// ���ð�ť�� Ĭ�ϡ����¡������� ʱ��ʾ��ͼƬ
		void setIcon(Icon defaultIcon)
		void setPressedIcon(Icon pressedIcon)
		void setDisabledIcon(Icon disabledIcon)

		// �Ƿ���Ʊ߿����ò����Ʊ߿��ٽ�������������ð�ť״̬ͼƬ�ķ�������ʵ���Զ��尴ť��
		void setBorderPainted(boolean b);
	JButton���ü�����
		// ��� �� �Ƴ� ��ť�ĵ���¼�
		void addActionListener(ActionListener listener)
		void removeActionListener(ActionListener listener)
*/
import javax.swing.*;
import java.awt.event.*;
public class Test
{
	public static void main(String[] args){
		JFrame jf=new JFrame("���Դ���");
		jf.setSize(200,200);
		jf.setLocationRelativeTo(null);
		jf.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);

		JPanel panel=new JPanel();
		//����һ����ť
		final JButton btn=new JButton("���԰�ť");

		//��Ӱ�ť�ĵ���¼�������
		btn.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e){
				//��ȡ�����¼�Դ���ǰ�ť����
				//JButton btn=(JButton)e.getSource();

				System.out.println("��ť�����");
			}
		});

		panel.add(btn);
		jf.setContentPane(panel);
		jf.setVisible(true);
	}
}