import java.awt.Color;
import java.awt.HeadlessException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JOptionPane;

public class updateEmployeeData extends javax.swing.JFrame {

	private static final long serialVersionUID = 1L;
	public updateEmployeeData() {
		initComponents();
		setLocationRelativeTo(null);
	}

	private void initComponents() {

		jPanel2 = new javax.swing.JPanel();
		jLabel3 = new javax.swing.JLabel();
		jLabel4 = new javax.swing.JLabel();
		jLabel5 = new javax.swing.JLabel();
		jLabel6 = new javax.swing.JLabel();
		jLabel7 = new javax.swing.JLabel();
		jLabel8 = new javax.swing.JLabel();
		jLabel9 = new javax.swing.JLabel();
		jLabel10 = new javax.swing.JLabel();
		jLabel11 = new javax.swing.JLabel();
		jLabel12 = new javax.swing.JLabel();
		jLabel13 = new javax.swing.JLabel();
		jLabel15 = new javax.swing.JLabel();
		jLabel17 = new javax.swing.JLabel();
		jLabel18 = new javax.swing.JLabel();
		jLabel19 = new javax.swing.JLabel();
		jLabel20 = new javax.swing.JLabel();
		jLabel21 = new javax.swing.JLabel();

		sid = new javax.swing.JTextField();
		spassword = new javax.swing.JTextField();
		sname = new javax.swing.JTextField();
		smobno = new javax.swing.JTextField();
		sgender = new javax.swing.JTextField();
		sfname = new javax.swing.JTextField();
		smname = new javax.swing.JTextField();
		sdob = new javax.swing.JTextField();
		sage = new javax.swing.JTextField();
		scaste = new javax.swing.JTextField();
		scity = new javax.swing.JTextField();
		sstate = new javax.swing.JTextField();
		sQualification = new javax.swing.JTextField();
		sDesignation = new javax.swing.JTextField();
		sSalary = new javax.swing.JTextField();
		sJoinDate = new javax.swing.JTextField();

		jButton1 = new javax.swing.JButton();
		jButton2 = new javax.swing.JButton();
		jButton3 = new javax.swing.JButton();
		jButton4 = new javax.swing.JButton();
		jLabel2 = new javax.swing.JLabel();

		jPanel2.setLayout(null);

		setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
		setPreferredSize(new java.awt.Dimension(1290, 800));
		getContentPane().setLayout(null);

		jLabel3.setFont(new java.awt.Font("Times New Roman", 1, 24));
		jLabel3.setForeground(Color.black);
		jLabel3.setText("Employee ID");
		getContentPane().add(jLabel3);
		jLabel3.setBounds(50, 70, 160, 28);

		jLabel17.setFont(new java.awt.Font("Times New Roman", 1, 24));
		jLabel17.setForeground(Color.black);
		jLabel17.setText("Password");
		getContentPane().add(jLabel17);
		jLabel17.setBounds(680, 170, 160, 28);

		jLabel18.setFont(new java.awt.Font("Times New Roman", 1, 24));
		jLabel18.setForeground(Color.black);
		jLabel18.setText("Qualification");
		getContentPane().add(jLabel18);
		jLabel18.setBounds(680, 220, 160, 28);

		jLabel19.setFont(new java.awt.Font("Times New Roman", 1, 24));
		jLabel19.setForeground(Color.black);
		jLabel19.setText("Designation");
		getContentPane().add(jLabel19);
		jLabel19.setBounds(680, 270, 160, 28);

		jLabel20.setFont(new java.awt.Font("Times New Roman", 1, 24));
		jLabel20.setForeground(Color.black);
		jLabel20.setText("Salary");
		getContentPane().add(jLabel20);
		jLabel20.setBounds(680, 320, 160, 28);

		jLabel21.setFont(new java.awt.Font("Times New Roman", 1, 24));
		jLabel21.setForeground(Color.black);
		jLabel21.setText("Join Date");
		getContentPane().add(jLabel21);
		jLabel21.setBounds(680, 370, 160, 28);

		jLabel4.setFont(new java.awt.Font("Times New Roman", 1, 24));
		jLabel4.setForeground(Color.black);
		jLabel4.setText("Name");
		getContentPane().add(jLabel4);
		jLabel4.setBounds(50, 170, 160, 28);

		jLabel5.setFont(new java.awt.Font("Times New Roman", 1, 24));
		jLabel5.setForeground(Color.black);
		jLabel5.setText("Mobile No.");
		getContentPane().add(jLabel5);
		jLabel5.setBounds(50, 220, 130, 28);

		jLabel6.setFont(new java.awt.Font("Times New Roman", 1, 24));
		jLabel6.setForeground(Color.black);
		jLabel6.setText("Gender");
		getContentPane().add(jLabel6);
		jLabel6.setBounds(50, 270, 77, 28);

		jLabel7.setFont(new java.awt.Font("Times New Roman", 1, 24));
		jLabel7.setForeground(Color.black);
		jLabel7.setText("Father's Name");
		getContentPane().add(jLabel7);
		jLabel7.setBounds(50, 320, 160, 28);

		jLabel8.setFont(new java.awt.Font("Times New Roman", 1, 24));
		jLabel8.setForeground(Color.black);
		jLabel8.setText("Mother's Name");
		getContentPane().add(jLabel8);
		jLabel8.setBounds(50, 370, 160, 28);

		jLabel9.setFont(new java.awt.Font("Times New Roman", 1, 24));
		jLabel9.setForeground(Color.black);
		jLabel9.setText("DOB");
		getContentPane().add(jLabel9);
		jLabel9.setBounds(50, 420, 52, 28);

		jLabel10.setFont(new java.awt.Font("Times New Roman", 1, 24));
		jLabel10.setForeground(Color.black);
		jLabel10.setText("Age");
		getContentPane().add(jLabel10);
		jLabel10.setBounds(50, 470, 40, 28);

		jLabel11.setFont(new java.awt.Font("Times New Roman", 1, 24));
		jLabel11.setForeground(Color.black);
		jLabel11.setText("Caste");
		getContentPane().add(jLabel11);
		jLabel11.setBounds(50, 520, 57, 28);

		jLabel12.setFont(new java.awt.Font("Times New Roman", 1, 24));
		jLabel12.setForeground(Color.black);
		jLabel12.setText("City");
		getContentPane().add(jLabel12);
		jLabel12.setBounds(50, 570, 44, 28);

		jLabel13.setFont(new java.awt.Font("Times New Roman", 1, 24));
		jLabel13.setForeground(Color.black);
		jLabel13.setText("State");
		getContentPane().add(jLabel13);
		jLabel13.setBounds(50, 620, 110, 28);

		sid.setBackground(Color.white);
		sid.setFont(new java.awt.Font("Times New Roman", 1, 24));
		sid.setForeground(Color.black);
		sid.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));
		getContentPane().add(sid);
		sid.setBounds(280, 70, 280, 30);

		spassword.setBackground(Color.white);
		spassword.setFont(new java.awt.Font("Times New Roman", 1, 24));
		spassword.setForeground(Color.black);
		spassword.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));
		getContentPane().add(spassword);
		spassword.setBounds(910, 170, 280, 30);

		sQualification.setBackground(Color.white);
		sQualification.setFont(new java.awt.Font("Times New Roman", 1, 24));
		sQualification.setForeground(Color.black);
		sQualification.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));
		getContentPane().add(sQualification);
		sQualification.setBounds(910, 220, 280, 30);

		sDesignation.setBackground(Color.white);
		sDesignation.setFont(new java.awt.Font("Times New Roman", 1, 24));
		sDesignation.setForeground(Color.black);
		sDesignation.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));
		getContentPane().add(sDesignation);
		sDesignation.setBounds(910, 270, 280, 30);

		sSalary.setBackground(Color.white);
		sSalary.setFont(new java.awt.Font("Times New Roman", 1, 24));
		sSalary.setForeground(Color.black);
		sSalary.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));
		getContentPane().add(sSalary);
		sSalary.setBounds(910, 320, 280, 30);

		sJoinDate.setBackground(Color.white);
		sJoinDate.setFont(new java.awt.Font("Times New Roman", 1, 24));
		sJoinDate.setForeground(Color.black);
		sJoinDate.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));
		getContentPane().add(sJoinDate);
		sJoinDate.setBounds(910, 370, 280, 30);

		sname.setBackground(Color.white);
		sname.setFont(new java.awt.Font("Times New Roman", 1, 24));
		sname.setForeground(Color.black);
		sname.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));
		getContentPane().add(sname);
		sname.setBounds(280, 170, 280, 30);

		smobno.setBackground(Color.white);
		smobno.setFont(new java.awt.Font("Times New Roman", 1, 24));
		smobno.setForeground(Color.black);
		smobno.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));
		getContentPane().add(smobno);
		smobno.setBounds(280, 220, 280, 30);

		sgender.setBackground(Color.white);
		sgender.setFont(new java.awt.Font("Times New Roman", 1, 24));
		sgender.setForeground(Color.black);
		sgender.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));
		getContentPane().add(sgender);
		sgender.setBounds(280, 270, 280, 30);

		sfname.setBackground(Color.white);
		sfname.setFont(new java.awt.Font("Times New Roman", 1, 24));
		sfname.setForeground(Color.black);
		sfname.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));
		getContentPane().add(sfname);
		sfname.setBounds(280, 320, 280, 30);

		smname.setBackground(Color.white);
		smname.setFont(new java.awt.Font("Times New Roman", 1, 24));
		smname.setForeground(Color.black);
		smname.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));
		getContentPane().add(smname);
		smname.setBounds(280, 370, 280, 30);

		sdob.setBackground(Color.white);
		sdob.setFont(new java.awt.Font("Times New Roman", 1, 24));
		sdob.setForeground(Color.black);
		sdob.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));
		getContentPane().add(sdob);
		sdob.setBounds(280, 420, 280, 30);

		sage.setBackground(Color.white);
		sage.setFont(new java.awt.Font("Times New Roman", 1, 24));
		sage.setForeground(Color.black);
		sage.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));
		getContentPane().add(sage);
		sage.setBounds(280, 470, 280, 30);

		scaste.setBackground(Color.white);
		scaste.setFont(new java.awt.Font("Times New Roman", 1, 24));
		scaste.setForeground(Color.black);
		scaste.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));
		getContentPane().add(scaste);
		scaste.setBounds(280, 520, 280, 30);

		scity.setBackground(Color.white);
		scity.setFont(new java.awt.Font("Times New Roman", 1, 24));
		scity.setForeground(Color.black);
		scity.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));
		getContentPane().add(scity);
		scity.setBounds(280, 570, 280, 30);

		sstate.setBackground(Color.white);
		sstate.setFont(new java.awt.Font("Times New Roman", 1, 24));
		sstate.setForeground(Color.black);
		sstate.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));
		getContentPane().add(sstate);
		sstate.setBounds(280, 620, 280, 30);

		jLabel15.setFont(new java.awt.Font("Times New Roman", 1, 36));
		jLabel15.setForeground(Color.black);
		jLabel15.setText("Employee Record");
		getContentPane().add(jLabel15);
		jLabel15.setBounds(50, 10, 450, 40);

		jButton1.setBackground(new java.awt.Color(102, 102, 255));
		jButton1.setFont(new java.awt.Font("Times New Roman", 1, 24));
		jButton1.setForeground(new java.awt.Color(255, 255, 255));
		jButton1.setText("Update");
		jButton1.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 255, 255), 1, true));
		jButton1.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				jButton1ActionPerformed(evt);
			}
		});
		getContentPane().add(jButton1);
		jButton1.setBounds(750, 470, 120, 40);

		jButton2.setBackground(new java.awt.Color(102, 102, 255));
		jButton2.setFont(new java.awt.Font("Times New Roman", 1, 24));
		jButton2.setForeground(new java.awt.Color(255, 255, 255));
		jButton2.setText("Back");
		jButton2.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 255, 255), 1, true));
		jButton2.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				jButton2ActionPerformed(evt);
			}
		});
		getContentPane().add(jButton2);
		jButton2.setBounds(950, 470, 120, 40);

		jButton3.setBackground(new java.awt.Color(102, 102, 255));
		jButton3.setFont(new java.awt.Font("Times New Roman", 1, 24));
		jButton3.setForeground(new java.awt.Color(255, 255, 255));
		jButton3.setText("View");
		jButton3.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 255, 255), 1, true));
		jButton3.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				jButton3ActionPerformed(evt);
			}
		});
		getContentPane().add(jButton3);
		jButton3.setBounds(650, 65, 120, 40);
		
		jButton4.setBackground(new java.awt.Color(102, 102, 255));
		jButton4.setFont(new java.awt.Font("Times New Roman", 1, 24));
		jButton4.setForeground(new java.awt.Color(255, 255, 255));
		jButton4.setText("Delete");
		jButton4.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 255, 255), 1, true));
		jButton4.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				jButton4ActionPerformed(evt);
			}
		});
		getContentPane().add(jButton4);
		jButton4.setBounds(850, 65, 120, 40);

		jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/addStudentData.jpg")));
		jLabel2.setText("jLabel2");
		getContentPane().add(jLabel2);
		jLabel2.setBounds(0, 0, 1290, 820);

		pack();
	}

	private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {
		try {
			Class.forName("com.mysql.jdbc.Driver");
			try (Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/BillingSystem", "root",
					"root")) {
				String sql = "Update Employee set Password = ?, Name = ?, MobileNo = ?, Gender = ?, FatherName = ?, MotherName = ?, "
						+ "DOB = ?, Age = ?, Caste = ?, City = ?, State = ?, Qualification = ?, Designation = ?, Salary = ?, JoinDate = ? where ID = ?";
				PreparedStatement pst = con.prepareStatement(sql);

				pst.setString(16, sid.getText());
				pst.setString(1, spassword.getText());
				pst.setString(2, sname.getText());
				pst.setString(3, smobno.getText());
				pst.setString(4, sgender.getText());
				pst.setString(5, sfname.getText());
				pst.setString(6, smname.getText());
				pst.setString(7, sdob.getText());
				pst.setString(8, sage.getText());
				pst.setString(9, scaste.getText());
				pst.setString(10, scity.getText());
				pst.setString(11, sstate.getText());
				pst.setString(12, sQualification.getText());
				pst.setString(13, sDesignation.getText());
				pst.setString(14, sSalary.getText());
				pst.setString(15, sJoinDate.getText());
				pst.executeUpdate();
				JOptionPane.showMessageDialog(null, "Record Updated Sucessfully.");

			}
		} catch (HeadlessException | ClassNotFoundException | SQLException e) {
			JOptionPane.showMessageDialog(null, e);
		}
	}

	private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {
			adminLandingPage ad = new adminLandingPage();
			ad.setVisible(true);
			this.dispose();
	}

	private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {
		try {
			Class.forName("com.mysql.jdbc.Driver");
			try (Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/BillingSystem", "root",
					"root")) {
				String sql = "select * from Employee where ID = ?";
				PreparedStatement pst = con.prepareStatement(sql);
				pst.setString(1, sid.getText());
				ResultSet rs = pst.executeQuery();
				if(rs.next()) {
					rs.beforeFirst();
					while (rs.next()) {
						
						sid.setText(rs.getString("ID"));
						spassword.setText(rs.getString("Password"));
						sname.setText(rs.getString("Name"));
						sfname.setText(rs.getString("FatherName"));
						smname.setText(rs.getString("MotherName"));
						smobno.setText(rs.getString("MobileNo"));
						sgender.setText(rs.getString("Gender"));
						sdob.setText(rs.getString("DOB"));
						sage.setText(rs.getString("Age"));
						scaste.setText(rs.getString("Caste"));
						scity.setText(rs.getString("City"));
						sstate.setText(rs.getString("State"));
						sQualification.setText(rs.getString("Qualification"));
						sDesignation.setText(rs.getString("Designation"));
						sSalary.setText(rs.getString("Salary"));
						sJoinDate.setText(rs.getString("JoinDate"));					
					}
				}
				else {
					JOptionPane.showMessageDialog(null, "No Record Found.");
				}
					

			}
		} catch (HeadlessException | ClassNotFoundException | SQLException e) {
			JOptionPane.showMessageDialog(null, e);
		}
	}
	
	private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {
		try {
			Class.forName("com.mysql.jdbc.Driver");
			try (Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/BillingSystem", "root",
					"root")) {
				String sql = "Delete from Employee where ID = ?";
				PreparedStatement pst = con.prepareStatement(sql);

				pst.setString(1, sid.getText());
				pst.executeUpdate();
				sid.setText("");
				spassword.setText("");
				sname.setText("");
				sfname.setText("");
				smname.setText("");
				smobno.setText("");
				sgender.setText("");
				sdob.setText("");
				sage.setText("");
				scaste.setText("");
				scity.setText("");
				sstate.setText("");
				sQualification.setText("");
				sDesignation.setText("");
				sSalary.setText("");
				sJoinDate.setText("");
				JOptionPane.showMessageDialog(null, "Record Deleted Sucessfully.");

			}
		} catch (HeadlessException | ClassNotFoundException | SQLException e) {
			JOptionPane.showMessageDialog(null, e);
		}
	}

	/*public static void main(String args[]) {
		try {
			for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
				if ("Nimbus".equals(info.getName())) {
					javax.swing.UIManager.setLookAndFeel(info.getClassName());
					break;
				}
			}
		} catch (ClassNotFoundException ex) {
			java.util.logging.Logger.getLogger(updateEmployeeData.class.getName()).log(java.util.logging.Level.SEVERE,
					null, ex);
		} catch (InstantiationException ex) {
			java.util.logging.Logger.getLogger(updateEmployeeData.class.getName()).log(java.util.logging.Level.SEVERE,
					null, ex);
		} catch (IllegalAccessException ex) {
			java.util.logging.Logger.getLogger(updateEmployeeData.class.getName()).log(java.util.logging.Level.SEVERE,
					null, ex);
		} catch (javax.swing.UnsupportedLookAndFeelException ex) {
			java.util.logging.Logger.getLogger(updateEmployeeData.class.getName()).log(java.util.logging.Level.SEVERE,
					null, ex);
		}

		java.awt.EventQueue.invokeLater(new Runnable() {
			public void run() {
				new updateEmployeeData().setVisible(true);
			}
		});
	}*/

	private javax.swing.JButton jButton1;
	private javax.swing.JButton jButton2;
	private javax.swing.JButton jButton3;
	private javax.swing.JButton jButton4;
	private javax.swing.JLabel jLabel10;
	private javax.swing.JLabel jLabel11;
	private javax.swing.JLabel jLabel17;
	private javax.swing.JLabel jLabel12;
	private javax.swing.JLabel jLabel13;
	private javax.swing.JLabel jLabel15;
	private javax.swing.JLabel jLabel2;
	private javax.swing.JLabel jLabel3;
	private javax.swing.JLabel jLabel4;
	private javax.swing.JLabel jLabel5;
	private javax.swing.JLabel jLabel6;
	private javax.swing.JLabel jLabel7;
	private javax.swing.JLabel jLabel8;
	private javax.swing.JLabel jLabel9;
	private javax.swing.JPanel jPanel2;
	private javax.swing.JLabel jLabel18;
	private javax.swing.JLabel jLabel19;
	private javax.swing.JLabel jLabel20;
	private javax.swing.JLabel jLabel21;
	private javax.swing.JTextField sage;
	private javax.swing.JTextField scaste;
	private javax.swing.JTextField scity;
	private javax.swing.JTextField sdob;
	private javax.swing.JTextField sfname;
	private javax.swing.JTextField smname;
	private javax.swing.JTextField sgender;
	private javax.swing.JTextField sid;
	private javax.swing.JTextField spassword;
	private javax.swing.JTextField sQualification;
	private javax.swing.JTextField sDesignation;
	private javax.swing.JTextField sSalary;
	private javax.swing.JTextField sJoinDate;
	private javax.swing.JTextField smobno;
	private javax.swing.JTextField sname;
	private javax.swing.JTextField sstate;
}
