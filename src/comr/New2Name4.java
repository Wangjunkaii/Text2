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

import beans.Public;
import comr.CenterPanel;
import dao.PublicDao;



public class New2Name4 extends JFrame {
	
	
	
	
	public New2Name4(List<Public> list) throws HeadlessException {

			
	
		
		
		setBounds((1366-800)/2,(768-460)/2,800,460);
		setTitle("公共卫生服务");
		//JLabel label = new JLabel(new ImageIcon("./image/6.jpg"));//图片未显示
		setLayout(new BorderLayout());
	
		
		PublicDao public1 = new PublicDao();
		
	
		String[][] tables = new String[list.size()][7];
		
		if(list!=null) {
			Public public2 = list.get(0);
			
			tables[0][0] = public2.getPname();
			tables[0][1] = public2.getPssex();
			tables[0][2] = public2.getPheight()+"";
			tables[0][3] = public2.getPweight()+"";
			tables[0][4] = public2.getPbloodpressure();
			tables[0][5] = public2.getPsee();
			tables[0][6] = public2.getPvital();
			
			
			
		}
		String[] title = {"姓名","性别","身高","体重","血压","视力","肺活量"};
		
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


