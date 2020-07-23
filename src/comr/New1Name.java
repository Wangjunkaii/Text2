package comr;

import java.awt.BorderLayout;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import beans.Health;
import dao.HealthDao;

import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.AbstractAction;
import java.awt.event.ActionEvent;
import javax.swing.Action;
import java.awt.Color;

public class New1Name extends JFrame {

	private JPanel contentPane;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTextField textField_3;
	private JTextField textField_4;
	private JTextField textField_5;
	private JTextField textField_6;
	private JTextField textField_7;
	private JTextField textField_8;
	private JTextField textField_9;
	private JTextField textField_10;
	private final Action action = new SwingAction();

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					New1Name frame = new New1Name();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public New1Name() {
		setTitle("健康档案数据管理");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 660, 460);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("\u6863\u6848\u7F16\u53F7\uFF1A");
		lblNewLabel.setBounds(64, 43, 81, 18);
		contentPane.add(lblNewLabel);
		
		JLabel label = new JLabel("");
		label.setBounds(88, 109, 72, 18);
		contentPane.add(label);
		
		JLabel label_1 = new JLabel("\u59D3\u540D\uFF1A");
		label_1.setBounds(64, 96, 72, 18);
		contentPane.add(label_1);
		
		JLabel label_2 = new JLabel("\u6027\u522B\uFF1A");
		label_2.setBounds(64, 152, 72, 18);
		contentPane.add(label_2);
		
		JLabel label_3 = new JLabel("\u73B0\u4F4F\u5740\uFF1A");
		label_3.setBounds(64, 210, 72, 18);
		contentPane.add(label_3);
		
		JLabel label_4 = new JLabel("\u51FA\u751F\u65E5\u671F\uFF1A");
		label_4.setBounds(64, 265, 82, 18);
		contentPane.add(label_4);
		
		JLabel lblNewLabel_1 = new JLabel("\u8EAB\u4EFD\u8BC1\u53F7\uFF1A");
		lblNewLabel_1.setBounds(64, 316, 95, 18);
		contentPane.add(lblNewLabel_1);
		
		JLabel label_5 = new JLabel("\u8840\u578B\uFF1A");
		label_5.setBounds(316, 43, 72, 18);
		contentPane.add(label_5);
		
		JLabel lblHr = new JLabel("RH\u9634\u6027\uFF1A");
		lblHr.setBounds(316, 96, 72, 18);
		contentPane.add(lblHr);
		
		JLabel label_6 = new JLabel("\u75BE\u75C5\u53F2\uFF1A");
		label_6.setBounds(316, 152, 72, 18);
		contentPane.add(label_6);
		
		JLabel label_7 = new JLabel("\u836F\u7269\u8FC7\u654F\u53F2\uFF1A");
		label_7.setBounds(316, 210, 93, 18);
		contentPane.add(label_7);
		
		JLabel label_8 = new JLabel("\u65E2\u5F80\u53F2\uFF1A");
		label_8.setBounds(316, 265, 72, 18);
		contentPane.add(label_8);
		
		textField = new JTextField();
		textField.setBounds(150, 40, 148, 24);
		contentPane.add(textField);
		textField.setColumns(10);
		
		textField_1 = new JTextField();
		textField_1.setColumns(10);
		textField_1.setBounds(149, 89, 148, 24);
		contentPane.add(textField_1);
		
		textField_2 = new JTextField();
		textField_2.setColumns(10);
		textField_2.setBounds(148, 145, 148, 24);
		contentPane.add(textField_2);
		
		textField_3 = new JTextField();
		textField_3.setColumns(10);
		textField_3.setBounds(147, 204, 148, 24);
		contentPane.add(textField_3);
		
		textField_4 = new JTextField();
		textField_4.setColumns(10);
		textField_4.setBounds(149, 260, 148, 24);
		contentPane.add(textField_4);
		
		textField_5 = new JTextField();
		textField_5.setColumns(10);
		textField_5.setBounds(150, 311, 219, 24);
		contentPane.add(textField_5);
		
		textField_6 = new JTextField();
		textField_6.setColumns(10);
		textField_6.setBounds(406, 39, 179, 24);
		contentPane.add(textField_6);
		
		textField_7 = new JTextField();
		textField_7.setColumns(10);
		textField_7.setBounds(406, 89, 179, 24);
		contentPane.add(textField_7);
		
		textField_8 = new JTextField();
		textField_8.setColumns(10);
		textField_8.setBounds(405, 146, 179, 24);
		contentPane.add(textField_8);
		
		textField_9 = new JTextField();
		textField_9.setColumns(10);
		textField_9.setBounds(405, 205, 179, 24);
		contentPane.add(textField_9);
		
		textField_10 = new JTextField();
		textField_10.setColumns(10);
		textField_10.setBounds(403, 257, 179, 24);
		contentPane.add(textField_10);
		
		JButton btnNewButton = new JButton("确定");
		btnNewButton.setBackground(Color.pink);
		btnNewButton.setAction(action);
		btnNewButton.setBounds(260,350, 126, 37);
		contentPane.add(btnNewButton);
	}

	private class SwingAction extends AbstractAction {
		public SwingAction() {
			putValue(NAME, "确定");
			putValue(SHORT_DESCRIPTION, "Some short description");
		}
		public void actionPerformed(ActionEvent e) {
			//按钮触发
			Health health = new Health();
			health.setHid(Integer.parseInt(textField.getText()));
			health.setHname(textField_1.getText());
			health.setHssex(textField_2.getText());
			health.setHaddress(textField_3.getText());
			health.setHbirthday(textField_4.getText());
			health.setHnumber(Integer.parseInt(textField_5.getText()));
			health.setHblood(textField_6.getText());
			health.setHRH(textField_7.getText());
			health.setHjibing(textField_8.getText());
			health.setHguomin(textField_9.getText());
			health.setHjiwang(textField_10.getText());
			HealthDao healh = new HealthDao();
			healh.insertByCondtion(health);
			
			
			dispose();
			JOptionPane.showMessageDialog(null, "插入成功");

			
		}
	}
}
