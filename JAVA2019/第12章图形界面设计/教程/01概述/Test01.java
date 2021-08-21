/*
	一个 Java 的图形界面，由各种不同类型的“元素”组成，例如: 窗口、菜单栏、对话框、标签、按钮、文本框等等，这些“元素”统一被称为 组件（Component）。

	组件按照不同的功能，可分为 顶层容器、中间容器、基本组件。一个简单窗口的组成，如下层级结构所示:

	顶层容器
		菜单栏
		中间容器
			基本组件
			基本组件
	
	组件类型的继承关系:

	顶层容器 属于窗口类组件，继承自java.awt.Window；
	中间容器 和 基本组件 继承自javax.swing.JComponent。

	顶层容器：JFrame，JDialog  组件一般不直接摆放在JFrame容器上，而是通过getContentPane+add 或setContentPane 摆放在contentPane上
										布局管理器也是对contenrPane设置的

	中间容器：JPanel           中间容器可以作为中间容器的组件
	基本组件：JLabel,JButton
*/
import javax.swing.*;

public class Test01{

    public static void main(String[] args) {
        // 1. 创建一个顶层容器（窗口）
        JFrame jf = new JFrame("测试窗口");          // 创建窗口
        jf.setSize(250, 250);                       // 设置窗口大小
        jf.setLocationRelativeTo(null);             // 把窗口位置设置到屏幕中心
        jf.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE); // 当点击窗口的关闭按钮时退出程序（没有这一句，程序不会退出）

        // 2. 创建中间容器（面板容器）
        JPanel panel = new JPanel();                // 创建面板容器，使用默认的布局管理器

        // 3. 创建一个基本组件（按钮），并添加到 面板容器 中
        JButton btn = new JButton("测试按钮");
        panel.add(btn);

        // 4. 把 面板容器 作为窗口的内容面板 设置到 窗口
        jf.setContentPane(panel);

        // 5. 显示窗口，前面创建的信息都在内存中，通过 jf.setVisible(true) 把内存中的窗口显示在屏幕上。
        jf.setVisible(true);
    }

}
