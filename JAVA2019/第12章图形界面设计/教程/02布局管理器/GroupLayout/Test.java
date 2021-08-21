/*
	javax.swing.GroupLayout

	GroupLayout�����鲼�ֹ������������齨����η��飬�Ծ��������� Container �е�λ�á�
	GroupLayout ��Ҫ��������ʹ�ã����� ������ �� �����飩��������GroupLayout.Group���ʵ������ɣ�
	ÿ������԰�������������Ԫ�أ�Group��Component �� Gap����

	GroupLayout֧��������:

	������ (sequential group)����˳����ָ������ˮƽ/��ֱ���������Ԫ�ء�
	������ (parallel group)����ָ������ˮƽ/��ֱ����������Ԫ�أ��ܹ������ֲ�ͬ��ʽ��������Ԫ�ء�
	PS: ���кͲ��и��ݲ�ͬ�ķ���ˮƽ/��ֱ���򣩣�Ԫ�ص����з�ʽҲ��ͬ�����ϵ��� �� �����ң���

	Group�Ĵ����Լ�Ԫ�ص����:

	// �ȴ������鲼�֣�����������
	GroupLayout layout = new GroupLayout(panel);

	// ���� ������
	GroupLayout.SequentialGroup seqGroup = layout.createSequentialGroup();
	// ��� ��Ԫ��
	seqGroup.addGroup(group);
	// ��� ���Ԫ��
	seqGroup.addComponent(component);
	// ��� ��϶
	seqGroup.addGap(size);

	// ���� ������
	GroupLayout.ParallelGroup paralGroup = layout.createParallelGroup();
	// ��� ��Ԫ�أ���ָ�����뷽ʽ��
	paralGroup.addGroup([alignment,] group);
	// ��� ���Ԫ�أ���ָ�����뷽ʽ��
	paralGroup.addComponent(component, [alignment]);
	// ��� ��϶
	paralGroup.addGap(size);

	GroupLayout �� X�ᣨˮƽ���򣩺� Y�ᣨ��ֱ���򣩵����Դ��������Ҫ�� GroupLayout �� ˮƽ �� ��ֱ �����Ϸֱ�ָ��һ���飬���ֱ�ȷ������� ˮƽ���� �� ��ֱ���� �ϵ�λ�á�

	���� GroupLayout ���������ϵ���:

	// ָ�����ֵ�ˮƽ�飨ȷ������� X�� �����ϵ�λ�ã�
	GroupLayout.setHorizontalGroup(GroupLayout.Group group);

	// ָ�����ֵĴ�ֱ�飨ȷ������� Y�� �����ϵ�λ�ã�
	GroupLayout.setVerticalGroup(GroupLayout.Group group);
*/
import java.awt.*;
import javax.swing.*;
public class Test
{
	public static void main(String[] args)
	{
		JFrame jf=new JFrame("���Դ���");
		jf.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);

		/*
			����
		//�������鲼�֣�����������
		GroupLayout layout=new GroupLayout(panel);
		
		//���������������
		JPanel panel=new JPanel(layout);
		*/
		
		//���������������
		JPanel panel=new JPanel();
		//�������鲼�֣�����������
		GroupLayout layout=new GroupLayout(panel);
		panel.setLayout(layout);

		//�������
		JButton jbt1=new JButton("��ť1");
		JButton jbt2=new JButton("��ť2");
		JButton jbt3=new JButton("��ť3");
		JButton jbt4=new JButton("��ť4");
		JButton jbt5=new JButton("��ť5");

		//�Զ��������֮��ļ�϶
		layout.setAutoCreateGaps(true);
		//�Զ����������봥�������߿�����֮��ļ�϶
		layout.setAutoCreateContainerGaps(true);
		
		/*
			ˮƽ��(��ȷ��X�᷽�������/���з�ʽ)

			ˮƽ���У�ˮƽ���У��������У�
			ˮƽ���У���ֱ���У��������У�
		*/
		//ˮƽ���У����£�btn1��btn2
		GroupLayout.ParallelGroup hParalGroup1=layout.createParallelGroup().addComponent(jbt1).addComponent(jbt2);
		
		//ˮƽ���У����£�btn3��btn4
		GroupLayout.ParallelGroup hParalGroup2=layout.createParallelGroup().addComponent(jbt3).addComponent(jbt4);
		
		//ˮƽ����(����)hParallelGroup1��hParallelGroup2
		GroupLayout.SequentialGroup hSeqGroup=layout.createSequentialGroup().addGroup(hParalGroup1).addGroup(hParalGroup2);
		
		//ˮƽ���У����£�hseqGroup��btn05
		GroupLayout.ParallelGroup hParalGroup=layout.createParallelGroup().addGroup(hSeqGroup).addComponent(jbt5,GroupLayout.Alignment.CENTER);
		
		layout.setHorizontalGroup(hParalGroup);  // ָ�����ֵ� ˮƽ�飨ˮƽ���꣩
		
      /*
			��ֱ�飨��ȷ�� Y �᷽�������/���з�ʽ��
         
         ��ֱ����: ��ֱ���У��������У�
         ��ֱ����: ˮƽ���У��������У�
      */
      // ��ֱ���У����ң�btn01 �� btn03
      GroupLayout.ParallelGroup vParalGroup01 = layout.createParallelGroup().addComponent(jbt1).addComponent(jbt3);

      // ��ֱ���У����ң�btn02 �� btn04
      GroupLayout.ParallelGroup vParalGroup02 = layout.createParallelGroup().addComponent(jbt2).addComponent(jbt4);

      // ��ֱ���У����£�vParalGroup01, vParalGroup02 �� btn05
      GroupLayout.SequentialGroup vSeqGroup = layout.createSequentialGroup().addGroup(vParalGroup01).addGroup(vParalGroup02).addComponent(jbt5);

      layout.setVerticalGroup(vSeqGroup);    // ָ�����ֵ� ��ֱ�飨��ֱ���꣩

      jf.setContentPane(panel);
      jf.pack();
      jf.setLocationRelativeTo(null);
      jf.setVisible(true);

	}
}