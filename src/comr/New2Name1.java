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

public class New2Name1 extends JDialog {
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
			
			New2Name1 dialog = new New2Name1();
			dialog.setDefaultCloseOperation(JDialog.DISPOSE_ON_CLOSE);
			dialog.setVisible(true);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	/**
	 * Create the dialog.
	 */
	public New2Name1() {
		setBounds(100, 100, 800, 460);
		setTitle("������������");
		getContentPane().setLayout(null);
		contentPanel.setBounds(0, 0, 432, 1);
		contentPanel.setBorder(new EmptyBorder(5, 5, 5, 5));
		getContentPane().add(contentPanel);
		contentPanel.setLayout(null);
		
		JLabel label = new JLabel("\u6B7B\u8005\u7F16\u53F7");
		label.setBounds(57, 48, 72, 18);
		contentPanel.add(label);
		
		JLabel lblNewLabel = new JLabel("���:");
		lblNewLabel.setBounds(102, 85, 72, 18);
		getContentPane().add(lblNewLabel );
		
		JLabel label_1 = new JLabel("����:");
		label_1.setBounds(102, 130, 72, 18);
		getContentPane().add(label_1);
		
		JLabel label_2 = new JLabel("�Ա�:");
		label_2.setBounds(102, 175, 72, 18);
		getContentPane().add(label_2);
		
		JLabel label_3 = new JLabel("���:");
		label_3.setBounds(102, 220, 72, 18);
		getContentPane().add(label_3);
		
		textField = new JTextField();
		textField.setBounds(150, 85, 225, 24);
		getContentPane().add(textField);
		textField.setColumns(10);
		
		JLabel label_4 = new JLabel("����:");
		label_4.setBounds(400, 85, 90, 18);
		getContentPane().add(label_4);
		
		JLabel label_5 = new JLabel("Ѫѹ:");
		label_5.setBounds(400, 130, 90, 18);
		getContentPane().add(label_5);
		
		JLabel label_6 = new JLabel("����:");
		label_6.setBounds(400, 175, 90, 18);
		getContentPane().add(label_6);
		
		JLabel label_7 = new JLabel("�λ���:");
		label_7.setBounds(400, 220, 90, 18);
		getContentPane().add(label_7);
		
		textField_1 = new JTextField();
		textField_1.setColumns(10);
		textField_1.setBounds(150, 130, 225, 24);
		getContentPane().add(textField_1);
		
		textField_2 = new JTextField();
		textField_2.setColumns(10);
		textField_2.setBounds(150, 175, 225, 24);
		getContentPane().add(textField_2);
		
		textField_3 = new JTextField();
		textField_3.setBounds(150, 220, 226, 24);
		getContentPane().add(textField_3);
		textField_3.setColumns(10);
		
		textField_4 = new JTextField();
		textField_4.setBounds(450, 85, 224, 24);
		getContentPane().add(textField_4);
		textField_4.setColumns(10);
		
		textField_5 = new JTextField();
		textField_5.setColumns(10);
		textField_5.setBounds(450, 130, 225, 24);
		getContentPane().add(textField_5);
		
		textField_6 = new JTextField();
		textField_6.setColumns(10);
		textField_6.setBounds(450, 175, 225, 24);
		getContentPane().add(textField_6);
		
		textField_7 = new JTextField();
		textField_7.setColumns(10);
		textField_7.setBounds(450, 220, 225, 24);
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
				public1.updateByCondtion(di);
				dispose();
				JOptionPane.showMessageDialog(null, "�޸ĳɹ�");
				
			}
		});
		btnNewButton.setAction(action);
		btnNewButton.setBounds(330, 300, 113, 27);
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