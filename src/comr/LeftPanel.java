package comr;


import java.awt.BorderLayout;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.List;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.JToolBar;

import beans.Die;
import beans.Health;
import beans.House;
import beans.Local;
import beans.Public;
import dao.DieDao;
import dao.HealthDao;
import dao.HouseDao;
import dao.LocalDao;
import dao.PublicDao;

public class LeftPanel extends JPanel {
	private JButton btn1;
	private JButton btn2;
	private JButton btn3;
	private JButton btn4;
	private JButton btn5;
	private JButton btn6;
	
	public LeftPanel() {
		
	//0	setBackground(Color.yellow);
		initComponents();
		setVisible(true);
	}
	
	private void initComponents() {
		this.setLayout(null);
//�û�����		
		btn1 = new JButton("�û�����");
		btn1.setBounds(10, 5, 95, 30);
		btn1.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent arg0) {
				
				MainFrame main = SwingUtil.getMainframe();
				
				//��������м�����
				CenterPanel jpCenter = main.getCenterPanel();
				
				//�Ƴ��������
				jpCenter.removeAll();
				
				jpCenter.setLayout(new BorderLayout());
				JPanel pane = new JPanel(new BorderLayout());
				
           //�û�������
				String[] titles = {"�������","����","����","�Ա�","��ͥסַ"};
				 
				DieDao dieD = new DieDao();
				List<Die> list = new ArrayList<>();
				list = dieD.selectByCondtion(null);
				String[][] tables = new String[list.size()][titles.length];
				
				for (int i = 0; i < list.size(); i++) {
					Die tmp = list.get(i);
					
					tables[i][0] = tmp.getDid()+"";
					tables[i][1] = tmp.getDname();
					tables[i][2] = tmp.getDage()+"";
					tables[i][3] = tmp.getSsex();
					tables[i][4] = tmp.getDaddress();
					
					
				}
				
				
				JTable table = new JTable(tables,titles);
				pane.add(table.getTableHeader(),BorderLayout.NORTH);
				pane.add(table,BorderLayout.CENTER);
				//�û�����--����
				JToolBar bar = new JToolBar("����");
				bar.setPreferredSize(new Dimension(0,60));
				JButton btn = new JButton("����");
				btn.setIcon(new ImageIcon("image/add.png"));
				JButton btn1 = new JButton("ɾ��");
				btn1.setIcon(new ImageIcon("image/decline.png"));
				JButton btn2 = new JButton("�޸�");
				btn2.setIcon(new ImageIcon("image/arrow_rotate_clockwise.png"));
				JButton btn3 = new JButton("��ѯ");
				btn3.setIcon(new ImageIcon("image/zoom.png"));
				bar.add(btn);
				bar.add(btn1);
				bar.add(btn2);
				bar.add(btn3);
				
				//����
				btn3.addActionListener(new ActionListener() {

						    	 
						@Override
						public void actionPerformed(ActionEvent e) {
							NewName3 newInsert1 = new NewName3();
							newInsert1.setVisible(true);
							newInsert1.setBounds((1366-400)/2, (768-300)/2, 400, 300);
							newInsert1.setDefaultCloseOperation(JDialog.DISPOSE_ON_CLOSE);
						    	 
						    	 
						
					}	
				});
				//�޸�
				btn2.addActionListener(new ActionListener() {

					@Override
					public void actionPerformed(ActionEvent e) {
						NewName2 jb1= new NewName2();
						jb1.setVisible(true);
						jb1.setBounds((1366-600)/2, (768-400)/2, 600, 400);
						jb1.setDefaultCloseOperation(JDialog.DISPOSE_ON_CLOSE);
					}	
				});
				//ɾ��
				btn1.addActionListener(new ActionListener() {

					@Override
					public void actionPerformed(ActionEvent e) {
						NewName1 jd= new NewName1();
						jd.setVisible(true);
						jd.setBounds((1366-400)/2, (768-300)/2, 400, 300);
						jd.setDefaultCloseOperation(JDialog.DISPOSE_ON_CLOSE);
						
					}
					
				});
			//����
				btn.addActionListener(new ActionListener() {

					@Override
					public void actionPerformed(ActionEvent e) {
						NewName newInsert = new NewName();
						newInsert.setVisible(true);
						newInsert.setBounds((1366-600)/2, (768-400)/2, 600, 400);
						newInsert.setDefaultCloseOperation(JDialog.DISPOSE_ON_CLOSE);
					}	
				});
			
		
				jpCenter.add(pane, BorderLayout.CENTER);
				jpCenter.add(bar, BorderLayout.NORTH);
				
				//����У�� �ؼ��Ƿ���Ч
				jpCenter.revalidate();
				//���»��� CenterPanel
				jpCenter.repaint();
			}
		});
			
		
	
		
		
