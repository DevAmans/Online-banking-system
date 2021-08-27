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
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.JLabel;
import javax.swing.GroupLayout.Alignment;
import javax.swing.GroupLayout;
import javax.swing.LayoutStyle.ComponentPlacement;
import javax.swing.event.AncestorListener;
import javax.swing.event.AncestorEvent;
import java.awt.Color;
import javax.swing.ImageIcon;
import java.awt.Font;

/**
 *
 * @author kg223
 */
public class BalanceCheck extends javax.swing.JInternalFrame {

    
    
        Connection conn;
        PreparedStatement pst;
        ResultSet rs;
    /**
     * Creates new form BalanceCheck
     */
    public BalanceCheck() {
        initComponents();
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
        jLabel1 = new javax.swing.JLabel();
        jLabel1.setBounds(57, 105, 386, 47);
        txtacc = new javax.swing.JTextField();
        txtacc.setFont(new Font("Tahoma", Font.BOLD, 22));
        txtacc.setBounds(97, 181, 284, 35);
        jButton1 = new javax.swing.JButton();
        jButton1.setForeground(new Color(255, 0, 0));
        jButton1.setBounds(500, 196, 194, 46);
        jButton2 = new javax.swing.JButton();
        jButton2.setForeground(new Color(255, 0, 0));
        jButton2.setBounds(500, 279, 194, 46);
        jLabel2 = new javax.swing.JLabel();
        jLabel2.setForeground(new Color(0, 0, 139));
        jLabel2.setBounds(513, 380, 114, 35);
        jLabel3 = new javax.swing.JLabel();
        jLabel3.setForeground(Color.GREEN);
        jLabel3.setBounds(496, 435, 161, 53);
        jLabel4 = new javax.swing.JLabel();
        jLabel4.setForeground(new Color(0, 0, 139));
        jLabel4.setFont(new Font("Arial Black", Font.BOLD, 20));
        jLabel4.setBounds(41, 309, 172, 49);
        jLabel5 = new javax.swing.JLabel();
        jLabel5.setForeground(new Color(0, 0, 139));
        jLabel5.setFont(new Font("Arial Black", Font.BOLD, 20));
        jLabel5.setBounds(41, 384, 172, 47);
        jLabel6 = new javax.swing.JLabel();
        jLabel6.setForeground(new Color(0, 0, 128));
        jLabel6.setBounds(243, 311, 148, 47);
        jLabel7 = new javax.swing.JLabel();
        jLabel7.setForeground(new Color(0, 0, 128));
        jLabel7.setBounds(243, 380, 148, 47);
        jLabel8 = new javax.swing.JLabel();
        jLabel8.setForeground(new Color(0, 0, 139));
        jLabel8.setFont(new Font("Arial Black", Font.BOLD, 20));
        jLabel8.setBounds(41, 239, 172, 47);
        jLabel9 = new javax.swing.JLabel();
        jLabel9.setForeground(new Color(0, 0, 128));
        jLabel9.setBounds(243, 239, 148, 50);

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Balance Check", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 1, 24))); // NOI18N
        jPanel1.setForeground(new java.awt.Color(153, 255, 255));

        jLabel1.setFont(new Font("Arial", Font.BOLD, 40)); // NOI18N
        jLabel1.setText("Enter Account No");
        jLabel1.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        jButton1.setFont(new Font("Tahoma", Font.BOLD, 40)); // NOI18N
        jButton1.setText("Search");
        jButton1.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton2.setFont(new Font("Tahoma", Font.BOLD, 40)); // NOI18N
        jButton2.setText("Cancel");
        jButton2.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jLabel2.setFont(new Font("Arial Black", Font.BOLD, 20)); // NOI18N
        jLabel2.setText("Balance");
        jLabel2.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        jLabel3.setFont(new Font("Arial Black", Font.BOLD, 32)); // NOI18N
        jLabel3.setText("jLabel3");
        jLabel3.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        jLabel4.setText("First Name");
        jLabel4.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        jLabel5.setText("Last Name");
        jLabel5.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        jLabel6.setFont(new Font("Tahoma", Font.BOLD, 30)); // NOI18N
        jLabel6.setText("jLabel6");
        jLabel6.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        jLabel7.setFont(new Font("Tahoma", Font.BOLD, 30)); // NOI18N
        jLabel7.setText("jLabel7");
        jLabel7.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        jLabel8.setText("Customer ID");
        jLabel8.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        jLabel9.setFont(new Font("Tahoma", Font.BOLD, 30)); // NOI18N
        jLabel9.setText("jLabel9");
        jLabel9.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        layout.setHorizontalGroup(
        	layout.createParallelGroup(Alignment.LEADING)
        		.addComponent(jPanel1, GroupLayout.DEFAULT_SIZE, 732, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
        	layout.createParallelGroup(Alignment.LEADING)
        		.addGroup(layout.createSequentialGroup()
        			.addComponent(jPanel1, GroupLayout.DEFAULT_SIZE, 512, Short.MAX_VALUE)
        			.addContainerGap())
        );
        jPanel1.setLayout(null);
        jPanel1.add(jLabel1);
        jPanel1.add(txtacc);
        jPanel1.add(jLabel2);
        jPanel1.add(jLabel5);
        jPanel1.add(jLabel8);
        jPanel1.add(jLabel4);
        jPanel1.add(jLabel9);
        jPanel1.add(jButton1);
        jPanel1.add(jButton2);
        jPanel1.add(jLabel6);
        jPanel1.add(jLabel7);
        jPanel1.add(jLabel3);
        
        lblNewLabel = new JLabel("");
        lblNewLabel.setBackground(new Color(175, 238, 238));
        lblNewLabel.setIcon(new ImageIcon("C:\\Users\\AMON HCV\\Desktop\\banner-glance.jpg"));
        lblNewLabel.setBounds(0, 0, 1028, 827);
        jPanel1.add(lblNewLabel);
        getContentPane().setLayout(layout);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
        setVisible(false);
        
        
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
            try {
                // TODO add your handling code here:
                String accno = txtacc.getText();
                Class.forName("com.mysql.cj.jdbc.Driver");
                conn = DriverManager.getConnection("jdbc:mysql://localhost/axisbanks?serverTimezone=UTC","root","");
                
                pst = conn.prepareStatement("Select c.cust_id,c.firstname,c.lastname,a.balance from customer c, account a where c.cust_id = a.cust_id and a.acc_id =?");
                pst.setString(1,accno);
                rs = pst.executeQuery();
                if(rs.next()==false)
            {
                JOptionPane.showMessageDialog(this,"Account not Found");
            }
                else
                {
                     String id = rs.getString(1);
                    String firstname = rs.getString(2);
                    String lastname = rs.getString(3);
                    String balance = rs.getString(4);
                    
                    jLabel9.setText(id.trim());
                    jLabel6.setText(firstname.trim());
                    jLabel7.setText(lastname.trim());
                    jLabel3.setText(balance.trim());
                }
                

                
                
            } catch (ClassNotFoundException ex) {
                Logger.getLogger(BalanceCheck.class.getName()).log(Level.SEVERE, null, ex);
            } catch (SQLException ex) {
                Logger.getLogger(BalanceCheck.class.getName()).log(Level.SEVERE, null, ex);
            }
    }//GEN-LAST:event_jButton1ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JTextField txtacc;
    private JLabel lblNewLabel;
    // End of variables declaration//GEN-END:variables
}
