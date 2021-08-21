/*
	javax.swing.JLabel
	��ǩ ��Ҫ����չʾ�ı���ͼƬ
	���췽����
		JLabel()

		JLabel(String text)

		JLabel(String text, int horizontalAlignment)

		JLabel(Icon image) 

		JLabel(Icon image, int horizontalAlignment) 

		JLabel(String text, Icon image, int horizontalAlignment)
		����hAlignment����������ʾ����Ϣ�Ķ��뷽ʽ�������֣�JLabel.BOTTOM,JLabel.LEFT,JLabel.RIGHT,JLabel.TOP,JLabel.CENTER
		ˮƽ����Ĭ�ϲ�������룬��ֱ����Ĭ�Ͼ���
	
	���÷�����
	
		// ���� �ı� �� ͼƬ
		void setText(String text)
		void setIcon(Icon icon)

		// �����ı������ͼƬ��λ�ã��ı�Ĭ����ͼƬ�ұߴ�ֱ���У�
		void setHorizontalTextPosition(int textPosition)
		void setVerticalTextPosition(int textPosition)

		// ���ñ�ǩ���ݣ��ڱ�ǩ�ڣ��Ķ��䷽ʽ��Ĭ������벢��ֱ���У�
		void setHorizontalAlignment(int alignment)
		void setVerticalAlignment(int alignment)

		// ����ͼƬ���ı�֮��ļ�϶
		void setIconTextGap(int iconTextGap)

		
		//����ķ��������� JComponent ������   
		 
		// �����ı����������͡���ʽ �� ��С
		void setFont(Font font)

		// ����������ɫ
		void setForeground(Color fg)

		// ������ƶ��������ʱ��ʾ����ʾ�ı�
		void setToolTipText(String text)

		// ��������ı���
		void setBackground(Color bg)

		// ��������Ƿ�ɼ�
		void setVisible(boolean visible)

		// ��������Ƿ�Ϊ ��͸����JLabelĬ��Ϊ͸��������Ϊ��͸���������ʾ����
		void setOpaque(boolean isOpaque)

		// ��������� ��ѡ ��С
		void setPreferredSize(Dimension preferredSize)

		// ��������� ��С ��С
		void setMinimumSize(Dimension minimumSize)

		// ��������� ��� ��С
		void setMaximumSize(Dimension maximumSize)

		
		//����Ķ�����������ȡֵ�����ο� DocsApi��
		setXXX(...) ������������Ӧ�� getXXX() ������ 

	��ʾͼƬʱ��Iconʵ���Ĵ�����һ�㴴��ImageIcon��ImageIcon ʵ���� Icon��:

		ImageIcon �Ĺ��췽��:

		// ʹ�� ����·�� ͼƬ���� ImageIcon
		ImageIcon(String filename)

		// ʹ�� ����·�� ͼƬ���� ImageIcon
		ImageIcon(URL location)

		// ʹ��ͼƬ�ļ����ֽ����鴴�� ImageIcon
		ImageIcon(byte[] imageData)

		// ʹ�� java.awt.Image ʵ������ ImageIcon
		ImageIcon(java.awt.Image image)

	java.awt.Image ʵ���Ĵ���:

		// ����һ: ͨ�� java.awt.Toolkit ����������ȡ���ء����� �� �ڴ��� �� ͼƬ��֧�� GIF��JPEG �� PNG��
		Image image = Toolkit.getDefaultToolkit().getImage(String filename);
		Image image = Toolkit.getDefaultToolkit().getImage(URL url);
		Image image = Toolkit.getDefaultToolkit().createImage(byte[] imageData);

		// ������: ͨ�� javax.imageio.ImageIO �������ȡ���ء����� �� �ڴ��� �� ͼƬ��BufferedImage �̳��� Image��
		BufferedImage bufImage = ImageIO.read(File input);
		BufferedImage bufImage = ImageIO.read(URL input);
		BufferedImage bufImage = ImageIO.read(InputStream input);

		
		 * PS_01: ͼƬ���: BufferedImage ����ͨ�� bufImage.getWidth() �� bufImage.getHeight() ����ֱ�ӻ�ȡͼƬ�Ŀ��;
		 *                 Image ��ȡ�����Ҫ���⴫��һ�� ImageObserver ������
		 *
		 * PS_02: ͼƬ�ü�: BufferedImage ͨ�� bufImage.getSubimage(int x, int y, int w, int h) �������Խ�ȡͼƬ��
		 *                 ����һ���֣�����һ���µ� BufferedImage ʵ����
		 *
		 * PS_03: ͼƬ����: Image ͨ�� image.getScaledInstance(int width, int height, int hints) �������Զ�ͼƬ����
		 *                 ���ţ������µ�һ�� Image ʵ����
		 

*/
import javax.swing.*;
import java.awt.*;
public class Test
{
	public static void main(String[] args){
		JFrame jf=new JFrame("���Դ���");
		jf.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);

		JPanel panel=new JPanel();

		//ֻ��ʾ�ı�
		JLabel label1=new JLabel();
		label1.setText("Only Text");
		label1.setFont(new Font(null,Font.PLAIN,25));//�������壬null��ʾʹ��Ĭ������
		panel.add(label1);
	
		//ֻ��ʾͼƬ
		JLabel label2=new JLabel();
		Image image1=Toolkit.getDefaultToolkit().getImage("test01.jpg");
		label2.setIcon(new ImageIcon(image1.getScaledInstance(200,-1,4)));
		panel.add(label2);

		//ͬʱ��ʾ�ı���ͼƬ
		JLabel label3=new JLabel();
		label3.setText("�ı���ͼƬ");
		Image image2=Toolkit.getDefaultToolkit().getImage("test02.jpg");
		label3.setIcon(new ImageIcon(image2.getScaledInstance(200,-1,4)));
		label3.setHorizontalTextPosition(SwingConstants.CENTER);//ˮƽ�����ı���ͼƬ����
		label3.setVerticalTextPosition(SwingConstants.BOTTOM);
		panel.add(label3);

		jf.setContentPane(panel);
		jf.pack();
		jf.setLocationRelativeTo(null);
		jf.setVisible(true);

	}
}


