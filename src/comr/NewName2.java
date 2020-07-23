package comr;



import java.awt.Container;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

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

import beans.Die;
import dao.DieDao;

public class NewName2 extends JDialog {
	static LeftPanel leftPanel = new LeftPanel();
	
	private final JPanel contentPanel = new JPanel();
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTextField textField_3;
	private JTextField textField_4;
	private final Action action = new SwingAction();

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		
		try {
			
			NewName2 dialog = new NewName2();
			dialog.setDefaultCloseOperation(JDialog.DISPOSE_ON_CLOSE);
			dialog.setVisible(true);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	/**
	 * Create the dialog.
	 */
	public NewName2() {
		setBounds(100, 100, 800, 460);
		setTitle("用户管理");
		getContentPane().setLayout(null);
		contentPanel.setBounds(0, 0, 432, 1);
		contentPanel.setBorder(new EmptyBorder(5, 5, 5, 5));
		getContentPane().add(contentPanel);
		contentPanel.setLayout(null);
		
		JLabel label = new JLabel("\u6B7B\u8005\u7F16\u53F7");
		label.setBounds(57, 48, 72, 18);
		contentPanel.add(label);
		
		JLabel lblNewLabel = new JLabel("\u7F16\u53F7\uFF1A");
		lblNewLabel.setBounds(132, 51, 72, 18);
		getContentPane().add(lblNewLabel);
		
		JLabel label_1 = new JLabel("\u59D3\u540D\uFF1A");
		label_1.setBounds(132, 100, 72, 18);
		getContentPane().add(label_1);
		
		JLabel label_2 = new JLabel("\u5E74\u9F84\uFF1A");
		label_2.setBounds(131, 146, 72, 18);
		getContentPane().add(label_2);
		
		JLabel label_3 = new JLabel("\u6027\u522B\uFF1A");
		label_3.setBounds(130, 188, 72, 18);
		getContentPane().add(label_3);
		
		JLabel label_4 = new JLabel("家庭住址:");
		label_4.setBounds(132, 234, 90, 18);
		getContentPane().add(label_4);
		
		
		
		textField = new JTextField();
		textField.setBounds(222, 45, 225, 24);
		getContentPane().add(textField);
		textField.setColumns(10);
		
		
		
		textField_1 = new JTextField();
		textField_1.setColumns(10);
		textField_1.setBounds(223, 95, 225, 24);
		getContentPane().add(textField_1);
		
		textField_2 = new JTextField();
		textField_2.setColumns(10);
		textField_2.setBounds(223, 140, 225, 24);
		getContentPane().add(textField_2);
		
		textField_3 = new JTextField();
		textField_3.setBounds(223, 186, 226, 24);
		getContentPane().add(textField_3);
		textField_3.setColumns(10);
		
		
		textField_4 = new JTextField();
		textField_4.setBounds(223,232, 226, 24);
		getContentPane().add(textField_4);
		textField_4.setColumns(10);
		
		JButton btnNewButton = new JButton("\u786E\u5B9A");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				Die die = new Die();
				die.setDid(Integer.parseInt(textField.getText()));
				die.setDname(textField_1.getText());
				die.setDage(Integer.parseInt(textField_2.getText()));
				die.setSsex(textField_3.getText());
				die.setDaddress(textField_4.getText());
				DieDao dieD = new DieDao();
				dieD.updateByCondtion(die);
				
				
				dispose();
				JOptionPane.showMessageDialog(null, "修改成功");
				
			}
		});
		btnNewButton.setAction(action);
		btnNewButton.setBounds(230, 300, 113, 27);
		getContentPane().add(btnNewButton);
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