/*
	javax.swing.BoxLayout

	BoxLayout，箱式布局管理器。它把若干组件按水平或垂直方向依次排列放置。
	Swing 提供了一个实现了 BoxLayout 的容器组件Box。使用 Box 提供的静态方法，
	createHorizontalBox()和createVerticalBox()
	可快速创建水平/垂直箱容器(Box)，以及填充组件之间空隙的不可见组件。
	用水平箱和垂直箱的组合嵌套可实现类似于 GridBagLayout 的效果，但没那么复杂。

	创建 胶状（宽/高可伸缩）的不可见组件（glue）:

	// 创建一个 水平方向胶状 的不可见组件，用于撑满水平方向剩余的空间（如果有多个该组件，则平分剩余空间）
	Component hGlue = Box.createHorizontalGlue();

	// 创建一个 垂直方向胶状 的不可见组件，用于撑满垂直方向剩余的空间（如果有多个该组件，则平分剩余空间）
	Component vGlue = Box.createVerticalGlue();

	// 创建一个 水平和垂直方向胶状 的不可见组件，用于撑满水平和垂直方向剩余的空间（如果有多个该组件，则平分剩余空间）
	Component glue = Box.createGlue();
	
	创建 固定宽度或高度 的不可见组件（struts）:

	// 创建一个 固定宽度 的不可见组件（用于水平箱）
	Component hStrut = Box.createHorizontalStrut(int width);

	// 创建一个 固定高度 的不可见组件（用于垂直箱）
	Component vStrut = Box.createVerticalStrut(int height);
	
	创建 固定宽高 的不可见组件（rigidAreas）:

	// 创建 固定宽高 的不可见组件
	Component rigidArea = Box.createRigidArea(new Dimension(int width, int height));
*/
import java.awt.*;
import javax.swing.*;
public class Test
{
	public static void main(String[] args){
		JFrame jf=new JFrame("测试窗口");
		jf.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);

		JButton jbt1=new JButton("按钮1");
		JButton jbt2=new JButton("按钮2");
		JButton jbt3=new JButton("按钮3");
		JButton jbt4=new JButton("按钮4");
		JButton jbt5=new JButton("按钮5");

		//创建第一个水平箱
		Box hBox1=Box.createHorizontalBox();
		hBox1.add(jbt1);
		hBox1.add(jbt2);
		hBox1.add(jbt3);

		//创建第二个水平箱
		Box hBox2=Box.createHorizontalBox();
		hBox2.add(jbt4);
		hBox2.add(Box.createHorizontalGlue());
		hBox2.add(jbt5);

		//创建一个垂直箱容器，放置上面两个水平箱（Box组合嵌套）
		Box vBox=Box.createVerticalBox();
		vBox.add(hBox1);
		vBox.add(Box.createVerticalStrut(20));
		vBox.add(hBox2);

		//把垂直箱容器作为内容面板
		jf.setContentPane(vBox);

		jf.pack();
		jf.setLocationRelativeTo(null);
		jf.setVisible(true);

	}
}
