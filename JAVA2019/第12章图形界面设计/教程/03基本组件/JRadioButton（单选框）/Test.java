/*
	javax.swing.JRadioButton
	单选按钮
	构造方法：
		// 无文本，未选中
		JRadioButton()

		// 有文本，未选中
		JRadioButton(String text)

		// 有文本，并指定是否选中
		JRadioButton(String text, boolean selected)

	常用方法：
		// 设置单选按钮的 文本、字体 和 字体颜色
		void setText(String text)
		void setFont(Font font)
		void setForeground(Color fg)

		/以下方法定义在 javax.swing.AbstractButton 基类中 

		// 设置单选按钮是否选中状态
		void setSelected(boolean b)

		// 判断单选按钮是否选中
		boolean isSelected()

		// 设置单选按钮是否可用
		void setEnabled(boolean enable)

		// 设置单选按钮在 默认、被选中、不可用 时显示的图片
		void setIcon(Icon defaultIcon)
		void setPressedIcon(Icon pressedIcon)
		void setDisabledIcon(Icon disabledIcon)

		// 设置图片和文本的间距
		void setIconTextGap(int iconTextGap)
		
	常用监听器：
		// 添加状态改变监听器
		void addChangeListener(ChangeListener l)

	ButtonGroup(按钮组):
		当有多个单选按钮时，一般只允许一个单选按钮选中，因此需要对同一类型的单选按钮进行分组，如下:
		// 创建一个按钮组
		ButtonGroup btnGroup = new ButtonGroup();

		// 添加单选按钮到按钮组
		btnGroup.add(radioBtn01);
		btnGroup.add(radioBtn02);
*/
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
public class Test
{
	public static void main(String[] args){
		JFrame jf=new JFrame("测试窗口");
		jf.setSize(200,200);
		jf.setLocationRelativeTo(null);
		jf.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);

		JPanel panel=new JPanel();

		//创建两个单选按钮
		JRadioButton radioBtn1=new JRadioButton("男");
		JRadioButton radioBtn2=new JRadioButton("女");

		//创建按钮组，把两个单选按钮添加到该组
		ButtonGroup btnGroup=new ButtonGroup();

		btnGroup.add(radioBtn1);
		btnGroup.add(radioBtn2);

		//设置第一个单选按钮被选中
		radioBtn1.setSelected(true);

		panel.add(radioBtn1);
		panel.add(radioBtn2);

		jf.setContentPane(panel);
		jf.setVisible(true);
	}
}
