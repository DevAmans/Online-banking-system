package axisbank;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import com.mysql.*;

import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JPasswordField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.awt.event.ActionEvent;
import java.awt.Color;

public class LLL extends JFrame {
	Connection conn;
	ResultSet rs;
	java.sql.Statement stmt;

	private JPanel contentPane;
	private JTextField txtuser;
	private JPasswordField passwordField;
	private JButton btnLogin;
	private JButton btnNewAccount;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					LLL frame = new LLL();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public LLL() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 767, 418);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(175, 238, 238));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblUsername = new JLabel("Username");
		lblUsername.setFont(new Font("Tahoma", Font.BOLD, 34));
		lblUsername.setBounds(87, 104, 207, 53);
		contentPane.add(lblUsername);
		
		JLabel lblPassword = new JLabel("Password");
		lblPassword.setFont(new Font("Tahoma", Font.BOLD, 34));
		lblPassword.setBounds(87, 196, 207, 53);
		contentPane.add(lblPassword);
		
		txtuser = new JTextField();
		txtuser.setFont(new Font("Tahoma", Font.BOLD, 16));
		txtuser.setBounds(326, 118, 219, 32);
		contentPane.add(txtuser);
		txtuser.setColumns(10);
		
		passwordField = new JPasswordField();
		passwordField.setFont(new Font("Tahoma", Font.BOLD, 16));
		passwordField.setBounds(326, 203, 219, 32);
		contentPane.add(passwordField);
		
		btnLogin = new JButton("Login");
		btnLogin.setFont(new Font("Tahoma", Font.BOLD, 25));
		btnLogin.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				try
				{	
					Class.forName("com.mysql.cj.jdbc.Driver");
		            conn =DriverManager.getConnection("jdbc:mysql://localhost:3306/axisbanks?serverTimezone=UTC","root","");
					String Username = txtuser.getText().toString();
					String Password = passwordField.getText().toString();
					stmt = conn.createStatement();
					rs = stmt.executeQuery("select Password from login where Username = '"+Username+"' and Password = '"+Password+"'");
					if(rs.next())
					{
						mainmenus mm = new mainmenus();
						mm.setVisible(true);
						dispose();
					}
					else
					{
						JOptionPane.showMessageDialog(null, "Login Failed");
					}
					
					txtuser.setText("");
					passwordField.setText("");
					
				}catch(Exception ex)
				
				
				{
					System.out.println(ex);
				}
			}
		});
		btnLogin.setBounds(259, 297, 131, 37);
		contentPane.add(btnLogin);
		
		btnNewAccount = new JButton("New Account ");
		btnNewAccount.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				newuser n = new newuser();
				n.setVisible(true);
				setVisible(false);
				
				//NewAccount na = new NewAccount();
				//na.setVisible(true);
				//dispose();
			}
		});
		btnNewAccount.setFont(new Font("Tahoma", Font.BOLD, 25));
		btnNewAccount.setBounds(435, 297, 225, 37);
		contentPane.add(btnNewAccount);
	}

}
