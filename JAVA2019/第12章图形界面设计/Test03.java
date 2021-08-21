/*
	关于JFrame容器
	方法：
		 构造方法：
		 JFrame(){}
		 JFrame(String text){}
		 设置窗口大小：
		 void pack(){}
		 void setSize(int w,int h){}
		 void setBounds(x,y,w,h){}
		 设置标题：
		 void setTitle(String s){}
		 设置颜色：
		 void setForeground(Color c){}
		 void setBackground(Color c){}
		 显示：
		 void setVisible(boolean b){}
		 void show(){}
*/
import java.awt.*;
import javax.swing.*;
public class Test03
{
	public static void main(String[] args){
		JFrame win=new JFrame();

		//设置窗口大小
		//win.setSize(200,200);
		//win.pack();
		win.setBounds(400,400,200,200);

		//设置标题
		win.setTitle("帮助窗口");

		//设置颜色
		win.setForeground(Color.red);
		win.setBackground(Color.blue);

		//获取容器
		Container contentPane=win.getContentPane();
		//设置容器的布局管理器，如果没有这句，Frame容器默认采用BorderLayout
		contentPane.setLayout(null);
		//创建组件
		JButton queding=new JButton("确定");
		//自定义布局
		//窗口左上角为坐标原点
		queding.setBounds(10,30,80,40);
		contentPane.add(queding);

		//显示
		win.setVisible(true);
		//win.show();
		win.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);

	}
}

