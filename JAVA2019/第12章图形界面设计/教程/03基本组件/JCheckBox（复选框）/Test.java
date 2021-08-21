/*
	javax.swing.JCheckBox
	复选框
	构造方法：
		// 无文本，默认未选中
		JCheckBox()

		// 有文本，默认未选中
		JCheckBox(String text)

		// 有文本，并指定是否选中
		JCheckBox(String text, boolean selected)
	常用方法：
		// 设置复选框的 文本、字体 和 字体颜色
		void setText(String text)
		void setFont(Font font)
		void setForeground(Color fg)

		以下方法定义在 javax.swing.AbstractButton 基类中

		// 设置复选框是否选中状态
		void setSelected(boolean b)

		// 判断复选框是否选中
		boolean isSelected()

		// 设置复选框是否可用
		void setEnabled(boolean enable)

		// 设置图片和文本的间距
		void setIconTextGap(int iconTextGap)
	常用监听器：
		// 添加状态改变监听器
		void addChangeListener(ChangeListener l)
*/
import javax.swing.*;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;
public class Test
{
	public static void main(String[] args){
		JFrame jf=new JFrame("测试窗口");
		jf.setSize(250,250);
		jf.setLocationRelativeTo(null);
		jf.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);

		JPanel panel=new JPanel();

		//创建复选框
		JCheckBox cb1=new JCheckBox("菠萝");
		JCheckBox cb2=new JCheckBox("香蕉");
		JCheckBox cb3=new JCheckBox("雪梨");
		JCheckBox cb4=new JCheckBox("荔枝");
		JCheckBox cb5=new JCheckBox("橘子");
		JCheckBox cb6=new JCheckBox("苹果");

		//添加第一个复选框的状态被改变的监听（其他复选框如果需要监听状态改变，则可按此方法添加监听）
		cb1.addChangeListener(new ChangeListener(){
			public void stateChanged(ChangeEvent e){
				//获取事件源（即复选框本身）
				JCheckBox cb=(JCheckBox)e.getSource();
				System.out.println(cb.getText()+"是否选中"+cb.isSelected());
			}
		});

		//设置默认第一个复选框选中
		cb1.setSelected(true);

		panel.add(cb1);
		panel.add(cb2);
		panel.add(cb3);
		panel.add(cb4);
		panel.add(cb5);

		jf.setContentPane(panel);
		jf.setVisible(true);


	}
}
