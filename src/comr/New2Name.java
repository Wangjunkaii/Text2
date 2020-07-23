package comr;


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
import beans.Public;
import dao.PublicDao;

public class New2Name extends JDialog {
	static LeftPanel leftPanel = new LeftPanel();
	
	private final JPanel contentPanel = new JPanel();
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTextField textField_3;
	private JTextField textField_4;
	private JTextField textField_5;
	private JTextField textField_6;
	private JTextField textField_7;
	private final Action action = new SwingAction();

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		
		try {
			
			New2Name dialog = new New2Name();
			dialog.setDefaultCloseOperation(JDialog.DISPOSE_ON_CLOSE);
			dialog.setVisible(true);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	/**
	 * Create the dialog.
	 */
	public New2Name() {
		setBounds(100, 100, 700, 380);
		setTitle("公共卫生服务");
		getContentPane().setLayout(null);
		contentPanel.setBounds(0, 0, 432, 1);
		contentPanel.setBorder(new EmptyBorder(5, 5, 5, 5));
		getContentPane().add(contentPanel);
		contentPanel.setLayout(null);
		
		JLabel label = new JLabel("\u6B7B\u8005\u7F16\u53F7");
		label.setBounds(57, 48, 72, 18);
		contentPanel.add(label);
		
		JLabel lblNewLabel = new JLabel("编号:");
		lblNewLabel.setBounds(72, 45, 72, 18);
		getContentPane().add(lblNewLabel );
		
		JLabel label_1 = new JLabel("姓名:");
		label_1.setBounds(72, 90, 72, 18);
		getContentPane().add(label_1);
		
		JLabel label_2 = new JLabel("性别:");
		label_2.setBounds(72, 135, 72, 18);
		getContentPane().add(label_2);
		
		JLabel label_3 = new JLabel("身高:");
		label_3.setBounds(72, 180, 72, 18);
		getContentPane().add(label_3);
		
		textField = new JTextField();
		textField.setBounds(122, 45, 225, 24);
		getContentPane().add(textField);
		textField.setColumns(10);
		
		JLabel label_4 = new JLabel("体重:");
		label_4.setBounds(370, 45, 90, 18);
		getContentPane().add(label_4);
		
		JLabel label_5 = new JLabel("血压:");
		label_5.setBounds(370, 90, 90, 18);
		getContentPane().add(label_5);
		
		JLabel label_6 = new JLabel("视力:");
		label_6.setBounds(370, 135, 90, 18);
		getContentPane().add(label_6);
		
		JLabel label_7 = new JLabel("肺活量:");
		label_7.setBounds(370, 180, 90, 18);
		getContentPane().add(label_7);
		
		textField_1 = new JTextField();
		textField_1.setColumns(10);
		textField_1.setBounds(120, 90, 225, 24);
		getContentPane().add(textField_1);
		
		textField_2 = new JTextField();
		textField_2.setColumns(10);
		textField_2.setBounds(120, 135, 225, 24);
		getContentPane().add(textField_2);
		
		textField_3 = new JTextField();
		textField_3.setBounds(120, 180, 226, 24);
		getContentPane().add(textField_3);
		textField_3.setColumns(10);
		
		textField_4 = new JTextField();
		textField_4.setBounds(420, 45, 224, 24);
		getContentPane().add(textField_4);
		textField_4.setColumns(10);
		
		textField_5 = new JTextField();
		textField_5.setColumns(10);
		textField_5.setBounds(420, 90, 225, 24);
		getContentPane().add(textField_5);
		
		textField_6 = new JTextField();
		textField_6.setColumns(10);
		textField_6.setBounds(420, 135, 225, 24);
		getContentPane().add(textField_6);
		
		textField_7 = new JTextField();
		textField_7.setColumns(10);
		textField_7.setBounds(420, 180, 225, 24);
		getContentPane().add(textField_7);
		
		
		
		JButton btnNewButton = new JButton("\u786E\u5B9A");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				Public di = new Public();
				di.setPid(Integer.parseInt(textField.getText()));
				di.setPname(textField_1.getText());
				di.setPssex(textField_2.getText());
				di.setPheight(Integer.parseInt(textField_3.getText()));
				di.setPweight(Integer.parseInt(textField_4.getText()));
				di.setPbloodpressure(textField_5.getText());
				di.setPsee(textField_6.getText());
				di.setPvital(textField_7.getText());
				PublicDao public1 = new PublicDao();
				public1.insertByCondtion(di);
				
				
				dispose();
				JOptionPane.showMessageDialog(null, "插入成功");
				
			}
		});
		btnNewButton.setAction(action);
		btnNewButton.setBounds(300, 260, 113, 27);
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