import java.awt.*;
import javax.swing.*;
public class Test06
{
	public static void main(String[] args){
		JFrame win=new JFrame("°ïÖú´°¿Ú");
		Container contentPane=win.getContentPane();
		contentPane.setLayout(new BorderLayout());
		JLabel lb1=new JLabel("ÉÏ±±",JLabel.CENTER);
		contentPane.add(lb1);
		win.setSize(200,200);
		win.setVisible(true);
		win.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE); 
	}
}