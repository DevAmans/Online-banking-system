/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package axisbank;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import java.sql.Date.*;
import javax.swing.JTextField;
import javax.swing.JLabel;
import javax.swing.GroupLayout.Alignment;
import javax.swing.LayoutStyle.ComponentPlacement;
import javax.swing.filechooser.FileNameExtensionFilter;
import javax.swing.text.JTextComponent;
import javax.swing.GroupLayout;
import javax.swing.ImageIcon;
import java.awt.Color;
import javax.swing.JButton;
import javax.swing.JFileChooser;

import java.awt.Font;
import java.awt.Image;
import java.awt.event.ActionListener;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.InputStream;
import java.awt.event.ActionEvent;
import javax.swing.JPanel;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JComboBox;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;

/**
 *
 * @author kg223
 * @param <jDateChooser>
 */
public class Customer<jDateChooser> extends javax.swing.JInternalFrame {

    /**
     * Creates new form Customer
     */
   String filename;
    public Customer() {
        initComponents();
       autoID();
       branch();
      
      
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel1.setBackground(new Color(175, 238, 238));
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        txtfname = new javax.swing.JTextField();
        txtfname.addKeyListener(new KeyAdapter() {
        	@Override
        	public void keyTyped(KeyEvent e) {
        		
        		char c = e.getKeyChar();
        		if(!(Character.isAlphabetic(c) || (c == KeyEvent.VK_BACK_SPACE) || (c == KeyEvent.VK_SPACE) || (c == KeyEvent.VK_DELETE)))
        		{
        			e.consume();
        		}
        	}
        });
        txtlname = new javax.swing.JTextField();
        txtlname.addKeyListener(new KeyAdapter() {
        	@Override
        	public void keyTyped(KeyEvent e) {
        		
        		char c = e.getKeyChar();
        		if(!(Character.isAlphabetic(c) || (c == KeyEvent.VK_BACK_SPACE) || (c == KeyEvent.VK_SPACE) || (c == KeyEvent.VK_DELETE)))
        		{
        			e.consume();
        	}	}
        });
        txtfaname = new javax.swing.JTextField();
        txtfaname.addKeyListener(new KeyAdapter() {
        	@Override
        	public void keyTyped(KeyEvent e) {
        		
        		char c = e.getKeyChar();
        		if(!(Character.isAlphabetic(c) || (c == KeyEvent.VK_BACK_SPACE) || (c == KeyEvent.VK_SPACE) || (c == KeyEvent.VK_DELETE)))
        		{
        			e.consume();
        		}
        	}
        });
        txtcity = new javax.swing.JTextField();
        txtstate = new javax.swing.JTextField();
        txtemail = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        txtpan = new javax.swing.JTextField();
        txtpan.addKeyListener(new KeyAdapter() {
        	@Override
        	public void keyTyped(KeyEvent e) {
        		
        		
        	}
        });
        txtadhar = new javax.swing.JTextField();
        txtadhar.addKeyListener(new KeyAdapter() {
        	@Override
        	public void keyTyped(KeyEvent e) {
        		
        		if(!(Character.isDigit(e.getKeyChar())))
        		{
        			e.consume();
        		}if(txtadhar.getText().length() >=15)
        		{
        			e.consume();
        		}
        		
        		
        	}
        });
        //jDateChooser = new com.toEditor().calendar().JDateChooser();
        jLabel13 = new javax.swing.JLabel();
        txtphone = new javax.swing.JTextField();
        txtphone.addKeyListener(new KeyAdapter() {
        	@Override
        	public void keyTyped(KeyEvent e) {
        		
        		if(!(Character.isDigit(e.getKeyChar())))
        		{
        			e.consume();
        		}if(txtphone.getText().length() >=10)
        		{
        			e.consume();
        		}
        	}
        });
        jLabel14 = new javax.swing.JLabel();
        txtbrnchcode = new javax.swing.JTextField();
        txtbrnchcode.addKeyListener(new KeyAdapter() {
        	@Override
        	public void keyTyped(KeyEvent e) {
        		
        		if(!(Character.isDigit(e.getKeyChar())))
        		{
        			e.consume();
        		}if(txtbrnchcode.getText().length() >=5)
        		{
        			e.consume();
        		}
        	}
        });
        jLabel15 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        txtseqa = new javax.swing.JTextField();
        txtseqq = new javax.swing.JComboBox();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jLabel17 = new javax.swing.JLabel();
        txtbranch = new javax.swing.JComboBox();
        txtbranch.setModel(new DefaultComboBoxModel(new String[] {""}));
        jLabel1 = new javax.swing.JLabel();

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Customer", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 0, 14))); // NOI18N

        jLabel2.setFont(new java.awt.Font("Perpetua Titling MT", 1, 18)); // NOI18N
        jLabel2.setText("Customer No");
        jLabel2.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        jLabel3.setFont(new java.awt.Font("Perpetua Titling MT", 1, 18)); // NOI18N
        jLabel3.setText("First Name");
        jLabel3.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        jLabel4.setFont(new java.awt.Font("Perpetua Titling MT", 1, 18)); // NOI18N
        jLabel4.setText("Last Name");
        jLabel4.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        jLabel5.setFont(new java.awt.Font("Perpetua Titling MT", 1, 18)); // NOI18N
        jLabel5.setText("Father Name");
        jLabel5.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        jLabel6.setFont(new java.awt.Font("Perpetua Titling MT", 1, 18)); // NOI18N
        jLabel6.setText("City");
        jLabel6.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        jLabel7.setFont(new java.awt.Font("Perpetua Titling MT", 1, 18)); // NOI18N
        jLabel7.setText("State");
        jLabel7.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        jLabel8.setFont(new java.awt.Font("Perpetua Titling MT", 1, 18)); // NOI18N
        jLabel8.setText("Branch");
        jLabel8.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        jLabel9.setFont(new java.awt.Font("Perpetua Titling MT", 1, 18)); // NOI18N
        jLabel9.setText("Email");
        jLabel9.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        jLabel10.setFont(new java.awt.Font("Lucida Bright", 1, 18)); // NOI18N
        jLabel10.setText("Pan Card");
        jLabel10.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        jLabel11.setFont(new java.awt.Font("Lucida Bright", 1, 18)); // NOI18N
        jLabel11.setText("Adhar Card");
        jLabel11.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        jLabel12.setFont(new java.awt.Font("Lucida Bright", 1, 18)); // NOI18N
        jLabel12.setText("DOB");
        jLabel12.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        jLabel13.setFont(new java.awt.Font("Lucida Bright", 1, 18)); // NOI18N
        jLabel13.setText("Phone");
        jLabel13.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        jLabel14.setFont(new java.awt.Font("Lucida Bright", 3, 18)); // NOI18N
        jLabel14.setText("Branch Code");
        jLabel14.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        jLabel15.setFont(new java.awt.Font("Lucida Bright", 1, 18)); // NOI18N
        jLabel15.setText("Seq.Q");
        jLabel15.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        jLabel16.setFont(new java.awt.Font("Lucida Bright", 1, 18)); // NOI18N
        jLabel16.setText("Seq.A");
        jLabel16.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

	


        txtseqq.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Select", "What is your nick name?", "What is your favourite colour?", "What is your first school name?", "What is your mother maiden name?" }));

        jButton1.setFont(new java.awt.Font("Lucida Sans Unicode", 1, 24)); // NOI18N
        jButton1.setForeground(new java.awt.Color(255, 0, 0));
        jButton1.setText("Add");
        jButton1.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton2.setFont(new java.awt.Font("Lucida Sans Unicode", 1, 24)); // NOI18N
        jButton2.setForeground(new java.awt.Color(255, 0, 51));
        jButton2.setText("Cancel");
        jButton2.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jLabel17.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel17.setForeground(new java.awt.Color(204, 0, 204));
        jLabel17.setText("jLabel17");
        jLabel17.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jLabel17.setOpaque(true);

        txtbranch.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtbranchActionPerformed(evt);
            }
        });
        
        JLabel lblNewLabel = new JLabel("");
        
        btnNewButton = new JButton("Upload");
        btnNewButton.addActionListener(new ActionListener() 
        {
        	public void actionPerformed(ActionEvent arg0) 
        	{
        		JFileChooser chooser = new JFileChooser();
        		chooser.showOpenDialog(null);
        		File f = chooser.getSelectedFile();
        		filename = f.getAbsolutePath();
        		txt_filename.setText(filename);
        		Image getAbsolutePath = null;
        		ImageIcon icon = new ImageIcon(filename);
        		Image image = icon.getImage().getScaledInstance(lblNewLabel.getWidth(),lblNewLabel.getHeight(),Image.SCALE_SMOOTH);
        		lblNewLabel.setIcon(icon);
        		/*JButton image = new JButton("Upload");
        		image.addActionListener(new ActionListener() 
        		{
        		public void actionPerformed(ActionEvent e) 
        		{
        		JFileChooser file=new  JFileChooser();
        		file.setCurrentDirectory(new File(System.getProperty("user.home")));
        		FileNameExtensionFilter f= new FileNameExtensionFilter("*.Images","jpg","gif","png");
        		file.addChoosableFileFilter(f);
        		int result=file.showSaveDialog(null);
        		if(result==JFileChooser.APPROVE_OPTION) {
        		File selectedfile = file.getSelectedFile();
        		  String path = selectedfile.getAbsolutePath();
        		  System.out.println(path);
        		 
        		}
        		else if(result==JFileChooser.CANCEL_OPTION) {
        		System.out.print("");
        		}
        		}

        		}
        		);*/
        		
        	}
        });
        btnNewButton.setFont(new Font("Arial Black", Font.BOLD, 24));
        
        txt_filename = new JTextField();
        txt_filename.setColumns(10);
        
        day = new JComboBox();
        day.setModel(new DefaultComboBoxModel(new String[] {"Day", "1", "2", "3", "4", "5", "6", "7", "8", "9", "10", "11", "12", "13", "14", "15", "16", "17", "18", "19", "20", "21", "22", "23", "24", "25", "26", "27", "28", "29", "30", "31"}));
        
        month = new JComboBox();
        month.setModel(new DefaultComboBoxModel(new String[] {"Month", "January", "February", "March", "April", "May", "June", "July", "August", "September", "October", "November", "December"}));
        
        year = new JComboBox();
        year.setModel(new DefaultComboBoxModel(new String[] {"Year", "1990", "1991", "1992", "1993", "1994", "1995", "1996", "1997", "1998", "1999", "2000", "2001", "2002", "2003", "2004", "2005", "2006", "2007", "2008", "2009", "2010", "2011", "2012", "2013", "2014", "2015", "2016", "2017", "2018", "2019", "2020", "2021", "2022", "2023", "2024", "2025", "2026", "2027", "2028", "2029", "2030", "2031", "2032", "2033", "2034", "2035", "2036", "2037", "2038", "2039", "2040", "2041", "2042", "2043", "2044", "2045", "2046", "2047", "2048", "2049", "2050"}));

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1Layout.setHorizontalGroup(
        	jPanel1Layout.createParallelGroup(Alignment.LEADING)
        		.addGroup(jPanel1Layout.createSequentialGroup()
        			.addContainerGap()
        			.addGroup(jPanel1Layout.createParallelGroup(Alignment.LEADING)
        				.addGroup(jPanel1Layout.createSequentialGroup()
        					.addComponent(jLabel9, GroupLayout.PREFERRED_SIZE, 128, GroupLayout.PREFERRED_SIZE)
        					.addGap(53)
        					.addComponent(txtemail, 205, 205, 205))
        				.addGroup(jPanel1Layout.createSequentialGroup()
        					.addGroup(jPanel1Layout.createParallelGroup(Alignment.LEADING)
        						.addComponent(jLabel8, GroupLayout.DEFAULT_SIZE, 148, Short.MAX_VALUE)
        						.addComponent(jLabel2, Alignment.TRAILING, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        						.addComponent(jLabel6, GroupLayout.DEFAULT_SIZE, 148, Short.MAX_VALUE)
        						.addComponent(jLabel7, Alignment.TRAILING, GroupLayout.DEFAULT_SIZE, 148, Short.MAX_VALUE)
        						.addComponent(jLabel5, GroupLayout.DEFAULT_SIZE, 148, Short.MAX_VALUE)
        						.addComponent(jLabel4, GroupLayout.DEFAULT_SIZE, 148, Short.MAX_VALUE)
        						.addComponent(jLabel3, GroupLayout.DEFAULT_SIZE, 148, Short.MAX_VALUE))
        					.addGap(33)
        					.addGroup(jPanel1Layout.createParallelGroup(Alignment.LEADING)
        						.addComponent(txtcity, 205, 205, 205)
        						.addComponent(txtfaname, 205, 205, 205)
        						.addGroup(jPanel1Layout.createParallelGroup(Alignment.LEADING, false)
        							.addComponent(txtstate)
        							.addComponent(txtbranch, 0, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        							.addGroup(jPanel1Layout.createSequentialGroup()
        								.addGap(39)
        								.addComponent(jLabel17)
        								.addGap(85))
        							.addComponent(txtfname, 179, 179, Short.MAX_VALUE)
        							.addComponent(txtlname)))
        					.addPreferredGap(ComponentPlacement.RELATED)))
        			.addGroup(jPanel1Layout.createParallelGroup(Alignment.LEADING)
        				.addGroup(jPanel1Layout.createSequentialGroup()
        					.addGap(119)
        					.addGroup(jPanel1Layout.createParallelGroup(Alignment.LEADING)
        						.addComponent(jLabel14, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        						.addComponent(jLabel15, GroupLayout.DEFAULT_SIZE, 120, Short.MAX_VALUE)
        						.addComponent(jLabel16, GroupLayout.DEFAULT_SIZE, 120, Short.MAX_VALUE)
        						.addComponent(jLabel11, GroupLayout.DEFAULT_SIZE, 120, Short.MAX_VALUE)
        						.addComponent(jLabel10, GroupLayout.DEFAULT_SIZE, 120, Short.MAX_VALUE)
        						.addComponent(jLabel12, GroupLayout.DEFAULT_SIZE, 120, Short.MAX_VALUE)
        						.addComponent(jLabel13, GroupLayout.DEFAULT_SIZE, 120, Short.MAX_VALUE))
        					.addGap(51)
        					.addGroup(jPanel1Layout.createParallelGroup(Alignment.LEADING)
        						.addGroup(jPanel1Layout.createSequentialGroup()
        							.addGroup(jPanel1Layout.createParallelGroup(Alignment.LEADING)
        								.addComponent(txtseqq, 0, 199, Short.MAX_VALUE)
        								.addComponent(txtseqa, GroupLayout.DEFAULT_SIZE, 199, Short.MAX_VALUE)
        								.addComponent(txtbrnchcode, GroupLayout.DEFAULT_SIZE, 199, Short.MAX_VALUE)
        								.addComponent(txtphone, GroupLayout.DEFAULT_SIZE, 199, Short.MAX_VALUE)
        								.addGroup(jPanel1Layout.createParallelGroup(Alignment.TRAILING, false)
        									.addComponent(txtpan, Alignment.LEADING)
        									.addComponent(txtadhar, Alignment.LEADING, GroupLayout.DEFAULT_SIZE, 186, Short.MAX_VALUE)))
        							.addGap(78))
        						.addGroup(jPanel1Layout.createSequentialGroup()
        							.addComponent(day, GroupLayout.PREFERRED_SIZE, 56, GroupLayout.PREFERRED_SIZE)
        							.addPreferredGap(ComponentPlacement.UNRELATED)
        							.addComponent(month, GroupLayout.PREFERRED_SIZE, 70, GroupLayout.PREFERRED_SIZE)
        							.addGap(13)
        							.addComponent(year, GroupLayout.PREFERRED_SIZE, 72, GroupLayout.PREFERRED_SIZE)
        							.addPreferredGap(ComponentPlacement.RELATED)))
        					.addGroup(jPanel1Layout.createParallelGroup(Alignment.LEADING)
        						.addComponent(lblNewLabel, GroupLayout.PREFERRED_SIZE, 224, GroupLayout.PREFERRED_SIZE)
        						.addComponent(txt_filename, 224, 224, 224)
        						.addComponent(btnNewButton, GroupLayout.PREFERRED_SIZE, 182, GroupLayout.PREFERRED_SIZE))
        					.addGap(160))
        				.addGroup(jPanel1Layout.createSequentialGroup()
        					.addGap(98)
        					.addComponent(jButton1, GroupLayout.PREFERRED_SIZE, 110, GroupLayout.PREFERRED_SIZE)
        					.addGap(46)
        					.addComponent(jButton2, GroupLayout.PREFERRED_SIZE, 126, GroupLayout.PREFERRED_SIZE)
        					.addGap(571))))
        );
        jPanel1Layout.setVerticalGroup(
        	jPanel1Layout.createParallelGroup(Alignment.TRAILING)
        		.addGroup(jPanel1Layout.createSequentialGroup()
        			.addGap(31)
        			.addGroup(jPanel1Layout.createParallelGroup(Alignment.LEADING)
        				.addGroup(jPanel1Layout.createSequentialGroup()
        					.addGroup(jPanel1Layout.createParallelGroup(Alignment.LEADING)
        						.addGroup(jPanel1Layout.createParallelGroup(Alignment.TRAILING)
        							.addComponent(txtstate, GroupLayout.PREFERRED_SIZE, 30, GroupLayout.PREFERRED_SIZE)
        							.addGroup(jPanel1Layout.createSequentialGroup()
        								.addComponent(jLabel2)
        								.addGap(49)
        								.addComponent(jLabel3)
        								.addGap(101)
        								.addGroup(jPanel1Layout.createParallelGroup(Alignment.BASELINE)
        									.addComponent(jLabel5, GroupLayout.PREFERRED_SIZE, 33, GroupLayout.PREFERRED_SIZE)
        									.addComponent(txtfaname, GroupLayout.PREFERRED_SIZE, 35, GroupLayout.PREFERRED_SIZE))
        								.addGap(34)
        								.addGroup(jPanel1Layout.createParallelGroup(Alignment.BASELINE)
        									.addComponent(jLabel6, GroupLayout.PREFERRED_SIZE, 30, GroupLayout.PREFERRED_SIZE)
        									.addComponent(txtcity, GroupLayout.PREFERRED_SIZE, 31, GroupLayout.PREFERRED_SIZE))
        								.addGap(48)
        								.addComponent(jLabel7)))
        						.addGroup(jPanel1Layout.createParallelGroup(Alignment.TRAILING)
        							.addGroup(jPanel1Layout.createSequentialGroup()
        								.addComponent(jLabel17)
        								.addGap(49)
        								.addGroup(jPanel1Layout.createParallelGroup(Alignment.BASELINE)
        									.addComponent(txtfname, GroupLayout.PREFERRED_SIZE, 33, GroupLayout.PREFERRED_SIZE)
        									.addComponent(jLabel11, GroupLayout.PREFERRED_SIZE, 34, GroupLayout.PREFERRED_SIZE)
        									.addComponent(txtadhar, GroupLayout.PREFERRED_SIZE, 36, GroupLayout.PREFERRED_SIZE))
        								.addGroup(jPanel1Layout.createParallelGroup(Alignment.LEADING)
        									.addGroup(jPanel1Layout.createSequentialGroup()
        										.addGap(31)
        										.addGroup(jPanel1Layout.createParallelGroup(Alignment.BASELINE)
        											.addComponent(txtlname, GroupLayout.PREFERRED_SIZE, 31, GroupLayout.PREFERRED_SIZE)
        											.addComponent(jLabel4)))
        									.addGroup(jPanel1Layout.createSequentialGroup()
        										.addGap(39)
        										.addGroup(jPanel1Layout.createParallelGroup(Alignment.LEADING)
        											.addComponent(year, GroupLayout.PREFERRED_SIZE, 26, GroupLayout.PREFERRED_SIZE)
        											.addGroup(jPanel1Layout.createParallelGroup(Alignment.BASELINE)
        												.addComponent(day, GroupLayout.DEFAULT_SIZE, 29, Short.MAX_VALUE)
        												.addComponent(jLabel12, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        											.addComponent(month, GroupLayout.PREFERRED_SIZE, 26, GroupLayout.PREFERRED_SIZE))))
        								.addGap(275))
        							.addGroup(jPanel1Layout.createParallelGroup(Alignment.BASELINE)
        								.addComponent(txtbranch, GroupLayout.PREFERRED_SIZE, 31, GroupLayout.PREFERRED_SIZE)
        								.addComponent(jLabel8, GroupLayout.PREFERRED_SIZE, 31, GroupLayout.PREFERRED_SIZE))))
        					.addPreferredGap(ComponentPlacement.RELATED, 32, Short.MAX_VALUE)
        					.addGroup(jPanel1Layout.createParallelGroup(Alignment.LEADING)
        						.addComponent(txtemail, GroupLayout.PREFERRED_SIZE, 31, GroupLayout.PREFERRED_SIZE)
        						.addComponent(jLabel9, GroupLayout.PREFERRED_SIZE, 41, GroupLayout.PREFERRED_SIZE))
        					.addGap(25))
        				.addGroup(jPanel1Layout.createSequentialGroup()
        					.addGroup(jPanel1Layout.createParallelGroup(Alignment.TRAILING)
        						.addGroup(jPanel1Layout.createSequentialGroup()
        							.addGroup(jPanel1Layout.createParallelGroup(Alignment.BASELINE)
        								.addComponent(jLabel10, GroupLayout.PREFERRED_SIZE, 34, GroupLayout.PREFERRED_SIZE)
        								.addComponent(txtpan, GroupLayout.DEFAULT_SIZE, 35, Short.MAX_VALUE))
        							.addGap(177))
        						.addGroup(jPanel1Layout.createSequentialGroup()
        							.addComponent(lblNewLabel, GroupLayout.PREFERRED_SIZE, 201, GroupLayout.PREFERRED_SIZE)
        							.addGap(18)))
        					.addGroup(jPanel1Layout.createParallelGroup(Alignment.LEADING)
        						.addGroup(jPanel1Layout.createParallelGroup(Alignment.BASELINE)
        							.addComponent(txtphone, GroupLayout.PREFERRED_SIZE, 42, GroupLayout.PREFERRED_SIZE)
        							.addComponent(jLabel13, GroupLayout.PREFERRED_SIZE, 37, GroupLayout.PREFERRED_SIZE))
        						.addComponent(txt_filename, GroupLayout.PREFERRED_SIZE, 38, GroupLayout.PREFERRED_SIZE))
        					.addGap(26)
        					.addGroup(jPanel1Layout.createParallelGroup(Alignment.BASELINE)
        						.addComponent(btnNewButton, GroupLayout.PREFERRED_SIZE, 64, GroupLayout.PREFERRED_SIZE)
        						.addComponent(jLabel14, GroupLayout.PREFERRED_SIZE, 35, GroupLayout.PREFERRED_SIZE)
        						.addComponent(txtbrnchcode, GroupLayout.PREFERRED_SIZE, 36, GroupLayout.PREFERRED_SIZE))
        					.addGroup(jPanel1Layout.createParallelGroup(Alignment.LEADING, false)
        						.addGroup(jPanel1Layout.createSequentialGroup()
        							.addGap(18)
        							.addComponent(txtseqq, GroupLayout.PREFERRED_SIZE, 37, GroupLayout.PREFERRED_SIZE))
        						.addGroup(jPanel1Layout.createSequentialGroup()
        							.addGap(21)
        							.addComponent(jLabel15, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
        					.addGap(36)
        					.addGroup(jPanel1Layout.createParallelGroup(Alignment.BASELINE)
        						.addComponent(txtseqa, GroupLayout.DEFAULT_SIZE, 34, Short.MAX_VALUE)
        						.addComponent(jLabel16, GroupLayout.PREFERRED_SIZE, 33, GroupLayout.PREFERRED_SIZE))
        					.addGap(78)))
        			.addGap(93))
        		.addGroup(jPanel1Layout.createSequentialGroup()
        			.addContainerGap(543, Short.MAX_VALUE)
        			.addGroup(jPanel1Layout.createParallelGroup(Alignment.BASELINE)
        				.addComponent(jButton1, GroupLayout.PREFERRED_SIZE, 56, GroupLayout.PREFERRED_SIZE)
        				.addComponent(jButton2, GroupLayout.PREFERRED_SIZE, 56, GroupLayout.PREFERRED_SIZE))
        			.addGap(81))
        );
        jPanel1.setLayout(jPanel1Layout);

        jLabel1.setFont(new java.awt.Font("Algerian", 1, 36)); // NOI18N
        jLabel1.setText("Customer");
        jLabel1.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        layout.setHorizontalGroup(
        	layout.createParallelGroup(Alignment.TRAILING)
        		.addGroup(layout.createSequentialGroup()
        			.addGroup(layout.createParallelGroup(Alignment.LEADING)
        				.addComponent(jLabel1, GroupLayout.PREFERRED_SIZE, 216, GroupLayout.PREFERRED_SIZE)
        				.addComponent(jPanel1, GroupLayout.PREFERRED_SIZE, 1217, GroupLayout.PREFERRED_SIZE))
        			.addContainerGap(72, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
        	layout.createParallelGroup(Alignment.LEADING)
        		.addGroup(layout.createSequentialGroup()
        			.addComponent(jLabel1, GroupLayout.PREFERRED_SIZE, 28, GroupLayout.PREFERRED_SIZE)
        			.addPreferredGap(ComponentPlacement.RELATED, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        			.addComponent(jPanel1, GroupLayout.PREFERRED_SIZE, 675, GroupLayout.PREFERRED_SIZE)
        			.addContainerGap())
        );
        getContentPane().setLayout(layout);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    Connection conn;
            PreparedStatement insert;
    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        try {
      
            // TODO add your handling code here:
        	autoID();
        	String customer_id = jLabel17.getText();
            String firstname = txtfname.getText();
            String lastname = txtlname.getText();
            String fathername = txtfaname.getText();
            String state = txtstate.getText();
            String city = txtcity.getText();
            String phone = txtphone.getText();
           Long mob=Long.parseLong(phone);
            String pan = txtpan.getText();
            String adhar = txtadhar.getText();
            Long aadhar=Long.parseLong(adhar);
            String email = txtemail.getText();
            String seq_a = txtseqa.getText();
            String seq_q = txtseqq.getSelectedItem().toString();
            String branchcode = txtbrnchcode.getText();
            Integer brnch=Integer.parseInt(branchcode);
            String branch = txtbranch.getSelectedItem().toString();
            String date_of_birth = day.getSelectedItem().toString()+"/"+month.getSelectedItem().toString()+"/"+year.getSelectedItem().toString();
           
            
          
            // Date dob = StringDate("2015-12-06 ");

            
            PreparedStatement conn1;
            Class.forName("com.mysql.cj.jdbc.Driver");
            conn =DriverManager.getConnection("jdbc:mysql://localhost:3306/axisbanks?serverTimezone=UTC","root","");
            String image = txt_filename.getText();
            image = image.replace("\\","\\\\");
            String query="insert into customer(cust_id,firstname,lastname,fathername,phone,pancard,branch,email,adharcard,branchcode,Seq_Qu,Seq_An,image,dob)"+"values(?,?,?,?,?,?,?,?,?,?,?,?,?,?)";
            String query1="insert into address(state,city)"+"values(?,?)"; 
            insert = conn.prepareStatement(query);
            conn1 = conn.prepareStatement(query1);
            String s = null;
            InputStream is = new FileInputStream(new File(filename));
            insert.setString(1,customer_id);
            insert.setString(2,firstname);
            insert.setString(3,lastname);
            insert.setString(4,fathername);
            insert.setLong(5,mob);
            insert.setString(6,pan);
            insert.setString(7,branch);
            insert.setString(8,email);
            insert.setLong(9,aadhar);
            insert.setInt(10,brnch);
          // insert.setString(12,pan);
            insert.setString(11,seq_q);
            insert.setString(12, seq_a);
            insert.setBlob(13, is);
            insert.setString(14,date_of_birth);
            conn1.setString(2,state);
            conn1.setString(3,city);
           // insert.setDate(15, (java.sql.Date) dob);
           // insert.setDate(15, (java.sql.Date) dob);
            insert.executeUpdate();
            conn1.executeUpdate();
            
           
          
            JOptionPane.showMessageDialog(this,"Record Added");
            
           
            txtfname.setText("");
            txtlname.setText("");
            txtstate.setText("");
            txtcity.setText("");
            txtphone.setText("");
            txtseqq.setSelectedIndex(-1);
            txtbranch.setSelectedIndex(-1);
            txtfaname.setText("");
            txtstate.setText("");
            txtbrnchcode.setText("");
            txtpan.setText("");
            txtadhar.setText("");
            txtemail.setText("");
            txtseqa.setText("");
           
            //txtdate.setDate("");
            
            
           
            txtfname.requestFocus();
            conn.close();
            
            
            
            
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(Customer.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            Logger.getLogger(Customer.class.getName()).log(Level.SEVERE, null, ex);
        } catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
        
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
        
               
               setVisible(false);
               dispose();
    }//GEN-LAST:event_jButton2ActionPerformed

    private void txtbranchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtbranchActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtbranchActionPerformed
       

        
    
   
        public void autoID()
        {
            try
            {
                
                    Class.forName("com.mysql.cj.jdbc.Driver");
                    conn = DriverManager.getConnection("jdbc:mysql://localhost/axisbanks?serverTimezone=UTC","root","");
                    Statement s = (Statement)conn.createStatement();
                   // JOptionPane.showMessageDialog(null,"Connected");
                    ResultSet rs = s.executeQuery("select MAX(cust_id) from customer");
                    rs.next();
                    rs.getString("MAX(cust_id)");
                    
                    if(rs.getString("MAX(cust_id)")==null)
                    {
                        jLabel17.setText("CS001");
                    }
                    else
                    {
                        long id = Long.parseLong(rs.getString("MAX(cust_id)").substring(2,rs.getString("MAX(cust_id)").length()));
                        id++;
                        
                        jLabel17.setText("CS" + String.format("%03d" ,id));
                    }
                    
                   
            } catch (ClassNotFoundException ex) {
            Logger.getLogger(Customer.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            Logger.getLogger(Customer.class.getName()).log(Level.SEVERE, null, ex);
        }
        }
    
    
    public void branch() 
    {
        try
        {
        	Class.forName("com.mysql.cj.jdbc.Driver");
            conn = DriverManager.getConnection("jdbc:mysql://localhost/axisbanks?serverTimezone=UTC","root","");
            insert = conn.prepareStatement("select * from branch");
            ResultSet rs = insert.executeQuery();
            txtbranch.removeAllItems();
            while(rs.next())
            {
                txtbranch.addItem(rs.getString(2));
            }
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(Customer.class.getName()).log(Level.SEVERE, null, ex);
        }catch(SQLException ex)
        {
            Logger.getLogger(Customer.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    
    
    
    
    
    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    //private com.toedter.calendar.JDateChooser jDateChooser;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JTextField txtadhar;
    private javax.swing.JComboBox txtbranch;
    private javax.swing.JTextField txtbrnchcode;
    private javax.swing.JTextField txtcity;
    private javax.swing.JTextField txtemail;
    private javax.swing.JTextField txtfaname;
    private javax.swing.JTextField txtfname;
    private javax.swing.JTextField txtlname;
    private javax.swing.JTextField txtpan;
    private javax.swing.JTextField txtphone;
    private javax.swing.JTextField txtseqa;
    private javax.swing.JComboBox txtseqq;
    private javax.swing.JTextField txtstate;
    private JButton btnNewButton;
    private JTextField txt_filename;
    private JComboBox day;
    private JComboBox month;
    private JComboBox year;
    // End of variables declaration//GEN-END:variables

    private void exit() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    private Date StringToDate(String _170300) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    private Date StringDate(String _170300) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
