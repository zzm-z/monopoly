/*
 * saveData.java
 *
 * Created on __DATE__, __TIME__
 */

package Frame;

import java.awt.Color;
import java.awt.Component;
import java.awt.Graphics;
import java.awt.Insets;
import java.sql.SQLException;

import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import javax.swing.border.Border;

import org.jb2011.lnf.beautyeye.ch3_button.BEButtonUI;
import org.jb2011.lnf.beautyeye.ch3_button.BEButtonUI.NormalColor;

import function.GameFunction;

/**
 *
 * @author  __USER__
 */
public class saveData extends javax.swing.JFrame {

	/** Creates new form saveData */
	public saveData() {
		initComponents();
		this.setIconImage(new ImageIcon("图片/logo1.jpg").getImage());
		setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
		this.setLocationRelativeTo(null);
	}

	//GEN-BEGIN:initComponents
	// <editor-fold defaultstate="collapsed" desc="Generated Code">
	private void initComponents() {

		jPanel1 = new javax.swing.JPanel();
		delete1 = new javax.swing.JButton();
		read1 = new javax.swing.JButton();
		read2 = new javax.swing.JButton();
		read3 = new javax.swing.JButton();
		delete2 = new javax.swing.JButton();
		delete3 = new javax.swing.JButton();
		jLabel1 = new javax.swing.JLabel();

		setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
		setTitle("\u4e09\u56fd\u4e89\u9738");

		jPanel1.setLayout(null);

		delete1.setIcon(new javax.swing.ImageIcon(getClass().getResource(
				"/images/detele1.png"))); // NOI18N
		delete1.setContentAreaFilled(false);
		jPanel1.add(delete1);
		delete1.setBounds(240, 830, 335, 63);

		read1.setIcon(new javax.swing.ImageIcon(getClass().getResource(
				"/images/read1.png"))); // NOI18N
		read1.setBorder(null);
		read1.setContentAreaFilled(false);
		read1.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				read1ActionPerformed(evt);
			}
		});
		jPanel1.add(read1);
		read1.setBounds(240, 80, 335, 733);

		read2.setIcon(new javax.swing.ImageIcon(getClass().getResource(
				"/images/read2.png"))); // NOI18N
		read2.setBorder(null);
		read2.setContentAreaFilled(false);
		read2.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				read2ActionPerformed(evt);
			}
		});
		jPanel1.add(read2);
		read2.setBounds(770, 80, 335, 733);

		read3.setIcon(new javax.swing.ImageIcon(getClass().getResource(
				"/images/read3.png"))); // NOI18N
		read3.setBorder(null);
		read3.setContentAreaFilled(false);
		read3.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				read3ActionPerformed(evt);
			}
		});
		jPanel1.add(read3);
		read3.setBounds(1300, 80, 335, 733);

		delete2.setIcon(new javax.swing.ImageIcon(getClass().getResource(
				"/images/detele1.png"))); // NOI18N
		delete2.setContentAreaFilled(false);
		jPanel1.add(delete2);
		delete2.setBounds(770, 830, 335, 63);

		delete3.setIcon(new javax.swing.ImageIcon(getClass().getResource(
				"/images/detele1.png"))); // NOI18N
		delete3.setContentAreaFilled(false);
		jPanel1.add(delete3);
		delete3.setBounds(1300, 830, 335, 63);

		jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource(
				"/images/saveData2.jpg"))); // NOI18N
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

	private void read3ActionPerformed(java.awt.event.ActionEvent evt) {
		try {
			GameFunction.saveGame(3);
			JOptionPane.showMessageDialog(null, "保存成功", "结果",
					JOptionPane.PLAIN_MESSAGE);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	private void read2ActionPerformed(java.awt.event.ActionEvent evt) {
		try {
			GameFunction.saveGame(2);
			JOptionPane.showMessageDialog(null, "保存成功", "结果",
					JOptionPane.PLAIN_MESSAGE);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	private void read1ActionPerformed(java.awt.event.ActionEvent evt) {
		// TODO add your handling code here:
		try {
			GameFunction.saveGame(1);
			JOptionPane.showMessageDialog(null, "保存成功", "结果",
					JOptionPane.PLAIN_MESSAGE);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	/**
	 * @param args the command line arguments
	 */
	public static void main(String args[]) {
		java.awt.EventQueue.invokeLater(new Runnable() {
			public void run() {
				new saveData().setVisible(true);
			}
		});
	}

	//GEN-BEGIN:variables
	// Variables declaration - do not modify
	private javax.swing.JButton delete1;
	private javax.swing.JButton delete2;
	private javax.swing.JButton delete3;
	private javax.swing.JLabel jLabel1;
	private javax.swing.JPanel jPanel1;
	private javax.swing.JButton read1;
	private javax.swing.JButton read2;
	private javax.swing.JButton read3;
	// End of variables declaration//GEN-END:variables

}