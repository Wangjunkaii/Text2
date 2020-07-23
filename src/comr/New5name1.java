package comr;



import java.awt.BorderLayout;
import java.awt.Font;
import java.awt.HeadlessException;
import java.util.List;


import javax.swing.JFrame;

import javax.swing.JPanel;
import javax.swing.JTable;

import beans.House;
import beans.Local;
import beans.Public;
import dao.HouseDao;
import dao.LocalDao;
import dao.PublicDao;




public class New5name1 extends JFrame {
	
	
	
	
	public New5name1(List<House> list, List<Public> list1) throws HeadlessException {
		// TODO Auto-generated constructor stub
//	}
//
//
//	public  New5Name1(List<House> list,List<Public> list1) throws HeadlessException {

			
	

		setBounds((1366-800)/2,(768-460)/2,800,460);
		setTitle("居民亲属关系");
		//JLabel label = new JLabel(new ImageIcon("./image/6.jpg"));//图片未显示
		setLayout(new BorderLayout());
	
		
		HouseDao house = new HouseDao();
		PublicDao public2=new PublicDao();
	
		String[][] tables = new String[list.size()][7];
		String[][] tables1 = new String[list1.size()][7];
		if(list!=null) {
			House house1 = list.get(0);
			
			//tables[0][0] = house1.getHhouseid()+"";
			tables[0][0] = house1.getHname();
			tables[0][1] = house1.getHaddress();
			//tables[0][2] = house1.getHaddress();
			tables[0][2] = house1.getHnumber();
			tables[0][3] = house1.getHmecd()+"";	
			tables[0][4] = house1.getHmeid()+"";	
			tables[0][5] = house1.getHzip()+"";	
			
			
			//tables1[0][0] = public1.getPhouseid()+"";
			
		}
		for (int i = 0; i < list1.size(); i++) {
			Public public1 = list1.get(i);
			tables1[i][0] = public1.getPname();
			tables1[i][1] = public1.getPssex();
			tables1[i][2] = public1.getPheight()+"";
			tables1[i][3] = public1.getPweight()+"";
			tables1[i][4] = public1.getPbloodpressure();
			tables1[i][5] = public1.getPsee();
		}
//		if(list1!=null) {
//			Public public1 = list1.get(0);
//			
//			tables1[0][0] = public1.getPhouseid()+"";
//			tables1[0][0] = public1.getPname();
//			tables1[0][1] = public1.getPssex();
//			tables1[0][2] = public1.getPheight()+"";
//			tables1[0][3] = public1.getPweight()+"";
//			tables1[0][4] = public1.getPbloodpressure();
//			tables1[0][5] = public1.getPsee();
//		
//			
//		}
		String[] title = {"姓名","家庭住址","手机号","医疗编号","医疗卡号","邮政编号"};
		String[] title1 = {"姓名","性别","身高","体重","血压","视力"};
		JTable table  = new JTable(tables,title);
		JTable table1  = new JTable(tables1,title1);
		
		JPanel pane = new JPanel(new BorderLayout());
		JPanel pane1 = new JPanel(new BorderLayout());
		table.setFont(new Font("宋体",Font.BOLD,18));
		table.setRowHeight(30);
		table1.setFont(new Font("宋体",Font.BOLD,18));
		table1.setRowHeight(30);

		
		pane.add(table.getTableHeader(),BorderLayout.NORTH);
		pane.add(table,BorderLayout.CENTER);
		pane1.add(table1.getTableHeader(),BorderLayout.NORTH);
		pane1.add(table1,BorderLayout.CENTER);

		getContentPane().add(pane,BorderLayout.NORTH);
		getContentPane().add(pane1);
		this.setVisible(true);
	}

	
	public static void main(String[] args) {
	
	}
}


