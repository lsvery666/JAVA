/*
	javax.swing.JPasswordField
	�����JPasswordField �̳��� JTextField��ֻ����ʾ���������ʱ
	���ض����ַ��滻��ʾ������ * �� �񣩣��÷��� JTextField ����һ�¡�

	���췽����
		JPasswordField()

		JPasswordField(String text)

		JPasswordField(int columns)

		JPasswordField(String text, int columns)
	
	���÷�����
		// ��ȡ��������������
		char[] getPassword()

		// ���������� �����ı������� �� ������ɫ
		void setText(String text)
		void setFont(Font font)
		void setForeground(Color fg)

		// ����������������ݵ�ˮƽ���뷽ʽ
		void setHorizontalAlignment(int alignment)

		// ���������Ĭ����ʾ�������ַ�
		void setEchoChar(char c)

		// ����������Ƿ�ɱ༭
		void setEditable(boolean b)

		���淽�������� java.awt.Component ������

		// �ж������ǰ�Ƿ�ӵ�н���
		boolean isFocusOwner()

		// ��������Ƿ����
		void setEnabled(boolean b)

	JPasswordField ���ü�����:

		// ��ӽ����¼�������
		void addFocusListener(FocusListener listener)

		// ����ı����ڵ� �ı��ı� ������
		textField.getDocument().addDocumentListener(DocumentListener listener)

		// ��Ӱ���������
		void addKeyListener(KeyListener listener)
*/
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
public class Test
{
	public static void main(String[] args){
		JFrame jf=new JFrame("���Դ���");
		jf.setSize(250,250);
		jf.setLocationRelativeTo(null);
		jf.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);

		JPanel panel=new JPanel();

		final JPasswordField jpf=new JPasswordField(10);
		panel.add(jpf);

		JButton jb=new JButton("�ύ");
		jb.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e){
				System.out.println("�ύ������Ϊ��"+new String(jpf.getPassword()));
			}
		});

		panel.add(jb);

		jf.setContentPane(panel);
		jf.setVisible(true);
	
	}
}
