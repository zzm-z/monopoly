/*
 * gameFrame.java
 *
 * Created on __DATE__, __TIME__
 */

package Frame;

import java.awt.Color;
import java.awt.HeadlessException;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Random;
import java.util.Timer;

import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import player.Players;

import function.GameFunction;

import run.Sql;

/**
 * 
 * @author __USER__
 */
public class ServerGameFrame extends javax.swing.JFrame {
	int x, y;
	int x2, y2;
	int orders = 0;// 玩家人数
	int playerNumber;
	int map;
	int oldorders;
	int role;
	int mapnumber=1;
	private JLabel jLabel01;
	public static Statement sta;
	public static PreparedStatement ps;
	public static Connection conn;

	/** Creates new form gameFrame */
	public ServerGameFrame(int mapnumber) {
		try {
			connection();
			Sql sql = new Sql();
			oldorders = sql.getServerOrders();
			initComponents();
			mapChange(1);
			checkorders();
			jButton30.setEnabled(false);
			this.setLocationRelativeTo(null);
			this.setIconImage(new ImageIcon("/images/logo1.jpg").getImage());
			binglirenwu1.setText("10000");
			binglirenwu2.setText("10000");
			binglirenwu3.setText("10000");
			binglirenwu4.setText("10000");
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	//GEN-BEGIN:initComponents
	// <editor-fold defaultstate="collapsed" desc="Generated Code">
	private void initComponents() {

		jPanel7 = new javax.swing.JPanel();
		renwu2 = new javax.swing.JLabel();
		binglirenwu2 = new javax.swing.JLabel();
		binglirenwu4 = new javax.swing.JLabel();
		renwu3 = new javax.swing.JLabel();
		renwu4 = new javax.swing.JLabel();
		renwu1 = new javax.swing.JLabel();
		jButton30 = new javax.swing.JButton();
		binglirenwu1 = new javax.swing.JLabel();
		binglirenwu3 = new javax.swing.JLabel();
		jLabel17 = new javax.swing.JLabel();
		jLabel2 = new javax.swing.JLabel();
		jLabel3 = new javax.swing.JLabel();
		jLabel4 = new javax.swing.JLabel();
		jLabel5 = new javax.swing.JLabel();
		lingdi2 = new javax.swing.JLabel();
		lingdi3 = new javax.swing.JLabel();
		lingdi4 = new javax.swing.JLabel();
		jButton1 = new javax.swing.JButton();
		lingdi5 = new javax.swing.JLabel();
		lingdi7 = new javax.swing.JLabel();
		lingdi8 = new javax.swing.JLabel();
		lingdi9 = new javax.swing.JLabel();
		lingdi11 = new javax.swing.JLabel();
		lingdi12 = new javax.swing.JLabel();
		lingdi13 = new javax.swing.JLabel();
		lingdi15 = new javax.swing.JLabel();
		lingdi16 = new javax.swing.JLabel();
		lingdi17 = new javax.swing.JLabel();
		lingdi19 = new javax.swing.JLabel();
		lingdi21 = new javax.swing.JLabel();
		lingdi23 = new javax.swing.JLabel();
		lingdi24 = new javax.swing.JLabel();
		lingdi26 = new javax.swing.JLabel();
		lingdi27 = new javax.swing.JLabel();
		number1 = new javax.swing.JLabel();
		number4 = new javax.swing.JLabel();
		number3 = new javax.swing.JLabel();
		number2 = new javax.swing.JLabel();
		bingli1 = new javax.swing.JLabel();
		bingli2 = new javax.swing.JLabel();
		bingli3 = new javax.swing.JLabel();
		bingli4 = new javax.swing.JLabel();
		jButton4 = new javax.swing.JButton();
		jLabel1 = new javax.swing.JLabel();

		setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
		setTitle("\u4e09\u56fd\u5927\u5bcc\u7fc1");
		addWindowListener(new java.awt.event.WindowAdapter() {
			public void windowClosed(java.awt.event.WindowEvent evt) {
				formWindowClosed(evt);
			}

			public void windowClosing(java.awt.event.WindowEvent evt) {
				formWindowClosing(evt);
			}
		});

		jPanel7.setLayout(null);

		renwu2.setIcon(new javax.swing.ImageIcon(getClass().getResource(
				"/roleimg/figure2.front.png"))); // NOI18N
		jPanel7.add(renwu2);
		renwu2.setBounds(1210, 470, 95, 200);

		binglirenwu2.setFont(new java.awt.Font("Microsoft YaHei UI", 1, 24));
		binglirenwu2.setForeground(new java.awt.Color(255, 255, 255));
		jPanel7.add(binglirenwu2);
		binglirenwu2.setBounds(1570, 30, 90, 30);

		binglirenwu4.setFont(new java.awt.Font("Microsoft YaHei UI", 1, 24));
		binglirenwu4.setForeground(new java.awt.Color(255, 255, 255));
		jPanel7.add(binglirenwu4);
		binglirenwu4.setBounds(240, 30, 90, 30);

		renwu3.setIcon(new javax.swing.ImageIcon(getClass().getResource(
				"/roleimg/figure3.front.png"))); // NOI18N
		jPanel7.add(renwu3);
		renwu3.setBounds(1205, 470, 95, 200);

		renwu4.setIcon(new javax.swing.ImageIcon(getClass().getResource(
				"/roleimg/figure4.front.png"))); // NOI18N
		jPanel7.add(renwu4);
		renwu4.setBounds(1200, 470, 95, 200);

		renwu1.setIcon(new javax.swing.ImageIcon(getClass().getResource(
				"/roleimg/figure1.front.png"))); // NOI18N
		jPanel7.add(renwu1);
		renwu1.setBounds(1210, 460, 95, 200);

		jButton30.setBackground(new java.awt.Color(255, 255, 255));
		jButton30.setIcon(new javax.swing.ImageIcon(getClass().getResource(
				"/images/touzi.png"))); // NOI18N
		jButton30.setBorder(null);
		jButton30.setContentAreaFilled(false);
		jButton30.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				jButton30ActionPerformed(evt);
			}
		});
		jPanel7.add(jButton30);
		jButton30.setBounds(1250, 830, 300, 70);

		binglirenwu1.setFont(new java.awt.Font("Microsoft YaHei UI", 1, 24));
		binglirenwu1.setForeground(new java.awt.Color(255, 255, 255));
		jPanel7.add(binglirenwu1);
		binglirenwu1.setBounds(240, 880, 90, 30);

		binglirenwu3.setBackground(new java.awt.Color(255, 255, 255));
		binglirenwu3.setFont(new java.awt.Font("Microsoft YaHei UI", 1, 24));
		binglirenwu3.setForeground(new java.awt.Color(255, 255, 255));
		jPanel7.add(binglirenwu3);
		binglirenwu3.setBounds(1560, 870, 90, 30);

		jLabel17.setIcon(new javax.swing.ImageIcon(getClass().getResource(
				"/images/1.jpg"))); // NOI18N
		jPanel7.add(jLabel17);
		jLabel17.setBounds(1690, 470, 100, 90);

