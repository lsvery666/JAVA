/*
	javax.swing.JTextArea
	�ı�����JTextArea �����༭���е��ı���JTextArea ����������б༭�⣬
	���������÷��� JTextField ����һ�¡�

	���췽����
		����˵��:
      text: Ĭ����ʾ���ı�
      rows: Ĭ�Ͽɼ�������
      columns: Ĭ�Ͽɼ�������
       
		Ĭ���� rows �� columns ������ѡ��С
		JTextArea()

		JTextArea(String text)

		JTextArea(int rows, int columns)

		JTextArea(String text, int rows, int columns)
	
	���÷�����
		// �Ƿ��Զ����У�Ĭ��Ϊ false
		void setLineWrap(boolean wrap)

		// �����Զ����з�ʽ�����Ϊ true�����ڵ��ʱ߽磨�հף�������; ���Ϊ false�������ַ��߽紦���С�Ĭ��Ϊ false��
		void setWrapStyleWord(boolean word)

		// ��ȡ�ı����е��ı�
		String getText()

		// ׷���ı����ĵ�ĩβ
		void append(String str)

		// �滻�����ı�
		void replaceRange(String str, int start, int end)

		// �����ı���� �ı������� �� ������ɫ
		void setText(String text)
		void setFont(Font font)
		void setForeground(Color fg)

		// ��ȡ���ݵ��������Ի��з����㣬�����Զ�����һ�в�������������
		int getLineCount()

		// ��ȡָ���У�������0��ʼ������β���������з�����ȫ���е�ƫ����
		int getLineEndOffset(int line)

		// ��ȡָ��ƫ�������ڵ�������������0��ʼ��
		int getLineOfOffset(int offset)

		// ������ɫ���ֱ�Ϊ: �����ɫ������ѡ�в��ֵı�����ɫ��ѡ�в����ı�����ɫ��������ʱ�ı�����ɫ
		void setCaretColor(Color c)
		void setSelectionColor(Color c)
		void setSelectedTextColor(Color c)
		void setDisabledTextColor(Color c)

		// �����ı����Ƿ�ɱ༭
		void setEditable(boolean b)

		���淽�������� java.awt.Component ������

		// �ж������ǰ�Ƿ�ӵ�н���
		boolean isFocusOwner()

		// ��������Ƿ����
		void setEnabled(boolean b)
	
	JTextArea ����ճ����ط���:

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

	JTextArea ���ü�����:

		// ��ӽ����¼�������
		void addFocusListener(FocusListener listener)

		// ����ı����ڵ� �ı��ı� ������
		textField.getDocument().addDocumentListener(DocumentListener listener)

		// ��Ӱ���������
		void addKeyListener(KeyListener listener)
	
	PS: JTextArea ��ʹ��ʱͨ�������ŵ� JScrollPane ��������ʹ�ã��Դ���ʵ����������ʱ��ˮƽ/��ֱ������Ч����
*/
import java.awt.event.*;
import javax.swing.*;
public class Test
{
	public static void main(String[] args){
		JFrame jf=new JFrame("���Դ���");
		jf.setSize(250,250);
		jf.setLocationRelativeTo(null);
		jf.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);

		JPanel panel=new JPanel();
		
		//����һ��5��10�е��ı�����
		final JTextArea jta=new JTextArea(5,10);
		//�����Զ�����
		jta.setLineWrap(true);
		//��ӵ��������
		panel.add(jta);

		//����һ���ύ��ť������ύ��ȡ�ı�
		JButton jb=new JButton("�ύ");
		jb.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e){
				System.out.println("�ύ:"+jta.getText()+"����"+jta.getLineCount());
			}
		});
		
		panel.add(jb);

		jf.setContentPane(panel);
		jf.setVisible(true);


	}
}