/*
 * gameFrame.java
 *
 * Created on __DATE__, __TIME__
 */

package Frame;

import java.awt.Color;
import java.awt.Cursor;
import java.awt.Image;
import java.awt.Point;
import java.awt.Toolkit;
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
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import player.Players;

import Frame.ServerGameFrame.Refreshimg;

import function.GameFunction;

import run.Sql;

/**
 * 
 * @author __USER__
 */
public class gameFrame extends javax.swing.JFrame {
	int x, y;
	int x2, y2;
	int orders = 0;// 玩家人数
	int playerNumber;
	int map;
	int mapnumber;
	int id;
	private JLabel jLabel01;
	public static Statement sta;
	public static PreparedStatement ps;
	public static Connection conn;

	public static long endTime;
	public static long lvbuTime;
	public static long sanTime;

	/** Creates new form gameFrame */
	public gameFrame(int mapnumber, int refresh) {

		Sql sqla = new Sql();
		connection();
		initComponents();
		if (Players.person == 0) {
			if (mapnumber == 1) {
				jLabel6.setIcon(new javax.swing.ImageIcon(getClass()
						.getResource("/images/story1.png")));
				//.setText("<html>文聘引军追赵云至赵云，只见张飞立于桥头。操疑有伏后，不敢近前。俄而曹仁、李典、夏侯惇、夏侯渊、乐进、张辽、张郃、许褚等都至。见飞怒目横矛，立马于桥上，又恐是诸葛孔明之计，都不敢近前。飞乃厉声大喝曰：“我乃燕人张翼德也！谁敢与我决一死战？”声如巨雷。曹军闻之，尽皆股栗（两腿发抖）。飞望见曹操后军阵脚移动，乃挺矛又喝曰：“战又不战，退又不退，却是何故！”喊声未绝，曹操身边夏侯杰惊得肝胆碎裂，倒撞于马下。正如是：黄口孺子，怎闻霹雳之声；病体樵夫，难听虎豹之吼。一时弃枪落盔者，不计其数，人如潮涌，马似山崩，自相践踏。长坂桥头杀气生，横枪立马眼圆睁。一声好似轰雷震，独退曹家百万兵</html>");

			} else if (mapnumber == 2) {
				jLabel6.setIcon(new javax.swing.ImageIcon(getClass()
						.getResource("/images/story2.png")));
				//.setText("<html>吕布复引兵搦战。八路诸侯齐出。傍边一将，圆睁环眼，倒竖虎须，挺丈八蛇矛，飞马大叫：“三姓家奴休走！燕人张飞在此！” 吕布见了便战张飞。飞抖擞精神，酣战吕布。云长见了，把马一拍，舞八十二斤青龙偃月刀，来夹攻吕布。刘玄德掣双股剑，骤黄鬃马，刺斜里也来助战。三人围绕战多时，遮拦架隔无休歇。喊声震动天地翻，杀气迷漫牛斗寒</html>");

			} else if (mapnumber == 3) {
				jLabel6.setIcon(new javax.swing.ImageIcon(getClass()
						.getResource("/images/story3.png")));
				//.setText("<html>使朱然于水路进兵，来日午后东南风大作，用船装载茅草，依计而行；韩当引一军攻江北岸，周泰引一军攻江南岸，每人手执茅草一把，内藏硫黄焰硝，各带火种，各执枪刀，一齐而上，但到蜀营，顺风举火；蜀兵四十屯，只烧二十屯，每间一屯烧一屯。各军预带干粮，不许暂退，昼夜追袭，只擒了刘备方止。众将听了军令，各受计而去。二将领命去了。初更时分，东南风骤起。只见御营左屯火发。方欲救时，御营右屯又火起。风紧火急，树木皆着，喊声大震。两屯军马齐出，奔离御营中，御营军自相践踏，死者不知其数。次日，吴兵又四下放火烧山，军士乱窜，先主惊慌。忽然火光中一将引数骑杀上山来，视之，乃关兴也。持矛举火破连营，玄德穷奔白帝城。一旦威名惊蜀魏，吴王宁不敬书生。</html>");

			} else if (mapnumber == 4) {
				jLabel6.setIcon(new javax.swing.ImageIcon(getClass()
						.getResource("/images/story4.png")));
				//.setText("<html>一将手提铁枪，背着一口剑，引十数骑跃马而来。赵云更不打话，直取那将。交马只一合，把那将一枪刺倒，从骑皆走。原来那将乃曹操随身背剑之将夏侯恩也。曹操有宝剑二口：一名“倚天”，一名“青”；倚天剑自佩之，青剑令夏侯恩佩之。那青剑砍铁如泥，锋利无比当时夏侯恩自恃勇力，背着曹操，只顾引人抢夺掳掠。不想撞着赵云，被他一枪刺死，夺了那口剑，看靶上有金嵌“青”二字，方知是宝剑也。云插剑提枪，复杀入重围，回顾手下从骑，已没一人，只剩得孤身。云并无半点退心，只顾往来寻觅；但逢百姓，便问糜夫人消息糜夫人乃弃阿斗于地，翻身投入枯井中而死战将全凭马力多，步行怎把幼君扶？拼将一死存刘嗣，勇决还亏女丈夫</html>");

			}
			Players.person = 1;
		}

		mapChange(mapnumber);

		paintThread2 a2 = new paintThread2();
		Thread b2 = new Thread(a2);
		b2.start();

		this.mapnumber = mapnumber;
		// 记录地图序号
		try {
			sqla.setmap(mapnumber);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		this.setLocationRelativeTo(null);
		this.setIconImage(new ImageIcon("/images/logo1.jpg").getImage());
		//
		this.setCursor(createCursor());
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setVisible(true);

		binglirenwu1.setText("10000");
		binglirenwu2.setText("10000");
		binglirenwu3.setText("10000");
		binglirenwu4.setText("10000");
		if (refresh != 0) {
			switch (refresh) {
			case 1:
				refreshimg(1);
				break;
			case 2:
				refreshimg(2);
				break;
			case 3:
				refreshimg(3);
				break;

			}
		}

	}

	public static Cursor createCursor() {
		// String fileName = "img/1.jpg";
		Image cursor = Toolkit.getDefaultToolkit().createImage(
				"src\\images\\subiao1.png");
		return Toolkit.getDefaultToolkit().createCustomCursor(cursor,
				new Point(16, 16), "mycursor");

	}

	//GEN-BEGIN:initComponents
	// <editor-fold defaultstate="collapsed" desc="Generated Code">
	private void initComponents() {

		jPanel7 = new javax.swing.JPanel();
		jLabel6 = new javax.swing.JLabel();
		jButton1 = new javax.swing.JButton();
		jButton2 = new javax.swing.JButton();
		renwu1 = new javax.swing.JLabel();
		renwu4 = new javax.swing.JLabel();
		renwu2 = new javax.swing.JLabel();
		renwu3 = new javax.swing.JLabel();
		jButton30 = new javax.swing.JButton();
		jLabel17 = new javax.swing.JLabel();
		jLabel2 = new javax.swing.JLabel();
		jLabel3 = new javax.swing.JLabel();
		jLabel4 = new javax.swing.JLabel();
		jLabel5 = new javax.swing.JLabel();
		lingdi2 = new javax.swing.JLabel();
		lingdi3 = new javax.swing.JLabel();
		lingdi4 = new javax.swing.JLabel();
		lingdi5 = new javax.swing.JLabel();
		lingdi7 = new javax.swing.JLabel();
		lingdi8 = new javax.swing.JLabel();
		jButton3 = new javax.swing.JButton();
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
		bingli1 = new javax.swing.JLabel();
		bingli2 = new javax.swing.JLabel();
		bingli3 = new javax.swing.JLabel();
		bingli4 = new javax.swing.JLabel();
		number1 = new javax.swing.JLabel();
		number4 = new javax.swing.JLabel();
		number3 = new javax.swing.JLabel();
		number2 = new javax.swing.JLabel();
		binglirenwu4 = new javax.swing.JLabel();
		binglirenwu1 = new javax.swing.JLabel();
		binglirenwu2 = new javax.swing.JLabel();
		binglirenwu3 = new javax.swing.JLabel();
		jButton4 = new javax.swing.JButton();
		jLabel1 = new javax.swing.JLabel();

		setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
		setTitle("\u4e09\u56fd\u5927\u5bcc\u7fc1");

		jPanel7.setLayout(null);

		jLabel6.setFont(new java.awt.Font("Microsoft YaHei UI", 0, 24));
		jLabel6.setForeground(new java.awt.Color(255, 255, 255));
		jPanel7.add(jLabel6);
		jLabel6.setBounds(460, 80, 970, 700);

		jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource(
				"/images/read.png"))); // NOI18N
		jButton1.setContentAreaFilled(false);
		jButton1.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				jButton1ActionPerformed(evt);
			}
		});
		jPanel7.add(jButton1);
		jButton1.setBounds(600, 880, 300, 70);

		jButton2.setIcon(new javax.swing.ImageIcon(getClass().getResource(
				"/images/save.png"))); // NOI18N
		jButton2.setContentAreaFilled(false);
		jButton2.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				jButton2ActionPerformed(evt);
			}
		});
		jPanel7.add(jButton2);
		jButton2.setBounds(270, 880, 300, 70);

		renwu1.setIcon(new javax.swing.ImageIcon(getClass().getResource(
				"/roleimg/figure1.front.png"))); // NOI18N
		jPanel7.add(renwu1);
		renwu1.setBounds(1080, 450, 95, 200);

		renwu4.setIcon(new javax.swing.ImageIcon(getClass().getResource(
				"/roleimg/figure4.front.png"))); // NOI18N
		jPanel7.add(renwu4);
		renwu4.setBounds(1310, 460, 95, 200);

		renwu2.setIcon(new javax.swing.ImageIcon(getClass().getResource(
				"/roleimg/figure2.front.png"))); // NOI18N
		jPanel7.add(renwu2);
		renwu2.setBounds(1150, 510, 95, 200);

		renwu3.setIcon(new javax.swing.ImageIcon(getClass().getResource(
				"/roleimg/figure3.front.png"))); // NOI18N
		jPanel7.add(renwu3);
		renwu3.setBounds(1180, 450, 95, 200);

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
		jButton30.setBounds(1290, 880, 310, 71);

		jLabel17.setIcon(new javax.swing.ImageIcon(getClass().getResource(
				"/images/1.jpg"))); // NOI18N
		jPanel7.add(jLabel17);
		jLabel17.setBounds(1690, 480, 100, 90);

		jLabel2.setBackground(new java.awt.Color(254, 254, 254));
		jLabel2.setForeground(new java.awt.Color(255, 255, 255));
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
		lingdi4.setBounds(1300, 630, 104, 91);
		jPanel7.add(lingdi5);
		lingdi5.setBounds(970, 640, 104, 91);
		jPanel7.add(lingdi7);
		lingdi7.setBounds(700, 840, 104, 91);
		jPanel7.add(lingdi8);
		lingdi8.setBounds(740, 650, 104, 91);

		jButton3.setIcon(new javax.swing.ImageIcon(getClass().getResource(
				"/images/list.returnButton.png"))); // NOI18N
		jButton3.setBorder(null);
		jButton3.setContentAreaFilled(false);
		jButton3.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				jButton3ActionPerformed(evt);
			}
		});
		jPanel7.add(jButton3);
		jButton3.setBounds(930, 880, 190, 70);
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

		bingli1.setIcon(new javax.swing.ImageIcon(getClass().getResource(
				"/map/soldiers 501.png"))); // NOI18N
		jPanel7.add(bingli1);
		bingli1.setBounds(10, 180, 50, 60);

		bingli2.setIcon(new javax.swing.ImageIcon(getClass().getResource(
				"/map/soldiers 501.png"))); // NOI18N
		jPanel7.add(bingli2);
		bingli2.setBounds(10, 910, 50, 60);

		bingli3.setIcon(new javax.swing.ImageIcon(getClass().getResource(
				"/map/soldiers 501.png"))); // NOI18N
		jPanel7.add(bingli3);
		bingli3.setBounds(1810, 170, 50, 60);

		bingli4.setIcon(new javax.swing.ImageIcon(getClass().getResource(
				"/map/soldiers 501.png"))); // NOI18N
		jPanel7.add(bingli4);
		bingli4.setBounds(1810, 910, 50, 60);

		number1.setFont(new java.awt.Font("Microsoft YaHei UI", 1, 65));
		number1.setForeground(new java.awt.Color(51, 255, 0));
		number1.setText("1");
		number1.setBorder(javax.swing.BorderFactory.createMatteBorder(2, 2, 2,
				2, new java.awt.Color(255, 255, 255)));
		jPanel7.add(number1);
		number1.setBounds(170, 830, 44, 80);

		number4.setFont(new java.awt.Font("Microsoft YaHei UI", 1, 65));
		number4.setForeground(new java.awt.Color(255, 255, 51));
		number4.setText("4");
		number4.setBorder(javax.swing.BorderFactory.createMatteBorder(3, 3, 3,
				3, new java.awt.Color(255, 255, 255)));
		jPanel7.add(number4);
		number4.setBounds(160, 100, 50, 80);

		number3.setFont(new java.awt.Font("Microsoft YaHei UI", 1, 65));
		number3.setForeground(new java.awt.Color(102, 102, 255));
		number3.setText("3");
		number3.setBorder(javax.swing.BorderFactory.createMatteBorder(3, 3, 3,
				3, new java.awt.Color(255, 255, 255)));
		jPanel7.add(number3);
		number3.setBounds(1670, 820, 50, 80);

		number2.setFont(new java.awt.Font("Microsoft YaHei UI", 1, 65));
		number2.setForeground(new java.awt.Color(255, 153, 51));
		number2.setText("2");
		number2.setBorder(javax.swing.BorderFactory.createMatteBorder(3, 3, 3,
				3, new java.awt.Color(255, 255, 255)));
		jPanel7.add(number2);
		number2.setBounds(1670, 80, 50, 80);

		binglirenwu4.setFont(new java.awt.Font("Microsoft YaHei UI", 1, 24));
		binglirenwu4.setForeground(new java.awt.Color(255, 255, 255));
		jPanel7.add(binglirenwu4);
		binglirenwu4.setBounds(70, 200, 90, 30);

		binglirenwu1.setFont(new java.awt.Font("Microsoft YaHei UI", 1, 24));
		binglirenwu1.setForeground(new java.awt.Color(255, 255, 255));
		jPanel7.add(binglirenwu1);
		binglirenwu1.setBounds(60, 930, 90, 30);

		binglirenwu2.setFont(new java.awt.Font("Microsoft YaHei UI", 1, 24));
		binglirenwu2.setForeground(new java.awt.Color(255, 255, 255));
		jPanel7.add(binglirenwu2);
		binglirenwu2.setBounds(1710, 190, 90, 30);

		binglirenwu3.setFont(new java.awt.Font("Microsoft YaHei UI", 1, 24));
		binglirenwu3.setForeground(new java.awt.Color(255, 255, 255));
		jPanel7.add(binglirenwu3);
		binglirenwu3.setBounds(1710, 930, 90, 30);

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
		// TODO add your handling code here:
		new mainFrame().setVisible(true);
		setVisible(false);
	}

	private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {
		// TODO add your handling code here:
		new List().setVisible(true);
	}

	private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {
		// TODO add your handling code here:
		try {
			new saveData().setVisible(true);

		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

	private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {
		// TODO add your handling code here:
		new readData().setVisible(true);
		setVisible(false);
	}

	/*
	 * public void movePlayer(int order, int dice) { System.out.println(order +
	 * "和" + dice); PaintThread a = new PaintThread(dice, order);// Thread b =
	 * new Thread(a); b.start(); }
	 */

	private void jButton30ActionPerformed(java.awt.event.ActionEvent evt) {
		// TODO add your handling code here:

		jButton30.setEnabled(false);
		gameround();

	}

	public void gameround() {
		try {
			Sql sql = new Sql();
			playerNumber = sql.getPlayerNumber();
			orders = sql.getServerOrders();

			int dice = GameFunction.dice();

			PaintThread1 a1 = new PaintThread1(dice);// 骰子动图
			PaintThread a = new PaintThread(dice, orders, mapnumber);// 传入骰子的数，移动两步,id为1

			Thread b1 = new Thread(a1);
			Thread b = new Thread(a);

			b.start();
			b1.start();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
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

	class paintThread2 implements Runnable {

		@Override
		public void run() {
			try {
				Thread.sleep(10000);
				jLabel6.setVisible(false);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}

		}
	}

	class PaintThread implements Runnable {
		int dice, orders, position, playerPosition, mapnumber;
		int i = 0;
		int j = 0;

		public PaintThread(int dice, int orders, int mapnumber) {
			this.dice = dice;
			this.orders = orders;
			this.mapnumber = mapnumber;
		}

		public void run() {
			// while（true）保持能一直运行
			// 得到当前格子的坐标

			while (i != dice) {

				String sql3 = "SELECT position FROM player where orders = "
						+ orders;

				try {
					sta = conn.createStatement();
					ResultSet rs = sta.executeQuery(sql3);
					if (rs.next()) {
						position = rs.getInt("position");// 得到玩家位置
					}
					// 得到当前的x，y
					String sql = "select x,y from land where position = "
							+ position;
					position = position + 1; // 下一格
					if (position == 29) {
						position = position % 29 + 1;
					}
					// 得到下一格的x，y
					String sql2 = "select x,y from land where position = "
							+ position;
					rs = sta.executeQuery(sql);
					if (rs.next()) {

						x = rs.getInt("x");
						y = rs.getInt("y");
					}
					rs = sta.executeQuery(sql2);

					if (rs.next()) {
						x2 = rs.getInt("x");
						y2 = rs.getInt("y");
					}
					String sqlid = "select id from player where orders = "
							+ orders;
					rs = sta.executeQuery(sqlid);
					if (rs.next()) {
						id = rs.getInt("id");
					}
				} catch (Exception e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}//
				while (true) {
					switch (id) {
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

					try {
						// 物体运行太快，肉眼无法追踪，这是减慢速度，使得肉眼能跟上刷新速度
						Thread.sleep(7);
						if (x == x2) {
							if (y - y2 > 0) {
								y--;
								if (id == 1) {
									renwu1
											.setIcon(new javax.swing.ImageIcon(
													getClass()
															.getResource(
																	"/roleimg/figure1.behind.png"))); // NOI18N
								}
								if (id == 2) {
									renwu2
											.setIcon(new javax.swing.ImageIcon(
													getClass()
															.getResource(
																	"/roleimg/figure2.behind.png"))); // NOI18N
								}
								if (id == 3) {
									renwu3
											.setIcon(new javax.swing.ImageIcon(
													getClass()
															.getResource(
																	"/roleimg/figure3.behind.png"))); // NOI18N
								}
								if (id == 4) {
									renwu4
											.setIcon(new javax.swing.ImageIcon(
													getClass()
															.getResource(
																	"/roleimg/figure4.behind.png"))); // NOI18N
								}
							}
							if (y - y2 < 0) {
								y++;
								if (id == 1) {
									renwu1
											.setIcon(new javax.swing.ImageIcon(
													getClass()
															.getResource(
																	"/roleimg/figure1.front.png"))); // NOI18N
								}
								if (id == 2) {
									renwu2
											.setIcon(new javax.swing.ImageIcon(
													getClass()
															.getResource(
																	"/roleimg/figure2.front.png"))); // NOI18N
								}
								if (id == 3) {
									renwu3
											.setIcon(new javax.swing.ImageIcon(
													getClass()
															.getResource(
																	"/roleimg/figure3.front.png"))); // NOI18N
								}
								if (id == 4) {
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
								if (id == 1) {
									renwu1
											.setIcon(new javax.swing.ImageIcon(
													getClass()
															.getResource(
																	"/roleimg/figure1.left.png"))); // NOI18N
								}
								if (id == 2) {
									renwu2
											.setIcon(new javax.swing.ImageIcon(
													getClass()
															.getResource(
																	"/roleimg/figure2.left.png"))); // NOI18N
								}
								if (id == 3) {
									renwu3
											.setIcon(new javax.swing.ImageIcon(
													getClass()
															.getResource(
																	"/roleimg/figure3.left.png"))); // NOI18N
								}
								if (id == 4) {
									renwu4
											.setIcon(new javax.swing.ImageIcon(
													getClass()
															.getResource(
																	"/roleimg/figure4.left.png"))); // NOI18N
								}
							}
							if (x - x2 < 0) {
								x++;
								if (id == 1) {
									renwu1
											.setIcon(new javax.swing.ImageIcon(
													getClass()
															.getResource(
																	"/roleimg/figure1.right.png"))); // NOI18N
								}
								if (id == 2) {
									renwu2
											.setIcon(new javax.swing.ImageIcon(
													getClass()
															.getResource(
																	"/roleimg/figure2.right.png"))); // NOI18N
								}
								if (id == 3) {
									renwu3
											.setIcon(new javax.swing.ImageIcon(
													getClass()
															.getResource(
																	"/roleimg/figure3.right.png"))); // NOI18N
								}
								if (id == 4) {
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
								if (id == 1) {
									renwu1
											.setIcon(new javax.swing.ImageIcon(
													getClass()
															.getResource(
																	"/roleimg/figure1.left.png"))); // NOI18N
								}
								if (id == 2) {
									renwu2
											.setIcon(new javax.swing.ImageIcon(
													getClass()
															.getResource(
																	"/roleimg/figure2.left.png"))); // NOI18N
								}
								if (id == 3) {
									renwu3
											.setIcon(new javax.swing.ImageIcon(
													getClass()
															.getResource(
																	"/roleimg/figure3.left.png"))); // NOI18N
								}
								if (id == 4) {
									renwu4
											.setIcon(new javax.swing.ImageIcon(
													getClass()
															.getResource(
																	"/roleimg/figure4.left.png"))); // NOI18N
								}
							}
							if (x - x2 < 0) {
								x++;
								if (id == 1) {
									renwu1
											.setIcon(new javax.swing.ImageIcon(
													getClass()
															.getResource(
																	"/roleimg/figure1.right.png"))); // NOI18N
								}
								if (id == 2) {
									renwu2
											.setIcon(new javax.swing.ImageIcon(
													getClass()
															.getResource(
																	"/roleimg/figure2.right.png"))); // NOI18N
								}
								if (id == 3) {
									renwu3
											.setIcon(new javax.swing.ImageIcon(
													getClass()
															.getResource(
																	"/roleimg/figure3.right.png"))); // NOI18N
								}
								if (id == 4) {
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
			// 判断是否在监狱
			System.out.println("我是map" + mapnumber);
			if (mapnumber == 1 && position == 14) {
				GameFunction.prison(orders);
			} else if (mapnumber == 2 && position == 22) {
				GameFunction.prison(orders);
			} else if (mapnumber == 3 && position == 10) {
				GameFunction.prison(orders);
			} else if (mapnumber == 4 && position == 14) {
				GameFunction.prison(orders);
			}

			else if (position == 6 || position == 10 || position == 14
					|| position == 18 || position == 20 || position == 22
					|| position == 25 || position == 28) {
				Random r = new Random();
				int R = r.nextInt(3) + 1;
				switch (R) {

				case 1:
					JOptionPane.showMessageDialog(null, "增加500兵力", "结果",
							JOptionPane.PLAIN_MESSAGE);
					new GameFunction().cookWine(orders);// 增加自身兵力
					break;

				case 2:
					JOptionPane.showMessageDialog(null, "增加400兵力", "结果",
							JOptionPane.PLAIN_MESSAGE);
					new GameFunction().threeVisitsToTheHut(orders);// 增加自己兵力
					break;
				case 3:
					JOptionPane.showMessageDialog(null, "停留", "结果",
							JOptionPane.PLAIN_MESSAGE);
					new GameFunction().flooding(orders);// 自己停留一回合
					break;
				}
			}

			try {
				// 判断是人机还是玩家
				String sqltype = "select type from player where orders = '"
						+ orders + "'";
				sta = conn.createStatement();
				ResultSet rs = sta.executeQuery(sqltype);
				int type = 0;
				if (rs.next()) {
					type = rs.getInt("type");
				}
				if (GameFunction.landSearch(orders)) {
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
						if (type == 2 && money > 1000) {
							// 2代表人机
							GameFunction.landBuy(orders);
							switch (position) {
							case 2:
								lingdi2.setIcon(new javax.swing.ImageIcon(
										getClass().getResource("/map/1级.png")));
								// 改变边框颜色
								switch (id) {
								case 1:
									lingdi2.setBorder(javax.swing.BorderFactory
											.createMatteBorder(2, 2, 2, 2,
													new java.awt.Color(0, 255,
															102)));
									break;
								case 2:
									lingdi2.setBorder(javax.swing.BorderFactory
											.createMatteBorder(2, 2, 2, 2,
													new java.awt.Color(255,
															153, 0)));
									break;
								case 3:
									lingdi2.setBorder(javax.swing.BorderFactory
											.createMatteBorder(2, 2, 2, 2,
													new java.awt.Color(51, 102,
															255)));
									break;
								case 4:
									lingdi2.setBorder(javax.swing.BorderFactory
											.createMatteBorder(2, 2, 2, 2,
													new java.awt.Color(255,
															255, 0)));
									break;
								}
								break;
							case 3:
								lingdi3.setIcon(new javax.swing.ImageIcon(
										getClass().getResource("/map/1级.png")));
								// 改变边框颜色
								switch (id) {
								case 1:
									lingdi3.setBorder(javax.swing.BorderFactory
											.createMatteBorder(2, 2, 2, 2,
													new java.awt.Color(0, 255,
															102)));
									break;
								case 2:
									lingdi3.setBorder(javax.swing.BorderFactory
											.createMatteBorder(2, 2, 2, 2,
													new java.awt.Color(255,
															153, 0)));
									break;
								case 3:
									lingdi3.setBorder(javax.swing.BorderFactory
											.createMatteBorder(2, 2, 2, 2,
													new java.awt.Color(51, 102,
															255)));
									break;
								case 4:
									lingdi3.setBorder(javax.swing.BorderFactory
											.createMatteBorder(2, 2, 2, 2,
													new java.awt.Color(255,
															255, 0)));
									break;
								}
								break;
							case 4:
								lingdi4.setIcon(new javax.swing.ImageIcon(
										getClass().getResource("/map/1级.png")));
								// 改变边框颜色
								switch (id) {
								case 1:
									lingdi4.setBorder(javax.swing.BorderFactory
											.createMatteBorder(2, 2, 2, 2,
													new java.awt.Color(0, 255,
															102)));
									break;
								case 2:
									lingdi4.setBorder(javax.swing.BorderFactory
											.createMatteBorder(2, 2, 2, 2,
													new java.awt.Color(255,
															153, 0)));
									break;
								case 3:
									lingdi4.setBorder(javax.swing.BorderFactory
											.createMatteBorder(2, 2, 2, 2,
													new java.awt.Color(51, 102,
															255)));
									break;
								case 4:
									lingdi4.setBorder(javax.swing.BorderFactory
											.createMatteBorder(2, 2, 2, 2,
													new java.awt.Color(255,
															255, 0)));
									break;
								}
								break;
							case 5:
								lingdi5.setIcon(new javax.swing.ImageIcon(
										getClass().getResource("/map/1级.png")));
								// 改变边框颜色
								switch (id) {
								case 1:
									lingdi5.setBorder(javax.swing.BorderFactory
											.createMatteBorder(2, 2, 2, 2,
													new java.awt.Color(0, 255,
															102)));
									break;
								case 2:
									lingdi5.setBorder(javax.swing.BorderFactory
											.createMatteBorder(2, 2, 2, 2,
													new java.awt.Color(255,
															153, 0)));
									break;
								case 3:
									lingdi5.setBorder(javax.swing.BorderFactory
											.createMatteBorder(2, 2, 2, 2,
													new java.awt.Color(51, 102,
															255)));
									break;
								case 4:
									lingdi5.setBorder(javax.swing.BorderFactory
											.createMatteBorder(2, 2, 2, 2,
													new java.awt.Color(255,
															255, 0)));
									break;
								}
								break;
							case 7:
								lingdi7.setIcon(new javax.swing.ImageIcon(
										getClass().getResource("/map/1级.png")));
								// 改变边框颜色
								switch (id) {
								case 1:
									lingdi7.setBorder(javax.swing.BorderFactory
											.createMatteBorder(2, 2, 2, 2,
													new java.awt.Color(0, 255,
															102)));
									break;
								case 2:
									lingdi7.setBorder(javax.swing.BorderFactory
											.createMatteBorder(2, 2, 2, 2,
													new java.awt.Color(255,
															153, 0)));
									break;
								case 3:
									lingdi7.setBorder(javax.swing.BorderFactory
											.createMatteBorder(2, 2, 2, 2,
													new java.awt.Color(51, 102,
															255)));
									break;
								case 4:
									lingdi7.setBorder(javax.swing.BorderFactory
											.createMatteBorder(2, 2, 2, 2,
													new java.awt.Color(255,
															255, 0)));
									break;
								}
								break;
							case 8:
								lingdi8.setIcon(new javax.swing.ImageIcon(
										getClass().getResource("/map/1级.png")));
								// 改变边框颜色
								switch (id) {
								case 1:
									lingdi8.setBorder(javax.swing.BorderFactory
											.createMatteBorder(2, 2, 2, 2,
													new java.awt.Color(0, 255,
															102)));
									break;
								case 2:
									lingdi8.setBorder(javax.swing.BorderFactory
											.createMatteBorder(2, 2, 2, 2,
													new java.awt.Color(255,
															153, 0)));
									break;
								case 3:
									lingdi8.setBorder(javax.swing.BorderFactory
											.createMatteBorder(2, 2, 2, 2,
													new java.awt.Color(51, 102,
															255)));
									break;
								case 4:
									lingdi8.setBorder(javax.swing.BorderFactory
											.createMatteBorder(2, 2, 2, 2,
													new java.awt.Color(255,
															255, 0)));
									break;
								}
								break;
							case 9:
								lingdi9.setIcon(new javax.swing.ImageIcon(
										getClass().getResource("/map/1级.png")));
								// 改变边框颜色
								switch (id) {
								case 1:
									lingdi9.setBorder(javax.swing.BorderFactory
											.createMatteBorder(2, 2, 2, 2,
													new java.awt.Color(0, 255,
															102)));
									break;
								case 2:
									lingdi9.setBorder(javax.swing.BorderFactory
											.createMatteBorder(2, 2, 2, 2,
													new java.awt.Color(255,
															153, 0)));
									break;
								case 3:
									lingdi9.setBorder(javax.swing.BorderFactory
											.createMatteBorder(2, 2, 2, 2,
													new java.awt.Color(51, 102,
															255)));
									break;
								case 4:
									lingdi9.setBorder(javax.swing.BorderFactory
											.createMatteBorder(2, 2, 2, 2,
													new java.awt.Color(255,
															255, 0)));
									break;
								}
								break;
							case 11:
								lingdi11.setIcon(new javax.swing.ImageIcon(
										getClass().getResource("/map/1级.png")));
								// 改变边框颜色
								switch (id) {
								case 1:
									lingdi11
											.setBorder(javax.swing.BorderFactory
													.createMatteBorder(
															2,
															2,
															2,
															2,
															new java.awt.Color(
																	0, 255, 102)));
									break;
								case 2:
									lingdi11
											.setBorder(javax.swing.BorderFactory
													.createMatteBorder(
															2,
															2,
															2,
															2,
															new java.awt.Color(
																	255, 153, 0)));
									break;
								case 3:
									lingdi11
											.setBorder(javax.swing.BorderFactory
													.createMatteBorder(2, 2, 2,
															2,
															new java.awt.Color(
																	51, 102,
																	255)));
									break;
								case 4:
									lingdi11
											.setBorder(javax.swing.BorderFactory
													.createMatteBorder(
															2,
															2,
															2,
															2,
															new java.awt.Color(
																	255, 255, 0)));
									break;
								}
								break;
							case 12:
								lingdi12.setIcon(new javax.swing.ImageIcon(
										getClass().getResource("/map/1级.png")));
								// 改变边框颜色
								switch (id) {
								case 1:
									lingdi12
											.setBorder(javax.swing.BorderFactory
													.createMatteBorder(
															2,
															2,
															2,
															2,
															new java.awt.Color(
																	0, 255, 102)));
									break;
								case 2:
									lingdi12
											.setBorder(javax.swing.BorderFactory
													.createMatteBorder(
															2,
															2,
															2,
															2,
															new java.awt.Color(
																	255, 153, 0)));
									break;
								case 3:
									lingdi12
											.setBorder(javax.swing.BorderFactory
													.createMatteBorder(2, 2, 2,
															2,
															new java.awt.Color(
																	51, 102,
																	255)));
									break;
								case 4:
									lingdi12
											.setBorder(javax.swing.BorderFactory
													.createMatteBorder(
															2,
															2,
															2,
															2,
															new java.awt.Color(
																	255, 255, 0)));
									break;
								}
								break;
							case 13:
								lingdi13.setIcon(new javax.swing.ImageIcon(
										getClass().getResource("/map/1级.png")));
								// 改变边框颜色
								switch (id) {
								case 1:
									lingdi13
											.setBorder(javax.swing.BorderFactory
													.createMatteBorder(
															2,
															2,
															2,
															2,
															new java.awt.Color(
																	0, 255, 102)));
									break;
								case 2:
									lingdi13
											.setBorder(javax.swing.BorderFactory
													.createMatteBorder(
															2,
															2,
															2,
															2,
															new java.awt.Color(
																	255, 153, 0)));
									break;
								case 3:
									lingdi13
											.setBorder(javax.swing.BorderFactory
													.createMatteBorder(2, 2, 2,
															2,
															new java.awt.Color(
																	51, 102,
																	255)));
									break;
								case 4:
									lingdi13
											.setBorder(javax.swing.BorderFactory
													.createMatteBorder(
															2,
															2,
															2,
															2,
															new java.awt.Color(
																	255, 255, 0)));
									break;
								}
								break;
							case 15:
								lingdi15.setIcon(new javax.swing.ImageIcon(
										getClass().getResource("/map/1级.png")));
								// 改变边框颜色
								switch (id) {
								case 1:
									lingdi15
											.setBorder(javax.swing.BorderFactory
													.createMatteBorder(
															2,
															2,
															2,
															2,
															new java.awt.Color(
																	0, 255, 102)));
									break;
								case 2:
									lingdi15
											.setBorder(javax.swing.BorderFactory
													.createMatteBorder(
															2,
															2,
															2,
															2,
															new java.awt.Color(
																	255, 153, 0)));
									break;
								case 3:
									lingdi15
											.setBorder(javax.swing.BorderFactory
													.createMatteBorder(2, 2, 2,
															2,
															new java.awt.Color(
																	51, 102,
																	255)));
									break;
								case 4:
									lingdi15
											.setBorder(javax.swing.BorderFactory
													.createMatteBorder(
															2,
															2,
															2,
															2,
															new java.awt.Color(
																	255, 255, 0)));
									break;
								}
								break;
							case 16:
								lingdi16.setIcon(new javax.swing.ImageIcon(
										getClass().getResource("/map/1级.png")));
								// 改变边框颜色
								switch (id) {
								case 1:
									lingdi16
											.setBorder(javax.swing.BorderFactory
													.createMatteBorder(
															2,
															2,
															2,
															2,
															new java.awt.Color(
																	0, 255, 102)));
									break;
								case 2:
									lingdi16
											.setBorder(javax.swing.BorderFactory
													.createMatteBorder(
															2,
															2,
															2,
															2,
															new java.awt.Color(
																	255, 153, 0)));
									break;
								case 3:
									lingdi16
											.setBorder(javax.swing.BorderFactory
													.createMatteBorder(2, 2, 2,
															2,
															new java.awt.Color(
																	51, 102,
																	255)));
									break;
								case 4:
									lingdi16
											.setBorder(javax.swing.BorderFactory
													.createMatteBorder(
															2,
															2,
															2,
															2,
															new java.awt.Color(
																	255, 255, 0)));
									break;
								}
								break;
							case 17:
								lingdi17.setIcon(new javax.swing.ImageIcon(
										getClass().getResource("/map/1级.png")));
								// 改变边框颜色
								switch (id) {
								case 1:
									lingdi17
											.setBorder(javax.swing.BorderFactory
													.createMatteBorder(
															2,
															2,
															2,
															2,
															new java.awt.Color(
																	0, 255, 102)));
									break;
								case 2:
									lingdi17
											.setBorder(javax.swing.BorderFactory
													.createMatteBorder(
															2,
															2,
															2,
															2,
															new java.awt.Color(
																	255, 153, 0)));
									break;
								case 3:
									lingdi17
											.setBorder(javax.swing.BorderFactory
													.createMatteBorder(2, 2, 2,
															2,
															new java.awt.Color(
																	51, 102,
																	255)));
									break;
								case 4:
									lingdi17
											.setBorder(javax.swing.BorderFactory
													.createMatteBorder(
															2,
															2,
															2,
															2,
															new java.awt.Color(
																	255, 255, 0)));
									break;
								}
								break;
							case 19:
								lingdi19.setIcon(new javax.swing.ImageIcon(
										getClass().getResource("/map/1级.png")));
								// 改变边框颜色
								switch (id) {
								case 1:
									lingdi19
											.setBorder(javax.swing.BorderFactory
													.createMatteBorder(
															2,
															2,
															2,
															2,
															new java.awt.Color(
																	0, 255, 102)));
									break;
								case 2:
									lingdi19
											.setBorder(javax.swing.BorderFactory
													.createMatteBorder(
															2,
															2,
															2,
															2,
															new java.awt.Color(
																	255, 153, 0)));
									break;
								case 3:
									lingdi19
											.setBorder(javax.swing.BorderFactory
													.createMatteBorder(2, 2, 2,
															2,
															new java.awt.Color(
																	51, 102,
																	255)));
									break;
								case 4:
									lingdi19
											.setBorder(javax.swing.BorderFactory
													.createMatteBorder(
															2,
															2,
															2,
															2,
															new java.awt.Color(
																	255, 255, 0)));
									break;
								}
								break;
							case 21:
								lingdi21.setIcon(new javax.swing.ImageIcon(
										getClass().getResource("/map/1级.png")));
								// 改变边框颜色
								switch (id) {
								case 1:
									lingdi21
											.setBorder(javax.swing.BorderFactory
													.createMatteBorder(
															2,
															2,
															2,
															2,
															new java.awt.Color(
																	0, 255, 102)));
									break;
								case 2:
									lingdi21
											.setBorder(javax.swing.BorderFactory
													.createMatteBorder(
															2,
															2,
															2,
															2,
															new java.awt.Color(
																	255, 153, 0)));
									break;
								case 3:
									lingdi21
											.setBorder(javax.swing.BorderFactory
													.createMatteBorder(2, 2, 2,
															2,
															new java.awt.Color(
																	51, 102,
																	255)));
									break;
								case 4:
									lingdi21
											.setBorder(javax.swing.BorderFactory
													.createMatteBorder(
															2,
															2,
															2,
															2,
															new java.awt.Color(
																	255, 255, 0)));
									break;
								}
								break;
							case 23:
								lingdi23.setIcon(new javax.swing.ImageIcon(
										getClass().getResource("/map/1级.png")));
								// 改变边框颜色
								switch (id) {
								case 1:
									lingdi23
											.setBorder(javax.swing.BorderFactory
													.createMatteBorder(
															2,
															2,
															2,
															2,
															new java.awt.Color(
																	0, 255, 102)));
									break;
								case 2:
									lingdi23
											.setBorder(javax.swing.BorderFactory
													.createMatteBorder(
															2,
															2,
															2,
															2,
															new java.awt.Color(
																	255, 153, 0)));
									break;
								case 3:
									lingdi23
											.setBorder(javax.swing.BorderFactory
													.createMatteBorder(2, 2, 2,
															2,
															new java.awt.Color(
																	51, 102,
																	255)));
									break;
								case 4:
									lingdi23
											.setBorder(javax.swing.BorderFactory
													.createMatteBorder(
															2,
															2,
															2,
															2,
															new java.awt.Color(
																	255, 255, 0)));
									break;
								}
								break;
							case 24:
								lingdi24.setIcon(new javax.swing.ImageIcon(
										getClass().getResource("/map/1级.png")));
								// 改变边框颜色
								switch (id) {
								case 1:
									lingdi24
											.setBorder(javax.swing.BorderFactory
													.createMatteBorder(
															2,
															2,
															2,
															2,
															new java.awt.Color(
																	0, 255, 102)));
									break;
								case 2:
									lingdi24
											.setBorder(javax.swing.BorderFactory
													.createMatteBorder(
															2,
															2,
															2,
															2,
															new java.awt.Color(
																	255, 153, 0)));
									break;
								case 3:
									lingdi24
											.setBorder(javax.swing.BorderFactory
													.createMatteBorder(2, 2, 2,
															2,
															new java.awt.Color(
																	51, 102,
																	255)));
									break;
								case 4:
									lingdi24
											.setBorder(javax.swing.BorderFactory
													.createMatteBorder(
															2,
															2,
															2,
															2,
															new java.awt.Color(
																	255, 255, 0)));
									break;
								}
								break;
							case 26:
								lingdi26.setIcon(new javax.swing.ImageIcon(
										getClass().getResource("/map/1级.png")));
								// 改变边框颜色
								switch (id) {
								case 1:
									lingdi26
											.setBorder(javax.swing.BorderFactory
													.createMatteBorder(
															2,
															2,
															2,
															2,
															new java.awt.Color(
																	0, 255, 102)));
									break;
								case 2:
									lingdi26
											.setBorder(javax.swing.BorderFactory
													.createMatteBorder(
															2,
															2,
															2,
															2,
															new java.awt.Color(
																	255, 153, 0)));
									break;
								case 3:
									lingdi26
											.setBorder(javax.swing.BorderFactory
													.createMatteBorder(2, 2, 2,
															2,
															new java.awt.Color(
																	51, 102,
																	255)));
									break;
								case 4:
									lingdi26
											.setBorder(javax.swing.BorderFactory
													.createMatteBorder(
															2,
															2,
															2,
															2,
															new java.awt.Color(
																	255, 255, 0)));
									break;
								}
								break;
							case 27:
								lingdi27.setIcon(new javax.swing.ImageIcon(
										getClass().getResource("/map/1级.png")));
								// 改变边框颜色
								switch (id) {
								case 1:
									lingdi27
											.setBorder(javax.swing.BorderFactory
													.createMatteBorder(
															2,
															2,
															2,
															2,
															new java.awt.Color(
																	0, 255, 102)));
									break;
								case 2:
									lingdi27
											.setBorder(javax.swing.BorderFactory
													.createMatteBorder(
															2,
															2,
															2,
															2,
															new java.awt.Color(
																	255, 153, 0)));
									break;
								case 3:
									lingdi27
											.setBorder(javax.swing.BorderFactory
													.createMatteBorder(2, 2, 2,
															2,
															new java.awt.Color(
																	51, 102,
																	255)));
									break;
								case 4:
									lingdi27
											.setBorder(javax.swing.BorderFactory
													.createMatteBorder(
															2,
															2,
															2,
															2,
															new java.awt.Color(
																	255, 255, 0)));
									break;
								}
								break;

							}
						} else {
							int res = JOptionPane
									.showConfirmDialog(null, "是否占领领地", "占领确认",
											JOptionPane.YES_NO_OPTION);
							if (res == JOptionPane.YES_OPTION && money > 1000) {
								GameFunction.landBuy(orders);
								JOptionPane.showMessageDialog(null, "购买成功",
										"结果", JOptionPane.PLAIN_MESSAGE);
								switch (position) {
								case 2:
									lingdi2.setIcon(new javax.swing.ImageIcon(
											getClass().getResource(
													"/map/1级.png")));
									// 改变边框颜色
									switch (id) {
									case 1:
										lingdi2
												.setBorder(javax.swing.BorderFactory
														.createMatteBorder(
																2,
																2,
																2,
																2,
																new java.awt.Color(
																		0, 255,
																		102)));
										break;
									case 2:
										lingdi2
												.setBorder(javax.swing.BorderFactory
														.createMatteBorder(
																2,
																2,
																2,
																2,
																new java.awt.Color(
																		255,
																		153, 0)));
										break;
									case 3:
										lingdi2
												.setBorder(javax.swing.BorderFactory
														.createMatteBorder(
																2,
																2,
																2,
																2,
																new java.awt.Color(
																		51,
																		102,
																		255)));
										break;
									case 4:
										lingdi2
												.setBorder(javax.swing.BorderFactory
														.createMatteBorder(
																2,
																2,
																2,
																2,
																new java.awt.Color(
																		255,
																		255, 0)));
										break;
									}
									break;
								case 3:
									lingdi3.setIcon(new javax.swing.ImageIcon(
											getClass().getResource(
													"/map/1级.png")));
									// 改变边框颜色
									switch (id) {
									case 1:
										lingdi3
												.setBorder(javax.swing.BorderFactory
														.createMatteBorder(
																2,
																2,
																2,
																2,
																new java.awt.Color(
																		0, 255,
																		102)));
										break;
									case 2:
										lingdi3
												.setBorder(javax.swing.BorderFactory
														.createMatteBorder(
																2,
																2,
																2,
																2,
																new java.awt.Color(
																		255,
																		153, 0)));
										break;
									case 3:
										lingdi3
												.setBorder(javax.swing.BorderFactory
														.createMatteBorder(
																2,
																2,
																2,
																2,
																new java.awt.Color(
																		51,
																		102,
																		255)));
										break;
									case 4:
										lingdi3
												.setBorder(javax.swing.BorderFactory
														.createMatteBorder(
																2,
																2,
																2,
																2,
																new java.awt.Color(
																		255,
																		255, 0)));
										break;
									}
									break;
								case 4:
									lingdi4.setIcon(new javax.swing.ImageIcon(
											getClass().getResource(
													"/map/1级.png")));
									// 改变边框颜色
									switch (id) {
									case 1:
										lingdi4
												.setBorder(javax.swing.BorderFactory
														.createMatteBorder(
																2,
																2,
																2,
																2,
																new java.awt.Color(
																		0, 255,
																		102)));
										break;
									case 2:
										lingdi4
												.setBorder(javax.swing.BorderFactory
														.createMatteBorder(
																2,
																2,
																2,
																2,
																new java.awt.Color(
																		255,
																		153, 0)));
										break;
									case 3:
										lingdi4
												.setBorder(javax.swing.BorderFactory
														.createMatteBorder(
																2,
																2,
																2,
																2,
																new java.awt.Color(
																		51,
																		102,
																		255)));
										break;
									case 4:
										lingdi4
												.setBorder(javax.swing.BorderFactory
														.createMatteBorder(
																2,
																2,
																2,
																2,
																new java.awt.Color(
																		255,
																		255, 0)));
										break;
									}
									break;
								case 5:
									lingdi5.setIcon(new javax.swing.ImageIcon(
											getClass().getResource(
													"/map/1级.png")));
									// 改变边框颜色
									switch (id) {
									case 1:
										lingdi5
												.setBorder(javax.swing.BorderFactory
														.createMatteBorder(
																2,
																2,
																2,
																2,
																new java.awt.Color(
																		0, 255,
																		102)));
										break;
									case 2:
										lingdi5
												.setBorder(javax.swing.BorderFactory
														.createMatteBorder(
																2,
																2,
																2,
																2,
																new java.awt.Color(
																		255,
																		153, 0)));
										break;
									case 3:
										lingdi5
												.setBorder(javax.swing.BorderFactory
														.createMatteBorder(
																2,
																2,
																2,
																2,
																new java.awt.Color(
																		51,
																		102,
																		255)));
										break;
									case 4:
										lingdi5
												.setBorder(javax.swing.BorderFactory
														.createMatteBorder(
																2,
																2,
																2,
																2,
																new java.awt.Color(
																		255,
																		255, 0)));
										break;
									}
									break;
								case 7:
									lingdi7.setIcon(new javax.swing.ImageIcon(
											getClass().getResource(
													"/map/1级.png")));
									// 改变边框颜色
									switch (id) {
									case 1:
										lingdi7
												.setBorder(javax.swing.BorderFactory
														.createMatteBorder(
																2,
																2,
																2,
																2,
																new java.awt.Color(
																		0, 255,
																		102)));
										break;
									case 2:
										lingdi7
												.setBorder(javax.swing.BorderFactory
														.createMatteBorder(
																2,
																2,
																2,
																2,
																new java.awt.Color(
																		255,
																		153, 0)));
										break;
									case 3:
										lingdi7
												.setBorder(javax.swing.BorderFactory
														.createMatteBorder(
																2,
																2,
																2,
																2,
																new java.awt.Color(
																		51,
																		102,
																		255)));
										break;
									case 4:
										lingdi7
												.setBorder(javax.swing.BorderFactory
														.createMatteBorder(
																2,
																2,
																2,
																2,
																new java.awt.Color(
																		255,
																		255, 0)));
										break;
									}
									break;
								case 8:
									lingdi8.setIcon(new javax.swing.ImageIcon(
											getClass().getResource(
													"/map/1级.png")));
									// 改变边框颜色
									switch (id) {
									case 1:
										lingdi8
												.setBorder(javax.swing.BorderFactory
														.createMatteBorder(
																2,
																2,
																2,
																2,
																new java.awt.Color(
																		0, 255,
																		102)));
										break;
									case 2:
										lingdi8
												.setBorder(javax.swing.BorderFactory
														.createMatteBorder(
																2,
																2,
																2,
																2,
																new java.awt.Color(
																		255,
																		153, 0)));
										break;
									case 3:
										lingdi8
												.setBorder(javax.swing.BorderFactory
														.createMatteBorder(
																2,
																2,
																2,
																2,
																new java.awt.Color(
																		51,
																		102,
																		255)));
										break;
									case 4:
										lingdi8
												.setBorder(javax.swing.BorderFactory
														.createMatteBorder(
																2,
																2,
																2,
																2,
																new java.awt.Color(
																		255,
																		255, 0)));
										break;
									}
									break;
								case 9:
									lingdi9.setIcon(new javax.swing.ImageIcon(
											getClass().getResource(
													"/map/1级.png")));
									// 改变边框颜色
									switch (id) {
									case 1:
										lingdi9
												.setBorder(javax.swing.BorderFactory
														.createMatteBorder(
																2,
																2,
																2,
																2,
																new java.awt.Color(
																		0, 255,
																		102)));
										break;
									case 2:
										lingdi9
												.setBorder(javax.swing.BorderFactory
														.createMatteBorder(
																2,
																2,
																2,
																2,
																new java.awt.Color(
																		255,
																		153, 0)));
										break;
									case 3:
										lingdi9
												.setBorder(javax.swing.BorderFactory
														.createMatteBorder(
																2,
																2,
																2,
																2,
																new java.awt.Color(
																		51,
																		102,
																		255)));
										break;
									case 4:
										lingdi9
												.setBorder(javax.swing.BorderFactory
														.createMatteBorder(
																2,
																2,
																2,
																2,
																new java.awt.Color(
																		255,
																		255, 0)));
										break;
									}
									break;
								case 11:
									lingdi11.setIcon(new javax.swing.ImageIcon(
											getClass().getResource(
													"/map/1级.png")));
									// 改变边框颜色
									switch (id) {
									case 1:
										lingdi11
												.setBorder(javax.swing.BorderFactory
														.createMatteBorder(
																2,
																2,
																2,
																2,
																new java.awt.Color(
																		0, 255,
																		102)));
										break;
									case 2:
										lingdi11
												.setBorder(javax.swing.BorderFactory
														.createMatteBorder(
																2,
																2,
																2,
																2,
																new java.awt.Color(
																		255,
																		153, 0)));
										break;
									case 3:
										lingdi11
												.setBorder(javax.swing.BorderFactory
														.createMatteBorder(
																2,
																2,
																2,
																2,
																new java.awt.Color(
																		51,
																		102,
																		255)));
										break;
									case 4:
										lingdi11
												.setBorder(javax.swing.BorderFactory
														.createMatteBorder(
																2,
																2,
																2,
																2,
																new java.awt.Color(
																		255,
																		255, 0)));
										break;
									}
									break;
								case 12:
									lingdi12.setIcon(new javax.swing.ImageIcon(
											getClass().getResource(
													"/map/1级.png")));
									// 改变边框颜色
									switch (id) {
									case 1:
										lingdi12
												.setBorder(javax.swing.BorderFactory
														.createMatteBorder(
																2,
																2,
																2,
																2,
																new java.awt.Color(
																		0, 255,
																		102)));
										break;
									case 2:
										lingdi12
												.setBorder(javax.swing.BorderFactory
														.createMatteBorder(
																2,
																2,
																2,
																2,
																new java.awt.Color(
																		255,
																		153, 0)));
										break;
									case 3:
										lingdi12
												.setBorder(javax.swing.BorderFactory
														.createMatteBorder(
																2,
																2,
																2,
																2,
																new java.awt.Color(
																		51,
																		102,
																		255)));
										break;
									case 4:
										lingdi12
												.setBorder(javax.swing.BorderFactory
														.createMatteBorder(
																2,
																2,
																2,
																2,
																new java.awt.Color(
																		255,
																		255, 0)));
										break;
									}
									break;
								case 13:
									lingdi13.setIcon(new javax.swing.ImageIcon(
											getClass().getResource(
													"/map/1级.png")));
									// 改变边框颜色
									switch (id) {
									case 1:
										lingdi13
												.setBorder(javax.swing.BorderFactory
														.createMatteBorder(
																2,
																2,
																2,
																2,
																new java.awt.Color(
																		0, 255,
																		102)));
										break;
									case 2:
										lingdi13
												.setBorder(javax.swing.BorderFactory
														.createMatteBorder(
																2,
																2,
																2,
																2,
																new java.awt.Color(
																		255,
																		153, 0)));
										break;
									case 3:
										lingdi13
												.setBorder(javax.swing.BorderFactory
														.createMatteBorder(
																2,
																2,
																2,
																2,
																new java.awt.Color(
																		51,
																		102,
																		255)));
										break;
									case 4:
										lingdi13
												.setBorder(javax.swing.BorderFactory
														.createMatteBorder(
																2,
																2,
																2,
																2,
																new java.awt.Color(
																		255,
																		255, 0)));
										break;
									}
									break;
								case 15:
									lingdi15.setIcon(new javax.swing.ImageIcon(
											getClass().getResource(
													"/map/1级.png")));
									// 改变边框颜色
									switch (id) {
									case 1:
										lingdi15
												.setBorder(javax.swing.BorderFactory
														.createMatteBorder(
																2,
																2,
																2,
																2,
																new java.awt.Color(
																		0, 255,
																		102)));
										break;
									case 2:
										lingdi15
												.setBorder(javax.swing.BorderFactory
														.createMatteBorder(
																2,
																2,
																2,
																2,
																new java.awt.Color(
																		255,
																		153, 0)));
										break;
									case 3:
										lingdi15
												.setBorder(javax.swing.BorderFactory
														.createMatteBorder(
																2,
																2,
																2,
																2,
																new java.awt.Color(
																		51,
																		102,
																		255)));
										break;
									case 4:
										lingdi15
												.setBorder(javax.swing.BorderFactory
														.createMatteBorder(
																2,
																2,
																2,
																2,
																new java.awt.Color(
																		255,
																		255, 0)));
										break;
									}
									break;
								case 16:
									lingdi16.setIcon(new javax.swing.ImageIcon(
											getClass().getResource(
													"/map/1级.png")));
									// 改变边框颜色
									switch (id) {
									case 1:
										lingdi16
												.setBorder(javax.swing.BorderFactory
														.createMatteBorder(
																2,
																2,
																2,
																2,
																new java.awt.Color(
																		0, 255,
																		102)));
										break;
									case 2:
										lingdi16
												.setBorder(javax.swing.BorderFactory
														.createMatteBorder(
																2,
																2,
																2,
																2,
																new java.awt.Color(
																		255,
																		153, 0)));
										break;
									case 3:
										lingdi16
												.setBorder(javax.swing.BorderFactory
														.createMatteBorder(
																2,
																2,
																2,
																2,
																new java.awt.Color(
																		51,
																		102,
																		255)));
										break;
									case 4:
										lingdi16
												.setBorder(javax.swing.BorderFactory
														.createMatteBorder(
																2,
																2,
																2,
																2,
																new java.awt.Color(
																		255,
																		255, 0)));
										break;
									}
									break;
								case 17:
									lingdi17.setIcon(new javax.swing.ImageIcon(
											getClass().getResource(
													"/map/1级.png")));
									// 改变边框颜色
									switch (id) {
									case 1:
										lingdi17
												.setBorder(javax.swing.BorderFactory
														.createMatteBorder(
																2,
																2,
																2,
																2,
																new java.awt.Color(
																		0, 255,
																		102)));
										break;
									case 2:
										lingdi17
												.setBorder(javax.swing.BorderFactory
														.createMatteBorder(
																2,
																2,
																2,
																2,
																new java.awt.Color(
																		255,
																		153, 0)));
										break;
									case 3:
										lingdi17
												.setBorder(javax.swing.BorderFactory
														.createMatteBorder(
																2,
																2,
																2,
																2,
																new java.awt.Color(
																		51,
																		102,
																		255)));
										break;
									case 4:
										lingdi17
												.setBorder(javax.swing.BorderFactory
														.createMatteBorder(
																2,
																2,
																2,
																2,
																new java.awt.Color(
																		255,
																		255, 0)));
										break;
									}
									break;
								case 19:
									lingdi19.setIcon(new javax.swing.ImageIcon(
											getClass().getResource(
													"/map/1级.png")));
									// 改变边框颜色
									switch (id) {
									case 1:
										lingdi19
												.setBorder(javax.swing.BorderFactory
														.createMatteBorder(
																2,
																2,
																2,
																2,
																new java.awt.Color(
																		0, 255,
																		102)));
										break;
									case 2:
										lingdi19
												.setBorder(javax.swing.BorderFactory
														.createMatteBorder(
																2,
																2,
																2,
																2,
																new java.awt.Color(
																		255,
																		153, 0)));
										break;
									case 3:
										lingdi19
												.setBorder(javax.swing.BorderFactory
														.createMatteBorder(
																2,
																2,
																2,
																2,
																new java.awt.Color(
																		51,
																		102,
																		255)));
										break;
									case 4:
										lingdi19
												.setBorder(javax.swing.BorderFactory
														.createMatteBorder(
																2,
																2,
																2,
																2,
																new java.awt.Color(
																		255,
																		255, 0)));
										break;
									}
									break;
								case 21:
									lingdi21.setIcon(new javax.swing.ImageIcon(
											getClass().getResource(
													"/map/1级.png")));
									// 改变边框颜色
									switch (id) {
									case 1:
										lingdi21
												.setBorder(javax.swing.BorderFactory
														.createMatteBorder(
																2,
																2,
																2,
																2,
																new java.awt.Color(
																		0, 255,
																		102)));
										break;
									case 2:
										lingdi21
												.setBorder(javax.swing.BorderFactory
														.createMatteBorder(
																2,
																2,
																2,
																2,
																new java.awt.Color(
																		255,
																		153, 0)));
										break;
									case 3:
										lingdi21
												.setBorder(javax.swing.BorderFactory
														.createMatteBorder(
																2,
																2,
																2,
																2,
																new java.awt.Color(
																		51,
																		102,
																		255)));
										break;
									case 4:
										lingdi21
												.setBorder(javax.swing.BorderFactory
														.createMatteBorder(
																2,
																2,
																2,
																2,
																new java.awt.Color(
																		255,
																		255, 0)));
										break;
									}
									break;
								case 23:
									lingdi23.setIcon(new javax.swing.ImageIcon(
											getClass().getResource(
													"/map/1级.png")));
									// 改变边框颜色
									switch (id) {
									case 1:
										lingdi23
												.setBorder(javax.swing.BorderFactory
														.createMatteBorder(
																2,
																2,
																2,
																2,
																new java.awt.Color(
																		0, 255,
																		102)));
										break;
									case 2:
										lingdi23
												.setBorder(javax.swing.BorderFactory
														.createMatteBorder(
																2,
																2,
																2,
																2,
																new java.awt.Color(
																		255,
																		153, 0)));
										break;
									case 3:
										lingdi23
												.setBorder(javax.swing.BorderFactory
														.createMatteBorder(
																2,
																2,
																2,
																2,
																new java.awt.Color(
																		51,
																		102,
																		255)));
										break;
									case 4:
										lingdi23
												.setBorder(javax.swing.BorderFactory
														.createMatteBorder(
																2,
																2,
																2,
																2,
																new java.awt.Color(
																		255,
																		255, 0)));
										break;
									}
									break;
								case 24:
									lingdi24.setIcon(new javax.swing.ImageIcon(
											getClass().getResource(
													"/map/1级.png")));
									// 改变边框颜色
									switch (id) {
									case 1:
										lingdi24
												.setBorder(javax.swing.BorderFactory
														.createMatteBorder(
																2,
																2,
																2,
																2,
																new java.awt.Color(
																		0, 255,
																		102)));
										break;
									case 2:
										lingdi24
												.setBorder(javax.swing.BorderFactory
														.createMatteBorder(
																2,
																2,
																2,
																2,
																new java.awt.Color(
																		255,
																		153, 0)));
										break;
									case 3:
										lingdi24
												.setBorder(javax.swing.BorderFactory
														.createMatteBorder(
																2,
																2,
																2,
																2,
																new java.awt.Color(
																		51,
																		102,
																		255)));
										break;
									case 4:
										lingdi24
												.setBorder(javax.swing.BorderFactory
														.createMatteBorder(
																2,
																2,
																2,
																2,
																new java.awt.Color(
																		255,
																		255, 0)));
										break;
									}
									break;
								case 26:
									lingdi26.setIcon(new javax.swing.ImageIcon(
											getClass().getResource(
													"/map/1级.png")));
									// 改变边框颜色
									switch (id) {
									case 1:
										lingdi26
												.setBorder(javax.swing.BorderFactory
														.createMatteBorder(
																2,
																2,
																2,
																2,
																new java.awt.Color(
																		0, 255,
																		102)));
										break;
									case 2:
										lingdi26
												.setBorder(javax.swing.BorderFactory
														.createMatteBorder(
																2,
																2,
																2,
																2,
																new java.awt.Color(
																		255,
																		153, 0)));
										break;
									case 3:
										lingdi26
												.setBorder(javax.swing.BorderFactory
														.createMatteBorder(
																2,
																2,
																2,
																2,
																new java.awt.Color(
																		51,
																		102,
																		255)));
										break;
									case 4:
										lingdi26
												.setBorder(javax.swing.BorderFactory
														.createMatteBorder(
																2,
																2,
																2,
																2,
																new java.awt.Color(
																		255,
																		255, 0)));
										break;
									}
									break;
								case 27:
									lingdi27.setIcon(new javax.swing.ImageIcon(
											getClass().getResource(
													"/map/1级.png")));
									// 改变边框颜色
									switch (id) {
									case 1:
										lingdi27
												.setBorder(javax.swing.BorderFactory
														.createMatteBorder(
																2,
																2,
																2,
																2,
																new java.awt.Color(
																		0, 255,
																		102)));
										break;
									case 2:
										lingdi27
												.setBorder(javax.swing.BorderFactory
														.createMatteBorder(
																2,
																2,
																2,
																2,
																new java.awt.Color(
																		255,
																		153, 0)));
										break;
									case 3:
										lingdi27
												.setBorder(javax.swing.BorderFactory
														.createMatteBorder(
																2,
																2,
																2,
																2,
																new java.awt.Color(
																		51,
																		102,
																		255)));
										break;
									case 4:
										lingdi27
												.setBorder(javax.swing.BorderFactory
														.createMatteBorder(
																2,
																2,
																2,
																2,
																new java.awt.Color(
																		255,
																		255, 0)));
										break;
									}
									break;

								}
								// 点击“是”后执行这个代码块
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
						if (type == 2 && money > 1000) {
							// 2代表人机
							GameFunction.landUp(money, level, orders, position);
							if (level + 1 == 2) {
								switch (position) {
								case 2:
									lingdi2.setIcon(new javax.swing.ImageIcon(
											getClass().getResource(
													"/map/2级.png")));
									break;
								case 3:
									lingdi3.setIcon(new javax.swing.ImageIcon(
											getClass().getResource(
													"/map/2级.png")));
									break;
								case 4:
									lingdi4.setIcon(new javax.swing.ImageIcon(
											getClass().getResource(
													"/map/2级.png")));
									break;
								case 5:
									lingdi5.setIcon(new javax.swing.ImageIcon(
											getClass().getResource(
													"/map/2级.png")));
									break;
								case 7:
									lingdi7.setIcon(new javax.swing.ImageIcon(
											getClass().getResource(
													"/map/2级.png")));
									break;
								case 8:
									lingdi8.setIcon(new javax.swing.ImageIcon(
											getClass().getResource(
													"/map/2级.png")));
									break;
								case 9:
									lingdi9.setIcon(new javax.swing.ImageIcon(
											getClass().getResource(
													"/map/2级.png")));
									break;
								case 11:
									lingdi11.setIcon(new javax.swing.ImageIcon(
											getClass().getResource(
													"/map/2级.png")));
									break;
								case 12:
									lingdi12.setIcon(new javax.swing.ImageIcon(
											getClass().getResource(
													"/map/2级.png")));
									break;
								case 13:
									lingdi13.setIcon(new javax.swing.ImageIcon(
											getClass().getResource(
													"/map/2级.png")));
									break;
								case 15:
									lingdi15.setIcon(new javax.swing.ImageIcon(
											getClass().getResource(
													"/map/2级.png")));
									break;
								case 16:
									lingdi16.setIcon(new javax.swing.ImageIcon(
											getClass().getResource(
													"/map/2级.png")));
									break;
								case 17:
									lingdi17.setIcon(new javax.swing.ImageIcon(
											getClass().getResource(
													"/map/2级.png")));
									break;
								case 19:
									lingdi19.setIcon(new javax.swing.ImageIcon(
											getClass().getResource(
													"/map/2级.png")));
									break;
								case 21:
									lingdi21.setIcon(new javax.swing.ImageIcon(
											getClass().getResource(
													"/map/2级.png")));
									break;
								case 23:
									lingdi23.setIcon(new javax.swing.ImageIcon(
											getClass().getResource(
													"/map/2级.png")));
									break;
								case 24:
									lingdi24.setIcon(new javax.swing.ImageIcon(
											getClass().getResource(
													"/map/2级.png")));
									break;
								case 26:
									lingdi26.setIcon(new javax.swing.ImageIcon(
											getClass().getResource(
													"/map/2级.png")));
									break;
								case 27:
									lingdi27.setIcon(new javax.swing.ImageIcon(
											getClass().getResource(
													"/map/2级.png")));
									break;

								}
							}
							if (level + 1 == 3) {
								switch (position) {
								case 2:
									lingdi2.setIcon(new javax.swing.ImageIcon(
											getClass().getResource(
													"/map/3级.png")));
									break;
								case 3:
									lingdi3.setIcon(new javax.swing.ImageIcon(
											getClass().getResource(
													"/map/3级.png")));
									break;
								case 4:
									lingdi4.setIcon(new javax.swing.ImageIcon(
											getClass().getResource(
													"/map/3级.png")));
									break;
								case 5:
									lingdi5.setIcon(new javax.swing.ImageIcon(
											getClass().getResource(
													"/map/3级.png")));
									break;
								case 7:
									lingdi7.setIcon(new javax.swing.ImageIcon(
											getClass().getResource(
													"/map/3级.png")));
									break;
								case 8:
									lingdi8.setIcon(new javax.swing.ImageIcon(
											getClass().getResource(
													"/map/3级.png")));
									break;
								case 9:
									lingdi9.setIcon(new javax.swing.ImageIcon(
											getClass().getResource(
													"/map/3级.png")));
									break;
								case 11:
									lingdi11.setIcon(new javax.swing.ImageIcon(
											getClass().getResource(
													"/map/3级.png")));
									break;
								case 12:
									lingdi12.setIcon(new javax.swing.ImageIcon(
											getClass().getResource(
													"/map/3级.png")));
									break;
								case 13:
									lingdi13.setIcon(new javax.swing.ImageIcon(
											getClass().getResource(
													"/map/3级.png")));
									break;
								case 15:
									lingdi15.setIcon(new javax.swing.ImageIcon(
											getClass().getResource(
													"/map/3级.png")));
									break;
								case 16:
									lingdi16.setIcon(new javax.swing.ImageIcon(
											getClass().getResource(
													"/map/3级.png")));
									break;
								case 17:
									lingdi17.setIcon(new javax.swing.ImageIcon(
											getClass().getResource(
													"/map/3级.png")));
									break;
								case 19:
									lingdi19.setIcon(new javax.swing.ImageIcon(
											getClass().getResource(
													"/map/3级.png")));
									break;
								case 21:
									lingdi21.setIcon(new javax.swing.ImageIcon(
											getClass().getResource(
													"/map/3级.png")));
									break;
								case 23:
									lingdi23.setIcon(new javax.swing.ImageIcon(
											getClass().getResource(
													"/map/3级.png")));
									break;
								case 24:
									lingdi24.setIcon(new javax.swing.ImageIcon(
											getClass().getResource(
													"/map/3级.png")));
									break;
								case 26:
									lingdi26.setIcon(new javax.swing.ImageIcon(
											getClass().getResource(
													"/map/3级.png")));
									break;
								case 27:
									lingdi27.setIcon(new javax.swing.ImageIcon(
											getClass().getResource(
													"/map/3级.png")));
									break;

								}
							}
						} else {

							int res = JOptionPane
									.showConfirmDialog(null, "是否升级领地", "升级领地",
											JOptionPane.YES_NO_OPTION);
							if (res == JOptionPane.YES_OPTION && money > 1000) {
								GameFunction.landUp(money, orders, level,
										position);
								if (level + 1 == 2) {
									switch (position) {
									case 2:
										lingdi2
												.setIcon(new javax.swing.ImageIcon(
														getClass().getResource(
																"/map/2级.png")));
										break;
									case 3:
										lingdi3
												.setIcon(new javax.swing.ImageIcon(
														getClass().getResource(
																"/map/2级.png")));
										break;
									case 4:
										lingdi4
												.setIcon(new javax.swing.ImageIcon(
														getClass().getResource(
																"/map/2级.png")));
										break;
									case 5:
										lingdi5
												.setIcon(new javax.swing.ImageIcon(
														getClass().getResource(
																"/map/2级.png")));
										break;
									case 7:
										lingdi7
												.setIcon(new javax.swing.ImageIcon(
														getClass().getResource(
																"/map/2级.png")));
										break;
									case 8:
										lingdi8
												.setIcon(new javax.swing.ImageIcon(
														getClass().getResource(
																"/map/2级.png")));
										break;
									case 9:
										lingdi9
												.setIcon(new javax.swing.ImageIcon(
														getClass().getResource(
																"/map/2级.png")));
										break;
									case 11:
										lingdi11
												.setIcon(new javax.swing.ImageIcon(
														getClass().getResource(
																"/map/2级.png")));
										break;
									case 12:
										lingdi12
												.setIcon(new javax.swing.ImageIcon(
														getClass().getResource(
																"/map/2级.png")));
										break;
									case 13:
										lingdi13
												.setIcon(new javax.swing.ImageIcon(
														getClass().getResource(
																"/map/2级.png")));
										break;
									case 15:
										lingdi15
												.setIcon(new javax.swing.ImageIcon(
														getClass().getResource(
																"/map/2级.png")));
										break;
									case 16:
										lingdi16
												.setIcon(new javax.swing.ImageIcon(
														getClass().getResource(
																"/map/2级.png")));
										break;
									case 17:
										lingdi17
												.setIcon(new javax.swing.ImageIcon(
														getClass().getResource(
																"/map/2级.png")));
										break;
									case 19:
										lingdi19
												.setIcon(new javax.swing.ImageIcon(
														getClass().getResource(
																"/map/2级.png")));
										break;
									case 21:
										lingdi21
												.setIcon(new javax.swing.ImageIcon(
														getClass().getResource(
																"/map/2级.png")));
										break;
									case 23:
										lingdi23
												.setIcon(new javax.swing.ImageIcon(
														getClass().getResource(
																"/map/2级.png")));
										break;
									case 24:
										lingdi24
												.setIcon(new javax.swing.ImageIcon(
														getClass().getResource(
																"/map/2级.png")));
										break;
									case 26:
										lingdi26
												.setIcon(new javax.swing.ImageIcon(
														getClass().getResource(
																"/map/2级.png")));
										break;
									case 27:
										lingdi27
												.setIcon(new javax.swing.ImageIcon(
														getClass().getResource(
																"/map/2级.png")));
										break;

									}
								}
								if (level + 1 == 3) {
									switch (position) {
									case 2:
										lingdi2
												.setIcon(new javax.swing.ImageIcon(
														getClass().getResource(
																"/map/3级.png")));
										break;
									case 3:
										lingdi3
												.setIcon(new javax.swing.ImageIcon(
														getClass().getResource(
																"/map/3级.png")));
										break;
									case 4:
										lingdi4
												.setIcon(new javax.swing.ImageIcon(
														getClass().getResource(
																"/map/3级.png")));
										break;
									case 5:
										lingdi5
												.setIcon(new javax.swing.ImageIcon(
														getClass().getResource(
																"/map/3级.png")));
										break;
									case 7:
										lingdi7
												.setIcon(new javax.swing.ImageIcon(
														getClass().getResource(
																"/map/3级.png")));
										break;
									case 8:
										lingdi8
												.setIcon(new javax.swing.ImageIcon(
														getClass().getResource(
																"/map/3级.png")));
										break;
									case 9:
										lingdi9
												.setIcon(new javax.swing.ImageIcon(
														getClass().getResource(
																"/map/3级.png")));
										break;
									case 11:
										lingdi11
												.setIcon(new javax.swing.ImageIcon(
														getClass().getResource(
																"/map/3级.png")));
										break;
									case 12:
										lingdi12
												.setIcon(new javax.swing.ImageIcon(
														getClass().getResource(
																"/map/3级.png")));
										break;
									case 13:
										lingdi13
												.setIcon(new javax.swing.ImageIcon(
														getClass().getResource(
																"/map/3级.png")));
										break;
									case 15:
										lingdi15
												.setIcon(new javax.swing.ImageIcon(
														getClass().getResource(
																"/map/3级.png")));
										break;
									case 16:
										lingdi16
												.setIcon(new javax.swing.ImageIcon(
														getClass().getResource(
																"/map/3级.png")));
										break;
									case 17:
										lingdi17
												.setIcon(new javax.swing.ImageIcon(
														getClass().getResource(
																"/map/3级.png")));
										break;
									case 19:
										lingdi19
												.setIcon(new javax.swing.ImageIcon(
														getClass().getResource(
																"/map/3级.png")));
										break;
									case 21:
										lingdi21
												.setIcon(new javax.swing.ImageIcon(
														getClass().getResource(
																"/map/3级.png")));
										break;
									case 23:
										lingdi23
												.setIcon(new javax.swing.ImageIcon(
														getClass().getResource(
																"/map/3级.png")));
										break;
									case 24:
										lingdi24
												.setIcon(new javax.swing.ImageIcon(
														getClass().getResource(
																"/map/3级.png")));
										break;
									case 26:
										lingdi26
												.setIcon(new javax.swing.ImageIcon(
														getClass().getResource(
																"/map/3级.png")));
										break;
									case 27:
										lingdi27
												.setIcon(new javax.swing.ImageIcon(
														getClass().getResource(
																"/map/3级.png")));
										break;

									}
								}
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
						GameFunction.landFine(orders, position);
						//罚钱弹窗
						int ownerid = 0;
						String sqlownerid = "select id from player where orders = "
								+ owner;
						rs = sta.executeQuery(sqlownerid);
						if (rs.next()) {
							ownerid = rs.getInt("id");
						}
						if (level == 1) {
							JOptionPane.showMessageDialog(null, "角色" + id
									+ "被角色" + ownerid + "奴役" + 1000 + "兵力",
									"奴役兵力", JOptionPane.PLAIN_MESSAGE);
						}
						if (level == 2) {
							JOptionPane.showMessageDialog(null, "角色" + id
									+ "被角色" + ownerid + "奴役" + 1000 + "兵力",
									"奴役兵力", JOptionPane.PLAIN_MESSAGE);
						}
						if (level == 3) {
							JOptionPane.showMessageDialog(null, "角色" + id
									+ "被角色" + ownerid + "奴役" + 3000 + "兵力",
									"奴役兵力", JOptionPane.PLAIN_MESSAGE);
						}

					}

				}

				if (!GameFunction.landSearch(1)) {
					System.out.println("无房子");
				}
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			// 检测房子结束
			// 输赢判断
			int change = new mapFrame2().change;
			switch (change) {
			case 2:
				int result1 = new Sql().getOneOut(orders);
				if (result1 == 1) {
					System.out.println(orders);
					System.out.println("你还活着");
					int result11 = new Sql().getOut1(orders);
					if (result11 == 1) {
						System.out.println("无人胜利");
					} else if (result11 == 2) {
						endTime = (System.currentTimeMillis() - new mapFrame2().startTime) / 60000;
						int liveTime = new Long(endTime).intValue();
						new GameFunction().setTime(liveTime, orders);
						JOptionPane.showMessageDialog(null, orders + "你赢了",
								"奴役兵力", JOptionPane.PLAIN_MESSAGE);
						System.out.println("你赢了");
					}
				} else if (result1 == 2) {
					endTime = (System.currentTimeMillis() - new mapFrame2().startTime) / 60000;
					int liveTime = new Long(endTime).intValue();
					new GameFunction().setTime(liveTime, orders);
					JOptionPane.showMessageDialog(null, orders + "输了", "",
							JOptionPane.PLAIN_MESSAGE);
					System.out.println("你失败了");
				}
				break;
			case 1:
				int result2 = new Sql().getOut2();
				if (result2 == 1) {
					lvbuTime = (System.currentTimeMillis() - new mapFrame2().startTime) / 60000;
					int liveTime = new Long(lvbuTime).intValue();
					new GameFunction().setTime(liveTime, orders);
					System.out.println("吕布胜利");
					JOptionPane.showMessageDialog(null, "你赢了", "",
							JOptionPane.PLAIN_MESSAGE);
				} else if (result2 == 2) {
					sanTime = (System.currentTimeMillis() - new mapFrame2().startTime) / 60000;
					int liveTime = new Long(sanTime).intValue();
					new GameFunction().setTime(liveTime, orders);
					JOptionPane.showMessageDialog(null, "你输了", "",
							JOptionPane.PLAIN_MESSAGE);
					System.out.println("三英胜利");
				} else {
					System.out.println("无人胜利");
				}
				break;
			case 3:
				int result3 = new Sql().getOneOut(orders);
				if (result3 == 1) {
					System.out.println(orders);
					System.out.println("你还活着");
					int result33 = new Sql().getOut1(orders);
					if (result33 == 1) {
						System.out.println("无人胜利");
					} else if (result33 == 2) {
						endTime = (System.currentTimeMillis() - new mapFrame2().startTime) / 60000;
						int liveTime = new Long(endTime).intValue();
						new GameFunction().setTime(liveTime, orders);
						JOptionPane.showMessageDialog(null, orders + "你赢了",
								"奴役兵力", JOptionPane.PLAIN_MESSAGE);
						System.out.println("你赢了");
					}
				} else if (result3 == 2) {
					endTime = (System.currentTimeMillis() - new mapFrame2().startTime) / 60000;
					int liveTime = new Long(endTime).intValue();
					new GameFunction().setTime(liveTime, orders);
					JOptionPane.showMessageDialog(null, orders + "输了", "",
							JOptionPane.PLAIN_MESSAGE);
					System.out.println("你失败了");
				}
				break;
			case 4:
				int result4 = new Sql().getOut2();
				if (result4 == 1) {
					lvbuTime = (System.currentTimeMillis() - new mapFrame2().startTime) / 60000;
					int liveTime = new Long(lvbuTime).intValue();
					new GameFunction().setTime(liveTime, orders);
					JOptionPane.showMessageDialog(null, "吕布赢了", "",
							JOptionPane.PLAIN_MESSAGE);
					System.out.println("吕布胜利");
				} else if (result4 == 2) {
					sanTime = (System.currentTimeMillis() - new mapFrame2().startTime) / 60000;
					int liveTime = new Long(sanTime).intValue();
					new GameFunction().setTime(liveTime, orders);
					JOptionPane.showMessageDialog(null, "三英赢了", "",
							JOptionPane.PLAIN_MESSAGE);
					System.out.println("三英胜利");
				} else {
					System.out.println("无人胜利");
				}
				break;

			}
			try {
				// 检测下一个是不是要停留在原地的玩家
				Sql sqla = new Sql();
				int nextorders = orders + 1;
				if (nextorders > playerNumber) {
					nextorders = 1;
				}
				// 直到有一个是没有停留的玩家才开始摇骰子，并且把有停留的玩家跳过顺序
				System.out.println("下一个玩家：" + nextorders);

				while (true) {
					// 先判断下一个玩家有没有失败，失败直接跳过 换下一个玩家继续检测。没有失败，则判断有没有shop
					if (sqla.getOneOut(nextorders) == 1) {
						System.out.println("下一个可正常运动的玩家" + nextorders);
						System.out.println("下一个玩家的stop："
								+ sqla.getStop(nextorders));
						if (sqla.getStop(nextorders) != 0) {
							int stop = sqla.getStop(nextorders);
							System.out.println(nextorders + "玩家由于stop被跳过");
							--stop;
							sqla.setStop(stop, nextorders);
							nextorders++;
							sqla.setOrders(nextorders);// 直接上传下一个顺序，跳过这个玩家
							if (nextorders > playerNumber) {
								nextorders = 1;
							}
						} else {
							sqla.setOrders(nextorders);
							break;
						}

					}
					// 失败跳过
					if (sqla.getOneOut(nextorders) == 2) {
						System.out.println(nextorders + "玩家由于失败被跳过");
						nextorders++;
						System.out.println("下一个" + nextorders);
						if (nextorders > playerNumber) {
							nextorders = 1;
						}
					}
				}
				// 检测是否为人机
				String sqltype = "select type from player where orders = '"
						+ nextorders + "'";

				sta = conn.createStatement();

				ResultSet rs1 = sta.executeQuery(sqltype);
				int type = 0;
				if (rs1.next()) {
					type = rs1.getInt("type");
				}
				if (type == 2) {
					// 如果是人机，就自动执行方法，跳过点击按钮
					gameround();
				} else {
					jButton30.setEnabled(true);
				}

				if (Integer.parseInt(sqla.getIdMoney(1)) > 0) {
					binglirenwu1.setText(sqla.getIdMoney(1));
				} else {
					binglirenwu1.setText("败北");
				}
				if (Integer.parseInt(sqla.getIdMoney(2)) > 0) {
					binglirenwu2.setText(sqla.getIdMoney(2));
				} else {
					binglirenwu2.setText("败北");
				}
				if (Integer.parseInt(sqla.getIdMoney(3)) > 0) {
					binglirenwu3.setText(sqla.getIdMoney(3));
				} else {
					binglirenwu3.setText("败北");
				}
				if (Integer.parseInt(sqla.getIdMoney(4)) > 0) {
					binglirenwu4.setText(sqla.getIdMoney(4));
				} else {
					binglirenwu4.setText("败北");
				}

			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}

		}
	}

	public static void connection() {

		try {
			Class.forName("com.mysql.jdbc.Driver");
			conn = DriverManager.getConnection(
					"jdbc:mysql://localhost:3306/monopoly", "root", "");
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

	public void refreshimg(int number) {
		/**
		 * 使用换存档的方法
		 */
		Refreshimg a = new Refreshimg(number);
		Thread b = new Thread(a);
		b.start();
	}

	// 读取存档
	class Refreshimg implements Runnable {
		int level = 0;
		int position = 0;
		int owner = 0;
		int map = 0;
		int orders = 0;
		int i = 1;
		int number;

		public Refreshimg(int number) {
			this.number = number;
		}

		@Override
		public void run() {
			// TODO Auto-generated method stub
			try {
				Sql sqla = new Sql();
				//
				sqla.copyRound(number);
				String sql = "select position,level,owner from land where level not in (0)";
				String sql1 = "select map from round";

				// 读取位置
				// 复制地图
				sta = conn.createStatement();
				ResultSet rs = sta.executeQuery(sql1);
				if (rs.next()) {
					map = rs.getInt("map");
				}
				mapChange(map);// 换地图和设置领地坐标
				switch (number) {
				case 1:

					sqla.copyMap(1);
					break;
				case 2:
					sqla.copyMap(2);
					break;
				case 3:
					sqla.copyMap(3);
					break;
				case 4:
					sqla.copyMap(4);
					break;
				}
				sqla.copyPlayer(number);
				// 读取金钱
				binglirenwu1.setText(sqla.getRoleMoney(1));
				binglirenwu2.setText(sqla.getRoleMoney(2));
				binglirenwu3.setText(sqla.getRoleMoney(3));
				binglirenwu4.setText(sqla.getRoleMoney(4));
				 while (i <= 4) {
				position = sqla.getPlayerposition(i);
				String sql2 = "select x,y from land where position = "
						+ position;
				rs = sta.executeQuery(sql2);
				while (rs.next()) {
					x = rs.getInt("x");
					y = rs.getInt("y");
					
				
				switch (i) {
				case 1:
					renwu1.setBounds(x - 15, y - 110, 150, 180);
					break;
				case 2:
					renwu2.setBounds(x - 15, y - 110, 150, 180);
					break;
				case 3:
					renwu3.setBounds(x - 15, y - 110, 150, 180);
					break;
				case 4:
					renwu4.setBounds(x - 15, y - 110, 150, 180);
					break;
				default:
					i++;
				}
				}
				}
				//
				// 读取房子
				rs = sta.executeQuery(sql);
				while (rs.next()) {
					position = rs.getInt("position");
					level = rs.getInt("level");
					owner = rs.getInt("owner");

					switch (position) {
					case 2:
						lingdi2.setIcon(new javax.swing.ImageIcon(getClass()
								.getResource("/map/" + level + "级.png")));
						switch (sqla.getIdbyOrders(owner)) {
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
						switch (sqla.getIdbyOrders(owner)) {
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
						switch (sqla.getIdbyOrders(owner)) {
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
						switch (sqla.getIdbyOrders(owner)) {
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
						switch (sqla.getIdbyOrders(owner)) {
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
						switch (sqla.getIdbyOrders(owner)) {
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
						switch (sqla.getIdbyOrders(owner)) {
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
						switch (sqla.getIdbyOrders(owner)) {
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
						switch (sqla.getIdbyOrders(owner)) {
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
						switch (sqla.getIdbyOrders(owner)) {
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
						switch (sqla.getIdbyOrders(owner)) {
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
						switch (sqla.getIdbyOrders(owner)) {
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
						switch (sqla.getIdbyOrders(owner)) {
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
						switch (sqla.getIdbyOrders(owner)) {
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
						switch (sqla.getIdbyOrders(owner)) {
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
						switch (sqla.getIdbyOrders(owner)) {
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
						switch (sqla.getIdbyOrders(owner)) {
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
						switch (sqla.getIdbyOrders(owner)) {
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
						switch (sqla.getIdbyOrders(owner)) {
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
					// 得到玩家位置
				}
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}

		}
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
					renwu4.setBounds(1220 - 30, 540 - 110, 150, 180);

					lingdi2.setBounds(1150, 680, 104, 91);
					lingdi3.setBounds(1000, 550, 104, 91);
					lingdi4.setBounds(840, 460, 104, 91);
					lingdi5.setBounds(840, 680, 104, 91);
					lingdi7.setBounds(510, 650, 104, 91);
					lingdi8.setBounds(370, 570, 104, 91);
					lingdi9.setBounds(520, 450, 104, 91);
					lingdi11.setBounds(360, 360, 104, 91);
					lingdi12.setBounds(370, 230, 104, 91);
					lingdi13.setBounds(530, 130, 104, 91);
					lingdi15.setBounds(480, 340, 104, 91);
					lingdi16.setBounds(740, 300, 104, 91);
					lingdi17.setBounds(1040, 300, 104, 91);
					lingdi19.setBounds(850, 120, 104, 91);
					lingdi21.setBounds(1040, 80, 104, 91);
					lingdi23.setBounds(1440, 130, 104, 91);
					lingdi24.setBounds(1330, 240, 104, 91);
					lingdi26.setBounds(1740, 350, 104, 91);
					lingdi27.setBounds(1620, 460, 104, 91);
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
					lingdi2.setBounds(1310, 600, 104, 91);
					lingdi3.setBounds(1150, 690, 104, 91);
					lingdi4.setBounds(1000, 590, 104, 91);
					lingdi5.setBounds(840, 690, 104, 91);
					lingdi7.setBounds(370, 590, 104, 91);
					lingdi8.setBounds(680, 590, 104, 91);
					lingdi9.setBounds(530, 490, 104, 91);
					lingdi11.setBounds(230, 280, 104, 91);
					lingdi12.setBounds(380, 160, 104, 91);
					lingdi13.setBounds(530, 60, 104, 91);
					lingdi15.setBounds(30, 270, 104, 91);
					lingdi16.setBounds(690, 380, 104, 91);
					lingdi17.setBounds(850, 470, 104, 91);
					lingdi19.setBounds(640, 280, 104, 91);
					lingdi21.setBounds(1150, 160, 104, 91);
					lingdi23.setBounds(1150, 350, 104, 91);
					lingdi24.setBounds(1470, 160, 104, 91);
					lingdi26.setBounds(1610, 270, 104, 91);
					lingdi27.setBounds(1478, 370, 104, 91);
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
					lingdi2.setBounds(210, 480, 104, 91);
					lingdi3.setBounds(510, 510, 104, 91);
					lingdi4.setBounds(660, 380, 104, 91);
					lingdi5.setBounds(310, 270, 104, 91);
					lingdi7.setBounds(670, 170, 104, 91);
					lingdi8.setBounds(830, 60, 104, 91);
					lingdi9.setBounds(980, 160, 104, 91);
					lingdi11.setBounds(1140, 260, 104, 91);
					lingdi12.setBounds(980, 380, 104, 91);
					lingdi13.setBounds(1290, 390, 104, 91);
					lingdi15.setBounds(1600, 170, 104, 91);
					lingdi16.setBounds(1600, 380, 104, 91);
					lingdi17.setBounds(1450, 490, 104, 91);
					lingdi19.setBounds(1600, 590, 104, 91);
					lingdi21.setBounds(1300, 700, 104, 91);
					lingdi23.setBounds(1140, 590, 104, 91);
					lingdi24.setBounds(980, 500, 104, 91);
					lingdi26.setBounds(690, 590, 104, 91);
					lingdi27.setBounds(830, 690, 104, 91);
				} catch (SQLException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				break;

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
	private javax.swing.JButton jButton2;
	private javax.swing.JButton jButton3;
	private javax.swing.JButton jButton30;
	private javax.swing.JButton jButton4;
	private javax.swing.JLabel jLabel1;
	private javax.swing.JLabel jLabel17;
	private javax.swing.JLabel jLabel2;
	private javax.swing.JLabel jLabel3;
	private javax.swing.JLabel jLabel4;
	private javax.swing.JLabel jLabel5;
	private javax.swing.JLabel jLabel6;
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