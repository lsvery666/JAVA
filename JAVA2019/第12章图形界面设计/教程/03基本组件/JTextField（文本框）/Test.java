/*
	javax.swing.JTextField
	�ı��� JTextField�����༭���е��ı�

	���췽����
	
		����˵��:
	   text: Ĭ����ʾ���ı�
		columns: ����������ѡ��ȵ����������������Ϊ 0������ѡ��Ƚ������ʵ�ֵ���Ȼ���
		 
		JTextField()

		JTextField(String text)

		JTextField(int columns)

		JTextField(String text, int columns)

	���÷�����
		
		// ��ȡ�ı����е��ı�
		String getText()

		// �����ı���� �ı������� �� ������ɫ
		void setText(String text)
		void setFont(Font font)
		void setForeground(Color fg)

		// ������ɫ���ֱ�Ϊ: �����ɫ������ѡ�в��ֵı�����ɫ��ѡ�в����ı�����ɫ��������ʱ�ı�����ɫ
		void setCaretColor(Color c)
		void setSelectionColor(Color c)
		void setSelectedTextColor(Color c)
		void setDisabledTextColor(Color c)

		// �����ı����ݵ�ˮƽ���뷽ʽ
		void setHorizontalAlignment(int alignment)

		// �����ı����Ƿ�ɱ༭
		void setEditable(boolean b)

		���淽�������� java.awt.Component ������ 

		// �ж������ǰ�Ƿ�ӵ�н���
		boolean isFocusOwner()

		// ��������Ƿ����
		void setEnabled(boolean b)
	
	JTextField����ճ����ط�����
		// ���ù�꿪ʼλ�ã�selectionStart >= 0
		void setSelectionStart(int selectionStart)

		// ���ù�����λ�ã�selectionEnd >= selectionStart
		void setSelectionEnd(int selectionEnd)

		// ����ѡ�в����ı�
		void copy()

		// ����ѡ�в����ı�
		void cut()

		// ճ���ı����ı���
		void paste()

	JTextField ���ü�����:

		// ��ӽ����¼�������
		void addFocusListener(FocusListener listener)

		// ����ı����ڵ� �ı��ı� ������
		textField.getDocument().addDocumentListener(DocumentListener listener)

		// ��Ӱ���������
		void addKeyListener(KeyListener listener)
*/
import java.awt.*;
import javax.swing.*;
import java.awt.event.*;
public class Test
{
	public static void main(String[] args){
		JFrame jf=new JFrame("���Դ���");
		jf.setSize(250,250);
		jf.setLocationRelativeTo(null);
		jf.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);

		JPanel panel=new JPanel();
		
		//�����ı���ָ���ɼ�����Ϊ8��
		final JTextField jtf=new JTextField(8);
		jtf.setFont(new Font(null,Font.PLAIN,20));
		panel.add(jtf);

		//����һ����ť��������ȡ�ı����е��ı�
		JButton jb=new JButton("�ύ");
		jb.setFont(new Font(null,Font.PLAIN,20));
		jb.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e){
				System.out.println("�ύ:"+jtf.getText());
			}
		});
		panel.add(jb);

		jf.setContentPane(panel);
		jf.setVisible(true);


	}
}