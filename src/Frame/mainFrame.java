/*
 * mainFrame.java
 *
 * Created on __DATE__, __TIME__
 */

package Frame;

import java.awt.Cursor;
import java.awt.Image;
import java.awt.Point;
import java.awt.Toolkit;
import java.sql.SQLException;

import javax.swing.ImageIcon;
import javax.swing.JFrame;

import player.Players;

import run.Sql;

/**
 *
 * @author  __USER__
 */
public class mainFrame extends javax.swing.JFrame {

	/** Creates new form mainFrame */
	public mainFrame() {
		initComponents();
		this.setLocationRelativeTo(null);
		this.setIconImage(new ImageIcon("图片/logo1.jpg").getImage());
		this.setCursor(getCursor());
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setVisible(true);
	}

	//GEN-BEGIN:initComponents
	// <editor-fold defaultstate="collapsed" desc="Generated Code">
	private void initComponents() {

		jPanel1 = new javax.swing.JPanel();
		jButton2 = new javax.swing.JButton();
		jButton3 = new javax.swing.JButton();
		jButton4 = new javax.swing.JButton();
		jLabel1 = new javax.swing.JLabel();
		jButton5 = new javax.swing.JButton();
		jButton6 = new javax.swing.JButton();
		jButton7 = new javax.swing.JButton();
		jButton8 = new javax.swing.JButton();
		jButton9 = new javax.swing.JButton();
		jButton10 = new javax.swing.JButton();

		setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
		setTitle("\u4e09\u56fd\u4e89\u9738");
		addWindowListener(new java.awt.event.WindowAdapter() {
			public void windowClosing(java.awt.event.WindowEvent evt) {
				formWindowClosing(evt);
			}
		});

		jPanel1.setLayout(null);

		jButton2.setBackground(new java.awt.Color(255, 255, 255));
		jButton2.setFont(new java.awt.Font("方正字迹-杜墨飞钢笔楷书 简", 1, 24));
		jButton2.setIcon(new javax.swing.ImageIcon(getClass().getResource(
				"/images/online.png"))); // NOI18N
		jButton2.setBorder(null);
		jButton2.setContentAreaFilled(false);
		jButton2.setFocusTraversalPolicyProvider(true);
		jButton2.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				jButton2ActionPerformed(evt);
			}
		});
		jPanel1.add(jButton2);
		jButton2.setBounds(710, 580, 380, 70);

		jButton3.setBackground(new java.awt.Color(255, 255, 255));
		jButton3.setFont(new java.awt.Font("方正字迹-杜墨飞钢笔楷书 简", 1, 24));
		jButton3.setIcon(new javax.swing.ImageIcon(getClass().getResource(
				"/images/AI.png"))); // NOI18N
		jButton3.setBorder(null);
		jButton3.setContentAreaFilled(false);
		jButton3.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				jButton3ActionPerformed(evt);
			}
		});
		jPanel1.add(jButton3);
		jButton3.setBounds(710, 670, 380, 70);

		jButton4.setBackground(new java.awt.Color(255, 255, 255));
		jButton4.setFont(new java.awt.Font("方正字迹-杜墨飞钢笔楷书 简", 1, 24));
		jButton4.setIcon(new javax.swing.ImageIcon(getClass().getResource(
				"/images/story.png"))); // NOI18N
		jButton4.setBorder(null);
		jButton4.setContentAreaFilled(false);
		jButton4.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				jButton4ActionPerformed(evt);
			}
		});
		jPanel1.add(jButton4);
		jButton4.setBounds(710, 760, 380, 70);

		jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource(
				"/images/main.png"))); // NOI18N
		jPanel1.add(jLabel1);
		jLabel1.setBounds(0, 0, 1873, 970);

		jButton5.setBackground(new java.awt.Color(255, 255, 255));
		jButton5.setFont(new java.awt.Font("方正字迹-杜墨飞钢笔楷书 简", 1, 24));
		jButton5.setIcon(new javax.swing.ImageIcon(getClass().getResource(
				"/images/AI.png"))); // NOI18N
		jButton5.setBorder(null);
		jButton5.setContentAreaFilled(false);
		jButton5.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				jButton5ActionPerformed(evt);
			}
		});
		jPanel1.add(jButton5);
		jButton5.setBounds(710, 670, 380, 70);

		jButton6.setBackground(new java.awt.Color(255, 255, 255));
		jButton6.setFont(new java.awt.Font("方正字迹-杜墨飞钢笔楷书 简", 1, 24));
		jButton6.setIcon(new javax.swing.ImageIcon(getClass().getResource(
				"/images/AI.png"))); // NOI18N
		jButton6.setBorder(null);
		jButton6.setContentAreaFilled(false);
		jButton6.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				jButton6ActionPerformed(evt);
			}
		});
		jPanel1.add(jButton6);
		jButton6.setBounds(710, 670, 380, 70);

		jButton7.setBackground(new java.awt.Color(255, 255, 255));
		jButton7.setFont(new java.awt.Font("方正字迹-杜墨飞钢笔楷书 简", 1, 24));
		jButton7.setIcon(new javax.swing.ImageIcon(getClass().getResource(
				"/images/AI.png"))); // NOI18N
		jButton7.setBorder(null);
		jButton7.setContentAreaFilled(false);
		jButton7.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				jButton7ActionPerformed(evt);
			}
		});
		jPanel1.add(jButton7);
		jButton7.setBounds(710, 670, 380, 70);

		jButton8.setBackground(new java.awt.Color(255, 255, 255));
		jButton8.setFont(new java.awt.Font("方正字迹-杜墨飞钢笔楷书 简", 1, 24));
		jButton8.setIcon(new javax.swing.ImageIcon(getClass().getResource(
				"/images/AI.png"))); // NOI18N
		jButton8.setBorder(null);
		jButton8.setContentAreaFilled(false);
		jButton8.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				jButton8ActionPerformed(evt);
			}
		});
		jPanel1.add(jButton8);
		jButton8.setBounds(710, 670, 380, 70);

		jButton9.setBackground(new java.awt.Color(255, 255, 255));
		jButton9.setFont(new java.awt.Font("方正字迹-杜墨飞钢笔楷书 简", 1, 24));
		jButton9.setIcon(new javax.swing.ImageIcon(getClass().getResource(
				"/images/AI.png"))); // NOI18N
		jButton9.setBorder(null);
		jButton9.setContentAreaFilled(false);
		jButton9.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				jButton9ActionPerformed(evt);
			}
		});
		jPanel1.add(jButton9);
		jButton9.setBounds(710, 670, 380, 70);

		jButton10.setBackground(new java.awt.Color(255, 255, 255));
		jButton10.setFont(new java.awt.Font("方正字迹-杜墨飞钢笔楷书 简", 1, 24));
		jButton10.setIcon(new javax.swing.ImageIcon(getClass().getResource(
				"/images/AI.png"))); // NOI18N
		jButton10.setBorder(null);
		jButton10.setContentAreaFilled(false);
		jButton10.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				jButton10ActionPerformed(evt);
			}
		});
		jPanel1.add(jButton10);
		jButton10.setBounds(710, 670, 380, 70);

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

	private void jButton10ActionPerformed(java.awt.event.ActionEvent evt) {
		// TODO add your handling code here:
	}

	private void jButton9ActionPerformed(java.awt.event.ActionEvent evt) {
		// TODO add your handling code here:
	}

	private void jButton8ActionPerformed(java.awt.event.ActionEvent evt) {
		// TODO add your handling code here:
	}

	private void jButton7ActionPerformed(java.awt.event.ActionEvent evt) {
		// TODO add your handling code here:
	}

	private void jButton6ActionPerformed(java.awt.event.ActionEvent evt) {
		// TODO add your handling code here:
	}

	private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {
		// TODO add your handling code here:
	}

	private void formWindowClosing(java.awt.event.WindowEvent evt) {
		// TODO add your handling code here:
	}

	private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {
		// TODO add your handling code here:
		Players.person = 0;
		Sql.connection();
		try {
			Sql.initialization();
			Sql.type();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		new mapFrame2().setVisible(true);
		setVisible(false);
	}

	private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {
		// TODO add your handling code here:
		Sql.connection();
		try {
			Sql.initializationPerson();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		new personFrame().setVisible(true);
		setVisible(false);
	}

	private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {
		try {
			Sql.connectionServer();// 连接数据库
			Sql sql = new Sql();
			/*需要在mainframe上做个判断前端需要在选择单机后再有两个选择 一个
			 * 是继续上传游戏 则不初始化，如果新开始游戏则调用初始化方法
			 */
			sql.initializationServer();
			//给玩家和人机排序,计算出玩家数量
			new enterFrame().setVisible(true);
			setVisible(false);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	//GEN-BEGIN:variables
	// Variables declaration - do not modify
	private javax.swing.JButton jButton10;
	private javax.swing.JButton jButton2;
	private javax.swing.JButton jButton3;
	private javax.swing.JButton jButton4;
	private javax.swing.JButton jButton5;
	private javax.swing.JButton jButton6;
	private javax.swing.JButton jButton7;
	private javax.swing.JButton jButton8;
	private javax.swing.JButton jButton9;
	private javax.swing.JLabel jLabel1;
	private javax.swing.JPanel jPanel1;
	// End of variables declaration//GEN-END:variables

}