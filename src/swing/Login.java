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
		JFrame jf=new JFrame("居民健康管理系统");
		jframe = jf;
        jf.setLocation(100,100);//设置位置
        jf.setSize(600,400); //设置大小
        jf.setLocationRelativeTo(null);
        jf.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        Container con = jf.getContentPane();//按钮 记住密码
        // 创建内容面板，指定布局为 null，则使用绝对布局
        JPanel panel = new JPanel(null);

     //标题
        JLabel label_image1 = new JLabel(new ImageIcon("./image/3.jpg"));
  		label_image1.setLocation(0, 20);
  		label_image1.setSize(600,50);
		panel.add(label_image1);
     //二维码
        JLabel label_image = new JLabel(new ImageIcon("./image/4.jpg"));
  		label_image.setLocation(50, 90);
  		label_image.setSize(200,200);
		panel.add(label_image);
     //用户名
        JLabel label_username=new JLabel("用户名: ");
		jf.add(label_username);
		
		JTextField userName = new JTextField(25);
		jf.add(userName);
        // 设置按钮的坐标
		label_username.setLocation(300, 100);
		userName.setLocation(350,115);
        // 设置按钮的宽高
		label_username.setSize(70, 50);
		userName.setSize(200,25);
        panel.add(label_username);
        panel.add(userName);
        
     //密码
        JLabel label_password=new JLabel("密    码: ");
		jf.add(label_password);
		
		JTextField password = new JTextField(25);
		jf.add(password);
        // 设置按钮的坐标
		label_password.setLocation(300, 150);
		password.setLocation(350,165);
        // 设置按钮的宽高
		label_password.setSize(70, 50);
		password.setSize(200,25);
        panel.add(label_password);
        panel.add(password);
        
    //记住密码
        JCheckBox checkbox=new JCheckBox("记住密码",false);
		System.out.println(checkbox.getText());
		con.add(checkbox);
		checkbox.setLocation(300, 190);
		checkbox.setLocation(350,200);
        // 设置按钮的宽高
		checkbox.setSize(70, 50);
		checkbox.setSize(200,25);
        panel.add(checkbox);
        
        
     // 登录
        JButton btn=new JButton("登录");
		btn.setLocation(400,240);
        // 设置按钮的宽高
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
				if(user!=null) {//登陆成功
					if("用户".equals(user.getRolename())) {
						new MainUser(username);
						jframe.dispose();
					}else if("管理员".equals(user.getRolename())) {
						new MainFrame();
						jframe.dispose();
					}
					 
				}else {
					//登陆失败
					JOptionPane.showMessageDialog(null, "登陆失败,用户名或者密码错误");
				}
			}
        	
        });
        jf.setContentPane(panel);
        //jf.setJMenuBar(menuBar);//一级菜单
        jf.setVisible(true);
	}
}