//������������		
		btn2 = new JButton("�����������ݹ���");
		btn2.setBounds(10, 45, 95, 30);
		btn2.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent arg0) {
				MainFrame main = SwingUtil.getMainframe();
				
				//��������м�����
				CenterPanel jpCenter = main.getCenterPanel();
				
				//�Ƴ��������
				jpCenter.removeAll();
				
				jpCenter.setLayout(new BorderLayout());
				JPanel pane = new JPanel(new BorderLayout());
				String[] titles = {"�������","����","�Ա�","��סַ","��������","���֤��","Ѫ��","RH����","����ʷ","ҩ�����ʷ","����ʷ"};
				 
				HealthDao health = new HealthDao();
				List<Health> list = new ArrayList<>();
				list = health.selectByCondtion(null);
				String[][] tables = new String[list.size()][titles.length];
				
				for (int i = 0; i < list.size(); i++) {
					Health tmp = list.get(i);
					
					tables[i][0] = tmp.getHid()+"";
					tables[i][1] = tmp.getHname();
					tables[i][2] = tmp.getHssex();
					tables[i][3] = tmp.getHaddress();
					tables[i][4] = tmp.getHbirthday();
					tables[i][5] = tmp.getHnumber()+"";
					tables[i][6] = tmp.getHblood();
					tables[i][7] = tmp.getHRH();
					tables[i][8] = tmp.getHjibing();
					tables[i][9] = tmp.getHguomin();
					tables[i][10] = tmp.getHjiwang();
					
				}
				
				
				JTable table = new JTable(tables,titles);
				pane.add(table.getTableHeader(),BorderLayout.NORTH);
				pane.add(table,BorderLayout.CENTER);
				//�û�����--����
				JToolBar bar = new JToolBar("����");
				bar.setPreferredSize(new Dimension(0,60));
				JButton btn = new JButton("����");
				btn.setIcon(new ImageIcon("image/add.png"));
				JButton btn1 = new JButton("ɾ��");
				btn1.setIcon(new ImageIcon("image/decline.png"));
				JButton btn2 = new JButton("�޸�");
				btn2.setIcon(new ImageIcon("image/arrow_rotate_clockwise.png"));
				JButton btn3 = new JButton("��ѯ");
				btn3.setIcon(new ImageIcon("image/zoom.png"));
				bar.add(btn);
				bar.add(btn1);
				bar.add(btn2);
				bar.add(btn3);
				
				
				btn.addActionListener(new ActionListener() {

					@Override
					public void actionPerformed(ActionEvent e) {
						New1Name newInsert = new New1Name();
						newInsert.setVisible(true);
						newInsert.setBounds((1366-650)/2, (768-460)/2, 650, 460);
						newInsert.setDefaultCloseOperation(JDialog.DISPOSE_ON_CLOSE);
					}	
				});
				
				btn1.addActionListener(new ActionListener() {

					@Override
					public void actionPerformed(ActionEvent e) {
						New1Name1 newInsert1 = new New1Name1();
						newInsert1.setVisible(true);
						newInsert1.setBounds((1366-400)/2, (768-300)/2, 400, 300);
						newInsert1.setDefaultCloseOperation(JDialog.DISPOSE_ON_CLOSE);
					}	
				});
				btn2.addActionListener(new ActionListener() {

					@Override
					public void actionPerformed(ActionEvent e) {
						New1Name2 newInsert1 = new New1Name2();
						newInsert1.setVisible(true);
						newInsert1.setBounds((1366-650)/2, (768-460)/2, 650, 460);
						newInsert1.setDefaultCloseOperation(JDialog.DISPOSE_ON_CLOSE);
					}	
				});
				btn3.addActionListener(new ActionListener() {

					@Override
					public void actionPerformed(ActionEvent e) {
						New1Name3 newInsert1 = new New1Name3();
						newInsert1.setVisible(true);
						newInsert1.setBounds((1366-400)/2, (768-300)/2, 400, 300);
						newInsert1.setDefaultCloseOperation(JDialog.DISPOSE_ON_CLOSE);
					}	
				});
				jpCenter.add(pane, BorderLayout.CENTER);
				jpCenter.add(bar, BorderLayout.NORTH);
				//����У�� �ؼ��Ƿ���Ч
				jpCenter.revalidate();
				//���»��� CenterPanel
				jpCenter.repaint();
			}
			
		});		
		
