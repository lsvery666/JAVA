/*
	һ�� Java ��ͼ�ν��棬�ɸ��ֲ�ͬ���͵ġ�Ԫ�ء���ɣ�����: ���ڡ��˵������Ի��򡢱�ǩ����ť���ı���ȵȣ���Щ��Ԫ�ء�ͳһ����Ϊ �����Component����

	������ղ�ͬ�Ĺ��ܣ��ɷ�Ϊ �����������м����������������һ���򵥴��ڵ���ɣ����²㼶�ṹ��ʾ:

	��������
		�˵���
		�м�����
			�������
			�������
	
	������͵ļ̳й�ϵ:

	�������� ���ڴ�����������̳���java.awt.Window��
	�м����� �� ������� �̳���javax.swing.JComponent��

	����������JFrame��JDialog  ���һ�㲻ֱ�Ӱڷ���JFrame�����ϣ�����ͨ��getContentPane+add ��setContentPane �ڷ���contentPane��
										���ֹ�����Ҳ�Ƕ�contenrPane���õ�

	�м�������JPanel           �м�����������Ϊ�м����������
	���������JLabel,JButton
*/
import javax.swing.*;

public class Test01{

    public static void main(String[] args) {
        // 1. ����һ���������������ڣ�
        JFrame jf = new JFrame("���Դ���");          // ��������
        jf.setSize(250, 250);                       // ���ô��ڴ�С
        jf.setLocationRelativeTo(null);             // �Ѵ���λ�����õ���Ļ����
        jf.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE); // ��������ڵĹرհ�ťʱ�˳�����û����һ�䣬���򲻻��˳���

        // 2. �����м����������������
        JPanel panel = new JPanel();                // �������������ʹ��Ĭ�ϵĲ��ֹ�����

        // 3. ����һ�������������ť��������ӵ� ������� ��
        JButton btn = new JButton("���԰�ť");
        panel.add(btn);

        // 4. �� ������� ��Ϊ���ڵ�������� ���õ� ����
        jf.setContentPane(panel);

        // 5. ��ʾ���ڣ�ǰ�洴������Ϣ�����ڴ��У�ͨ�� jf.setVisible(true) ���ڴ��еĴ�����ʾ����Ļ�ϡ�
        jf.setVisible(true);
    }

}
