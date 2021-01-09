/*
 * MapFrame2.java
 *
 * Created on __DATE__, __TIME__
 */

package Frame;

import javax.swing.ImageIcon;

/**
 *
 * @author  __USER__
 */
public class PersonmapFrame2 extends javax.swing.JFrame {
	public static long startTime;//开始时间
	static int change;

	/** Creates new form mapFrame */
	/** Creates new form MapFrame2 */
	public PersonmapFrame2() {
		initComponents();
		this.setLocationRelativeTo(null);
		this.setIconImage(new ImageIcon("图片/logo1.jpg").getImage());
	}

	//GEN-BEGIN:initComponents
	// <editor-fold defaultstate="collapsed" desc="Generated Code">
	private void initComponents() {

		jPanel1 = new javax.swing.JPanel();
		jButton4 = new javax.swing.JButton();
		jButton2 = new javax.swing.JButton();
		jButton1 = new javax.swing.JButton();
		jButton3 = new javax.swing.JButton();
		jButton5 = new javax.swing.JButton();
		jLabel2 = new javax.swing.JLabel();

		setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

		jPanel1.setLayout(null);

		jButton4.setBackground(new java.awt.Color(239, 239, 239));
		jButton4.setIcon(new javax.swing.ImageIcon(getClass().getResource(
				"/map/map.map4.png"))); // NOI18N
		jButton4.setBorder(null);
		jButton4.setContentAreaFilled(false);
		jButton4.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				jButton4ActionPerformed(evt);
			}
		});
		jPanel1.add(jButton4);
		jButton4.setBounds(160, 310, 350, 260);

		jButton2.setBackground(new java.awt.Color(239, 239, 239));
		jButton2.setIcon(new javax.swing.ImageIcon(getClass().getResource(
				"/map/map.map3.png"))); // NOI18N
		jButton2.setBorder(null);
		jButton2.setContentAreaFilled(false);
		jButton2.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				jButton2ActionPerformed(evt);
			}
		});
		jPanel1.add(jButton2);
		jButton2.setBounds(550, 320, 370, 260);

		jButton1.setBackground(new java.awt.Color(239, 239, 239));
		jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource(
				"/map/map.map1.png"))); // NOI18N
		jButton1.setBorder(null);
		jButton1.setContentAreaFilled(false);
		jButton1.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				jButton1ActionPerformed(evt);
			}
		});
		jPanel1.add(jButton1);
		jButton1.setBounds(950, 310, 350, 280);

		jButton3.setBackground(new java.awt.Color(239, 239, 239));
		jButton3.setForeground(new java.awt.Color(255, 255, 255));
		jButton3.setIcon(new javax.swing.ImageIcon(getClass().getResource(
				"/map/map.map2.png"))); // NOI18N
		jButton3.setBorder(null);
		jButton3.setContentAreaFilled(false);
		jButton3.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				jButton3ActionPerformed(evt);
			}
		});
		jPanel1.add(jButton3);
		jButton3.setBounds(1350, 320, 360, 270);

		jButton5.setIcon(new javax.swing.ImageIcon(getClass().getResource(
				"/images/main.returnButton.png"))); // NOI18N
		jButton5.setBorder(null);
		jButton5.setContentAreaFilled(false);
		jButton5.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				jButton5ActionPerformed(evt);
			}
		});
		jPanel1.add(jButton5);
		jButton5.setBounds(1635, 20, 190, 70);

		jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource(
				"/images/mapFrame.png"))); // NOI18N
		jPanel1.add(jLabel2);
		jLabel2.setBounds(0, 0, 1873, 970);

		javax.swing.GroupLayout layout = new javax.swing.GroupLayout(
				getContentPane());
		getContentPane().setLayout(layout);
		layout.setHorizontalGroup(layout.createParallelGroup(
				javax.swing.GroupLayout.Alignment.LEADING).addComponent(
				jPanel1, javax.swing.GroupLayout.Alignment.TRAILING,
				javax.swing.GroupLayout.PREFERRED_SIZE, 1873,
				javax.swing.GroupLayout.PREFERRED_SIZE));
		layout.setVerticalGroup(layout.createParallelGroup(
				javax.swing.GroupLayout.Alignment.LEADING).addComponent(
				jPanel1, javax.swing.GroupLayout.Alignment.TRAILING,
				javax.swing.GroupLayout.PREFERRED_SIZE, 970,
				javax.swing.GroupLayout.PREFERRED_SIZE));

		pack();
	}// </editor-fold>
	//GEN-END:initComponents

	private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {
		new mainFrame().setVisible(true);
		setVisible(false);
	}

	private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {
		change = 2;
		new PersongameFrame(2, 0).setVisible(true);
		startTime = System.currentTimeMillis();
		//gameFrame.connection();
		setVisible(false);
	}

	private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {
		change = 3;
		new PersongameFrame(3, 0).setVisible(true);
		//gameFrame.connection();
		startTime = System.currentTimeMillis();
		setVisible(false);
	}

	private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {
		change = 1;
		// TODO add your handling code here:
		new PersongameFrame(1, 0).setVisible(true);
		startTime = System.currentTimeMillis();//选择地图后开始记时
		System.out.println(startTime);
		//gameFrame.connection();
		setVisible(false);
	}

	private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {
		change = 4;
		new PersongameFrame(4, 0).setVisible(true);
		startTime = System.currentTimeMillis();
		//gameFrame.connection();
		setVisible(false);
	}

	/**
	 * @param args the command line arguments
	 */
	public static void main(String args[]) {
		java.awt.EventQueue.invokeLater(new Runnable() {
			public void run() {
				new PersonmapFrame2().setVisible(true);
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
	private javax.swing.JLabel jLabel2;
	private javax.swing.JPanel jPanel1;
	// End of variables declaration//GEN-END:variables

}