/*
	javax.swing.JComboBox
	�����б��JComboBox�������б����ʽչʾ���ѡ��û����Դ������б���ѡ��һ��ֵ��

	���е�ѡ��������һ�� ComboBoxModel ʵ����ά����

	�������JComboBoxΪ�ɱ༭״̬������ѡ��ָ����ѡ��ֵ�⣬�������û���������ֵ�����������ֵ����Ϊ-1����

	���췽����
	
	 * һ�� JComboBox ʵ��ά����һ�� ComboBoxModel ʵ����
	 * ComboBoxModel ʵ������ֱ�Ӵ�����Ҳ����ͨ���� ���� �� ���� ���ݵ� JComboBox �м�Ӵ�����
	 * JComboBox �ڲ������� ComboBoxModel ʵ���� DefaultComboBoxModel��
	 
		JComboBox()

		JComboBox(ComboBoxModel model)

		JComboBox(Object[] items)

		JComboBox(Vector<?> items)
	
	JComboBox ���÷���:

		// ����ѡ�е�����
		void setSelectedIndex(int index)

		// ��ȡ��ǰѡ�е�����
		int getSelectedIndex()

		// ��ȡ��ǰѡ�е�������
		Object getSelectedItem()

		// ����ѡ������ģ��
		void setModel(ComboBoxModel<?> model)

		// ��ȡά��ѡ�����ݵ� ComboBoxModel��
		// ��ͨ�� model.getElementAt(int index) �� model.getSize() 
		// �ɷֱ� ��ȡָ��������ѡ������ �� ѡ��������
		ComboBoxModel<?> getModel()

		// ���ѡ��ѡ��״̬�ı�ļ�����
		void addItemListener(ItemListener listener)

		// ���������б���Ƿ�ɱ༭��Ĭ�ϲ��ɱ༭��
		// �������Ϊ�ɱ༭�������ѡ��ָ����ѡ��ֵ�⣬�������û���������ֵ�����������ֵ����Ϊ-1��
		void setEditable(boolean flag)
*/
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

		//���һ����ǩ��
		JLabel label=new JLabel("ˮ��");
		panel.add(label);

		//��Ҫѡ�����Ŀ
		String[] listData=new String[]{"�㽶","ѩ��","ƻ��","��֦"};
		
		//����һ�������б��
		final JComboBox<String> comboBox=new JComboBox<String>(listData);
		
		//�����Ŀ״̬�ı�ļ�����
		comboBox.addItemListener(new ItemListener(){
			public void itemStateChanged(ItemEvent e){
				if(e.getStateChange()==ItemEvent.SELECTED){
					System.out.println("ѡ��"+comboBox.getSelectedIndex()+"="+comboBox.getSelectedItem());
				}
			}
		});

		//����Ĭ��ѡ�е���Ŀ
		comboBox.setSelectedIndex(2);

		panel.add(comboBox);

		jf.setContentPane(panel);
		jf.setVisible(true);


	}
}