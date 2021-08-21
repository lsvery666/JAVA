/*
	自定义布局
	针对组件，而不是针对窗口
*/
import java.awt.*;
import javax.swing.*;
public class Test02
{
	public static void main(String[] args){
		//创建窗口
		JFrame win=new JFrame("帮助窗口");
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
		win.setSize(200,200);
		win.setVisible(true);
		win.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE); 
	}
}