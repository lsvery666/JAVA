/*
	JToggleButton
	javax.swing.JToggleButton
	开关按钮 JToggleButton 是 JRadioButton, JCheckBox 的父类，
	主要实现一个按钮的两种状态（选中 和 未选中）来实现开关切换的效果。

	构造方法：
		// 无文本，默认未选中
		JToggleButton()

		// 有文本，默认未选中
		JToggleButton(String text)

		// 有文本，并指定是否选中
		JToggleButton(String text, boolean selected)

	常用方法：
		/ 设置开关按钮的 文本、字体 和 字体颜色
		void setText(String text)
		void setFont(Font font)
		void setForeground(Color fg)

		以下方法定义在 javax.swing.AbstractButton 基类中

		// 设置开关按钮是否选中状态
		void setSelected(boolean b)

		// 判断开关按钮是否选中
		boolean isSelected()

		// 设置开关按钮是否可用
		void setEnabled(boolean enable)

		// 设置开关按钮在 默认(关)、被选中(开)、不可用 时显示的图片
		void setIcon(Icon defaultIcon)
		void setPressedIcon(Icon pressedIcon)
		void setDisabledIcon(Icon disabledIcon)

		// 设置图片和文本之间的间距
		void setIconTextGap(int iconTextGap)
	
	JToggleButton 常用监听器:

		// 添加状态改变监听器
		void addChangeListener(ChangeListener l)

	可以在main方法里加这么一段代码，可以让界面好看点
		try{
			UIManager.setLookAndFeel("com.sun.java.swing.plaf.nimbus.NimbusLookAndFeel");
		}catch (Exception e){
			e.printStackTrace();
		}
*/
//默认的开关按钮
import javax.swing.event.*;
import javax.swing.*;
public class Test01
{
	public static void main(String[] args){
		JFrame jf=new JFrame("测试窗口");
		jf.setSize(250,250);
		jf.setLocationRelativeTo(null);
		jf.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);

		JPanel panel=new JPanel();

		JToggleButton jtb=new JToggleButton("开关按钮");

		jtb.addChangeListener(new ChangeListener(){
			public void stateChanged(ChangeEvent e){
				JToggleButton jtb=(JToggleButton)e.getSource();
				System.out.println(jtb.getText()+"是否选中"+jtb.isSelected());
			}
		});
		
		try{
			UIManager.setLookAndFeel("com.sun.java.swing.plaf.nimbus.NimbusLookAndFeel");
		}catch (Exception e){
			e.printStackTrace();
		}
		panel.add(jtb);
		jf.setContentPane(panel);
		jf.setVisible(true);

	}
}









	