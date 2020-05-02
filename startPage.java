
import java.awt.Color;
import java.awt.HeadlessException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import javax.swing.JComboBox;
import javax.swing.JDialog;
import javax.swing.JOptionPane;

public class startPage extends javax.swing.JFrame {

	private static final long serialVersionUID = 1L;
	public startPage() {
		initComponents();
		setLocationRelativeTo(null);
	}

	private void initComponents() {

		jPanel1 = new javax.swing.JPanel();
		jLabel2 = new javax.swing.JLabel();
		jLabel3 = new javax.swing.JLabel();
		jLabel4 = new javax.swing.JLabel();
		jLabel5 = new javax.swing.JLabel();
		user = new javax.swing.JTextField();
		pass = new javax.swing.JPasswordField();
		jButton1 = new javax.swing.JButton();
		jButton3 = new javax.swing.JButton();
		jLabel1 = new javax.swing.JLabel();
		
		String users[] = { "Admin", "Student", "Employee" };
		UserSelection = new JComboBox<String>(users);

		setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

		jPanel1.setLayout(null);

		jLabel2.setFont(new java.awt.Font("Times New Roman", 1, 48));
		jLabel2.setForeground(Color.black);
		jLabel2.setText("Institute Billing System");
		jPanel1.add(jLabel2);
		jLabel2.setBounds(50, 10, 500, 60);

		jLabel3.setFont(new java.awt.Font("Times New Roman", 1, 28));
		jLabel3.setForeground(Color.white);
		jLabel3.setText("Username");
		jPanel1.add(jLabel3);
		jLabel3.setBounds(80, 150, 120, 50);

		jLabel4.setFont(new java.awt.Font("Times New Roman", 1, 28));
		jLabel4.setForeground(Color.white);
		jLabel4.setText("Password");
		jPanel1.add(jLabel4);
		jLabel4.setBounds(80, 200, 120, 50);

		jLabel5.setFont(new java.awt.Font("Times New Roman", 1, 28));
		jLabel5.setForeground(Color.white);
		jLabel5.setText("Usertype");
		jPanel1.add(jLabel5);
		jLabel5.setBounds(80, 250, 120, 50);

		UserSelection.setBounds(230, 260, 190, 30);
		jPanel1.add(UserSelection);

		jPanel1.add(user);
		user.setBounds(230, 160, 190, 30);
		jPanel1.add(pass);
		pass.setBounds(230, 210, 190, 30);

		jButton1.setBackground(new java.awt.Color(255, 255, 255));
		jButton1.setFont(new java.awt.Font("Times New Roman", 1, 24));
		jButton1.setText("Login");
		jButton1.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				jButton1ActionPerformed(evt);
			}
		});
		jPanel1.add(jButton1);
		jButton1.setBounds(130, 310, 110, 30);

		jButton3.setBackground(new java.awt.Color(255, 255, 255));
		jButton3.setFont(new java.awt.Font("Times New Roman", 1, 24));
		jButton3.setText("Exit");

		jButton3.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				jButton3ActionPerformed(evt);
			}
		});

		jPanel1.add(jButton3);
		jButton3.setBounds(280, 310, 110, 30);

		jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/startPage.jpg")));
		jLabel1.setText("jLabel1");
		jPanel1.add(jLabel1);
		jLabel1.setBounds(0, 0, 600, 500);

		javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
		getContentPane().setLayout(layout);
		layout.setHorizontalGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
				.addGroup(layout.createSequentialGroup().addContainerGap()
						.addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 600, Short.MAX_VALUE)
						.addContainerGap()));
		layout.setVerticalGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
				.addGroup(layout.createSequentialGroup().addContainerGap()
						.addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 400, Short.MAX_VALUE)
						.addContainerGap()));

		pack();
	}

	@SuppressWarnings("deprecation")
	private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {
		try {
			Class.forName("com.mysql.jdbc.Driver");
			Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/BillingSystem", "root", "root");
			String sql = "";
			String selectedUser = (String) UserSelection.getSelectedItem();
			if (selectedUser == "Admin")
				sql = "SELECT * FROM Admin WHERE ID = ? AND Password = ?";
			else if (selectedUser == "Student")
				sql = "SELECT * FROM Student WHERE ID = ? AND Password = ?";
			else
				sql = "SELECT * FROM Employee WHERE ID = ? AND Password = ?";
			PreparedStatement pst = con.prepareStatement(sql);
			pst.setString(1, user.getText());
			pst.setString(2, pass.getText());
			ResultSet rs = pst.executeQuery();
			if (rs.next()) {
				JOptionPane.showMessageDialog(null, "Login Successfully.");
				setVisible(false);
				if(selectedUser == "Admin") {
					adminLandingPage a = new adminLandingPage();
					a.setVisible(true);
				}
				else if(selectedUser == "Student"){
					viewStudentData a = new viewStudentData(user.getText());
					a.setVisible(true);
				}
				else {
					viewEmployeeData a = new viewEmployeeData(user.getText());
					a.setVisible(true);
				}
			} else {
				JOptionPane.showMessageDialog(null, "Invalid Credentials. Please try again.");
			}
		} catch (HeadlessException | ClassNotFoundException | SQLException e) {
			JOptionPane.showMessageDialog(null, e);
		}
	}

	private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {
		JDialog.setDefaultLookAndFeelDecorated(true);
		int response = JOptionPane.showConfirmDialog(null, "Do you want to EXIT?", "Confirm", JOptionPane.YES_NO_OPTION,
				JOptionPane.QUESTION_MESSAGE);
		if (response == JOptionPane.YES_NO_OPTION) {
			this.dispose();
		}
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
			java.util.logging.Logger.getLogger(startPage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
		} catch (InstantiationException ex) {
			java.util.logging.Logger.getLogger(startPage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
		} catch (IllegalAccessException ex) {
			java.util.logging.Logger.getLogger(startPage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
		} catch (javax.swing.UnsupportedLookAndFeelException ex) {
			java.util.logging.Logger.getLogger(startPage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
		}

		java.awt.EventQueue.invokeLater(new Runnable() {
			public void run() {
				new startPage().setVisible(true);
			}
		});
	}

	private javax.swing.JButton jButton1;
	private javax.swing.JButton jButton3;
	private javax.swing.JLabel jLabel1;
	private javax.swing.JLabel jLabel2;
	private javax.swing.JLabel jLabel3;
	private javax.swing.JLabel jLabel4;
	private javax.swing.JLabel jLabel5;
	private javax.swing.JPanel jPanel1;
	private javax.swing.JPasswordField pass;
	private javax.swing.JTextField user;
	private javax.swing.JComboBox<String> UserSelection;

}