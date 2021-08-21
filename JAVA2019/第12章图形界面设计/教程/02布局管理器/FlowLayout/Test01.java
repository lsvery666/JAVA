/*
	java.awt.FlowLayout
	��ʽ����

	FlowLayout����ʽ���ֹ���������ˮƽ�����������з������������һ�У�����һ�м������С����з������� �� �ҵ���ȡ����������componentOrientation���ԣ�����������Component���������ܵ�ֵ����:

	ComponentOrientation.LEFT_TO_RIGHT��Ĭ�ϣ�
	ComponentOrientation.RIGHT_TO_LEFT

	ͬһ�У�ˮƽ���򣩵�����Ķ��뷽ʽ�� FlowLayout ��align����ȷ���������ܵ�ֵ����:

	FlowLayout.LEFT : �����
	FlowLayout.CENTER : ���ж��루Ĭ�ϣ�
	FlowLayout.RIGHT : �Ҷ���
	FlowLayout.LEADING : ����������Ŀ�ʼ�߶��룬���磬���ڴ����ҵķ���������߶���
	FlowLayout.TRAILING : ����������Ľ����߶��룬���磬���ڴ����ҵķ��������ұ߶��롣
	
	FlowLayout(){}											//�������Ķ����Ĭ�ϵ�5��λˮƽ�ʹ�ֱ��϶
	FlowLayout(int align){}                      //�����µ�FlowLayout����ָ���Ķ����Ĭ�ϵ�5��λˮƽ�ʹ�ֱ��϶
	FlowLayout(int align,int hGap,int vGap){}    //����һ���µ����̲��ֹ�����������ָʾ�Ķ��뷽ʽ��ָʾ��ˮƽ�ʹ�ֱ���
	int align�����ж��뷽ʽ�������֣�LEFT,CENTER,RIGHT,LEADING(�뿪ʼ������룩�� TRAILING�������������룩
	int hGap��int vGap����������ˮƽ�ʹ�ֱ���
	*/
	import java.awt.*;
	import javax.swing.*;
	public class Test01
	{
		public static void main(String[] args){
			JFrame jf=new JFrame("���Դ���");
			jf.setSize(200,250);
			jf.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
			jf.setLocationRelativeTo(null);
			
			//�����м�������ָ��ʹ����ʽ����
			//JPanel panel=new JPanel(new FlowLayout());
			JPanel panel=new JPanel(new FlowLayout(FlowLayout.LEFT));

			JButton btn1=new JButton("��ť1");
			JButton btn2=new JButton("��ť2");
			JButton btn3=new JButton("��ť3");
			JButton btn4=new JButton("��ť4");
			JButton btn5=new JButton("��ť5");

			panel.add(btn1);
			panel.add(btn2);
			panel.add(btn3);
			panel.add(btn4);
			panel.add(btn5);

			//�����м�������ӵ����������
			jf.setContentPane(panel);
			jf.setVisible(true);
		}


	}

