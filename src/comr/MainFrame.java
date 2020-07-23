package comr;

import java.awt.BorderLayout;
import java.awt.Container;
import java.awt.Dimension;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;

import comr.CenterPanel;
import comr.LeftPanel;

public class MainFrame extends JFrame{

	public static void main(String[] args) {
		new MainFrame();
	}

	private CenterPanel centerPanel = null;
	private LeftPanel leftPanel =null;
	private static JFrame frame = null;
	public MainFrame(){
		
		setTitle("���񽡿�����ϵͳ");
		frame = this;
		setBounds((1366-800)/2, (768-560)/2, 800, 460);
	
		//��ʼ������
		initPanel();                      
		
		//��ʼ�� �м�����
		initCenterPanel();
		
		SwingUtil.setMainframe(this);
		
		//��ʾ����
		setVisible(true);
		//���ڹر�
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
	public static JFrame getMainFrame(){
		
		return  frame;
	}
	//���������м�����
	public CenterPanel getCenterPanel() {
		return centerPanel;
	}
	
	//��ʼ���м�����
	private void initCenterPanel() {
		centerPanel = new CenterPanel();
		JLabel label = new JLabel(new ImageIcon("./image/6.jpg"));
		
		centerPanel.add(label);
		this.add(centerPanel, BorderLayout.CENTER);
	}
	
	//��ʼ������
	private void initPanel() {
		leftPanel = new LeftPanel();
		leftPanel.setPreferredSize(new Dimension(110,575));
		this.add(leftPanel,BorderLayout.WEST);
	}

}





