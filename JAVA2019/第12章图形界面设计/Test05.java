/*
	关于JLabel标签：
	构造方法：
		JLabel(String s){}
		JLabel(String s,int hAlignment){}
		JLabel(ImageIcon image){}
		JLabel(ImageIcon image,int hAlignment){}
		参数hAlignment是设置所显示的信息的对齐方式，有五种：JLabel.BOTTOM,JLabel.LEFT,JLabel.RIGHT,JLabel.TOP,JLabel.CENTER
		默认采用左对齐
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
		JFrame win=new JFrame("调查问卷");
		Container contentPane=win.getContentPane();
		JLabel que=new JLabel("基本情况调查表",JLabel.CENTER);
		JLabel l1=new JLabel("1.喜欢的体育运动:",JLabel.LEFT);
		JCheckBox c1=new JCheckBox("足球",true);
		JCheckBox c2=new JCheckBox("篮球");
		JCheckBox c3=new JCheckBox("羽毛球");
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