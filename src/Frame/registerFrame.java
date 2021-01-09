/*
 * registerFrame.java
 *
 * Created on __DATE__, __TIME__
 */

package Frame;

import java.sql.SQLException;

import javax.swing.ImageIcon;
import javax.swing.JOptionPane;

import player.Players;

import run.Sql;

/**
 *
 * @author  __USER__
 */
public class registerFrame extends javax.swing.JFrame {

	/** Creates new form registerFrame */
	public registerFrame() {
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
		setTitle("\u4e09\u56fd\u4e89\u9738");

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
				"/images/registerFrame.button.png"))); // NOI18N
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
		jButton2.setBounds(1555, 30, 180, 70);

		jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource(
				"/images/loginFrame.png"))); // NOI18N
		jPanel1.add(jLabel1);
		jLabel1.setBounds(2, 0, 1873, 970);

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
		new loginFrame().setVisible(true);
		setVisible(false);
	}

	private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {
		// TODO add your handling code here:
		try {
			Sql.connectionServer();
			String username = jTextField1.getText();
			String password = jPasswordField1.getText();
			if(Sql.register(username,password)){
				JOptionPane.showMessageDialog(jPanel1, "×¢²á³É¹¦", "×¢²á",
						JOptionPane.WARNING_MESSAGE);
			}
			
			
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	private void jPasswordField1ActionPerformed(java.awt.event.ActionEvent evt) {
		// TODO add your handling code here:
	}

	private void jTextField1ActionPerformed(java.awt.event.ActionEvent evt) {
		// TODO add your handling code here:
	}

	/**
	 * @param args the command line arguments
	 */
	public static void main(String args[]) {
		java.awt.EventQueue.invokeLater(new Runnable() {
			public void run() {
				new registerFrame().setVisible(true);
			}
		});
	}

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