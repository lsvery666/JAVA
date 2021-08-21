/*
	javax.swing.JRadioButton
	��ѡ��ť
	���췽����
		// ���ı���δѡ��
		JRadioButton()

		// ���ı���δѡ��
		JRadioButton(String text)

		// ���ı�����ָ���Ƿ�ѡ��
		JRadioButton(String text, boolean selected)

	���÷�����
		// ���õ�ѡ��ť�� �ı������� �� ������ɫ
		void setText(String text)
		void setFont(Font font)
		void setForeground(Color fg)

		/���·��������� javax.swing.AbstractButton ������ 

		// ���õ�ѡ��ť�Ƿ�ѡ��״̬
		void setSelected(boolean b)

		// �жϵ�ѡ��ť�Ƿ�ѡ��
		boolean isSelected()

		// ���õ�ѡ��ť�Ƿ����
		void setEnabled(boolean enable)

		// ���õ�ѡ��ť�� Ĭ�ϡ���ѡ�С������� ʱ��ʾ��ͼƬ
		void setIcon(Icon defaultIcon)
		void setPressedIcon(Icon pressedIcon)
		void setDisabledIcon(Icon disabledIcon)

		// ����ͼƬ���ı��ļ��
		void setIconTextGap(int iconTextGap)
		
	���ü�������
		// ���״̬�ı������
		void addChangeListener(ChangeListener l)

	ButtonGroup(��ť��):
		���ж����ѡ��ťʱ��һ��ֻ����һ����ѡ��ťѡ�У������Ҫ��ͬһ���͵ĵ�ѡ��ť���з��飬����:
		// ����һ����ť��
		ButtonGroup btnGroup = new ButtonGroup();

		// ��ӵ�ѡ��ť����ť��
		btnGroup.add(radioBtn01);
		btnGroup.add(radioBtn02);
*/
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
public class Test
{
	public static void main(String[] args){
		JFrame jf=new JFrame("���Դ���");
		jf.setSize(200,200);
		jf.setLocationRelativeTo(null);
		jf.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);

		JPanel panel=new JPanel();

		//����������ѡ��ť
		JRadioButton radioBtn1=new JRadioButton("��");
		JRadioButton radioBtn2=new JRadioButton("Ů");

		//������ť�飬��������ѡ��ť��ӵ�����
		ButtonGroup btnGroup=new ButtonGroup();

		btnGroup.add(radioBtn1);
		btnGroup.add(radioBtn2);

		//���õ�һ����ѡ��ť��ѡ��
		radioBtn1.setSelected(true);

		panel.add(radioBtn1);
		panel.add(radioBtn2);

		jf.setContentPane(panel);
		jf.setVisible(true);
	}
}