//������������		
		btn3 = new JButton("������������");
		btn3.setBounds(10, 165, 95, 30);
		btn3.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent arg0) {
				MainFrame main = SwingUtil.getMainframe();
				
				//��������м�����
				CenterPanel jpCenter = main.getCenterPanel();
				
				//�Ƴ��������
				jpCenter.removeAll();
				
				jpCenter.setLayout(new BorderLayout());
				JPanel pane = new JPanel(new BorderLayout());
				String[] titles = {"���","����","�Ա�","���","����","Ѫѹ","����","�λ���"};
				
				PublicDao public1 = new PublicDao();
				
				List<Public> list = new ArrayList<>();
				list = public1.selectByCondtion(null);
				String[][] tables = new String[list.size()][titles.length];
				
				for (int i = 0; i < list.size(); i++) {
					Public tmp = list.get(i);
					tables[i][0] = tmp.getPid()+"";
					tables[i][1] = tmp.getPname();
					tables[i][2] = tmp.getPssex();
					tables[i][3] = tmp.getPheight()+"";
					tables[i][4] = tmp.getPweight()+"";
					tables[i][5] = tmp.getPbloodpressure();
					tables[i][6] = tmp.getPsee();
					tables[i][7] = tmp.getPvital();
					
					
				}
				
				
				JTable table = new JTable(tables,titles);
				pane.add(table.getTableHeader(),BorderLayout.NORTH);
				pane.add(table,BorderLayout.CENTER);
				//�û�����--����
				JToolBar bar = new JToolBar("����");
				bar.setPreferredSize(new Dimension(0,60));
				JButton btn = new JButton("����");
				btn.setIcon(new ImageIcon("image/add.png"));
				JButton btn1 = new JButton("�޸�");
				btn1.setIcon(new ImageIcon("image/arrow_rotate_clockwise.png"));
				JButton btn2 = new JButton("ɾ��");
				btn2.setIcon(new ImageIcon("image/decline.png"));
				JButton btn3 = new JButton("��ѯ");
				btn3.setIcon(new ImageIcon("image/zoom.png"));
				
				bar.add(btn);
				bar.add(btn1);
				bar.add(btn2);
				bar.add(btn3);
				btn.addActionListener(new ActionListener() {

					@Override
					public void actionPerformed(ActionEvent e) {
						New2Name newInsert = new New2Name();
						newInsert.setVisible(true);
						newInsert.setBounds((1366-700)/2, (768-380)/2, 700, 380);
						newInsert.setDefaultCloseOperation(JDialog.DISPOSE_ON_CLOSE);
					}	
				});
				
				btn1.addActionListener(new ActionListener() {

					@Override
					public void actionPerformed(ActionEvent e) {
						New2Name1 newInsert1 = new New2Name1();
						newInsert1.setVisible(true);
						newInsert1.setBounds((1366-700)/2, (768-380)/2, 700, 380);
						newInsert1.setDefaultCloseOperation(JDialog.DISPOSE_ON_CLOSE);
					}	
				});
				btn2.addActionListener(new ActionListener() {

					@Override
					public void actionPerformed(ActionEvent e) {
						New2Name2 newInsert1 = new New2Name2();
						newInsert1.setVisible(true);
						newInsert1.setBounds((1366-400)/2, (768-300)/2, 400, 300);
						newInsert1.setDefaultCloseOperation(JDialog.DISPOSE_ON_CLOSE);
					}	
				});
				btn3.addActionListener(new ActionListener() {

					@Override
					public void actionPerformed(ActionEvent e) {
						New2Name3 newInsert1 = new New2Name3();
						newInsert1.setVisible(true);
						newInsert1.setBounds((1366-400)/2, (768-300)/2, 400, 300);
						newInsert1.setDefaultCloseOperation(JDialog.DISPOSE_ON_CLOSE);
					}	
				});
				jpCenter.add(pane, BorderLayout.CENTER);
				jpCenter.add(bar, BorderLayout.NORTH);
				//����У�� �ؼ��Ƿ���Ч
				jpCenter.revalidate();
				//���»��� CenterPanel
				jpCenter.repaint();
			}
			
		});	
		
		
