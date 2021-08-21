/*
	java.awt.BorderLayout
	BorderLayout，边界布局管理器。它把 Container 按方位分为 5 个区域（东、西、南、北、中），每个区域放置一个组件。

	BorderLayout 构造方法:

	// 构造一个组件之间没有间距的新边框布局
	BorderLayout() 

	// 构造一个具有指定组件间距的边框布局
	BorderLayout(int hgap, int vgap) 

   BorderLayout 表示方位的 5 个常量:

	BorderLayout.NORTH      // 容器的北边
	BorderLayout.SOUTH      // 容器的南边
	BorderLayout.WEST       // 容器的西边
	BorderLayout.EAST       // 容器的东边
	BorderLayout.CENTER     // 容器的中心
*/
import java.awt.*;
import javax.swing.*;
public class Test
{
	public static void main(String[] args){
		JFrame jf=new JFrame("测试窗口");
		jf.setSize(350,250);
		jf.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);

		//创建内容面板容器，指定使用边界布局
		JPanel panel=new JPanel(new BorderLayout());

		//创建5个按钮
		JButton jbt1=new JButton("按钮1");
		JButton jbt2=new JButton("按钮2");
		JButton jbt3=new JButton("按钮3");
		JButton jbt4=new JButton("按钮4");
		JButton jbt5=new JButton("按钮5");

		//把五个按钮添加到容器的5个方位
		panel.add(jbt1, BorderLayout.NORTH);
      panel.add(jbt2, BorderLayout.SOUTH);
      panel.add(jbt3, BorderLayout.WEST);
      panel.add(jbt4, BorderLayout.EAST);
      panel.add(jbt5, BorderLayout.CENTER);

		jf.setContentPane(panel);
		jf.setLocationRelativeTo(null);
		jf.setVisible(true);


	}
}