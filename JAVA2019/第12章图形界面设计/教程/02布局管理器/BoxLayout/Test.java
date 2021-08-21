/*
	javax.swing.BoxLayout

	BoxLayout����ʽ���ֹ��������������������ˮƽ��ֱ�����������з��á�
	Swing �ṩ��һ��ʵ���� BoxLayout ���������Box��ʹ�� Box �ṩ�ľ�̬������
	createHorizontalBox()��createVerticalBox()
	�ɿ��ٴ���ˮƽ/��ֱ������(Box)���Լ�������֮���϶�Ĳ��ɼ������
	��ˮƽ��ʹ�ֱ������Ƕ�׿�ʵ�������� GridBagLayout ��Ч������û��ô���ӡ�

	���� ��״����/�߿��������Ĳ��ɼ������glue��:

	// ����һ�� ˮƽ����״ �Ĳ��ɼ���������ڳ���ˮƽ����ʣ��Ŀռ䣨����ж�����������ƽ��ʣ��ռ䣩
	Component hGlue = Box.createHorizontalGlue();

	// ����һ�� ��ֱ����״ �Ĳ��ɼ���������ڳ�����ֱ����ʣ��Ŀռ䣨����ж�����������ƽ��ʣ��ռ䣩
	Component vGlue = Box.createVerticalGlue();

	// ����һ�� ˮƽ�ʹ�ֱ����״ �Ĳ��ɼ���������ڳ���ˮƽ�ʹ�ֱ����ʣ��Ŀռ䣨����ж�����������ƽ��ʣ��ռ䣩
	Component glue = Box.createGlue();
	
	���� �̶���Ȼ�߶� �Ĳ��ɼ������struts��:

	// ����һ�� �̶���� �Ĳ��ɼ����������ˮƽ�䣩
	Component hStrut = Box.createHorizontalStrut(int width);

	// ����һ�� �̶��߶� �Ĳ��ɼ���������ڴ�ֱ�䣩
	Component vStrut = Box.createVerticalStrut(int height);
	
	���� �̶���� �Ĳ��ɼ������rigidAreas��:

	// ���� �̶���� �Ĳ��ɼ����
	Component rigidArea = Box.createRigidArea(new Dimension(int width, int height));
*/
import java.awt.*;
import javax.swing.*;
public class Test
{
	public static void main(String[] args){
		JFrame jf=new JFrame("���Դ���");
		jf.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);

		JButton jbt1=new JButton("��ť1");
		JButton jbt2=new JButton("��ť2");
		JButton jbt3=new JButton("��ť3");
		JButton jbt4=new JButton("��ť4");
		JButton jbt5=new JButton("��ť5");

		//������һ��ˮƽ��
		Box hBox1=Box.createHorizontalBox();
		hBox1.add(jbt1);
		hBox1.add(jbt2);
		hBox1.add(jbt3);

		//�����ڶ���ˮƽ��
		Box hBox2=Box.createHorizontalBox();
		hBox2.add(jbt4);
		hBox2.add(Box.createHorizontalGlue());
		hBox2.add(jbt5);

		//����һ����ֱ��������������������ˮƽ�䣨Box���Ƕ�ף�
		Box vBox=Box.createVerticalBox();
		vBox.add(hBox1);
		vBox.add(Box.createVerticalStrut(20));
		vBox.add(hBox2);

		//�Ѵ�ֱ��������Ϊ�������
		jf.setContentPane(vBox);

		jf.pack();
		jf.setLocationRelativeTo(null);
		jf.setVisible(true);

	}
}
