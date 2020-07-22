package comr;



import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.HeadlessException;
import java.util.ArrayList;
import java.util.List;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTable;

import beans.Die;
import beans.Health;
import beans.Public;
import comr.CenterPanel;
import dao.DieDao;
import dao.HealthDao;
import dao.PublicDao;

public class NewName4 extends JFrame {
	
	
	
	
	public NewName4(List<Die> list) throws HeadlessException {

			
		//背景图片
		
//		    JFrame jf=new JFrame("欢迎用户登录");
//
//		    JPanel panel = new JPanel(null);
//	        JLabel label_image1 = new JLabel(new ImageIcon("./image/7.jng"));
//	  		label_image1.setLocation(0, 20);
//	  		label_image1.setSize(600,50);
//			panel.add(label_image1);
//			
//			jf.setContentPane(panel);
//			 jf.setVisible(true);
		
		
		setBounds((1366-800)/2,(768-460)/2,800,460);
		setTitle("用户查询");
		//JLabel label = new JLabel(new ImageIcon("./image/6.jpg"));//图片未显示
		setLayout(new BorderLayout());
	
		
		DieDao die = new DieDao();
		
		String[][] tables = new String[list.size()][4];
		
		if(list!=null) {
			Die die11 = list.get(0);
			
			tables[0][0] = die11.getDname();
			tables[0][1] = die11.getDage()+"";
			tables[0][2] = die11.getSsex();
			tables[0][3] = die11.getDaddress();
			
			
		}
		String[] title = {"姓名","年龄","性别","家庭住址"};
		
		JTable table  = new JTable(tables,title);
		
		
		JPanel pane = new JPanel(new BorderLayout());
		table.setFont(new Font("宋体",Font.BOLD,18));
		table.setRowHeight(30);
		


	
		
		
		pane.add(table.getTableHeader(),BorderLayout.NORTH);
		pane.add(table,BorderLayout.CENTER);

		getContentPane().add(pane);
		
		this.setVisible(true);
	}

	public static void main(String[] args) {
	
	}
}


