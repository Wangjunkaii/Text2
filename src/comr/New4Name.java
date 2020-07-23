package comr;

import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.List;

import javax.swing.AbstractAction;
import javax.swing.Action;
import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.border.EmptyBorder;

import beans.Die;
import dao.DieDao;

public class New4Name extends JDialog {
	static LeftPanel leftPanel = new LeftPanel();
	
	private final JPanel contentPanel = new JPanel();
	private JTextField textField;
	
	private final Action action = new SwingAction();

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		
		try {
			
			New4Name dialog = new New4Name();
			dialog.setDefaultCloseOperation(JDialog.DISPOSE_ON_CLOSE);
			dialog.setVisible(true);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	/**
	 * Create the dialog.
	 */
	public New4Name() {
		setBounds(100, 100, 800, 460);
		setTitle("身份信息检索");
		getContentPane().setLayout(new BorderLayout());
		JPanel pane = new JPanel();
		pane.setPreferredSize(new Dimension(0,100));
		contentPanel.setBounds(0, 0, 432, 1);
		contentPanel.setBorder(new EmptyBorder(5, 5, 5, 5));
		getContentPane().add(contentPanel);
		contentPanel.setLayout(null);
		
		
		
		JLabel lblNewLabel = new JLabel("输入姓名:");
		lblNewLabel.setBounds(50, 35, 72, 18);
		pane.add(lblNewLabel);
		textField = new JTextField();
		textField.setBounds(120, 30, 170, 24);
		pane.add(textField);
		textField.setColumns(10);
		JButton btnNewButton = new JButton("\u786E\u5B9A");
		pane.add(btnNewButton);
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				Die die = new Die();
				die.setDname(textField.getText());
				
				DieDao dieD = new DieDao();
				List<Die> list = dieD.selectByCondtion(die);
				
				JPanel pane1 = new JPanel(new BorderLayout());
				pane1.setPreferredSize(new Dimension(100,100));
				String[] titles = {"档案编号","姓名","年龄","性别","家庭住址"};
				 
				
				String[][] tables = new String[list.size()][titles.length];
				
				for (int i = 0; i < list.size(); i++) {
					Die tmp = list.get(i);
					
					tables[i][0] = tmp.getDid()+"";
					tables[i][1] = tmp.getDname();
					tables[i][2] = tmp.getDage()+"";
					tables[i][3] = tmp.getSsex();
					tables[i][4] = tmp.getDaddress();
					
					
				}
				JTable table = new JTable(tables,titles);
				pane1.add(table.getTableHeader(),BorderLayout.NORTH);
				pane1.add(table);
				getContentPane().add(pane1);
				setVisible(true);
				
			}
		});
		btnNewButton.setAction(action);
		btnNewButton.setBounds(300, 30, 100, 20);
		pane.add(btnNewButton);
		getContentPane().add(pane,BorderLayout.NORTH);
	}
	private class SwingAction extends AbstractAction {
		public SwingAction() {
			putValue(NAME, "确定");
			putValue(SHORT_DESCRIPTION, "Some short description");
		}
		public void actionPerformed(ActionEvent e) {
		}
	}
}
