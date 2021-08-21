/*
	javax.swing.JPasswordField
	密码框。JPasswordField 继承自 JTextField，只是显示输入的内容时
	用特定的字符替换显示（例如 * 或 ●），用法和 JTextField 基本一致。

	构造方法：
		JPasswordField()

		JPasswordField(String text)

		JPasswordField(int columns)

		JPasswordField(String text, int columns)
	
	常用方法：
		// 获取密码框输入的密码
		char[] getPassword()

		// 设置密码框的 密码文本、字体 和 字体颜色
		void setText(String text)
		void setFont(Font font)
		void setForeground(Color fg)

		// 设置密码框输入内容的水平对齐方式
		void setHorizontalAlignment(int alignment)

		// 设置密码框默认显示的密码字符
		void setEchoChar(char c)

		// 设置密码框是否可编辑
		void setEditable(boolean b)

		下面方法定义在 java.awt.Component 基类中

		// 判断组件当前是否拥有焦点
		boolean isFocusOwner()

		// 设置组件是否可用
		void setEnabled(boolean b)

	JPasswordField 常用监听器:

		// 添加焦点事件监听器
		void addFocusListener(FocusListener listener)

		// 添加文本框内的 文本改变 监听器
		textField.getDocument().addDocumentListener(DocumentListener listener)

		// 添加按键监听器
		void addKeyListener(KeyListener listener)
*/
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
public class Test
{
	public static void main(String[] args){
		JFrame jf=new JFrame("测试窗口");
		jf.setSize(250,250);
		jf.setLocationRelativeTo(null);
		jf.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);

		JPanel panel=new JPanel();

		final JPasswordField jpf=new JPasswordField(10);
		panel.add(jpf);

		JButton jb=new JButton("提交");
		jb.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e){
				System.out.println("提交，密码为："+new String(jpf.getPassword()));
			}
		});

		panel.add(jb);

		jf.setContentPane(panel);
		jf.setVisible(true);
	
	}
}
