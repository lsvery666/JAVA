/*
	javax.swing.*;
		JFrame 窗口
			JFrame(String str){}                   //构造一个标题为str的窗口
			public Container getContentPane(){}    //返回该窗口的容器
			public void setContentPane​(Container contentPane)  //为该窗口设置一个面板容器 
			public void setSize(int width, int height){}  //设置窗口的长宽
			public void setVisible(boolean b){}    //可视化

		JLabel 标签
			JLabel(String text,int horizontalAlignment){}   //LEFT,CENTER,RIGHT,LEADING(与开始方向对齐）或 TRAILING（与结束方向对齐）
			
		JButton 按钮
			JButton(String text){}                 //构造一个信息为text的按钮

	java.awt.*;	
		Container 容器
			public void setLayout(LayoutManager lm){}   //为该容器选择一种布局管理器
			public Component add(Component cmp){}		  //将指定的组件附加到此容器的末尾	

		GridLayout 网格布局管理器 
			GridLayout(){}                              //在单个行中创建一个每个组件的默认值为一列的网格布局
			GridLayout(int rows,int lines){}            //构造一个行列数为rows，lines的网格布局管理器
			GridLayout(int rows,int cols,int hgap,int vgap){}
			如果要摆放的组件大于GridLayout所设置的单元格个数，多出来的组件也会被摆放在窗口中，但是会破坏原来的样式
			
		FlowLayout 流布局管理器  Panel和Applet容器默认采用
			FlowLayout(){}										  //具有中心对齐和默认的5单位水平和垂直间隙
			FlowLayout(int align){}                     //构造新的FlowLayout具有指定的对齐和默认的5单位水平和垂直间隙
			FlowLayout(int align,int hGap,int vGap){}    //创建一个新的流程布局管理器，具有指示的对齐方式和指示的水平和垂直间距
			int align代表行对齐方式，有五种：LEFT,CENTER,RIGHT,LEADING(与开始方向对齐）或 TRAILING（与结束方向对齐）
			int hGap和int vGap代表组件间的水平和垂直间距

		BoderFlowout 边界布局管理器  Frame容器默认采用
			上北下南左西右东中间五个区域：BorderLayout.NORTH、BorderLayout.SOUTH、BorderLayout.WEST、BorderLayout.EAST、BorderLayout.CENTER
			优先排列上北
		
		
	
*/
import java.awt.*;
import javax.swing.*;
public class Test01
{
	public void go(){
		//创建窗口
		JFrame win=new JFrame("帮助窗口");

		

		//设置窗口可视化
		win.setVisible(true);

		//设置窗口尺寸
		win.setSize(200,200);//未添加组件前 这句话不能写在setVisible之前

	

		// 把窗口位置设置到屏幕中心
		win.setLocationRelativeTo(null);    
		
		// 当点击窗口的关闭按钮时退出程序（没有这一句，程序不会退出）
      win.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE); 

		

		//返回该窗口的容器
		Container contentPane=win.getContentPane();

		//设置该容器的布局管理器
		//contentPane.setLayout(new GridLayout(5,1));
		//contentPane.setLayout(new FlowLayout());
		contentPane.setLayout(new FlowLayout(FlowLayout.LEADING,50,50));

		//创建组件
		JLabel labOne=new JLabel("计算机基础模拟练习系统1.0",JLabel.CENTER);
		JLabel labTwo=new JLabel("北京信息职业技术学院",JLabel.CENTER);
		JLabel labThree=new JLabel("软件工程系制作",JLabel.CENTER);
		JLabel labFour=new JLabel("(c)版权所有2010年6月",JLabel.CENTER);
		JButton queding=new JButton("确定");

		

		//添加组件
		contentPane.add(labOne);
		contentPane.add(labTwo);
		contentPane.add(labThree);
		contentPane.add(labFour);
		contentPane.add(queding);

		


	}
	public static void main(String[] args){
		Test01 t=new Test01();
		t.go();
	}

}