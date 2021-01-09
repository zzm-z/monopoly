/*
 * Dice.java
 *
 * Created on __DATE__, __TIME__
 */

package mapFunction;

/**
 *
 * @author  __USER__
 */
public class Dice extends javax.swing.JFrame {
int i=1;//用于切换图片
int number=1;
	/** Creates new form Dice */
	public Dice() {
		initComponents();
	}
	public Dice(int number){
		initComponents();
		this.number=number;
	}

	/** This method is called from within the constructor to
	 * initialize the form.
	 * WARNING: Do NOT modify this code. The content of this method is
	 * always regenerated by the Form Editor.
	 */
	//GEN-BEGIN:initComponents
	// <editor-fold defaultstate="collapsed" desc="Generated Code">
	private void initComponents() {

		jLabel1 = new javax.swing.JLabel();
		jButton1 = new javax.swing.JButton();

		setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

		jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource(
				"/images/1.jpg"))); // NOI18N

		jButton1.setText("jButton1");
		jButton1.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				jButton1ActionPerformed(evt);
			}
		});

		javax.swing.GroupLayout layout = new javax.swing.GroupLayout(
				getContentPane());
		getContentPane().setLayout(layout);
		layout.setHorizontalGroup(layout.createParallelGroup(
				javax.swing.GroupLayout.Alignment.LEADING).addGroup(
				layout.createSequentialGroup().addGap(129, 129, 129)
						.addComponent(jButton1).addContainerGap(181,
								Short.MAX_VALUE)).addGroup(
				javax.swing.GroupLayout.Alignment.TRAILING,
				layout.createSequentialGroup().addContainerGap(131,
						Short.MAX_VALUE).addComponent(jLabel1).addGap(174, 174,
						174)));
		layout.setVerticalGroup(layout.createParallelGroup(
				javax.swing.GroupLayout.Alignment.LEADING).addGroup(
				javax.swing.GroupLayout.Alignment.TRAILING,
				layout.createSequentialGroup().addGap(74, 74, 74).addComponent(
						jLabel1).addPreferredGap(
						javax.swing.LayoutStyle.ComponentPlacement.RELATED, 72,
						Short.MAX_VALUE).addComponent(jButton1).addGap(54, 54,
						54)));

		pack();
	}// </editor-fold>
	//GEN-END:initComponents

	private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {
		// TODO add your handling code here:
		PaintThread a = new PaintThread();
		Thread b = new Thread(a);
		b.start();
		if(number==1){
			System.out.println("number能显示");
		}

	}

	/**
	 * @param args the command line arguments
	 */
	class PaintThread implements Runnable {
		public void run() {
			//while（true）保持蛇能一直运行
			while (true) {
				jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource(
				"/images/"+i+".jpg"))); // NOI18N

				try {
					//物体运行太快，肉眼无法追踪，这是减慢速度，使得肉眼能跟上刷新速度
					Thread.sleep(100);
					if(i==13){
						switch(number){
						case 1:
							jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource(
									"/images/number1.jpg"))); // NOI18N
							break;
						case 2:
							jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource(
									"/images/number2.jpg"))); // NOI18N
						}
					
					}
					i++;
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
			}
		}
	}

	public static void main(String args[]) {
		java.awt.EventQueue.invokeLater(new Runnable() {
			public void run() {
				new Dice().setVisible(true);
			}
		});
	}

	//GEN-BEGIN:variables
	// Variables declaration - do not modify
	private javax.swing.JButton jButton1;
	private javax.swing.JLabel jLabel1;
	// End of variables declaration//GEN-END:variables

}