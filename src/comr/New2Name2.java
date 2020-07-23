package comr;

import java.awt.Color;
import java.awt.EventQueue;
import java.awt.event.ActionEvent;

import javax.swing.AbstractAction;
import javax.swing.Action;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.border.EmptyBorder;

import beans.Public;
import dao.PublicDao;



//公共卫生——删除

	public class New2Name2 extends JFrame {

		private JPanel contentPane;
		private JTextField textField;
		
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
		public New2Name2() {
	
			setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
			setBounds(100, 100, 400, 300);
			setTitle("公共卫生服务");
			contentPane = new JPanel();
			contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
			setContentPane(contentPane);
			contentPane.setLayout(null);
			
			JLabel lblNewLabel = new JLabel("档案编号:");
			lblNewLabel.setBounds(50, 80, 72, 18);
			contentPane.add(lblNewLabel);
			
			
			
			textField = new JTextField();
			textField.setBounds(120, 80, 170, 24);
			contentPane.add(textField);
			textField.setColumns(10);
			
			
			JButton btnNewButton = new JButton("确定");
			btnNewButton.setBackground(Color.pink);
			btnNewButton.setAction(action);
			btnNewButton.setBounds(135, 170, 100, 30);
			contentPane.add(btnNewButton);
		}

		private class SwingAction extends AbstractAction {
			public SwingAction() {
				putValue(NAME, "确定");
				putValue(SHORT_DESCRIPTION, "Some short description");
			}
			public void actionPerformed(ActionEvent e) {
				//按钮触发
				Public public2 = new Public();
				public2.setPid(Integer.parseInt(textField.getText()));
				
				
				PublicDao public3 = new PublicDao();
				public3.deleteByCondtion(public2);
				
				
				dispose();
				JOptionPane.showMessageDialog(null, "删除成功");

				
			}
		}
	}



