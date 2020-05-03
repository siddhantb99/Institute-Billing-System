import java.awt.Color;

import javax.swing.JDialog;
import javax.swing.JOptionPane;

public class adminLandingPage extends javax.swing.JFrame {

	private static final long serialVersionUID = 1L;
	public adminLandingPage() {
		initComponents();
		setLocationRelativeTo(null);
	}

	private void initComponents() {

		jPanel1 = new javax.swing.JPanel();
		jButton1 = new javax.swing.JButton();
		jButton2 = new javax.swing.JButton();
		jButton3 = new javax.swing.JButton();
		jButton4 = new javax.swing.JButton();
		jButton5 = new javax.swing.JButton();
		jButton6 = new javax.swing.JButton();
		jButton7 = new javax.swing.JButton();
		jLabel1 = new javax.swing.JLabel();

		setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
		setPreferredSize(new java.awt.Dimension(1290, 800));
		jPanel1.setLayout(null);

		jButton1.setBackground(new java.awt.Color(153, 204, 255));
		jButton1.setFont(new java.awt.Font("Times New Roman", 1, 28));
		jButton1.setForeground(Color.black);
		jButton1.setText("Add Student Data");
		jButton1.setBorder(javax.swing.BorderFactory.createLineBorder(Color.black));

		jButton1.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				jButton1ActionPerformed(evt);
			}
		});

		jPanel1.add(jButton1);
		jButton1.setBounds(90, 320, 350, 80);

		jButton2.setBackground(new java.awt.Color(153, 204, 255));
		jButton2.setFont(new java.awt.Font("Times New Roman", 1, 28));
		jButton2.setForeground(Color.black);
		jButton2.setText("View/Update Student Data");
		jButton2.setBorder(javax.swing.BorderFactory.createLineBorder(Color.black));

		jButton2.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				jButton2ActionPerformed(evt);
			}
		});

		jPanel1.add(jButton2);
		jButton2.setBounds(500, 320, 350, 80);

		jButton3.setBackground(new java.awt.Color(153, 204, 255));
		jButton3.setFont(new java.awt.Font("Times New Roman", 1, 28));
		jButton3.setForeground(Color.black);
		jButton3.setText("Add Admin Data");
		jButton3.setBorder(javax.swing.BorderFactory.createLineBorder(Color.black));
		jButton3.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				jButton3ActionPerformed(evt);
			}
		});
		jPanel1.add(jButton3);
		jButton3.setBounds(90, 560, 350, 80);

		jButton4.setBackground(new java.awt.Color(153, 204, 255));
		jButton4.setFont(new java.awt.Font("Times New Roman", 1, 28));
		jButton4.setForeground(Color.black);
		jButton4.setText("Add Employee Data");
		jButton4.setBorder(javax.swing.BorderFactory.createLineBorder(Color.black));

		jButton4.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				jButton4ActionPerformed(evt);
			}
		});

		jPanel1.add(jButton4);
		jButton4.setBounds(90, 440, 350, 80);

		jButton5.setBackground(new java.awt.Color(153, 204, 255));
		jButton5.setFont(new java.awt.Font("Times New Roman", 1, 28));
		jButton5.setForeground(Color.black);
		jButton5.setText("View/Update Employee Data");
		jButton5.setBorder(javax.swing.BorderFactory.createLineBorder(Color.black));
		jButton5.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				jButton5ActionPerformed(evt);
			}
		});
		jPanel1.add(jButton5);
		jButton5.setBounds(500, 440, 350, 80);

		jButton6.setBackground(new java.awt.Color(153, 204, 255));
		jButton6.setFont(new java.awt.Font("Times New Roman", 1, 28));
		jButton6.setForeground(Color.black);
		jButton6.setText("View/Update Admin Data");
		jButton6.setBorder(javax.swing.BorderFactory.createLineBorder(Color.black));
		jButton6.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				jButton6ActionPerformed(evt);
			}
		});
		jPanel1.add(jButton6);
		jButton6.setBounds(500, 560, 350, 80);

		jButton7.setBackground(new java.awt.Color(153, 204, 255));
		jButton7.setFont(new java.awt.Font("Times New Roman", 1, 28));
		jButton7.setForeground(Color.black);
		jButton7.setText("Logout");
		jButton7.setBorder(javax.swing.BorderFactory.createLineBorder(Color.black));
		jButton7.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				jButton7ActionPerformed(evt);
			}
		});
		jPanel1.add(jButton7);
		jButton7.setBounds(910, 560, 340, 80);

		jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/secure.jpg")));
		jLabel1.setText("jLabel1");
		jPanel1.add(jLabel1);
		jLabel1.setBounds(0, 0, 1500, 710);

		javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
		getContentPane().setLayout(layout);
		layout.setHorizontalGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
				.addGroup(layout.createSequentialGroup().addContainerGap()
						.addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 1502, Short.MAX_VALUE)
						.addContainerGap()));
		layout.setVerticalGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
				.addGroup(layout.createSequentialGroup().addContainerGap()
						.addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 709, Short.MAX_VALUE)
						.addContainerGap()));

		pack();
	}

	private void jButton7ActionPerformed(java.awt.event.ActionEvent evt) {
		JDialog.setDefaultLookAndFeelDecorated(true);
		int response = JOptionPane.showConfirmDialog(null, "Do you want to EXIT?", "Confirm", JOptionPane.YES_NO_OPTION,
				JOptionPane.QUESTION_MESSAGE);
		if (response == JOptionPane.YES_NO_OPTION) {
			this.dispose();
		}
	}

	private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {
		addStudentData sd = new addStudentData();
		sd.setVisible(true);
		this.dispose();
	}

	private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {
		addEmployeeData ad = new addEmployeeData();
		ad.setVisible(true);
		this.dispose();
	}

	private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {
		updateStudentData rs = new updateStudentData();
		rs.setVisible(true);
		this.dispose();
	}

	private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {
		addAdminData ad = new addAdminData();
		ad.setVisible(true);
		this.dispose();
	}

	private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {
		updateEmployeeData sd = new updateEmployeeData();
		sd.setVisible(true);
		this.dispose();
	}
	private void jButton6ActionPerformed(java.awt.event.ActionEvent evt) {
		updateAdminData sd = new updateAdminData();
		sd.setVisible(true);
		this.dispose();
	}

	public static void main(String args[]) {

		try {
			for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
				if ("Nimbus".equals(info.getName())) {
					javax.swing.UIManager.setLookAndFeel(info.getClassName());
					break;
				}
			}
		} catch (ClassNotFoundException ex) {
			java.util.logging.Logger.getLogger(adminLandingPage.class.getName()).log(java.util.logging.Level.SEVERE,
					null, ex);
		} catch (InstantiationException ex) {
			java.util.logging.Logger.getLogger(adminLandingPage.class.getName()).log(java.util.logging.Level.SEVERE,
					null, ex);
		} catch (IllegalAccessException ex) {
			java.util.logging.Logger.getLogger(adminLandingPage.class.getName()).log(java.util.logging.Level.SEVERE,
					null, ex);
		} catch (javax.swing.UnsupportedLookAndFeelException ex) {
			java.util.logging.Logger.getLogger(adminLandingPage.class.getName()).log(java.util.logging.Level.SEVERE,
					null, ex);
		}

		java.awt.EventQueue.invokeLater(() -> {
			new adminLandingPage().setVisible(true);
		});
	}

	private javax.swing.JButton jButton1;
	private javax.swing.JButton jButton2;
	private javax.swing.JButton jButton3;
	private javax.swing.JButton jButton4;
	private javax.swing.JButton jButton5;
	private javax.swing.JButton jButton6;
	private javax.swing.JButton jButton7;
	private javax.swing.JLabel jLabel1;
	private javax.swing.JPanel jPanel1;

}
