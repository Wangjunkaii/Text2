package comr;

import java.awt.event.ActionEvent;

import java.awt.event.ActionListener;
import java.util.List;

import javax.swing.AbstractAction;
import javax.swing.Action;
import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.border.EmptyBorder;

import beans.House;
import beans.Public;
import dao.HouseDao;
import dao.PublicDao;


public class New5Name extends JDialog {
	private static JFrame jframe;
	
	static LeftPanel leftPanel = new LeftPanel();
	
	private final JPanel contentPanel = new JPanel();
	private JTextField textField;
	
	private final Action action = new SwingAction();

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		
		try {
			
			New5Name dialog = new New5Name();
			dialog.setDefaultCloseOperation(JDialog.DISPOSE_ON_CLOSE);
			dialog.setVisible(true);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	/**
	 * Create the dialog.
	 */
	public New5Name() {
		setBounds(100, 100, 800, 460);
		setTitle("居民亲属管理");
		getContentPane().setLayout(null);
		contentPanel.setBounds(0, 0, 432, 1);
		contentPanel.setBorder(new EmptyBorder(5, 5, 5, 5));
		getContentPane().add(contentPanel);
		contentPanel.setLayout(null);
		
		JLabel label = new JLabel("用户");
		label.setBounds(57, 48, 72, 18);
		contentPanel.add(label);
		
		JLabel lblNewLabel = new JLabel("户主姓名:");
		lblNewLabel.setBounds(50, 80, 72, 18);
		getContentPane().add(lblNewLabel);
		textField = new JTextField();
		textField.setBounds(120, 80, 170, 24);
		getContentPane().add(textField);
		textField.setColumns(10);
		JButton btnNewButton = new JButton("查询");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				HouseDao houseD = new HouseDao();
				House house = new House();
				house.setHname(textField.getText());
				
				
			
				
				List<House> list = houseD.selectByCondtion(house);
				
				
				PublicDao PublicD = new PublicDao();
				Public public1 = new Public();
				
				public1.setPhouseid(list.get(0).getHhouseid());
				List<Public> list1 = PublicD.selectByCondtion(public1);
				System.out.println("size: "+list1.size());
				dispose();
				JOptionPane.showMessageDialog(null, "查找成功");
				
	     		New5name1 frame = new New5name1(list,list1);
			
				frame.setVisible(true);
				frame.setBounds(500, 200, 500,300);
				
				
					
			}	
			
		});
		btnNewButton.setAction(action);
		btnNewButton.setBounds(135, 170, 100, 30);
		getContentPane().add(btnNewButton);
	}
	private class SwingAction extends AbstractAction {
		public SwingAction() {
			putValue(NAME, "查询");
			putValue(SHORT_DESCRIPTION, "Some short description");
		}
		public void actionPerformed(ActionEvent e) {
			
			
		}
	}
}
