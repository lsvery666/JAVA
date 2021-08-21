import javax.swing.*;
import javax.swing.event.*;
public class Test02
{
	public static void main(String[] args){
		JFrame jf=new JFrame("���Դ���");
		jf.setSize(250,250);
		jf.setLocationRelativeTo(null);
		jf.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);

		JPanel panel=new JPanel();

		JToggleButton jtb=new JToggleButton();

		//�������ò����ư�ť�߿�
		jtb.setBorderPainted(false);

		//����ѡ�У�������δѡ�У��أ�ʱ��ʾ��ͼƬ
		jtb.setSelectedIcon(new ImageIcon("toggle_on.png"));
		jtb.setIcon(new ImageIcon("toggle_off.png"));

		//���jbt��״̬���ı�ļ���
		jtb.addChangeListener(new ChangeListener(){
			public void stateChanged(ChangeEvent e){
				JToggleButton jtb=(JToggleButton)e.getSource();
				System.out.println(jtb.getText()+"�Ƿ�ѡ�У�"+jtb.isSelected());
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