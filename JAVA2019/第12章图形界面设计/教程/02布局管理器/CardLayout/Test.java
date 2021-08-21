/*
	javax.swing.CardLayout

	CardLayout，卡片布局管理器。它将容器中的每个组件看作一张卡片，一次只能看到一张卡片，容器则充当卡片的堆栈，默认显示第一张卡片。

	CardLayout 构造方法:

	// 创建一个间距大小为 0 的卡片布局
	CardLayout()

	// 创建一个指定水平/垂直间距大小的卡片布局。
	CardLayout(int hgap, int vgap) 

	CardLayout 常用方法:

	// 显示第一张卡片
	void first(Container parent);

	// 显示最后一张卡片
	void last(Container parent);

	// 显示下一张卡片（自动循环显示）
	void next(Container parent);

	// 显示上一张卡片（自动循环显示）
	void previous(Container parent);

	// 显示指定名称的组件（添加组件到容器时，可同时添加组件的名称）
	void show(Container parent, String name);
*/
import java.awt.*;
import javax.swing.*;
import java.awt.event.*;
public class Test
{
	public static void main(String[] args){
		JFrame jf=new JFrame("测试窗口");
		jf.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
		jf.setSize(300,200);

		//创建卡片布局，卡片间水平和竖直间隔为100,10
		final CardLayout layout =new CardLayout(100,10);

		//创建内容面板容器，指定布局管理器
		final JPanel panel=new JPanel();
		panel.setLayout(layout);

		//以上三句话可以写成：
		//final JPanel panel=new JPanel(new CardLayout(10,10));

		JButton jbt1=new JButton("按钮1");
		JButton jbt2=new JButton("按钮2");
		JButton jbt3=new JButton("按钮3");

		panel.add(jbt1,"1");
		panel.add(jbt2,"2");
		panel.add(jbt3,"3");

		//先显示第二个
		layout.show(panel,"2");

		jf.setContentPane(panel);
		jf.setLocationRelativeTo(null);
		jf.setVisible(true);

		//每间隔2秒切换显示下一个
		new Timer(1000,new ActionListener(){
			public void actionPerformed(ActionEvent e){
				layout.next(panel);
			}
		}).start();
	}
}