//�����Ϣ����
		btn4 = new JButton("�����Ϣ����");
		btn4.setBounds(10, 205, 95, 30);
		btn4.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent arg0) {
				MainFrame main = SwingUtil.getMainframe();
				//��������м�����
				CenterPanel jpCenter = main.getCenterPanel();
				
				//�Ƴ��������
				jpCenter.removeAll();
				
				jpCenter.setLayout(new BorderLayout());
				
				
				JPanel pane = new JPanel(new BorderLayout());
				
           //�û�������
				String[] titles = {"�������","����","����","�Ա�","��ͥסַ"};
				 
				DieDao dieD = new DieDao();
				List<Die> list = new ArrayList<>();
				list = dieD.selectByCondtion(null);
				String[][] tables = new String[list.size()][titles.length];
				
				for (int i = 0; i < list.size(); i++) {
					Die tmp = list.get(i);
					
					tables[i][0] = tmp.getDid()+"";
					tables[i][1] = tmp.getDname();
					tables[i][2] = tmp.getDage()+"";
					tables[i][3] = tmp.getSsex();
					tables[i][4] = tmp.getDaddress();
					
					
				}
				
				
				JTable table = new JTable(tables,titles);
				pane.add(table.getTableHeader(),BorderLayout.NORTH);
				pane.add(table,BorderLayout.CENTER);
				//�û�����--����
				JToolBar bar = new JToolBar("����");
				bar.setPreferredSize(new Dimension(250,60));
				JButton btn = new JButton("��ѯ");
				btn.setIcon(new ImageIcon("image/zoom.png"));
				bar.add(btn);
			
				btn.addActionListener(new ActionListener() {
				    	
				    	@Override
						public void actionPerformed(ActionEvent e) {
				    		New4Name newInsert1 = new New4Name();
							newInsert1.setVisible(true);
							newInsert1.setBounds((1366-400)/2, (768-300)/2, 400, 300);
							newInsert1.setDefaultCloseOperation(JDialog.DISPOSE_ON_CLOSE);
				        }	
			   });
				
			    jpCenter.add(pane, BorderLayout.CENTER);
			    jpCenter.add(bar,BorderLayout.NORTH);
				
				//����У�� �ؼ��Ƿ���Ч
				jpCenter.revalidate();
				//���»��� CenterPanel
				jpCenter.repaint();
			}
		
			
		});			
		
//���������Ǽ�		
		btn5 = new JButton("���������Ǽ�");
		btn5.setBounds(10, 85, 95, 30);
		btn5.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent arg0) {
				MainFrame main = SwingUtil.getMainframe();
				
				//��������м�����
				CenterPanel jpCenter = main.getCenterPanel();
				
				//�Ƴ��������
				jpCenter.removeAll();
				
				jpCenter.setLayout(new BorderLayout());
				JPanel pane = new JPanel(new BorderLayout());
				
		           //�û�������
						String[] titles = {"���","����","����","�Ա�","����ʱ��","����   �ص�","��ͥסַ"};
						 
						LocalDao local = new LocalDao();
						List<Local> list = new ArrayList<>();
						list = local.selectByCondtion(null);
						String[][] tables = new String[list.size()][titles.length];
						//System.out.println(list.size());
						//System.out.println(list.get(0).toString());
						for (int i = 0; i < list.size(); i++) {
							Local tmp = list.get(i);
							System.out.println(tmp.getLname()+" ");
							tables[i][0] = tmp.getLid()+"";
							tables[i][1] = tmp.getLname();
							tables[i][2] = tmp.getLage()+"";
							tables[i][3] = tmp.getSsex();
							tables[i][4] = tmp.getLtime();
							tables[i][5] = tmp.getLdielocal();
							tables[i][6] = tmp.getLaddress();
							
						}
						
						JTable table = new JTable(tables,titles);
						pane.add(table.getTableHeader(),BorderLayout.NORTH);
						pane.add(table,BorderLayout.CENTER);
						//�û�����--����
						JToolBar bar = new JToolBar("����");
						bar.setPreferredSize(new Dimension(0,60));
						JButton btn = new JButton("����");
						btn.setIcon(new ImageIcon("image/add.png"));
						JButton btn1 = new JButton("ɾ��");
						btn1.setIcon(new ImageIcon("image/decline.png"));
						JButton btn2 = new JButton("�޸�");
						btn2.setIcon(new ImageIcon("image/arrow_rotate_clockwise.png"));
						JButton btn3 = new JButton("��ѯ");
						btn3.setIcon(new ImageIcon("image/zoom.png"));
						bar.add(btn);
						bar.add(btn1);
						bar.add(btn2);
						bar.add(btn3);
						btn.addActionListener(new ActionListener() {

							@Override
							public void actionPerformed(ActionEvent e) {
								New3Name newInsert1 = new New3Name();
								newInsert1.setVisible(true);
								newInsert1.setBounds((1366-800)/2, (768-460)/2, 800, 460);
								newInsert1.setDefaultCloseOperation(JDialog.DISPOSE_ON_CLOSE);
							}	
						});
						btn1.addActionListener(new ActionListener() {

							@Override
							public void actionPerformed(ActionEvent e) {
								New3Name1 newInsert1 = new New3Name1();
								newInsert1.setVisible(true);
								newInsert1.setBounds((1366-400)/2, (768-300)/2, 400, 300);
								newInsert1.setDefaultCloseOperation(JDialog.DISPOSE_ON_CLOSE);
							}	
						});
						btn2.addActionListener(new ActionListener() {

							@Override
							public void actionPerformed(ActionEvent e) {
								New3Name2 newInsert1 = new New3Name2();
								newInsert1.setVisible(true);
								newInsert1.setBounds((1366-800)/2, (768-460)/2, 800, 460);
								newInsert1.setDefaultCloseOperation(JDialog.DISPOSE_ON_CLOSE);
							}	
						});
						btn3.addActionListener(new ActionListener() {

							@Override
							public void actionPerformed(ActionEvent e) {
								New3Name3 newInsert1 = new New3Name3();
								newInsert1.setVisible(true);
								newInsert1.setBounds((1366-400)/2, (768-300)/2, 400, 300);
								newInsert1.setDefaultCloseOperation(JDialog.DISPOSE_ON_CLOSE);
							}	
						});
						jpCenter.add(pane, BorderLayout.CENTER);
						jpCenter.add(bar, BorderLayout.NORTH);
				//����У�� �ؼ��Ƿ���Ч
				jpCenter.revalidate();
				//���»��� CenterPanel
				jpCenter.repaint();
			}
		
			
		});			
