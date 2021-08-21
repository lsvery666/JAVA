/*
	java.awt.GridLayout
	GridLayout�����񲼾ֹ����������Ծ���������ʽ��������������в��ã�
	�����������зֳɴ�С��ȵľ�������һ�������з���һ��������������Զ���������

	����������������: ͨ�����췽���� setRows �� setColumns ����������������������Ϊ����ֵʱ��
	ָ���������������ԡ�����ͨ��ָ���������Ͳ����е����������ȷ����
	��ˣ����磬���ָ�������к����У��ڲ���������˾Ÿ������
	�����ǽ���ʾΪ�������С���������������Ϊ��ʱ��ָ�������ŶԲ�����Ч��
   
	GridLayout(){}                              //�ڵ������д���һ��ÿ�������Ĭ��ֵΪһ�е����񲼾�
	GridLayout(int rows,int lines){}            //����һ��������Ϊrows��lines�����񲼾ֹ�����
	GridLayout(int rows,int cols,int hgap,int vgap){}
*/
import java.awt.*;
import javax.swing.*;
public class Test
{
	public static void main(String[] args){
		JFrame jf=new JFrame("���Դ���");
		jf.setSize(300,300);
		jf.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
		jf.setLocationRelativeTo(null);

		//����3��3�е����񲼾�
		GridLayout gl=new GridLayout(3,3);

		//����ˮƽ����ֱ��϶
		gl.setHgap(10);
		gl.setVgap(10);
		
		//��ȡ�������
		Container contentPane=jf.getContentPane();

		//�����м�����
		JPanel panel=new JPanel(gl);

		//�����������
		JButton jbt1=new JButton("��ť1");
		JButton jbt2=new JButton("��ť2");
		JButton jbt3=new JButton("��ť3");
		JButton jbt4=new JButton("��ť4");
		JButton jbt5=new JButton("��ť5");
		JButton jbt6=new JButton("��ť6");
		JButton jbt7=new JButton("��ť7");
		JButton jbt8=new JButton("��ť8");
		
		//��ӻ������
		panel.add(jbt1);
		panel.add(jbt2);
		panel.add(jbt3);
		panel.add(jbt4);
		panel.add(jbt5);
		panel.add(jbt6);
		panel.add(jbt7);
		panel.add(jbt8);
		
		//Ϊ��������������
		contentPane.add(panel);
		jf.setVisible(true);

	}
}
