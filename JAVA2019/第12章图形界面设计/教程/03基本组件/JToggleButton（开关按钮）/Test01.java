/*
	JToggleButton
	javax.swing.JToggleButton
	���ذ�ť JToggleButton �� JRadioButton, JCheckBox �ĸ��࣬
	��Ҫʵ��һ����ť������״̬��ѡ�� �� δѡ�У���ʵ�ֿ����л���Ч����

	���췽����
		// ���ı���Ĭ��δѡ��
		JToggleButton()

		// ���ı���Ĭ��δѡ��
		JToggleButton(String text)

		// ���ı�����ָ���Ƿ�ѡ��
		JToggleButton(String text, boolean selected)

	���÷�����
		/ ���ÿ��ذ�ť�� �ı������� �� ������ɫ
		void setText(String text)
		void setFont(Font font)
		void setForeground(Color fg)

		���·��������� javax.swing.AbstractButton ������

		// ���ÿ��ذ�ť�Ƿ�ѡ��״̬
		void setSelected(boolean b)

		// �жϿ��ذ�ť�Ƿ�ѡ��
		boolean isSelected()

		// ���ÿ��ذ�ť�Ƿ����
		void setEnabled(boolean enable)

		// ���ÿ��ذ�ť�� Ĭ��(��)����ѡ��(��)�������� ʱ��ʾ��ͼƬ
		void setIcon(Icon defaultIcon)
		void setPressedIcon(Icon pressedIcon)
		void setDisabledIcon(Icon disabledIcon)

		// ����ͼƬ���ı�֮��ļ��
		void setIconTextGap(int iconTextGap)
	
	JToggleButton ���ü�����:

		// ���״̬�ı������
		void addChangeListener(ChangeListener l)

	������main���������ôһ�δ��룬�����ý���ÿ���
		try{
			UIManager.setLookAndFeel("com.sun.java.swing.plaf.nimbus.NimbusLookAndFeel");
		}catch (Exception e){
			e.printStackTrace();
		}
*/
//Ĭ�ϵĿ��ذ�ť
import javax.swing.event.*;
import javax.swing.*;
public class Test01
{
	public static void main(String[] args){
		JFrame jf=new JFrame("���Դ���");
		jf.setSize(250,250);
		jf.setLocationRelativeTo(null);
		jf.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);

		JPanel panel=new JPanel();

		JToggleButton jtb=new JToggleButton("���ذ�ť");

		jtb.addChangeListener(new ChangeListener(){
			public void stateChanged(ChangeEvent e){
				JToggleButton jtb=(JToggleButton)e.getSource();
				System.out.println(jtb.getText()+"�Ƿ�ѡ��"+jtb.isSelected());
			}
		});
		
		try{
			UIManager.setLookAndFeel("com.sun.java.swing.plaf.nimbus.NimbusLookAndFeel");
		}catch (Exception e){
			e.printStackTrace();
		}
		panel.add(jtb);
		jf.setContentPane(panel);
		jf.setVisible(true);

	}
}









	