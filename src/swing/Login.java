package swing;

import java.awt.Container;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.WindowConstants;

import beans.User;
import comr.MainFrame;
import dao.IUserDao;
import dao.UserDao;

public class Login {
    private static JFrame jframe;
	private static  IUserDao dao;
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		JFrame jf=new JFrame("���񽡿�����ϵͳ");
		jframe = jf;
        jf.setLocation(100,100);//����λ��
        jf.setSize(600,400); //���ô�С
        jf.setLocationRelativeTo(null);
        jf.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        Container con = jf.getContentPane();//��ť ��ס����
        // ����������壬ָ������Ϊ null����ʹ�þ��Բ���
        JPanel panel = new JPanel(null);

     //����
        JLabel label_image1 = new JLabel(new ImageIcon("./image/3.jpg"));
  		label_image1.setLocation(0, 20);
  		label_image1.setSize(600,50);
		panel.add(label_image1);
     //��ά��
        JLabel label_image = new JLabel(new ImageIcon("./image/4.jpg"));
  		label_image.setLocation(50, 90);
  		label_image.setSize(200,200);
		panel.add(label_image);
     //�û���
        JLabel label_username=new JLabel("�û���: ");
		jf.add(label_username);
		
		JTextField userName = new JTextField(25);
		jf.add(userName);
        // ���ð�ť������
		label_username.setLocation(300, 100);
		userName.setLocation(350,115);
        // ���ð�ť�Ŀ��
		label_username.setSize(70, 50);
		userName.setSize(200,25);
        panel.add(label_username);
        panel.add(userName);
        
     //����
        JLabel label_password=new JLabel("��    ��: ");
		jf.add(label_password);
		
		JTextField password = new JTextField(25);
		jf.add(password);
        // ���ð�ť������
		label_password.setLocation(300, 150);
		password.setLocation(350,165);
        // ���ð�ť�Ŀ��
		label_password.setSize(70, 50);
		password.setSize(200,25);
        panel.add(label_password);
        panel.add(password);
        
    //��ס����
        JCheckBox checkbox=new JCheckBox("��ס����",false);
		System.out.println(checkbox.getText());
		con.add(checkbox);
		checkbox.setLocation(300, 190);
		checkbox.setLocation(350,200);
        // ���ð�ť�Ŀ��
		checkbox.setSize(70, 50);
		checkbox.setSize(200,25);
        panel.add(checkbox);
        
        
     // ��¼
        JButton btn=new JButton("��¼");
		btn.setLocation(400,240);
        // ���ð�ť�Ŀ��
		btn.setSize(100,25);
        panel.add(btn);
        
        btn.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				String username=userName.getText();
				String password1=password.getText();
				dao = new UserDao();
				User user=dao.getLogin(username,password1);
				//System.out.println(user);
				if(user!=null) {//��½�ɹ�
					if("�û�".equals(user.getRolename())) {
						new MainUser(username);
						jframe.dispose();
					}else if("����Ա".equals(user.getRolename())) {
						new MainFrame();
						jframe.dispose();
					}
					 
				}else {
					//��½ʧ��
					JOptionPane.showMessageDialog(null, "��½ʧ��,�û��������������");
				}
			}
        	
        });
        jf.setContentPane(panel);
        //jf.setJMenuBar(menuBar);//һ���˵�
        jf.setVisible(true);
	}
}