		jLabel2.setBackground(new java.awt.Color(254, 254, 254));
		jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource(
				"/images/曹操1502.png"))); // NOI18N
		jPanel7.add(jLabel2);
		jLabel2.setBounds(1720, 0, 150, 160);

		jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource(
				"/images/董卓1501.png"))); // NOI18N
		jPanel7.add(jLabel3);
		jLabel3.setBounds(1720, 750, 150, 150);

		jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource(
				"/images/刘备 (2)1501.png"))); // NOI18N
		jPanel7.add(jLabel4);
		jLabel4.setBounds(0, 720, 170, 190);

		jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource(
				"/images/孙权1501.png"))); // NOI18N
		jPanel7.add(jLabel5);
		jLabel5.setBounds(0, 0, 180, 170);
		jPanel7.add(lingdi2);
		lingdi2.setBounds(1500, 510, 104, 91);
		jPanel7.add(lingdi3);
		lingdi3.setBounds(1510, 660, 104, 91);
		jPanel7.add(lingdi4);
		lingdi4.setBounds(1320, 630, 104, 91);

		jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource(
				"/images/list.returnButton.png"))); // NOI18N
		jButton1.setContentAreaFilled(false);
		jButton1.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				jButton1ActionPerformed(evt);
			}
		});
		jPanel7.add(jButton1);
		jButton1.setBounds(470, 860, 180, 70);
		jPanel7.add(lingdi5);
		lingdi5.setBounds(970, 640, 104, 91);
		jPanel7.add(lingdi7);
		lingdi7.setBounds(700, 840, 104, 91);
		jPanel7.add(lingdi8);
		lingdi8.setBounds(740, 650, 104, 91);
		jPanel7.add(lingdi9);
		lingdi9.setBounds(990, 460, 104, 91);
		jPanel7.add(lingdi11);
		lingdi11.setBounds(1080, 340, 104, 91);
		jPanel7.add(lingdi12);
		lingdi12.setBounds(780, 280, 104, 91);
		jPanel7.add(lingdi13);
		lingdi13.setBounds(580, 280, 104, 91);
		jPanel7.add(lingdi15);
		lingdi15.setBounds(520, 640, 104, 91);
		jPanel7.add(lingdi16);
		lingdi16.setBounds(300, 640, 104, 91);
		jPanel7.add(lingdi17);
		lingdi17.setBounds(370, 460, 104, 91);
		jPanel7.add(lingdi19);
		lingdi19.setBounds(80, 470, 104, 91);
		jPanel7.add(lingdi21);
		lingdi21.setBounds(310, 290, 104, 91);
		jPanel7.add(lingdi23);
		lingdi23.setBounds(570, 120, 104, 91);
		jPanel7.add(lingdi24);
		lingdi24.setBounds(780, 120, 104, 91);
		jPanel7.add(lingdi26);
		lingdi26.setBounds(1190, 110, 104, 91);
		jPanel7.add(lingdi27);
		lingdi27.setBounds(1510, 30, 104, 91);

		number1.setFont(new java.awt.Font("Microsoft YaHei UI", 1, 65));
		number1.setForeground(new java.awt.Color(51, 255, 0));
		number1.setText("1");
		number1.setBorder(javax.swing.BorderFactory.createMatteBorder(2, 2, 2,
				2, new java.awt.Color(255, 255, 255)));
		jPanel7.add(number1);
		number1.setBounds(170, 760, 44, 80);

		number4.setFont(new java.awt.Font("Microsoft YaHei UI", 1, 65));
		number4.setForeground(new java.awt.Color(255, 255, 51));
		number4.setText("4");
		number4.setBorder(javax.swing.BorderFactory.createMatteBorder(3, 3, 3,
				3, new java.awt.Color(255, 255, 255)));
		jPanel7.add(number4);
		number4.setBounds(180, 90, 50, 80);

		number3.setFont(new java.awt.Font("Microsoft YaHei UI", 1, 65));
		number3.setForeground(new java.awt.Color(102, 102, 255));
		number3.setText("3");
		number3.setBorder(javax.swing.BorderFactory.createMatteBorder(3, 3, 3,
				3, new java.awt.Color(255, 255, 255)));
		jPanel7.add(number3);
		number3.setBounds(1670, 750, 50, 80);

		number2.setFont(new java.awt.Font("Microsoft YaHei UI", 1, 65));
		number2.setForeground(new java.awt.Color(255, 153, 51));
		number2.setText("2");
		number2.setBorder(javax.swing.BorderFactory.createMatteBorder(3, 3, 3,
				3, new java.awt.Color(255, 255, 255)));
		jPanel7.add(number2);
		number2.setBounds(1670, 80, 50, 80);

		bingli1.setIcon(new javax.swing.ImageIcon(getClass().getResource(
				"/map/soldiers 501.png"))); // NOI18N
		jPanel7.add(bingli1);
		bingli1.setBounds(180, 0, 50, 60);

		bingli2.setIcon(new javax.swing.ImageIcon(getClass().getResource(
				"/map/soldiers 501.png"))); // NOI18N
		jPanel7.add(bingli2);
		bingli2.setBounds(180, 850, 50, 60);

		bingli3.setIcon(new javax.swing.ImageIcon(getClass().getResource(
				"/map/soldiers 501.png"))); // NOI18N
		jPanel7.add(bingli3);
		bingli3.setBounds(1670, 0, 50, 60);

		bingli4.setIcon(new javax.swing.ImageIcon(getClass().getResource(
				"/map/soldiers 501.png"))); // NOI18N
		jPanel7.add(bingli4);
		bingli4.setBounds(1660, 840, 50, 60);

		jButton4.setIcon(new javax.swing.ImageIcon(getClass().getResource(
				"/images/main.returnButton.png"))); // NOI18N
		jButton4.setBorder(null);
		jButton4.setContentAreaFilled(false);
		jButton4.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				jButton4ActionPerformed(evt);
			}
		});
		jPanel7.add(jButton4);
		jButton4.setBounds(1270, 10, 190, 71);

		jLabel1.setBackground(new java.awt.Color(102, 102, 255));
		jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource(
				"/map/地图2.png"))); // NOI18N
		jPanel7.add(jLabel1);
		jLabel1.setBounds(0, -20, 1873, 1010);

		javax.swing.GroupLayout layout = new javax.swing.GroupLayout(
				getContentPane());
		getContentPane().setLayout(layout);
		layout.setHorizontalGroup(layout.createParallelGroup(
				javax.swing.GroupLayout.Alignment.LEADING).addComponent(
				jPanel7, javax.swing.GroupLayout.Alignment.TRAILING,
				javax.swing.GroupLayout.DEFAULT_SIZE, 1872, Short.MAX_VALUE));
		layout.setVerticalGroup(layout.createParallelGroup(
				javax.swing.GroupLayout.Alignment.LEADING).addComponent(
				jPanel7, javax.swing.GroupLayout.PREFERRED_SIZE, 971,
				javax.swing.GroupLayout.PREFERRED_SIZE));

		pack();
	}// </editor-fold>
	//GEN-END:initComponents

	private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {
		new mainFrame().setVisible(true);
		setVisible(false);
	}

	private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {
		// TODO add your handling code here:
		new ServerList().setVisible(true);
	}

	private void formWindowClosing(java.awt.event.WindowEvent evt) {
		Sql sql = new Sql();
		try {
			sql.setRole(0, Players.username);
			sql.setonline(0, Players.username);
			sql.setstart(0);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	private void formWindowClosed(java.awt.event.WindowEvent evt) {
		// TODO add your handling code here:

	}

	private void jButton30ActionPerformed(java.awt.event.ActionEvent evt) {
		// TODO add your handling code here:
		try {
			jButton30.setEnabled(false);
			int dice = GameFunction.dice();
			Sql.setOver(0);// 正在行走中
			// 将玩家序号和骰子点数上传到数据库
			// 将原本的position上传到round
			try {
				Sql sqla = new Sql();
				int position = 0;
				String sql5 = "SELECT position FROM player where orders = "
						+ sqla.getPlayerOrders();
				sta = conn.createStatement();
				ResultSet rs = rs = sta.executeQuery(sql5);
				if (rs.next()) {
					position = rs.getInt("position");// 得到玩家位置
				}
				Sql.setPosition(position);
				// 将最后的坐标上传到player的position
				int finposition = position + dice;
				String sql = "update player set position= " + finposition
						+ " where orders=" + sqla.getPlayerOrders();
				PreparedStatement ptmt = conn.prepareStatement(sql);
				ptmt.execute();
			} catch (SQLException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}
			Sql sqla = new Sql();
			Sql.setDice(dice);
			Sql.setOrders(sqla.getPlayerOrders());
			oldorders = sqla.getServerOrders();
			gameround();
			/*int change = new mapFrame().change;
			switch (change) {
			case 1:
				int result = new Sql().getOut2();
				if (result == 1) {
					System.out.println("吕布胜利");
				} else if (result == 2) {
					System.out.println("三英胜利");
				}
				break;
			case 2:
				int result1 = new Sql().getOut1(orders);
				if (result1 == 2) {
					System.out.println("你赢了");
				} else {
					System.out.println("无人胜利");
				}
				break;
			case 3:
				int result2 = new Sql().getout3();
				if (result2 == 1) {
					System.out.println("赵云胜利");
				} else if (result2 == 2) {
					System.out.println("赵云失败");
				}
				break;
			case 4:
				int result3 = new Sql().getOut4();
				if (result3 == 1) {
					System.out.println("胜利");
				} else if (result3 == 2) {
					System.out.println("失败");
				}
				break;
			}*/
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

	public void gameround() throws SQLException {
		Sql sql = new Sql();
		playerNumber = sql.getPlayerNumber();//玩家总人数
		int serverOrders = sql.getServerOrders();
		if (serverOrders == 0) {
			serverOrders = sql.getPlayerNumber();
		}
		PaintThread1 a1 = new PaintThread1(sql.getDice());// 骰子动图
		PaintThread a = new PaintThread(sql.getDice(), serverOrders, sql
				.getPosition());// 传入骰子的数，移动id，起始位置
		Thread b1 = new Thread(a1);
		Thread b = new Thread(a);
		b.start();
		b1.start();
	}

	class PaintThread1 implements Runnable {
		// 多线程
		int dice;
		int j = 2;

		public PaintThread1(int dice) {
			this.dice = dice;
			;
		}

		@Override
		public void run() {
			// TODO Auto-generated method stub
			while (j != 101) {
				jLabel17.setIcon(new javax.swing.ImageIcon(getClass()
						.getResource("/images/" + j + ".jpg")));
				try {
					Thread.sleep(10);
					if (j > 13) {
						switch (dice) {
						case 1:
							jLabel17.setIcon(new javax.swing.ImageIcon(
									getClass().getResource("/images/15.jpg")));
							j = 100;
							break;
						case 2:
							jLabel17.setIcon(new javax.swing.ImageIcon(
									getClass().getResource("/images/16.jpg")));
							j = 100;
							break;
						case 3:
							jLabel17.setIcon(new javax.swing.ImageIcon(
									getClass().getResource("/images/17.jpg")));
							j = 100;
							break;
						case 4:
							jLabel17.setIcon(new javax.swing.ImageIcon(
									getClass().getResource("/images/18.jpg")));
							j = 100;
							break;
						case 5:
							jLabel17.setIcon(new javax.swing.ImageIcon(
									getClass().getResource("/images/19.jpg")));
							j = 100;
							break;
						case 6:
							jLabel17.setIcon(new javax.swing.ImageIcon(
									getClass().getResource("/images/20.jpg")));
							j = 100;
							break;
						}
					}
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				j++;
			}
		}

	}

	class PaintThread implements Runnable {
		int dice, orders, position, playerPosition;
		int i = 0;
		int j = 0;

		public PaintThread(int dice, int orders, int position) {
			this.dice = dice;
			this.orders = orders;
			this.position = position;
		}

		public void run() {
			// while（true）保持能一直运行
			// 得到当前格子的坐标
			Sql sqla = new Sql();
			try {
				role = sqla.getOrdersRole(orders);
			} catch (SQLException e2) {
				// TODO Auto-generated catch block
				e2.printStackTrace();
			}
			while (i != dice) {

				try {

					// 得到当前的x，y
					String sql = "select x,y from land where position = "
							+ position;
					position = position + 1; //下一格
					if (position == 29) {
						position = position % 29 + 1;
					}
					// 得到下一格的x，y
					String sql2 = "select x,y from land where position = "
							+ position;
					ResultSet rs = sta.executeQuery(sql);
					if (rs.next()) {

						x = rs.getInt("x");
						y = rs.getInt("y");
					}
					rs = sta.executeQuery(sql2);

					if (rs.next()) {
						x2 = rs.getInt("x");
						y2 = rs.getInt("y");
					}

				} catch (Exception e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}//
				while (true) {
					try {
						switch (role) {
						case 1:
							renwu1.setBounds(x - 15, y - 110, 150, 180);// -40,-100使其放在按钮中间
							break;
						case 2:
							renwu2.setBounds(x - 30, y - 110, 150, 180);// -40,-100使其放在按钮中间
							break;
						case 3:
							renwu3.setBounds(x - 30, y - 110, 150, 180);// -40,-100使其放在按钮中间
							break;
						case 4:
							renwu4.setBounds(x - 30, y - 110, 150, 180);// -40,-100使其放在按钮中间
							break;
						}
					} catch (Exception e1) {
						// TODO Auto-generated catch block
						e1.printStackTrace();
					}

					try {
						// 物体运行太快，肉眼无法追踪，这是减慢速度，使得肉眼能跟上刷新速度
						Thread.sleep(7);
						if (x == x2) {
							if (y - y2 > 0) {
								y--;
								if (role == 1) {
									renwu1
											.setIcon(new javax.swing.ImageIcon(
													getClass()
															.getResource(
																	"/roleimg/figure1.behind.png"))); // NOI18N
								}
								if (role == 2) {
									renwu2
											.setIcon(new javax.swing.ImageIcon(
													getClass()
															.getResource(
																	"/roleimg/figure2.behind.png"))); // NOI18N
								}
								if (role == 3) {
									renwu3
											.setIcon(new javax.swing.ImageIcon(
													getClass()
															.getResource(
																	"/roleimg/figure3.behind.png"))); // NOI18N
								}
								if (role == 4) {
									renwu4
											.setIcon(new javax.swing.ImageIcon(
													getClass()
															.getResource(
																	"/roleimg/figure4.behind.png"))); // NOI18N
								}
							}
							if (y - y2 < 0) {
								y++;
								if (role == 1) {
									renwu1
											.setIcon(new javax.swing.ImageIcon(
													getClass()
															.getResource(
																	"/roleimg/figure1.front.png"))); // NOI18N
								}
								if (role == 2) {
									renwu2
											.setIcon(new javax.swing.ImageIcon(
													getClass()
															.getResource(
																	"/roleimg/figure2.front.png"))); // NOI18N
								}
								if (role == 3) {
									renwu3
											.setIcon(new javax.swing.ImageIcon(
													getClass()
															.getResource(
																	"/roleimg/figure3.front.png"))); // NOI18N
								}
								if (role == 4) {
									renwu4
											.setIcon(new javax.swing.ImageIcon(
													getClass()
															.getResource(
																	"/roleimg/figure4.front.png"))); // NOI18N
								}
							}
						} else if (y == y2) {
							if (x - x2 > 0) {
								x--;
								if (role == 1) {
									renwu1
											.setIcon(new javax.swing.ImageIcon(
													getClass()
															.getResource(
																	"/roleimg/figure1.left.png"))); // NOI18N
								}
								if (role == 2) {
									renwu2
											.setIcon(new javax.swing.ImageIcon(
													getClass()
															.getResource(
																	"/roleimg/figure2.left.png"))); // NOI18N
								}
								if (role == 3) {
									renwu3
											.setIcon(new javax.swing.ImageIcon(
													getClass()
															.getResource(
																	"/roleimg/figure3.left.png"))); // NOI18N
								}
								if (role == 4) {
									renwu4
											.setIcon(new javax.swing.ImageIcon(
													getClass()
															.getResource(
																	"/roleimg/figure4.left.png"))); // NOI18N
								}
							}
							if (x - x2 < 0) {
								x++;
								if (role == 1) {
									renwu1
											.setIcon(new javax.swing.ImageIcon(
													getClass()
															.getResource(
																	"/roleimg/figure1.right.png"))); // NOI18N
								}
								if (role == 2) {
									renwu2
											.setIcon(new javax.swing.ImageIcon(
													getClass()
															.getResource(
																	"/roleimg/figure2.right.png"))); // NOI18N
								}
								if (role == 3) {
									renwu3
											.setIcon(new javax.swing.ImageIcon(
													getClass()
															.getResource(
																	"/roleimg/figure3.right.png"))); // NOI18N
								}
								if (role == 4) {
									renwu4
											.setIcon(new javax.swing.ImageIcon(
													getClass()
															.getResource(
																	"/roleimg/figure4.right.png"))); // NOI18N
								}
							}
						} else if (y != y2 && x != x2) {
							if (y - y2 > 0) {
								y--;
							}
							if (y - y2 < 0) {
								y++;
							}
							if (x - x2 > 0) {
								x--;
								if (role == 1) {
									renwu1
											.setIcon(new javax.swing.ImageIcon(
													getClass()
															.getResource(
																	"/roleimg/figure1.left.png"))); // NOI18N
								}
								if (role == 2) {
									renwu2
											.setIcon(new javax.swing.ImageIcon(
													getClass()
															.getResource(
																	"/roleimg/figure2.left.png"))); // NOI18N
								}
								if (role == 3) {
									renwu3
											.setIcon(new javax.swing.ImageIcon(
													getClass()
															.getResource(
																	"/roleimg/figure3.left.png"))); // NOI18N
								}
								if (role == 4) {
									renwu4
											.setIcon(new javax.swing.ImageIcon(
													getClass()
															.getResource(
																	"/roleimg/figure4.left.png"))); // NOI18N
								}
							}
							if (x - x2 < 0) {
								x++;
								if (role == 1) {
									renwu1
											.setIcon(new javax.swing.ImageIcon(
													getClass()
															.getResource(
																	"/roleimg/figure1.right.png"))); // NOI18N
								}
								if (role == 2) {
									renwu2
											.setIcon(new javax.swing.ImageIcon(
													getClass()
															.getResource(
																	"/roleimg/figure2.right.png"))); // NOI18N
								}
								if (role == 3) {
									renwu3
											.setIcon(new javax.swing.ImageIcon(
													getClass()
															.getResource(
																	"/roleimg/figure3.right.png"))); // NOI18N
								}
								if (role == 4) {
									renwu4
											.setIcon(new javax.swing.ImageIcon(
													getClass()
															.getResource(
																	"/roleimg/figure4.right.png"))); // NOI18N
								}
							}
						}
						if (x == x2 && y == y2) {
							i++;
							String sql4 = "update player set position = "
									+ position + " where orders = " + orders;
							sta.executeUpdate(sql4);
							break;
						}
					} catch (Exception e) {
						e.printStackTrace();
					}
				}
			}
			// 移动结束

			try {
				if (orders == sqla.getPlayerOrders()) {
					if (position == 6 || position == 10 || position == 14
							|| position == 18 || position == 20
							|| position == 22 || position == 25
							|| position == 28) {
						Random r = new Random();
						int R = r.nextInt(4) + 1;
						switch (R) {

						case 1:
							new GameFunction().cookWine(orders);//增加自身兵力
							break;

						case 2:
							new GameFunction().threeVisitsToTheHut(orders);//增加自己兵力
							JOptionPane.showMessageDialog(null, "增加兵力", "结果",
									JOptionPane.PLAIN_MESSAGE);
							break;
						case 3:
							new GameFunction().floodingServer(role);//自己停留一回合
							JOptionPane.showMessageDialog(null, "停留一回合", "结果",
									JOptionPane.PLAIN_MESSAGE);
							break;
						}
					}
				}
			} catch (Exception e) {
				e.printStackTrace();
			}
			
			try {
				if (orders == sqla.getPlayerOrders()){
				if (mapnumber == 1 && position == 14) {
					GameFunction.prisonServer(role);
					JOptionPane.showMessageDialog(null, "到达虎牢关，停留两回合", "结果",
							JOptionPane.PLAIN_MESSAGE);
				} else if (mapnumber == 2 && position == 22) {
					GameFunction.prisonServer(role);
					JOptionPane.showMessageDialog(null, "到达虎牢关，停留两回", "结果",
							JOptionPane.PLAIN_MESSAGE);
				} else if (mapnumber == 3 && position == 10) {
					GameFunction.prisonServer(role);
					JOptionPane.showMessageDialog(null, "到达虎牢关，停留两回", "结果",
							JOptionPane.PLAIN_MESSAGE);
				} else if (mapnumber == 4 && position == 14) {
					GameFunction.prisonServer(role);
					JOptionPane.showMessageDialog(null, "到达虎牢关，停留两回", "结果",
							JOptionPane.PLAIN_MESSAGE);
				}
				}
			} catch (HeadlessException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			} catch (SQLException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}
			try {
				GameFunction gf = new GameFunction();
				String sqlposition = "select position from player where orders = " + orders;
				System.out.println("我是position"+position);
				sta = conn.createStatement();
				ResultSet rs = sta.executeQuery(sqlposition);
				if (rs.next()) {
					position = rs.getInt("position");// 得到玩家位置
				}
				if (gf.landSearchServer(position)) {
					int owner = 0;
					int level = 0;
					int money = 0;

					/**
					 * 买房子，罚钱，升级房子
					 */
					System.out.println("有房子");
					String sql = "select owner,level from land where position = "
							+ position;
					String sql1 = "select money from player where orders = "
							+ orders;
					sta = conn.createStatement();
					rs = sta.executeQuery(sql1);
					// rs = sta.executeQuery(sql1);

					if (rs.next()) {
						money = rs.getInt("money");
					}
					rs = sta.executeQuery(sql);
					if (rs.next()) {
						owner = rs.getInt("owner");// 得到所属者
						level = rs.getInt("level");// 得到等级

					}
					if (owner == 0) {
						/**
						 * 买房子
						 */
						if (orders == sqla.getPlayerOrders()) {
							int res = JOptionPane
									.showConfirmDialog(null, "是否占领领地", "占领确认",
											JOptionPane.YES_NO_OPTION);
							if (res == JOptionPane.YES_OPTION && money > 1000) {
								gf.landBuyServer(orders);
								JOptionPane.showMessageDialog(null, "购买成功",
										"结果", JOptionPane.PLAIN_MESSAGE);

							} else {
								// 点击“否”后执行这个代码块
								JOptionPane.showMessageDialog(null, "购买失败",
										"结果", JOptionPane.PLAIN_MESSAGE);
							}
						}
					}
					if (owner == orders) {
						/**
						 * 升级
						 */
						if (orders == sqla.getPlayerOrders()) {

							int res = JOptionPane
									.showConfirmDialog(null, "是否升级领地", "升级领地",
											JOptionPane.YES_NO_OPTION);
							if (res == JOptionPane.YES_OPTION && money > 1000) {
								gf.landUpServer(money, orders, level,
										position);
//								if (level + 1 == 2) {
//									switch (position) {
//									case 2:
//										lingdi2
//												.setIcon(new javax.swing.ImageIcon(
//														getClass().getResource(
//																"/map/2级.png")));
//										break;
//									case 3:
//										lingdi3
//												.setIcon(new javax.swing.ImageIcon(
//														getClass().getResource(
//																"/map/2级.png")));
//										break;
//									case 4:
//										lingdi4
//												.setIcon(new javax.swing.ImageIcon(
//														getClass().getResource(
//																"/map/2级.png")));
//										break;
//									case 5:
//										lingdi5
//												.setIcon(new javax.swing.ImageIcon(
//														getClass().getResource(
//																"/map/2级.png")));
//										break;
//									case 7:
//										lingdi7
//												.setIcon(new javax.swing.ImageIcon(
//														getClass().getResource(
//																"/map/2级.png")));
//										break;
//									case 8:
//										lingdi8
//												.setIcon(new javax.swing.ImageIcon(
//														getClass().getResource(
//																"/map/2级.png")));
//										break;
//									case 9:
//										lingdi9
//												.setIcon(new javax.swing.ImageIcon(
//														getClass().getResource(
//																"/map/2级.png")));
//										break;
//									case 11:
//										lingdi11
//												.setIcon(new javax.swing.ImageIcon(
//														getClass().getResource(
//																"/map/2级.png")));
//										break;
//									case 12:
//										lingdi12
//												.setIcon(new javax.swing.ImageIcon(
//														getClass().getResource(
//																"/map/2级.png")));
//										break;
//									case 13:
//										lingdi13
//												.setIcon(new javax.swing.ImageIcon(
//														getClass().getResource(
//																"/map/2级.png")));
//										break;
//									case 15:
//										lingdi15
//												.setIcon(new javax.swing.ImageIcon(
//														getClass().getResource(
//																"/map/2级.png")));
//										break;
//									case 16:
//										lingdi16
//												.setIcon(new javax.swing.ImageIcon(
//														getClass().getResource(
//																"/map/2级.png")));
//										break;
//									case 17:
//										lingdi17
//												.setIcon(new javax.swing.ImageIcon(
//														getClass().getResource(
//																"/map/2级.png")));
//										break;
//									case 19:
//										lingdi19
//												.setIcon(new javax.swing.ImageIcon(
//														getClass().getResource(
//																"/map/2级.png")));
//										break;
//									case 21:
//										lingdi21
//												.setIcon(new javax.swing.ImageIcon(
//														getClass().getResource(
//																"/map/2级.png")));
//										break;
//									case 23:
//										lingdi23
//												.setIcon(new javax.swing.ImageIcon(
//														getClass().getResource(
//																"/map/2级.png")));
//										break;
//									case 24:
//										lingdi24
//												.setIcon(new javax.swing.ImageIcon(
//														getClass().getResource(
//																"/map/2级.png")));
//										break;
//									case 26:
//										lingdi26
//												.setIcon(new javax.swing.ImageIcon(
//														getClass().getResource(
//																"/map/2级.png")));
//										break;
//									case 27:
//										lingdi27
//												.setIcon(new javax.swing.ImageIcon(
//														getClass().getResource(
//																"/map/2级.png")));
//										break;
//
//									}
//								}
//								if (level + 1 == 3) {
//									switch (position) {
//									case 2:
//										lingdi2
//												.setIcon(new javax.swing.ImageIcon(
//														getClass().getResource(
//																"/map/3级.png")));
//										break;
//									case 3:
//										lingdi3
//												.setIcon(new javax.swing.ImageIcon(
//														getClass().getResource(
//																"/map/3级.png")));
//										break;
//									case 4:
//										lingdi4
//												.setIcon(new javax.swing.ImageIcon(
//														getClass().getResource(
//																"/map/3级.png")));
//										break;
//									case 5:
//										lingdi5
//												.setIcon(new javax.swing.ImageIcon(
//														getClass().getResource(
//																"/map/3级.png")));
//										break;
//									case 7:
//										lingdi7
//												.setIcon(new javax.swing.ImageIcon(
//														getClass().getResource(
//																"/map/3级.png")));
//										break;
//									case 8:
//										lingdi8
//												.setIcon(new javax.swing.ImageIcon(
//														getClass().getResource(
//																"/map/3级.png")));
//										break;
//									case 9:
//										lingdi9
//												.setIcon(new javax.swing.ImageIcon(
//														getClass().getResource(
//																"/map/3级.png")));
//										break;
//									case 11:
//										lingdi11
//												.setIcon(new javax.swing.ImageIcon(
//														getClass().getResource(
//																"/map/3级.png")));
//										break;
//									case 12:
//										lingdi12
//												.setIcon(new javax.swing.ImageIcon(
//														getClass().getResource(
//																"/map/3级.png")));
//										break;
//									case 13:
//										lingdi13
//												.setIcon(new javax.swing.ImageIcon(
//														getClass().getResource(
//																"/map/3级.png")));
//										break;
//									case 15:
//										lingdi15
//												.setIcon(new javax.swing.ImageIcon(
//														getClass().getResource(
//																"/map/3级.png")));
//										break;
//									case 16:
//										lingdi16
//												.setIcon(new javax.swing.ImageIcon(
//														getClass().getResource(
//																"/map/3级.png")));
//										break;
//									case 17:
//										lingdi17
//												.setIcon(new javax.swing.ImageIcon(
//														getClass().getResource(
//																"/map/3级.png")));
//										break;
//									case 19:
//										lingdi19
//												.setIcon(new javax.swing.ImageIcon(
//														getClass().getResource(
//																"/map/3级.png")));
//										break;
//									case 21:
//										lingdi21
//												.setIcon(new javax.swing.ImageIcon(
//														getClass().getResource(
//																"/map/3级.png")));
//										break;
//									case 23:
//										lingdi23
//												.setIcon(new javax.swing.ImageIcon(
//														getClass().getResource(
//																"/map/3级.png")));
//										break;
//									case 24:
//										lingdi24
//												.setIcon(new javax.swing.ImageIcon(
//														getClass().getResource(
//																"/map/3级.png")));
//										break;
//									case 26:
//										lingdi26
//												.setIcon(new javax.swing.ImageIcon(
//														getClass().getResource(
//																"/map/3级.png")));
//										break;
//									case 27:
//										lingdi27
//												.setIcon(new javax.swing.ImageIcon(
//														getClass().getResource(
//																"/map/3级.png")));
//										break;
//
//									}
//								}
								JOptionPane.showMessageDialog(null, "升级成功",
										"结果", JOptionPane.PLAIN_MESSAGE);
								// 点击“是”后执行这个代码块
							} else {
								// 点击“否”后执行这个代码块
								JOptionPane.showMessageDialog(null, "升级失败",
										"结果", JOptionPane.PLAIN_MESSAGE);
							}
						}
					}
					if (owner != 0 && owner != orders) {
						/**
						 * 罚钱
						 */

						if (orders == sqla.getPlayerOrders()) {
							String ownerid = null;
							String sqlownerid = "select username from player where orders = "
									+ owner;
							rs = sta.executeQuery(sqlownerid);
							if (rs.next()) {
								ownerid = rs.getString("username");
							}
							if (level == 1) {
								JOptionPane.showMessageDialog(null, "角色" + Sql.getUsername(orders)
										+ "被角色" + ownerid + "奴役" + 1000 + "兵力",
										"奴役兵力", JOptionPane.PLAIN_MESSAGE);
							}
							if (level == 2) {
								JOptionPane.showMessageDialog(null, "角色" + Sql.getUsername(orders)
										+ "被角色" + ownerid + "奴役" + 2000 + "兵力",
										"奴役兵力", JOptionPane.PLAIN_MESSAGE);
							}
							if (level == 3) {
								JOptionPane.showMessageDialog(null, "角色" + Sql.getUsername(orders)
										+ "被角色" + ownerid + "奴役" + 3000 + "兵力",
										"奴役兵力", JOptionPane.PLAIN_MESSAGE);
							}

							GameFunction.landFine(orders, position);
						}
					}

				}

				if (!GameFunction.landSearch(1)) {
					System.out.println("无房子");
				}

				// 检测房子结束

				if (sqla.getServerOrders() == sqla.getPlayerNumber()) {
					Sql.setOrders(0);
				}
				//上传over，告诉服务器已经操作完毕，让其他玩家刷新
				Sql.setOver(1);
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			// 检测房子结束

		}
	}

	public void checkorders() {
		CheckOrders co = new CheckOrders();
		Thread co2 = new Thread(co);
		co2.start();
		//		Refresh rf = new Refresh();
		//		Thread rf2 = new Thread(rf);
		//		rf2.start();
	}

	//	class Refresh implements Runnable {
	//
	//		@Override
	//		public void run() {
	//			Sql sql = new Sql();
	//			// TODO Auto-generated method stub
	//			while (true) {
	//
	//				try {
	//					Thread.sleep(1000);
	//					if (sql.getOver() == 1) {
	//						refreshimg();
	//					}
	//				} catch (Exception e) {
	//					// TODO Auto-generated catch block
	//					e.printStackTrace();
	//				}
	//
	//			}
	//
	//		}
	//
	//	}

	class CheckOrders implements Runnable {

		@Override
		public void run() {
			while (true) {
				try {

					Sql sql = new Sql();
					// TODO Auto-generated method stub

					Thread.sleep(1500);
					refreshimg();
					// 移动其他角色
					// 条件是出牌顺序改变，并且上一轮玩家行走完毕
					if (sql.getOver() == 1) {
						refreshimg();
					}
					if (sql.getServerOrders() != oldorders
							&& sql.getServerOrders() != 0) {
						sql.setOver(0);
						gameround();
						oldorders = sql.getServerOrders();
						jButton30.setEnabled(false);
					}
					// 移动本机角色
					if(sql.getServerOrders() + 1 != sql.getPlayerOrders()){
						//新加的
						jButton30.setEnabled(false);
					}
					if (sql.getServerOrders() + 1 == sql.getPlayerOrders()
							&& sql.getOver() == 1) {
						int playorders = sql.getPlayerOrders();
						if (sql.getStop(playorders) != 0) {
							int stop = sql.getStop(playorders);
							stop--;
							sql.setStop(stop, playorders);
							sql.setOrders(playorders);
							sql.setDice(0);
						}
						//已破产的玩家不得再移动
						else if (sql.getServerOrders() + 1 == sql
								.getPlayerOrders()
								&& sql.getOver() == 1
								&& sql.getMoney(sql.getPlayerOrders()) <= 0) {
							sql.setOrders(playorders);
							sql.setDice(0);
							JOptionPane.showMessageDialog(null, "你输了", "结果",
									JOptionPane.PLAIN_MESSAGE);
						}else{
							jButton30.setEnabled(true);
						}

					}
					if (sql.getServerOrders() == sql.getPlayerOrders()) {
						oldorders = sql.getServerOrders();
					}

					// 移动当前服务器记录的电脑角色，over变成1后只执行一次

					// 如果有人将over设置为0，可以点按钮了，就将moveonce重置，从而可以再运行
					// 一次上面这条else语句

				} catch (Exception e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		}
	}

	public static void connection() {

		try {
			Class.forName("com.mysql.jdbc.Driver");
			conn = DriverManager.getConnection(
					"jdbc:mysql://58.87.109.119:3306/monopoly", "root",
					"123456");
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	public void mapChange(int mapnumber) {
		/**
		 * 使用换地图的方法
		 */
		Mapchange a = new Mapchange(mapnumber);
		Thread b = new Thread(a);
		b.start();
	}

	class Mapchange implements Runnable {
		/**
		 * 换地图的多线程
		 */
		int mapnumber;

		public Mapchange(int mapnumber) {
			this.mapnumber = mapnumber;
		}

		@Override
		public void run() {
			switch (mapnumber) {
			case 1:
				try {
					// TODO Auto-generated method stub
					String sql1 = "delete from land where 1=1";
					String sql2 = "insert into land select * from land1";
					PreparedStatement ptmt = conn.prepareStatement(sql1);
					ptmt.execute();
					ptmt = conn.prepareStatement(sql2);
					ptmt.execute();
					renwu1.setBounds(1210 - 30, 540 - 110, 150, 180);
					renwu2.setBounds(1210 - 30, 540 - 110, 150, 180);
					renwu3.setBounds(1210 - 30, 540 - 110, 150, 180);
					renwu4.setBounds(1210 - 30, 540 - 110, 150, 180);
					jLabel1.setIcon(new javax.swing.ImageIcon(getClass()
							.getResource("/map/领地3.2.png")));
					sta = conn.createStatement();
//					
					lingdi2.setBounds(1510, 500, 104, 91);
					lingdi3.setBounds(1510, 630, 104, 91);
					lingdi4.setBounds(1300, 640, 104, 91);
					lingdi5.setBounds(1090, 640, 104, 91);
					lingdi7.setBounds(880, 770, 104, 91);
					lingdi8.setBounds(880, 640, 104, 91);
					lingdi9.setBounds(1080, 500, 104, 91);
					lingdi11.setBounds(1080, 360, 104, 91);
					lingdi12.setBounds(880, 360, 104, 91);
					lingdi13.setBounds(670, 360, 104, 91);
					lingdi15.setBounds(670, 650, 104, 91);
					lingdi16.setBounds(470, 650, 104, 91);
					lingdi17.setBounds(470, 500, 104, 91);
					lingdi19.setBounds(260, 500, 104, 91);
					lingdi21.setBounds(470, 360, 104, 91);
					lingdi23.setBounds(670, 220, 104, 91);
					lingdi24.setBounds(880, 220, 104, 91);
					lingdi26.setBounds(1300, 220, 104, 91);
					lingdi27.setBounds(1510, 80, 104, 91);

				} catch (SQLException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				break;
			case 2:
				try {
					// TODO Auto-generated method stub
					String sql1 = "delete from land where 1=1";
					String sql2 = "insert into land select * from land2";
					PreparedStatement ptmt = conn.prepareStatement(sql1);
					ptmt.execute();
					ptmt = conn.prepareStatement(sql2);
					ptmt.execute();
					jLabel1.setIcon(new javax.swing.ImageIcon(getClass()
							.getResource("/map/地图2.png")));
					sta = conn.createStatement();
					renwu1.setBounds(1220 - 30, 610 - 110, 150, 180);
					renwu2.setBounds(1220 - 30, 610 - 110, 150, 180);
					renwu3.setBounds(1220 - 30, 610 - 110, 150, 180);
					renwu4.setBounds(1220 - 30, 610 - 110, 150, 180);

					lingdi3.setBounds(1050, 640, 104, 91);
					lingdi5.setBounds(740, 650, 104, 91);
					lingdi7.setBounds(260, 540, 104, 91);
					lingdi9.setBounds(350, 480, 104, 91);
					lingdi11.setBounds(210, 270, 104, 91);
					lingdi12.setBounds(360, 160, 104, 91);
					lingdi17.setBounds(740, 440, 104, 91);
					lingdi23.setBounds(1070, 430, 104, 91);
					lingdi26.setBounds(1440, 260, 104, 91);
				} catch (SQLException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				break;
			case 3:
				try {
					// TODO Auto-generated method stub
					String sql1 = "delete from land where 1=1";
					String sql2 = "insert into land select * from land3";
					PreparedStatement ptmt = conn.prepareStatement(sql1);
					ptmt.execute();
					ptmt = conn.prepareStatement(sql2);
					ptmt.execute();
					renwu1.setBounds(1370 - 30, 510 - 110, 150, 180);
					renwu2.setBounds(1370 - 30, 510 - 110, 150, 180);
					renwu3.setBounds(1370 - 30, 510 - 110, 150, 180);
					renwu4.setBounds(1370 - 30, 510 - 110, 150, 180);
					jLabel1.setIcon(new javax.swing.ImageIcon(getClass()
							.getResource("/map/地图3.png")));
					sta = conn.createStatement();
					lingdi3.setBounds(1050, 640, 104, 91);
					lingdi5.setBounds(740, 650, 104, 91);
					lingdi7.setBounds(260, 540, 104, 91);
					lingdi9.setBounds(350, 480, 104, 91);
					lingdi11.setBounds(210, 270, 104, 91);
					lingdi12.setBounds(360, 160, 104, 91);
					lingdi17.setBounds(740, 440, 104, 91);
					lingdi23.setBounds(1070, 430, 104, 91);
					lingdi26.setBounds(1440, 260, 104, 91);
				} catch (SQLException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				break;
			case 4:
				try {
					// TODO Auto-generated method stub
					String sql1 = "delete from land where 1=1";
					String sql2 = "insert into land select * from land4";
					PreparedStatement ptmt = conn.prepareStatement(sql1);
					ptmt.execute();
					ptmt = conn.prepareStatement(sql2);
					ptmt.execute();
					renwu1.setBounds(270 - 30, 630 - 110, 150, 180);
					renwu2.setBounds(270 - 30, 630 - 110, 150, 180);
					renwu3.setBounds(270 - 30, 630 - 110, 150, 180);
					renwu4.setBounds(270 - 30, 630 - 110, 150, 180);
					jLabel1.setIcon(new javax.swing.ImageIcon(getClass()
							.getResource("/map/地图4.png")));
					sta = conn.createStatement();
					lingdi3.setBounds(1050, 640, 104, 91);
					lingdi5.setBounds(740, 650, 104, 91);
					lingdi7.setBounds(260, 540, 104, 91);
					lingdi9.setBounds(350, 480, 104, 91);
					lingdi11.setBounds(210, 270, 104, 91);
					lingdi12.setBounds(360, 160, 104, 91);
					lingdi17.setBounds(740, 440, 104, 91);
					lingdi23.setBounds(1070, 430, 104, 91);
					lingdi26.setBounds(1440, 260, 104, 91);
				} catch (SQLException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				break;

			}

		}

	}

	public void refreshimg() {
		/**
		 * 使用换地图的方法
		 */
		Refreshimg a = new Refreshimg();
		Thread b = new Thread(a);
		b.start();
	}

	//重绘房子
	class Refreshimg implements Runnable {
		int level = 0;
		int position = 0;

		@Override
		public void run() {
			// TODO Auto-generated method stub
			Sql sqla = new Sql();
			String sql = "select position,level from land where level not in (0)";
			//			try {
			//				if (Integer.parseInt(sqla.getRoleMoney(1)) > 0) {
			//					binglirenwu1.setText(sqla.getRoleMoney(1));
			//				} else {
			//					binglirenwu1.setText("败北");
			//				}
			//				if (Integer.parseInt(sqla.getRoleMoney(2)) > 0) {
			//					binglirenwu2.setText(sqla.getRoleMoney(2));
			//				} else {
			//					binglirenwu2.setText("败北");
			//				}
			//				if (Integer.parseInt(sqla.getRoleMoney(3)) > 0) {
			//					binglirenwu3.setText(sqla.getRoleMoney(3));
			//				} else {
			//					binglirenwu3.setText("败北");
			//				}
			//				if (Integer.parseInt(sqla.getRoleMoney(4)) > 0) {
			//					binglirenwu4.setText(sqla.getRoleMoney(4));
			//				} else {
			//					binglirenwu4.setText("败北");
			//				}
			//			} catch (Exception e) {
			//
			//			}
			try {
			if (Integer.parseInt(sqla.getRoleMoney(1)) > 0) {
				binglirenwu1.setText(sqla.getRoleMoney(1));
			} else {
				binglirenwu1.setText("败北");
			}
			if (Integer.parseInt(sqla.getRoleMoney(2)) > 0) {
				binglirenwu2.setText(sqla.getRoleMoney(2));
			} else {
				binglirenwu2.setText("败北");
			}
			if (Integer.parseInt(sqla.getRoleMoney(3)) > 0) {
				binglirenwu3.setText(sqla.getRoleMoney(3));
			} else {
				binglirenwu3.setText("败北");
			}
			if (Integer.parseInt(sqla.getRoleMoney(4)) > 0) {
				binglirenwu4.setText(sqla.getRoleMoney(4));
			} else {
				binglirenwu4.setText("败北");
			}
			}catch(Exception e){
				
			}
			
			try {
				sta = conn.createStatement();
				ResultSet rs = sta.executeQuery(sql);

				while (rs.next()) {
					position = rs.getInt("position");
					level = rs.getInt("level");

					switch (position) {
					case 2:
						lingdi2.setIcon(new javax.swing.ImageIcon(getClass()
								.getResource("/map/" + level + "级.png")));
						switch (sqla.getOrdersRole(sqla.getOwner(position))) {
						case 1:
							lingdi2.setBorder(javax.swing.BorderFactory
									.createMatteBorder(2, 2, 2, 2,
											new java.awt.Color(0, 255, 102)));
							break;
						case 2:
							lingdi2.setBorder(javax.swing.BorderFactory
									.createMatteBorder(2, 2, 2, 2,
											new java.awt.Color(255, 153, 0)));
							break;
						case 3:
							lingdi2.setBorder(javax.swing.BorderFactory
									.createMatteBorder(2, 2, 2, 2,
											new java.awt.Color(51, 102, 255)));
							break;
						case 4:
							lingdi2.setBorder(javax.swing.BorderFactory
									.createMatteBorder(2, 2, 2, 2,
											new java.awt.Color(255, 255, 0)));
							break;
						}
						break;
					case 3:
						lingdi3.setIcon(new javax.swing.ImageIcon(getClass()
								.getResource("/map/" + level + "级.png")));
						switch (sqla.getOrdersRole(sqla.getOwner(position))) {
						case 1:
							lingdi3.setBorder(javax.swing.BorderFactory
									.createMatteBorder(2, 2, 2, 2,
											new java.awt.Color(0, 255, 102)));
							break;
						case 2:
							lingdi3.setBorder(javax.swing.BorderFactory
									.createMatteBorder(2, 2, 2, 2,
											new java.awt.Color(255, 153, 0)));
							break;
						case 3:
							lingdi3.setBorder(javax.swing.BorderFactory
									.createMatteBorder(2, 2, 2, 2,
											new java.awt.Color(51, 102, 255)));
							break;
						case 4:
							lingdi3.setBorder(javax.swing.BorderFactory
									.createMatteBorder(2, 2, 2, 2,
											new java.awt.Color(255, 255, 0)));
							break;
						}
						break;
					case 4:
						lingdi4.setIcon(new javax.swing.ImageIcon(getClass()
								.getResource("/map/" + level + "级.png")));
						switch (sqla.getOrdersRole(sqla.getOwner(position))) {
						case 1:
							lingdi4.setBorder(javax.swing.BorderFactory
									.createMatteBorder(2, 2, 2, 2,
											new java.awt.Color(0, 255, 102)));
							break;
						case 2:
							lingdi4.setBorder(javax.swing.BorderFactory
									.createMatteBorder(2, 2, 2, 2,
											new java.awt.Color(255, 153, 0)));
							break;
						case 3:
							lingdi4.setBorder(javax.swing.BorderFactory
									.createMatteBorder(2, 2, 2, 2,
											new java.awt.Color(51, 102, 255)));
							break;
						case 4:
							lingdi4.setBorder(javax.swing.BorderFactory
									.createMatteBorder(2, 2, 2, 2,
											new java.awt.Color(255, 255, 0)));
							break;
						}
						break;
					case 5:
						lingdi5.setIcon(new javax.swing.ImageIcon(getClass()
								.getResource("/map/" + level + "级.png")));
						switch (sqla.getOrdersRole(sqla.getOwner(position))) {
						case 1:
							lingdi5.setBorder(javax.swing.BorderFactory
									.createMatteBorder(2, 2, 2, 2,
											new java.awt.Color(0, 255, 102)));
							break;
						case 2:
							lingdi5.setBorder(javax.swing.BorderFactory
									.createMatteBorder(2, 2, 2, 2,
											new java.awt.Color(255, 153, 0)));
							break;
						case 3:
							lingdi5.setBorder(javax.swing.BorderFactory
									.createMatteBorder(2, 2, 2, 2,
											new java.awt.Color(51, 102, 255)));
							break;
						case 4:
							lingdi5.setBorder(javax.swing.BorderFactory
									.createMatteBorder(2, 2, 2, 2,
											new java.awt.Color(255, 255, 0)));
							break;
						}
						break;
					case 7:
						lingdi7.setIcon(new javax.swing.ImageIcon(getClass()
								.getResource("/map/" + level + "级.png")));
						switch (sqla.getOrdersRole(sqla.getOwner(position))) {
						case 1:
							lingdi7.setBorder(javax.swing.BorderFactory
									.createMatteBorder(2, 2, 2, 2,
											new java.awt.Color(0, 255, 102)));
							break;
						case 2:
							lingdi7.setBorder(javax.swing.BorderFactory
									.createMatteBorder(2, 2, 2, 2,
											new java.awt.Color(255, 153, 0)));
							break;
						case 3:
							lingdi7.setBorder(javax.swing.BorderFactory
									.createMatteBorder(2, 2, 2, 2,
											new java.awt.Color(51, 102, 255)));
							break;
						case 4:
							lingdi7.setBorder(javax.swing.BorderFactory
									.createMatteBorder(2, 2, 2, 2,
											new java.awt.Color(255, 255, 0)));
							break;
						}
						break;
					case 8:
						lingdi8.setIcon(new javax.swing.ImageIcon(getClass()
								.getResource("/map/" + level + "级.png")));
						switch (sqla.getOrdersRole(sqla.getOwner(position))) {
						case 1:
							lingdi8.setBorder(javax.swing.BorderFactory
									.createMatteBorder(2, 2, 2, 2,
											new java.awt.Color(0, 255, 102)));
							break;
						case 2:
							lingdi8.setBorder(javax.swing.BorderFactory
									.createMatteBorder(2, 2, 2, 2,
											new java.awt.Color(255, 153, 0)));
							break;
						case 3:
							lingdi8.setBorder(javax.swing.BorderFactory
									.createMatteBorder(2, 2, 2, 2,
											new java.awt.Color(51, 102, 255)));
							break;
						case 4:
							lingdi8.setBorder(javax.swing.BorderFactory
									.createMatteBorder(2, 2, 2, 2,
											new java.awt.Color(255, 255, 0)));
							break;
						}
						break;
					case 9:
						lingdi9.setIcon(new javax.swing.ImageIcon(getClass()
								.getResource("/map/" + level + "级.png")));
						switch (sqla.getOrdersRole(sqla.getOwner(position))) {
						case 1:
							lingdi9.setBorder(javax.swing.BorderFactory
									.createMatteBorder(2, 2, 2, 2,
											new java.awt.Color(0, 255, 102)));
							break;
						case 2:
							lingdi9.setBorder(javax.swing.BorderFactory
									.createMatteBorder(2, 2, 2, 2,
											new java.awt.Color(255, 153, 0)));
							break;
						case 3:
							lingdi9.setBorder(javax.swing.BorderFactory
									.createMatteBorder(2, 2, 2, 2,
											new java.awt.Color(51, 102, 255)));
							break;
						case 4:
							lingdi9.setBorder(javax.swing.BorderFactory
									.createMatteBorder(2, 2, 2, 2,
											new java.awt.Color(255, 255, 0)));
							break;
						}
						break;
					case 11:
						lingdi11.setIcon(new javax.swing.ImageIcon(getClass()
								.getResource("/map/" + level + "级.png")));
						switch (sqla.getOrdersRole(sqla.getOwner(position))) {
						case 1:
							lingdi11.setBorder(javax.swing.BorderFactory
									.createMatteBorder(2, 2, 2, 2,
											new java.awt.Color(0, 255, 102)));
							break;
						case 2:
							lingdi11.setBorder(javax.swing.BorderFactory
									.createMatteBorder(2, 2, 2, 2,
											new java.awt.Color(255, 153, 0)));
							break;
						case 3:
							lingdi11.setBorder(javax.swing.BorderFactory
									.createMatteBorder(2, 2, 2, 2,
											new java.awt.Color(51, 102, 255)));
							break;
						case 4:
							lingdi11.setBorder(javax.swing.BorderFactory
									.createMatteBorder(2, 2, 2, 2,
											new java.awt.Color(255, 255, 0)));
							break;
						}
						break;
					case 12:
						lingdi12.setIcon(new javax.swing.ImageIcon(getClass()
								.getResource("/map/" + level + "级.png")));
						switch (sqla.getOrdersRole(sqla.getOwner(position))) {
						case 1:
							lingdi12.setBorder(javax.swing.BorderFactory
									.createMatteBorder(2, 2, 2, 2,
											new java.awt.Color(0, 255, 102)));
							break;
						case 2:
							lingdi12.setBorder(javax.swing.BorderFactory
									.createMatteBorder(2, 2, 2, 2,
											new java.awt.Color(255, 153, 0)));
							break;
						case 3:
							lingdi12.setBorder(javax.swing.BorderFactory
									.createMatteBorder(2, 2, 2, 2,
											new java.awt.Color(51, 102, 255)));
							break;
						case 4:
							lingdi12.setBorder(javax.swing.BorderFactory
									.createMatteBorder(2, 2, 2, 2,
											new java.awt.Color(255, 255, 0)));
							break;
						}
						break;
					case 13:
						lingdi13.setIcon(new javax.swing.ImageIcon(getClass()
								.getResource("/map/" + level + "级.png")));
						switch (sqla.getOrdersRole(sqla.getOwner(position))) {
						case 1:
							lingdi13.setBorder(javax.swing.BorderFactory
									.createMatteBorder(2, 2, 2, 2,
											new java.awt.Color(0, 255, 102)));
							break;
						case 2:
							lingdi13.setBorder(javax.swing.BorderFactory
									.createMatteBorder(2, 2, 2, 2,
											new java.awt.Color(255, 153, 0)));
							break;
						case 3:
							lingdi13.setBorder(javax.swing.BorderFactory
									.createMatteBorder(2, 2, 2, 2,
											new java.awt.Color(51, 102, 255)));
							break;
						case 4:
							lingdi13.setBorder(javax.swing.BorderFactory
									.createMatteBorder(2, 2, 2, 2,
											new java.awt.Color(255, 255, 0)));
							break;
						}
						break;
					case 15:
						lingdi15.setIcon(new javax.swing.ImageIcon(getClass()
								.getResource("/map/" + level + "级.png")));
						switch (sqla.getOrdersRole(sqla.getOwner(position))) {
						case 1:
							lingdi15.setBorder(javax.swing.BorderFactory
									.createMatteBorder(2, 2, 2, 2,
											new java.awt.Color(0, 255, 102)));
							break;
						case 2:
							lingdi15.setBorder(javax.swing.BorderFactory
									.createMatteBorder(2, 2, 2, 2,
											new java.awt.Color(255, 153, 0)));
							break;
						case 3:
							lingdi15.setBorder(javax.swing.BorderFactory
									.createMatteBorder(2, 2, 2, 2,
											new java.awt.Color(51, 102, 255)));
							break;
						case 4:
							lingdi15.setBorder(javax.swing.BorderFactory
									.createMatteBorder(2, 2, 2, 2,
											new java.awt.Color(255, 255, 0)));
							break;
						}
						break;
					case 16:
						lingdi16.setIcon(new javax.swing.ImageIcon(getClass()
								.getResource("/map/" + level + "级.png")));
						switch (sqla.getOrdersRole(sqla.getOwner(position))) {
						case 1:
							lingdi16.setBorder(javax.swing.BorderFactory
									.createMatteBorder(2, 2, 2, 2,
											new java.awt.Color(0, 255, 102)));
							break;
						case 2:
							lingdi16.setBorder(javax.swing.BorderFactory
									.createMatteBorder(2, 2, 2, 2,
											new java.awt.Color(255, 153, 0)));
							break;
						case 3:
							lingdi16.setBorder(javax.swing.BorderFactory
									.createMatteBorder(2, 2, 2, 2,
											new java.awt.Color(51, 102, 255)));
							break;
						case 4:
							lingdi16.setBorder(javax.swing.BorderFactory
									.createMatteBorder(2, 2, 2, 2,
											new java.awt.Color(255, 255, 0)));
							break;
						}
						break;
					case 17:
						lingdi17.setIcon(new javax.swing.ImageIcon(getClass()
								.getResource("/map/" + level + "级.png")));
						switch (sqla.getOrdersRole(sqla.getOwner(position))) {
						case 1:
							lingdi17.setBorder(javax.swing.BorderFactory
									.createMatteBorder(2, 2, 2, 2,
											new java.awt.Color(0, 255, 102)));
							break;
						case 2:
							lingdi17.setBorder(javax.swing.BorderFactory
									.createMatteBorder(2, 2, 2, 2,
											new java.awt.Color(255, 153, 0)));
							break;
						case 3:
							lingdi17.setBorder(javax.swing.BorderFactory
									.createMatteBorder(2, 2, 2, 2,
											new java.awt.Color(51, 102, 255)));
							break;
						case 4:
							lingdi17.setBorder(javax.swing.BorderFactory
									.createMatteBorder(2, 2, 2, 2,
											new java.awt.Color(255, 255, 0)));
							break;
						}
						break;
					case 19:
						lingdi19.setIcon(new javax.swing.ImageIcon(getClass()
								.getResource("/map/" + level + "级.png")));
						switch (sqla.getOrdersRole(sqla.getOwner(position))) {
						case 1:
							lingdi19.setBorder(javax.swing.BorderFactory
									.createMatteBorder(2, 2, 2, 2,
											new java.awt.Color(0, 255, 102)));
							break;
						case 2:
							lingdi19.setBorder(javax.swing.BorderFactory
									.createMatteBorder(2, 2, 2, 2,
											new java.awt.Color(255, 153, 0)));
							break;
						case 3:
							lingdi19.setBorder(javax.swing.BorderFactory
									.createMatteBorder(2, 2, 2, 2,
											new java.awt.Color(51, 102, 255)));
							break;
						case 4:
							lingdi19.setBorder(javax.swing.BorderFactory
									.createMatteBorder(2, 2, 2, 2,
											new java.awt.Color(255, 255, 0)));
							break;
						}
						break;
					case 21:
						lingdi21.setIcon(new javax.swing.ImageIcon(getClass()
								.getResource("/map/" + level + "级.png")));
						switch (sqla.getOrdersRole(sqla.getOwner(position))) {
						case 1:
							lingdi21.setBorder(javax.swing.BorderFactory
									.createMatteBorder(2, 2, 2, 2,
											new java.awt.Color(0, 255, 102)));
							break;
						case 2:
							lingdi21.setBorder(javax.swing.BorderFactory
									.createMatteBorder(2, 2, 2, 2,
											new java.awt.Color(255, 153, 0)));
							break;
						case 3:
							lingdi21.setBorder(javax.swing.BorderFactory
									.createMatteBorder(2, 2, 2, 2,
											new java.awt.Color(51, 102, 255)));
							break;
						case 4:
							lingdi21.setBorder(javax.swing.BorderFactory
									.createMatteBorder(2, 2, 2, 2,
											new java.awt.Color(255, 255, 0)));
							break;
						}
						break;
					case 23:
						lingdi23.setIcon(new javax.swing.ImageIcon(getClass()
								.getResource("/map/" + level + "级.png")));
						switch (sqla.getOrdersRole(sqla.getOwner(position))) {
						case 1:
							lingdi23.setBorder(javax.swing.BorderFactory
									.createMatteBorder(2, 2, 2, 2,
											new java.awt.Color(0, 255, 102)));
							break;
						case 2:
							lingdi23.setBorder(javax.swing.BorderFactory
									.createMatteBorder(2, 2, 2, 2,
											new java.awt.Color(255, 153, 0)));
							break;
						case 3:
							lingdi23.setBorder(javax.swing.BorderFactory
									.createMatteBorder(2, 2, 2, 2,
											new java.awt.Color(51, 102, 255)));
							break;
						case 4:
							lingdi23.setBorder(javax.swing.BorderFactory
									.createMatteBorder(2, 2, 2, 2,
											new java.awt.Color(255, 255, 0)));
							break;
						}
						break;
					case 24:
						lingdi24.setIcon(new javax.swing.ImageIcon(getClass()
								.getResource("/map/" + level + "级.png")));
						switch (sqla.getOrdersRole(sqla.getOwner(position))) {
						case 1:
							lingdi24.setBorder(javax.swing.BorderFactory
									.createMatteBorder(2, 2, 2, 2,
											new java.awt.Color(0, 255, 102)));
							break;
						case 2:
							lingdi24.setBorder(javax.swing.BorderFactory
									.createMatteBorder(2, 2, 2, 2,
											new java.awt.Color(255, 153, 0)));
							break;
						case 3:
							lingdi24.setBorder(javax.swing.BorderFactory
									.createMatteBorder(2, 2, 2, 2,
											new java.awt.Color(51, 102, 255)));
							break;
						case 4:
							lingdi24.setBorder(javax.swing.BorderFactory
									.createMatteBorder(2, 2, 2, 2,
											new java.awt.Color(255, 255, 0)));
							break;
						}
						break;
					case 26:
						lingdi26.setIcon(new javax.swing.ImageIcon(getClass()
								.getResource("/map/" + level + "级.png")));
						switch (sqla.getOrdersRole(sqla.getOwner(position))) {
						case 1:
							lingdi26.setBorder(javax.swing.BorderFactory
									.createMatteBorder(2, 2, 2, 2,
											new java.awt.Color(0, 255, 102)));
							break;
						case 2:
							lingdi26.setBorder(javax.swing.BorderFactory
									.createMatteBorder(2, 2, 2, 2,
											new java.awt.Color(255, 153, 0)));
							break;
						case 3:
							lingdi26.setBorder(javax.swing.BorderFactory
									.createMatteBorder(2, 2, 2, 2,
											new java.awt.Color(51, 102, 255)));
							break;
						case 4:
							lingdi26.setBorder(javax.swing.BorderFactory
									.createMatteBorder(2, 2, 2, 2,
											new java.awt.Color(255, 255, 0)));
							break;
						}
						break;
					case 27:
						lingdi27.setIcon(new javax.swing.ImageIcon(getClass()
								.getResource("/map/" + level + "级.png")));
						switch (sqla.getOrdersRole(sqla.getOwner(position))) {
						case 1:
							lingdi2.setBorder(javax.swing.BorderFactory
									.createMatteBorder(2, 2, 2, 2,
											new java.awt.Color(0, 255, 102)));
							break;
						case 2:
							lingdi27.setBorder(javax.swing.BorderFactory
									.createMatteBorder(2, 2, 2, 2,
											new java.awt.Color(255, 153, 0)));
							break;
						case 3:
							lingdi27.setBorder(javax.swing.BorderFactory
									.createMatteBorder(2, 2, 2, 2,
											new java.awt.Color(51, 102, 255)));
							break;
						case 4:
							lingdi27.setBorder(javax.swing.BorderFactory
									.createMatteBorder(2, 2, 2, 2,
											new java.awt.Color(255, 255, 0)));
							break;
						}
						break;

					}
				}

			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}

		}
	}

	//GEN-BEGIN:variables
	// Variables declaration - do not modify
	private javax.swing.JLabel bingli1;
	private javax.swing.JLabel bingli2;
	private javax.swing.JLabel bingli3;
	private javax.swing.JLabel bingli4;
	private javax.swing.JLabel binglirenwu1;
	private javax.swing.JLabel binglirenwu2;
	private javax.swing.JLabel binglirenwu3;
	private javax.swing.JLabel binglirenwu4;
	private javax.swing.JButton jButton1;
	private javax.swing.JButton jButton30;
	private javax.swing.JButton jButton4;
	private javax.swing.JLabel jLabel1;
	private javax.swing.JLabel jLabel17;
	private javax.swing.JLabel jLabel2;
	private javax.swing.JLabel jLabel3;
	private javax.swing.JLabel jLabel4;
	private javax.swing.JLabel jLabel5;
	private javax.swing.JPanel jPanel7;
	private javax.swing.JLabel lingdi11;
	private javax.swing.JLabel lingdi12;
	private javax.swing.JLabel lingdi13;
	private javax.swing.JLabel lingdi15;
	private javax.swing.JLabel lingdi16;
	private javax.swing.JLabel lingdi17;
	private javax.swing.JLabel lingdi19;
	private javax.swing.JLabel lingdi2;
	private javax.swing.JLabel lingdi21;
	private javax.swing.JLabel lingdi23;
	private javax.swing.JLabel lingdi24;
	private javax.swing.JLabel lingdi26;
	private javax.swing.JLabel lingdi27;
	private javax.swing.JLabel lingdi3;
	private javax.swing.JLabel lingdi4;
	private javax.swing.JLabel lingdi5;
	private javax.swing.JLabel lingdi7;
	private javax.swing.JLabel lingdi8;
	private javax.swing.JLabel lingdi9;
	private javax.swing.JLabel number1;
	private javax.swing.JLabel number2;
	private javax.swing.JLabel number3;
	private javax.swing.JLabel number4;
	private javax.swing.JLabel renwu1;
	private javax.swing.JLabel renwu2;
	private javax.swing.JLabel renwu3;
	private javax.swing.JLabel renwu4;
	// End of variables declaration//GEN-END:variables

}