/*
	����JLabel��ǩ��
	���췽����
		JLabel(String s){}
		JLabel(String s,int hAlignment){}
		JLabel(ImageIcon image){}
		JLabel(ImageIcon image,int hAlignment){}
		����hAlignment����������ʾ����Ϣ�Ķ��뷽ʽ�������֣�JLabel.BOTTOM,JLabel.LEFT,JLabel.RIGHT,JLabel.TOP,JLabel.CENTER
		Ĭ�ϲ��������
*/
import java.awt.*;
import javax.swing.*;
public class Test05
{
	public static void main(String[] args){
		Questionnaire q=new Questionnaire();
		q.go();
	}
}
class Questionnaire
	{	
		JFrame win=new JFrame("�����ʾ�");
		Container contentPane=win.getContentPane();
		JLabel que=new JLabel("������������",JLabel.CENTER);
		JLabel l1=new JLabel("1.ϲ���������˶�:",JLabel.LEFT);
		JCheckBox c1=new JCheckBox("����",true);
		JCheckBox c2=new JCheckBox("����");
		JCheckBox c3=new JCheckBox("��ë��");
		JPanel p=new JPanel();
		JPanel p1=new JPanel();
		
		public void go(){
			contentPane.setLayout(new BorderLayout());
			p1.setLayout(new GridLayout(4,1));
			p1.add(l1);
			p1.add(c1);
			p1.add(c2);
			p1.add(c3);
			p.add(p1);
			contentPane.add(que,BorderLayout.NORTH);
			contentPane.add(p,BorderLayout.CENTER);
			win.setSize(400,300);
			win.setVisible(true);
			win.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
		}
	}