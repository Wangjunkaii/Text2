package comr;





//����--ɾ��

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
	//����--�޸�
public class New1Name2 extends JFrame {

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
		public New1Name2() {
			setTitle("��������");
			setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
			setBounds(100, 100, 800, 460);
			contentPane = new JPanel();
			contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
			setContentPane(contentPane);
			contentPane.setLayout(null);
			
			JLabel lblNewLabel = new JLabel("�������:");
			lblNewLabel.setBounds(300, 150, 100, 50);
			contentPane.add(lblNewLabel);
			
			
			
			textField = new JTextField();
			textField.setBounds(370, 159, 200, 30);
			contentPane.add(textField);
			textField.setColumns(10);
			
			
			JButton btnNewButton = new JButton("ȷ��");
			btnNewButton.setBackground(Color.pink);
			btnNewButton.setAction(action);
			btnNewButton.setBounds(370, 250, 100, 40);
			contentPane.add(btnNewButton);
		}

		private class SwingAction extends AbstractAction {
			public SwingAction() {
				putValue(NAME, "ȷ��");
				putValue(SHORT_DESCRIPTION, "Some short description");
			}
			public void actionPerformed(ActionEvent e) {
				//��ť����
				Health health = new Health();
				health.setHid(Integer.parseInt(textField.getText()));
				
				
				HealthDao healh = new HealthDao();
				healh.deleteByCondtion(health);
				
				
				dispose();
				JOptionPane.showMessageDialog(null, "ɾ���ɹ�");

				
			}
		}
	}

