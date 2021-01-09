/*
 * loginFrame.java
 *
 * Created on __DATE__, __TIME__
 */

package Frame;

import java.sql.PreparedStatement;
import java.sql.SQLException;

import javax.swing.ImageIcon;
import javax.swing.JOptionPane;

import player.Players;

import run.Sql;

/**
 * 
 * @author __USER__
 */
public class loginFrame extends javax.swing.JFrame {

	/** Creates new form loginFrame */
	public loginFrame() {
		initComponents();
		this.setLocationRelativeTo(null);
		this.setIconImage(new ImageIcon("Í¼Æ¬/logo1.jpg").getImage());
	}

	//GEN-BEGIN:initComponents
	// <editor-fold defaultstate="collapsed" desc="Generated Code">
	private void initComponents() {

		jPanel1 = new javax.swing.JPanel();
		jTextField1 = new javax.swing.JTextField();
		jPasswordField1 = new javax.swing.JPasswordField();
		jButton1 = new javax.swing.JButton();
		jButton2 = new javax.swing.JButton();
		jLabel1 = new javax.swing.JLabel();

		setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

		jPanel1.setLayout(null);

		jTextField1.setFont(new java.awt.Font("ÐÂËÎÌå", 1, 20));
		jTextField1.setHorizontalAlignment(javax.swing.JTextField.CENTER);
		jTextField1.setToolTipText("");
		jTextField1.setBorder(null);
		jTextField1.setOpaque(false);
		jTextField1.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				jTextField1ActionPerformed(evt);
			}
		});
		jPanel1.add(jTextField1);
		jTextField1.setBounds(756, 366, 510, 50);

		jPasswordField1.setFont(new java.awt.Font("ÐÂËÎÌå", 1, 18));
		jPasswordField1.setHorizontalAlignment(javax.swing.JTextField.CENTER);
		jPasswordField1.setBorder(null);
		jPasswordField1.setOpaque(false);
		jPasswordField1.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				jPasswordField1ActionPerformed(evt);
			}
		});
		jPanel1.add(jPasswordField1);
		jPasswordField1.setBounds(760, 486, 500, 50);

		jButton1.setFont(new java.awt.Font("·½Õý×Ö¼£-¶ÅÄ«·É¸Ö±Ê¿¬Êé ¼ò", 1, 24));
		jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource(
				"/images/loginFrame.button.png"))); // NOI18N
		jButton1.setBorder(null);
		jButton1.setContentAreaFilled(false);
		jButton1.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				jButton1ActionPerformed(evt);
			}
		});
		jPanel1.add(jButton1);
		jButton1.setBounds(690, 610, 520, 70);

		jButton2.setIcon(new javax.swing.ImageIcon(getClass().getResource(
				"/images/enter.returnButton.png"))); // NOI18N
		jButton2.setBorder(null);
		jButton2.setContentAreaFilled(false);
		jButton2.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				jButton2ActionPerformed(evt);
			}
		});
		jPanel1.add(jButton2);
		jButton2.setBounds(1680, 20, 180, 70);

		jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource(
				"/images/loginFrame.png"))); // NOI18N
		jPanel1.add(jLabel1);
		jLabel1.setBounds(0, 0, 1873, 970);

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

	private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {
		new mainFrame().setVisible(true);
		setVisible(false);
	}

	private void jTextField1ActionPerformed(java.awt.event.ActionEvent evt) {
		// TODO add your handling code here:
	}

	private void jPasswordField1ActionPerformed(java.awt.event.ActionEvent evt) {
		// TODO add your handling code here:
	}

	private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {
		// TODO add your handling code here:
		try {
			String username = jTextField1.getText();
			String password = jPasswordField1.getText();
			String s = Sql.getUsername(username);
			if (s.equalsIgnoreCase("yes")) {
				if (Sql.getPassword(username).toString().equalsIgnoreCase(
						password)) {
					//·þÎñÆ÷µÇÂ¼º¯Êý±äÎª1

					Sql sql = new Sql();
					sql.setonline(1, jTextField1.getText().toString());
					Players.username = jTextField1.getText().toString();
					//½ÇÉ«º¯Êý±äÎª0
					sql.setRole(0, Players.username);
					new OnlineFrame().setVisible(true);
					setVisible(false);
				} else {
					JOptionPane.showMessageDialog(jPanel1, "ÃÜÂë´íÎó£¡", "µÇÂ¼",
							JOptionPane.WARNING_MESSAGE);
				}
			} else {
				JOptionPane.showMessageDialog(jPanel1, "ÕËºÅ´íÎó£¡", "µÇÂ¼",
						JOptionPane.WARNING_MESSAGE);
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

	/**
	 * @param args
	 *            the command line arguments
	 */

	//GEN-BEGIN:variables
	// Variables declaration - do not modify
	private javax.swing.JButton jButton1;
	private javax.swing.JButton jButton2;
	private javax.swing.JLabel jLabel1;
	private javax.swing.JPanel jPanel1;
	private javax.swing.JPasswordField jPasswordField1;
	private javax.swing.JTextField jTextField1;
	// End of variables declaration//GEN-END:variables

}