package comr;



import java.awt.BorderLayout;
import java.awt.Font;
import java.awt.HeadlessException;
import java.util.List;


import javax.swing.JFrame;

import javax.swing.JPanel;
import javax.swing.JTable;

import beans.Local;


import dao.LocalDao;




public class New3Name4 extends JFrame {
	
	
	
	
	public New3Name4(List<Local> list) throws HeadlessException {

			
	

		setBounds((1366-800)/2,(768-460)/2,800,460);
		setTitle("公共卫生服务");
		//JLabel label = new JLabel(new ImageIcon("./image/6.jpg"));//图片未显示
		setLayout(new BorderLayout());
	
		
		LocalDao local = new LocalDao();
		
	
		String[][] tables = new String[list.size()][6];
		
		if(list!=null) {
			Local local1 = list.get(0);
			
			tables[0][0] = local1.getLname();
			tables[0][1] = local1.getLage()+"";
			tables[0][2] = local1.getSsex();
			tables[0][3] = local1.getLtime();
			tables[0][4] = local1.getLdielocal();
			tables[0][5] = local1.getLaddress();
			
			
			
			
		}
		String[] title = {"姓名","年龄","性别","死亡时间","死亡地点","家庭住址"};
		
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


