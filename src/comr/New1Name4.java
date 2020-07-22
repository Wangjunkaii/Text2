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


import beans.Health;
import beans.Public;
import comr.CenterPanel;

import dao.HealthDao;
import dao.PublicDao;

public class New1Name4 extends JFrame {
	
	
	
	
	public New1Name4(List<Health> list) throws HeadlessException {

			
	
		
		
		setBounds((1366-800)/2,(768-460)/2,800,460);
		setTitle("健康档案数据管理");
		//JLabel label = new JLabel(new ImageIcon("./image/6.jpg"));//图片未显示
		setLayout(new BorderLayout());
	
		
		HealthDao health = new HealthDao();
		
	
		String[][] tables = new String[list.size()][8];
		
		if(list!=null) {
			Health health1 = list.get(0);
			
			tables[0][0] = health1.getHname();
			tables[0][1] = health1.getHssex();
			tables[0][2] = health1.getHaddress();
			tables[0][3] = health1.getHbirthday();
			tables[0][4] = health1.getHnumber()+"";
			tables[0][5] = health1.getHblood();
			tables[0][6] = health1.getHguomin();
			tables[0][7] = health1.getHjibing();
			
			
		}
		String[] title = {"姓名","性别","家庭住址","出生日期","身份证号","血型","过敏史","疾病史"};
		
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


