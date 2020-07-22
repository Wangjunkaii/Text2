package comr;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.AbstractAction;
import javax.swing.Action;
import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.border.EmptyBorder;

import beans.Die;
import beans.Local;
import dao.DieDao;
import dao.LocalDao;

//��������������������
public class New3Name extends JDialog{
static LeftPanel leftPanel = new LeftPanel();
	
	private final JPanel contentPanel = new JPanel();
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTextField textField_3;
	private JTextField textField_4;
	private JTextField textField_5;
	private JTextField textField_6;
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
	public New3Name() {
		setBounds(100, 100, 800, 460);
		setTitle("���������Ǽ�");
		getContentPane().setLayout(null);
		contentPanel.setBounds(0, 0, 432, 1);
		contentPanel.setBorder(new EmptyBorder(5, 5, 5, 5));
		getContentPane().add(contentPanel);
		contentPanel.setLayout(null);
		
		JLabel label = new JLabel("\u6B7B\u8005\u7F16\u53F7");
		label.setBounds(57, 48, 72, 18);
		contentPanel.add(label);
		
		JLabel lblNewLabel = new JLabel("\u7F16\u53F7\uFF1A");
		lblNewLabel.setBounds(232, 50, 72, 18);
		getContentPane().add(lblNewLabel);
		
		JLabel label_1 = new JLabel("\u59D3\u540D\uFF1A");
		label_1.setBounds(232, 100, 72, 18);
		getContentPane().add(label_1);
		
		JLabel label_2 = new JLabel("\u5E74\u9F84\uFF1A");
		label_2.setBounds(232, 146, 72, 18);
		getContentPane().add(label_2);
		
		JLabel label_3 = new JLabel("\u6027\u522B\uFF1A");
		label_3.setBounds(232, 188, 72, 18);
		getContentPane().add(label_3);
		
		textField = new JTextField();
		textField.setBounds(322, 45, 225, 24);
		getContentPane().add(textField);
		textField.setColumns(10);
		JLabel label_4 = new JLabel("����ʱ��:");
		label_4.setBounds(233, 235, 90, 18);
		getContentPane().add(label_4);
		
		JLabel label_5 = new JLabel("�����ص�:");
		label_5.setBounds(233, 282, 90, 18);
		getContentPane().add(label_5);
		
		JLabel label_6 = new JLabel("��ͥסַ:");
		label_6.setBounds(233, 329, 90, 18);
		getContentPane().add(label_6);
		
		textField_1 = new JTextField();
		textField_1.setColumns(10);
		textField_1.setBounds(323, 95, 225, 24);
		getContentPane().add(textField_1);
		
		textField_2 = new JTextField();
		textField_2.setColumns(10);
		textField_2.setBounds(323, 140, 225, 24);
		getContentPane().add(textField_2);
		
		textField_3 = new JTextField();
		textField_3.setBounds(323, 185, 226, 24);
		getContentPane().add(textField_3);
		textField_3.setColumns(10);
		
		textField_4 = new JTextField();
		textField_4.setBounds(323, 230, 224, 24);
		getContentPane().add(textField_4);
		textField_4.setColumns(10);
		
		textField_5 = new JTextField();
		textField_5.setBounds(323, 280, 224, 24);
		getContentPane().add(textField_5);
		textField_5.setColumns(10);
		
		textField_6 = new JTextField();
		textField_6.setBounds(323, 330, 224, 24);
		getContentPane().add(textField_6);
		textField_6.setColumns(10);
		
		
		JButton btnNewButton = new JButton("\u786E\u5B9A");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				Local local = new Local();
				local.setLid(Integer.parseInt(textField.getText()));
				local.setLname(textField_1.getText());
			    local.setLage(Integer.parseInt(textField_2.getText()));
				local.setSsex(textField_3.getText());
				local.setLtime(textField_4.getText());
				local.setLdielocal(textField_5.getText());
				local.setLaddress(textField_6.getText());
				LocalDao local1 = new LocalDao();
				local1.insertByCondtion(local);
				
				
				dispose();
				JOptionPane.showMessageDialog(null, "����ɹ�");
				
			}
		});
		btnNewButton.setAction(action);
		btnNewButton.setBounds(330, 380, 113, 27);
		getContentPane().add(btnNewButton);
	}
	private class SwingAction extends AbstractAction {
		public SwingAction() {
			putValue(NAME, "ȷ��");
			putValue(SHORT_DESCRIPTION, "Some short description");
		}
		public void actionPerformed(ActionEvent e) {
		}
	}

}
