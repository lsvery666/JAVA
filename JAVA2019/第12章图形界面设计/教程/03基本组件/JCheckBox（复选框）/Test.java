/*
	javax.swing.JCheckBox
	��ѡ��
	���췽����
		// ���ı���Ĭ��δѡ��
		JCheckBox()

		// ���ı���Ĭ��δѡ��
		JCheckBox(String text)

		// ���ı�����ָ���Ƿ�ѡ��
		JCheckBox(String text, boolean selected)
	���÷�����
		// ���ø�ѡ��� �ı������� �� ������ɫ
		void setText(String text)
		void setFont(Font font)
		void setForeground(Color fg)

		���·��������� javax.swing.AbstractButton ������

		// ���ø�ѡ���Ƿ�ѡ��״̬
		void setSelected(boolean b)

		// �жϸ�ѡ���Ƿ�ѡ��
		boolean isSelected()

		// ���ø�ѡ���Ƿ����
		void setEnabled(boolean enable)

		// ����ͼƬ���ı��ļ��
		void setIconTextGap(int iconTextGap)
	���ü�������
		// ���״̬�ı������
		void addChangeListener(ChangeListener l)
*/
import javax.swing.*;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;
public class Test
{
	public static void main(String[] args){
		JFrame jf=new JFrame("���Դ���");
		jf.setSize(250,250);
		jf.setLocationRelativeTo(null);
		jf.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);

		JPanel panel=new JPanel();

		//������ѡ��
		JCheckBox cb1=new JCheckBox("����");
		JCheckBox cb2=new JCheckBox("�㽶");
		JCheckBox cb3=new JCheckBox("ѩ��");
		JCheckBox cb4=new JCheckBox("��֦");
		JCheckBox cb5=new JCheckBox("����");
		JCheckBox cb6=new JCheckBox("ƻ��");

		//��ӵ�һ����ѡ���״̬���ı�ļ�����������ѡ�������Ҫ����״̬�ı䣬��ɰ��˷�����Ӽ�����
		cb1.addChangeListener(new ChangeListener(){
			public void stateChanged(ChangeEvent e){
				//��ȡ�¼�Դ������ѡ����
				JCheckBox cb=(JCheckBox)e.getSource();
				System.out.println(cb.getText()+"�Ƿ�ѡ��"+cb.isSelected());
			}
		});

		//����Ĭ�ϵ�һ����ѡ��ѡ��
		cb1.setSelected(true);

		panel.add(cb1);
		panel.add(cb2);
		panel.add(cb3);
		panel.add(cb4);
		panel.add(cb5);

		jf.setContentPane(panel);
		jf.setVisible(true);


	}
}
