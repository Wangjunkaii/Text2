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
		
		setTitle("居民健康管理系统");
		frame = this;
		setBounds((1366-800)/2, (768-560)/2, 800, 460);
	
		//初始化容器
		initPanel();                      
		
		//初始化 中间容器
		initCenterPanel();
		
		SwingUtil.setMainframe(this);
		
		//显示窗体
		setVisible(true);
		//窗口关闭
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
	public static JFrame getMainFrame(){
		
		return  frame;
	}
	//返回内容中间容器
	public CenterPanel getCenterPanel() {
		return centerPanel;
	}
	
	//初始化中间容器
	private void initCenterPanel() {
		centerPanel = new CenterPanel();
		JLabel label = new JLabel(new ImageIcon("./image/6.jpg"));
		
		centerPanel.add(label);
		this.add(centerPanel, BorderLayout.CENTER);
	}
	
	//初始化容器
	private void initPanel() {
		leftPanel = new LeftPanel();
		leftPanel.setPreferredSize(new Dimension(110,575));
		this.add(leftPanel,BorderLayout.WEST);
	}

}





