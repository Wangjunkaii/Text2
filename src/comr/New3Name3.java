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

import beans.Local;
import dao.LocalDao;






public class New3Name3 extends JDialog {
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
			
			NewName dialog = new NewName();
			dialog.setDefaultCloseOperation(JDialog.DISPOSE_ON_CLOSE);
			dialog.setVisible(true);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	/**
	 * Create the dialog.
	 */
	public New3Name3() {
		setBounds(100, 100, 800, 460);
		setTitle("居民死亡登记");
		getContentPane().setLayout(null);
		contentPanel.setBounds(0, 0, 432, 1);
		contentPanel.setBorder(new EmptyBorder(5, 5, 5, 5));
		getContentPane().add(contentPanel);
		contentPanel.setLayout(null);
		
		JLabel label = new JLabel("用户");
		label.setBounds(57, 48, 72, 18);
		contentPanel.add(label);
		
		JLabel lblNewLabel = new JLabel("输入姓名:");
		lblNewLabel.setBounds(50, 80, 72, 18);
		getContentPane().add(lblNewLabel);
		textField = new JTextField();
		textField.setBounds(120, 80, 170, 24);
		getContentPane().add(textField);
		textField.setColumns(10);
		JButton btnNewButton = new JButton("查询");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				LocalDao localD = new LocalDao();
				Local local = new Local();
				local.setLname(textField.getText());
				System.out.println(local);
				

				List<Local> list = localD.selectByCondtion(local);
				System.out.println(list.size());
				
				dispose();
				JOptionPane.showMessageDialog(null, "查找成功");
				
				New3Name4 frame = new New3Name4(list);
				frame.setVisible(true);
				frame.setBounds(500, 200, 500,300);
				
				
					
			}	
			
		});
		btnNewButton.setAction(action);
		btnNewButton.setBounds(135, 170, 100, 27);
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
