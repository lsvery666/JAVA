/*
	java.awt.GridLayout
	GridLayout，网格布局管理器。它以矩形网格形式对容器的组件进行布置，
	把容器按行列分成大小相等的矩形网格，一个网格中放置一个组件，组件宽高自动撑满网格。

	以行数和总数优先: 通过构造方法或 setRows 和 setColumns 方法将行数和列数都设置为非零值时，
	指定的列数将被忽略。列数通过指定的行数和布局中的组件总数来确定。
	因此，例如，如果指定了三行和两列，在布局中添加了九个组件，
	则它们将显示为三行三列。仅当将行数设置为零时，指定列数才对布局有效。
   
	GridLayout(){}                              //在单个行中创建一个每个组件的默认值为一列的网格布局
	GridLayout(int rows,int lines){}            //构造一个行列数为rows，lines的网格布局管理器
	GridLayout(int rows,int cols,int hgap,int vgap){}
*/
import java.awt.*;
import javax.swing.*;
public class Test
{
	public static void main(String[] args){
		JFrame jf=new JFrame("测试窗口");
		jf.setSize(300,300);
		jf.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
		jf.setLocationRelativeTo(null);

		//创建3行3列的网格布局
		GridLayout gl=new GridLayout(3,3);

		//设置水平和竖直间隙
		gl.setHgap(10);
		gl.setVgap(10);
		
		//获取内容面板
		Container contentPane=jf.getContentPane();

		//创建中间容器
		JPanel panel=new JPanel(gl);

		//创建基本组件
		JButton jbt1=new JButton("按钮1");
		JButton jbt2=new JButton("按钮2");
		JButton jbt3=new JButton("按钮3");
		JButton jbt4=new JButton("按钮4");
		JButton jbt5=new JButton("按钮5");
		JButton jbt6=new JButton("按钮6");
		JButton jbt7=new JButton("按钮7");
		JButton jbt8=new JButton("按钮8");
		
		//添加基本组件
		panel.add(jbt1);
		panel.add(jbt2);
		panel.add(jbt3);
		panel.add(jbt4);
		panel.add(jbt5);
		panel.add(jbt6);
		panel.add(jbt7);
		panel.add(jbt8);
		
		//为内容面板添加容器
		contentPane.add(panel);
		jf.setVisible(true);

	}
}
