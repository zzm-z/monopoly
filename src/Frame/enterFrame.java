/*
 * entrerFrame.java
 *
 * Created on __DATE__, __TIME__
 */

package Frame;

import java.awt.Cursor;
import java.awt.Image;
import java.awt.Point;
import java.awt.Toolkit;

import javax.swing.ImageIcon;
import javax.swing.JFrame;

/**
 *
 * @author  __USER__
 */
public class enterFrame extends javax.swing.JFrame {

	/** Creates new form entrerFrame */
	public enterFrame() {
		initComponents();
		this.setLocationRelativeTo(null);
		this.setIconImage(new ImageIcon("ͼƬ/logo1.jpg").getImage());
		//���
		this.setCursor(createCursor());
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setVisible(true);
	}

	public static Cursor createCursor() {
		//String fileName = "img/1.jpg";
		Image cursor = Toolkit.getDefaultToolkit().createImage(
				"src\\images\\subiao1.png");
		return Toolkit.getDefaultToolkit().createCustomCursor(cursor,
				new Point(16, 16), "mycursor");

	}

	/** This method is called from within the constructor to
	 * initialize the form.
	 * WARNING: Do NOT modify this code. The content of this method is
	 * always regenerated by the Form Editor.
	 */
	//GEN-BEGIN:initComponents
	// <editor-fold defaultstate="collapsed" desc="Generated Code">
	private void initComponents() {

		jPanel1 = new javax.swing.JPanel();
		jButton1 = new javax.swing.JButton();
		jButton2 = new javax.swing.JButton();
		jButton3 = new javax.swing.JButton();
		jLabel1 = new javax.swing.JLabel();

		setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
		setTitle("\u4e09\u56fd\u5927\u5bcc\u7fc1");

		jPanel1.setLayout(null);

		jButton1.setBackground(new java.awt.Color(255, 255, 255));
		jButton1.setFont(new java.awt.Font("�����ּ�-��ī�ɸֱʿ��� ��", 1, 24));
		jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource(
				"/images/login.button.png"))); // NOI18N
		jButton1.setBorder(null);
		jButton1.setContentAreaFilled(false);
		jButton1.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				jButton1ActionPerformed(evt);
			}
		});
		jPanel1.add(jButton1);
		jButton1.setBounds(520, 730, 380, 70);

		jButton2.setBackground(new java.awt.Color(255, 255, 255));
		jButton2.setFont(new java.awt.Font("�����ּ�-��ī�ɸֱʿ��� ��", 1, 24));
		jButton2.setIcon(new javax.swing.ImageIcon(getClass().getResource(
				"/images/register.button.png"))); // NOI18N
		jButton2.setBorder(null);
		jButton2.setContentAreaFilled(false);
		jButton2.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				jButton2ActionPerformed(evt);
			}
		});
		jPanel1.add(jButton2);
		jButton2.setBounds(1040, 730, 380, 70);

		jButton3.setIcon(new javax.swing.ImageIcon(getClass().getResource(
				"/images/enter.returnButton.png"))); // NOI18N
		jButton3.setContentAreaFilled(false);
		jButton3.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				jButton3ActionPerformed(evt);
			}
		});
		jPanel1.add(jButton3);
		jButton3.setBounds(1665, 20, 180, 70);

		jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource(
				"/images/enter.png"))); // NOI18N
		jPanel1.add(jLabel1);
		jLabel1.setBounds(0, 0, 1873, 970);

		javax.swing.GroupLayout layout = new javax.swing.GroupLayout(
				getContentPane());
		getContentPane().setLayout(layout);
		layout.setHorizontalGroup(layout.createParallelGroup(
				javax.swing.GroupLayout.Alignment.LEADING).addComponent(
				jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 1873,
				javax.swing.GroupLayout.PREFERRED_SIZE));
		layout.setVerticalGroup(layout.createParallelGroup(
				javax.swing.GroupLayout.Alignment.LEADING).addComponent(
				jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 920,
				javax.swing.GroupLayout.PREFERRED_SIZE));

		pack();
	}// </editor-fold>
	//GEN-END:initComponents

	private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {
		new mainFrame().setVisible(true);
		setVisible(false);
	}

	private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {
		new registerFrame().setVisible(true);
		setVisible(false);
	}

	private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {
		// TODO add your handling code here:

		new loginFrame().setVisible(true);
		setVisible(false);
	}

	/**
	 * @param args the command line arguments
	 */

	//GEN-BEGIN:variables
	// Variables declaration - do not modify
	private javax.swing.JButton jButton1;
	private javax.swing.JButton jButton2;
	private javax.swing.JButton jButton3;
	private javax.swing.JLabel jLabel1;
	private javax.swing.JPanel jPanel1;
	// End of variables declaration//GEN-END:variables

}