package swing;

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

public class MainUser extends JFrame {
	
	
	
	
	public MainUser(String name) throws HeadlessException {

			
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
		setTitle("欢迎用户登录");
		//JLabel label = new JLabel(new ImageIcon("./image/6.jpg"));//图片未显示
		setLayout(new BorderLayout());
		
		List<Health> list1  = new ArrayList<>();
		List<Public> list2  = new ArrayList<>();
		HealthDao healthD = new HealthDao();
		PublicDao publicD = new PublicDao();
		
		Health health = new Health();
		health.setHname(name);
		list1 = healthD.selectByCondtion(health);
		Public publicTmp = new Public();
		publicTmp.setPname(name);
		list2 = publicD.selectByCondtion(publicTmp);
		
		String[][] tables = new String[1][7];
		String[][] tables1 = new String[1][7];
		if(list1!=null) {
			Health heath = list1.get(0);
			Public pub = list2.get(0);
			//System.out.println(heath.getHnumber()+" "+heath.getHname()+" "+heath.getHssex()+" "+heath.getHbirthday()+" "+heath.getHaddress()+" "+heath.getHblood()+" "+heath.getHguomin()+" "+heath.getHjibing()+" "+heath.getHjiwang());
			tables[0][0] = heath.getHname();
			tables[0][1] = pub.getPheight()+"";
			tables[0][2] = heath.getHssex();
			tables[0][3] = heath.getHbirthday();
			tables[0][4] = heath.getHaddress();
			tables[0][5] = heath.getHnumber()+"";
			tables[0][6] = heath.getHblood();
			tables1[0][0] = heath.getHguomin();
			tables1[0][1] = heath.getHjibing();
			tables1[0][2] = heath.getHjiwang();
			tables1[0][3] = pub.getPweight()+"";
			tables1[0][4] = pub.getPbloodpressure();
			tables1[0][5] = pub.getPsee();
			tables1[0][6] = pub.getPvital();
		}
		String[] title = {"姓名","身高","性别","生日","家庭住址","身份证号","血型"};
		String[] title1 = {"过敏","疾病","既往史","体重","血压","视力","肺活量"};
		JTable table  = new JTable(tables,title);
		JTable table1  = new JTable(tables1,title1);
		
		JPanel pane = new JPanel();
		table.setFont(new Font("宋体",Font.BOLD,18));
		table.setRowHeight(30);
		


		JPanel pane1 = new JPanel();
		table1.setFont(new Font("宋体",Font.BOLD,18));
		table1.setRowHeight(30);
		
		pane.add(table.getTableHeader(),BorderLayout.NORTH);
		pane.add(table,BorderLayout.CENTER);
		FlowLayout f=(FlowLayout)pane.getLayout();
		f.setHgap(0);
		f.setVgap(0);
		pane1.add(table1.getTableHeader(),BorderLayout.NORTH);
		pane1.add(table1,BorderLayout.CENTER);
		FlowLayout f1=(FlowLayout)pane1.getLayout();
		f1.setHgap(0);
		f1.setVgap(0);
		pane.setPreferredSize(new Dimension(100,100));
		getContentPane().add(pane,BorderLayout.NORTH);
		getContentPane().add(pane1,BorderLayout.CENTER);
		this.setVisible(true);
	}

	public static void main(String[] args) {
	
	}
}


