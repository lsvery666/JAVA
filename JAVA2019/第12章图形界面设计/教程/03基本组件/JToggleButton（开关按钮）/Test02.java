import javax.swing.*;
import javax.swing.event.*;
public class Test02
{
	public static void main(String[] args){
		JFrame jf=new JFrame("测试窗口");
		jf.setSize(250,250);
		jf.setLocationRelativeTo(null);
		jf.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);

		JPanel panel=new JPanel();

		JToggleButton jtb=new JToggleButton();

		//首先设置不绘制按钮边框
		jtb.setBorderPainted(false);

		//设置选中（开）和未选中（关）时显示的图片
		jtb.setSelectedIcon(new ImageIcon("toggle_on.png"));
		jtb.setIcon(new ImageIcon("toggle_off.png"));

		//添加jbt的状态被改变的监听
		jtb.addChangeListener(new ChangeListener(){
			public void stateChanged(ChangeEvent e){
				JToggleButton jtb=(JToggleButton)e.getSource();
				System.out.println(jtb.getText()+"是否选中："+jtb.isSelected());
			}
		});

		panel.add(jtb);

		jf.setContentPane(panel);
		
		try{
			UIManager.setLookAndFeel("com.sun.java.swing.plaf.nimbus.NimbusLookAndFeel");
		}catch (Exception e){
			e.printStackTrace();
		}
		
		jf.setVisible(true);
	
	}
}