//������������		
		btn6 = new JButton("������������");
		btn6.setBounds(10, 125, 95, 30);
		btn6.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent arg0) {
				MainFrame main = SwingUtil.getMainframe();
				
				//��������м�����
				CenterPanel jpCenter = main.getCenterPanel();
				
				//�Ƴ��������
				jpCenter.removeAll();
				
				jpCenter.setLayout(new BorderLayout());
				JPanel pane = new JPanel(new BorderLayout());
				
           //�û�������
				String[] titles = {"��ͥ���","����","��ͥסַ","�ֻ�","ҽ�ƿ���","ҽ��֤��","��������"};
				 
				HouseDao house = new HouseDao();
				List<House> list = new ArrayList<>();
				list = house.selectByCondtion(null);
				String[][] tables = new String[list.size()][titles.length];
				
				for (int i = 0; i < list.size(); i++) {
					House tmp = list.get(i);
					
					tables[i][0] = tmp.getHhouseid()+""; 
					tables[i][1] = tmp.getHname();
					tables[i][2] = tmp.getHaddress();
					tables[i][3] = tmp.getHnumber();
					tables[i][4] = tmp.getHmecd()+"";
					tables[i][5] = tmp.getHmeid()+"";
					tables[i][6] = tmp.getHzip()+"";
					
					
				}
				
				
				JTable table = new JTable(tables,titles);
				pane.add(table.getTableHeader(),BorderLayout.NORTH);
				pane.add(table,BorderLayout.CENTER);
				//�û�����--����
				JToolBar bar = new JToolBar("����");
				bar.setPreferredSize(new Dimension(0,60));
				JButton btn = new JButton("����");
				btn.setIcon(new ImageIcon("image/zoom.png")); 
				bar.add(btn);
				    btn.addActionListener(new ActionListener() {
				    	
				    	@Override
						public void actionPerformed(ActionEvent e) {
							New5Name newInsert1 = new New5Name();
							newInsert1.setVisible(true);
							newInsert1.setBounds((1366-400)/2, (768-300)/2, 400, 300);
							newInsert1.setDefaultCloseOperation(JDialog.DISPOSE_ON_CLOSE);
				    	 
				    	 
				    }	
				    });
				jpCenter.add(pane, BorderLayout.CENTER);
				jpCenter.add(bar, BorderLayout.NORTH);
				//����У�� �ؼ��Ƿ���Ч
				jpCenter.revalidate();
				//���»��� CenterPanel
				jpCenter.repaint();
			}
		
			
		});			
		
		add(btn1);
		add(btn2);
		add(btn3);
		add(btn4);
		add(btn5);
		add(btn6);
}
}		
		
