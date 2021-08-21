/*
	java.awt.FlowLayout
	流式布局

	FlowLayout，流式布局管理器。按水平方向依次排列放置组件，排满一行，换下一行继续排列。排列方向（左到右 或 右到左）取决于容器的componentOrientation属性（该属性属于Component），它可能的值如下:

	ComponentOrientation.LEFT_TO_RIGHT（默认）
	ComponentOrientation.RIGHT_TO_LEFT

	同一行（水平方向）的组件的对齐方式由 FlowLayout 的align属性确定，它可能的值如下:

	FlowLayout.LEFT : 左对齐
	FlowLayout.CENTER : 居中对齐（默认）
	FlowLayout.RIGHT : 右对齐
	FlowLayout.LEADING : 与容器方向的开始边对齐，例如，对于从左到右的方向，则与左边对齐
	FlowLayout.TRAILING : 与容器方向的结束边对齐，例如，对于从左到右的方向，则与右边对齐。
	
	FlowLayout(){}											//具有中心对齐和默认的5单位水平和垂直间隙
	FlowLayout(int align){}                      //构造新的FlowLayout具有指定的对齐和默认的5单位水平和垂直间隙
	FlowLayout(int align,int hGap,int vGap){}    //创建一个新的流程布局管理器，具有指示的对齐方式和指示的水平和垂直间距
	int align代表行对齐方式，有五种：LEFT,CENTER,RIGHT,LEADING(与开始方向对齐）或 TRAILING（与结束方向对齐）
	int hGap和int vGap代表组件间的水平和垂直间距
	*/
	import java.awt.*;
	import javax.swing.*;
	public class Test01
	{
		public static void main(String[] args){
			JFrame jf=new JFrame("测试窗口");
			jf.setSize(200,250);
			jf.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
			jf.setLocationRelativeTo(null);
			
			//创建中间容器，指定使用流式布局
			//JPanel panel=new JPanel(new FlowLayout());
			JPanel panel=new JPanel(new FlowLayout(FlowLayout.LEFT));

			JButton btn1=new JButton("按钮1");
			JButton btn2=new JButton("按钮2");
			JButton btn3=new JButton("按钮3");
			JButton btn4=new JButton("按钮4");
			JButton btn5=new JButton("按钮5");

			panel.add(btn1);
			panel.add(btn2);
			panel.add(btn3);
			panel.add(btn4);
			panel.add(btn5);

			//将该中间容器添加到内容面板上
			jf.setContentPane(panel);
			jf.setVisible(true);
		}


	}

