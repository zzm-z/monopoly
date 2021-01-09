/*
 * figureFrame.java
 *
 * Created on __DATE__, __TIME__
 */

package Frame;

import java.sql.ResultSet;
import java.sql.SQLException;

import javax.swing.ImageIcon;

import Frame.ServerGameFrame.CheckOrders;

import player.Players;

import run.Sql;

/**
 * 
 * @author __USER__
 */
public class OnlineFrame extends javax.swing.JFrame {
	boolean click1 = false;
	boolean click2 = false;
	boolean click3 = false;
	boolean click4 = false;
	boolean start = true;

	/** Creates new form figureFrame */
	public OnlineFrame() {
		initComponents();
		this.setLocationRelativeTo(null);
		this.setIconImage(new ImageIcon("图片/logo1.jpg").getImage());
		Start s = new Start();
		Thread s2 = new Thread(s);
		s2.start();

	}

	//GEN-BEGIN:initComponents
	// <editor-fold defaultstate="collapsed" desc="Generated Code">
	private void initComponents() {

		jPanel1 = new javax.swing.JPanel();
		jButton1 = new javax.swing.JButton();
		jButton2 = new javax.swing.JButton();
		jButton3 = new javax.swing.JButton();
		jButton4 = new javax.swing.JButton();
		jButton5 = new javax.swing.JButton();
		jButton6 = new javax.swing.JButton();
		jLabel6 = new javax.swing.JLabel();

		setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
		setTitle("\u4e09\u56fd\u5927\u5bcc\u7fc1");
		addWindowListener(new java.awt.event.WindowAdapter() {
			public void windowDeactivated(java.awt.event.WindowEvent evt) {
				formWindowDeactivated(evt);
			}

			public void windowClosing(java.awt.event.WindowEvent evt) {
				formWindowClosing(evt);
			}
		});

		jPanel1.setLayout(null);

		jButton1.setBackground(new java.awt.Color(239, 239, 239));
		jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource(
				"/images/刘备卡牌.png"))); // NOI18N
		jButton1
				.setToolTipText("\u4ec1\u4e49\uff1a\u6bcf\u56de\u5408\u589e\u52a0200\u5175\u529b");
		jButton1.setBorder(null);
		jButton1.setContentAreaFilled(false);
		jButton1.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				jButton1ActionPerformed(evt);
			}
		});
		jPanel1.add(jButton1);
		jButton1.setBounds(80, 400, 219, 319);

		jButton2.setBackground(new java.awt.Color(239, 239, 239));
		jButton2.setIcon(new javax.swing.ImageIcon(getClass().getResource(
				"/images/曹操卡牌.png"))); // NOI18N
		jButton2
				.setToolTipText("\u67ad\u96c4\uff1a\u6bcf\u56de\u5408\u83b7\u5f97\u4e00\u5f20\u5361\u724c ");
		jButton2.setBorder(null);
		jButton2.setContentAreaFilled(false);
		jButton2.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				jButton2ActionPerformed(evt);
			}
		});
		jPanel1.add(jButton2);
		jButton2.setBounds(490, 400, 219, 319);

		jButton3.setBackground(new java.awt.Color(239, 239, 239));
		jButton3.setIcon(new javax.swing.ImageIcon(getClass().getResource(
				"/images/孙权卡牌.png"))); // NOI18N
		jButton3
				.setToolTipText("\u5236\u8861\uff1a\u6bcf\u56de\u5408\u89e6\u53d1\u4e00\u6b21\u968f\u673a\u4e8b\u4ef6 ");
		jButton3.setBorder(null);
		jButton3.setContentAreaFilled(false);
		jButton3.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				jButton3ActionPerformed(evt);
			}
		});
		jPanel1.add(jButton3);
		jButton3.setBounds(1600, 400, 219, 319);

		jButton4.setBackground(new java.awt.Color(239, 239, 239));
		jButton4.setIcon(new javax.swing.ImageIcon(getClass().getResource(
				"/images/董卓卡牌.png"))); // NOI18N
		jButton4
				.setToolTipText("\u8089\u6797\uff1a\u5360\u9886\u57ce\u6c60\u53ef\u4ee5\u51cf\u5c1110%\u7684\u5175\u529b");
		jButton4.setBorder(null);
		jButton4.setContentAreaFilled(false);
		jButton4.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				jButton4ActionPerformed(evt);
			}
		});
		jPanel1.add(jButton4);
		jButton4.setBounds(1250, 400, 219, 319);

		jButton5.setBackground(new java.awt.Color(255, 255, 255));
		jButton5.setFont(new java.awt.Font("方正古隶简体", 1, 36));
		jButton5.setIcon(new javax.swing.ImageIcon(getClass().getResource(
				"/images/online。button.png"))); // NOI18N
		jButton5.setBorder(null);
		jButton5.setContentAreaFilled(false);
		jButton5.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				jButton5ActionPerformed(evt);
			}
		});
		jPanel1.add(jButton5);
		jButton5.setBounds(850, 770, 310, 70);

		jButton6.setIcon(new javax.swing.ImageIcon(getClass().getResource(
				"/images/figure.returnButton.png"))); // NOI18N
		jButton6.setBorder(null);
		jButton6.setContentAreaFilled(false);
		jButton6.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				jButton6ActionPerformed(evt);
			}
		});
		jPanel1.add(jButton6);
		jButton6.setBounds(1632, 30, 183, 70);

		jLabel6.setIcon(new javax.swing.ImageIcon(getClass().getResource(
				"/images/figureFrame.png"))); // NOI18N
		jPanel1.add(jLabel6);
		jLabel6.setBounds(0, 0, 1870, 970);

		javax.swing.GroupLayout layout = new javax.swing.GroupLayout(
				getContentPane());
		getContentPane().setLayout(layout);
		layout.setHorizontalGroup(layout.createParallelGroup(
				javax.swing.GroupLayout.Alignment.LEADING).addComponent(
				jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 1873,
				Short.MAX_VALUE));
		layout.setVerticalGroup(layout.createParallelGroup(
				javax.swing.GroupLayout.Alignment.LEADING).addComponent(
				jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 970,
				Short.MAX_VALUE));

		pack();
	}// </editor-fold>
	//GEN-END:initComponents

	private void jButton6ActionPerformed(java.awt.event.ActionEvent evt) {
		new mainFrame().setVisible(true);
		setVisible(false);
	}

	private void formWindowClosing(java.awt.event.WindowEvent evt) {
		Sql sql = new Sql();
		try {
			sql.setRole(0, Players.username);
			sql.setonline(0, Players.username);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	private void formWindowDeactivated(java.awt.event.WindowEvent evt) {

	}

	private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {
		// TODO add your handling code here:
		Sql sql = new Sql();
		if (click4) {
			jButton1.setVisible(true);
			jButton2.setVisible(true);
			jButton3.setVisible(true);
			jButton4.setVisible(true);
			jButton3.setBounds(1600, 400, 219, 319);
			try {
				sql.setRole(0, Players.username);
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			click4 = false;
		} else {

			if (sql.selectAllRole(4)) {
				try {
					sql.setRole(4, Players.username);
				} catch (SQLException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				jButton2.setVisible(false);
				jButton1.setVisible(false);
				jButton4.setVisible(false);
				jButton3.setBounds(820, 440, 219, 319);
				click4 = true;
			}
		}

	}

	private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {
		// TODO add your handling code here:
		Sql sql = new Sql();
		if (click3) {
			jButton1.setVisible(true);
			jButton2.setVisible(true);
			jButton3.setVisible(true);
			jButton4.setVisible(true);
			jButton4.setBounds(1250, 400, 219, 319);
			click3 = false;
			try {
				sql.setRole(0, Players.username);
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		} else {

			if (sql.selectAllRole(3)) {
				try {
					sql.setRole(3, Players.username);
				} catch (SQLException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				jButton2.setVisible(false);
				jButton3.setVisible(false);
				jButton1.setVisible(false);
				jButton4.setBounds(820, 440, 219, 319);
				click3 = true;
			}
		}

	}

	private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {
		// TODO add your handling code here:
		Sql sql = new Sql();
		if (click2) {
			jButton1.setVisible(true);
			jButton2.setVisible(true);
			jButton3.setVisible(true);
			jButton4.setVisible(true);
			jButton2.setBounds(490, 400, 219, 319);
			click2 = false;
			try {
				sql.setRole(0, Players.username);
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		} else {

			if (sql.selectAllRole(2)) {
				try {
					sql.setRole(2, Players.username);
				} catch (SQLException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				jButton1.setVisible(false);
				jButton3.setVisible(false);
				jButton4.setVisible(false);
				jButton2.setBounds(820, 440, 219, 319);
				click2 = true;
			}
		}

	}

	private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {
		// TODO add your handling code here:

		Sql sql = new Sql();
		if (click1) {
			jButton1.setVisible(true);
			jButton2.setVisible(true);
			jButton3.setVisible(true);
			jButton4.setVisible(true);
			jButton1.setBounds(80, 400, 219, 319);
			click1 = false;
			try {
				sql.setRole(0, Players.username);
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		} else {

			if (sql.selectAllRole(1)) {
				try {
					sql.setRole(1, Players.username);
				} catch (SQLException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				jButton2.setVisible(false);
				jButton3.setVisible(false);
				jButton4.setVisible(false);
				jButton1.setBounds(820, 440, 219, 319);
				click1 = true;
			}
		}

	}

	class Start implements Runnable {

		@Override
		public void run() {
			// TODO Auto-generated method stub
			Sql sql = new Sql();
			while (true) {
				try {

					Thread.sleep(1000);
					if (sql.getstart() == 1 && start) {
						new ServerGameFrame(1).setVisible(true);
						setVisible(false);
						break;
					}
				} catch (Exception e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		}

	}

	private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {
		// TODO add your handling code here:
		new ServerGameFrame(1).setVisible(true);
		Sql sql = new Sql();
		try {
			//为在线的玩家排序

			sql.typeServer();
			sql.setstart(1);
			start = false;//让自己开始的不用再次打开
			//sql.typeServer();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		setVisible(false);
	}

	/**
	 * @param args
	 *            the command line arguments
	 */
	public static void main(String args[]) {
		java.awt.EventQueue.invokeLater(new Runnable() {
			public void run() {
				new OnlineFrame().setVisible(true);
			}
		});
	}

	//GEN-BEGIN:variables
	// Variables declaration - do not modify
	private javax.swing.JButton jButton1;
	private javax.swing.JButton jButton2;
	private javax.swing.JButton jButton3;
	private javax.swing.JButton jButton4;
	private javax.swing.JButton jButton5;
	private javax.swing.JButton jButton6;
	private javax.swing.JLabel jLabel6;
	private javax.swing.JPanel jPanel1;
	// End of variables declaration//GEN-END:variables

}