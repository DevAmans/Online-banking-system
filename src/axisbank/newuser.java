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
import javax.swing.JPasswordField;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.awt.event.ActionEvent;
import java.awt.Color;

public class newuser extends JFrame {
	
	Connection conn;
	ResultSet rs;
	java.sql.PreparedStatement insert;
	private JPanel contentPane;
	private JPasswordField txtpassword;
	private JTextField txtemail;
	private JTextField txtphone;
	private JTextField txtusername;
	private JTextField txtname;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					newuser frame = new newuser();
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
	public newuser() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 670, 484);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(175, 238, 238));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel label = new JLabel("New Account");
		label.setFont(new Font("Snap ITC", Font.BOLD, 40));
		label.setBounds(147, 11, 349, 46);
		contentPane.add(label);
		
		JLabel label_1 = new JLabel("Name");
		label_1.setFont(new Font("Tahoma", Font.BOLD, 20));
		label_1.setBounds(84, 82, 91, 25);
		contentPane.add(label_1);
		
		JLabel label_2 = new JLabel("Username");
		label_2.setFont(new Font("Tahoma", Font.BOLD, 20));
		label_2.setBounds(84, 137, 117, 25);
		contentPane.add(label_2);
		
		JLabel label_3 = new JLabel("Mobile");
		label_3.setFont(new Font("Tahoma", Font.BOLD, 20));
		label_3.setBounds(84, 188, 91, 25);
		contentPane.add(label_3);
		
		JLabel label_4 = new JLabel("Email");
		label_4.setFont(new Font("Tahoma", Font.BOLD, 20));
		label_4.setBounds(84, 245, 91, 25);
		contentPane.add(label_4);
		
		JLabel label_5 = new JLabel("Password");
		label_5.setFont(new Font("Tahoma", Font.BOLD, 20));
		label_5.setBounds(84, 300, 117, 25);
		contentPane.add(label_5);
		
		txtpassword = new JPasswordField();
		txtpassword.setFont(new Font("Tahoma", Font.BOLD, 16));
		txtpassword.setBounds(243, 300, 193, 25);
		contentPane.add(txtpassword);
		
		txtemail = new JTextField();
		txtemail.setFont(new Font("Tahoma", Font.BOLD, 16));
		txtemail.setColumns(10);
		txtemail.setBounds(243, 245, 193, 25);
		contentPane.add(txtemail);
		
		txtphone = new JTextField();
		txtphone.setFont(new Font("Tahoma", Font.BOLD, 16));
		txtphone.setColumns(10);
		txtphone.setBounds(243, 188, 193, 25);
		contentPane.add(txtphone);
		
		txtusername = new JTextField();
		txtusername.setFont(new Font("Tahoma", Font.BOLD, 16));
		txtusername.setColumns(10);
		txtusername.setBounds(243, 137, 193, 25);
		contentPane.add(txtusername);
		
		txtname = new JTextField();
		txtname.setFont(new Font("Tahoma", Font.BOLD, 16));
		txtname.setColumns(10);
		txtname.setBounds(243, 82, 193, 25);
		contentPane.add(txtname);
		//java.sql.PreparedStatement insert;
		JButton button = new JButton("Create");
		button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				
				try
				{
					String name = txtname.getText();
		            String username = txtusername.getText();
		            String phone = txtphone.getText();
			        Long mob=Long.parseLong(phone);
		            String email = txtemail.getText();
		            String password = txtpassword.getText();

				Class.forName("com.mysql.cj.jdbc.Driver");
	             conn =DriverManager.getConnection("jdbc:mysql://localhost:3306/axisbanks?serverTimezone=UTC","root","");
	            
	        String query ="INSERT INTO newaccount(name, username, phone, email, password)"+" VALUES (?,?,?,?,?)";
	            
	           
	            
	            
	            
	            insert = conn.prepareStatement(query);
	            insert.setString(1, name);
	            insert.setString(2, username);
	            insert.setLong(3,mob);
	            insert.setString(4,email);
	            insert.setString(5,password);
	            insert.execute();
	           // rs=insert.executeQuery();
	            
	            	JOptionPane.showMessageDialog(null,"Created Successfully.......");
	          
	            
				}catch(Exception ex)
				{
					System.out.println(ex);
				}
			}
		});
		button.setFont(new Font("Tahoma", Font.BOLD, 24));
		button.setBounds(147, 371, 140, 37);
		contentPane.add(button);
		
		JButton button_1 = new JButton("Cancel");
		button_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				LLL l = new LLL();
				l.setVisible(true);
				setVisible(false);
				
			}
		});
		button_1.setFont(new Font("Tahoma", Font.BOLD, 24));
		button_1.setBounds(339, 371, 140, 37);
		contentPane.add(button_1);
	}

}
