package axisbank;

import java.awt.EventQueue;

import javax.swing.JInternalFrame;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

import com.mysql.jdbc.*;

import javax.swing.border.BevelBorder;
import javax.swing.JScrollPane;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.awt.event.ActionEvent;
import java.awt.Font;
import java.awt.Color;

public class CustomerRecord extends JInternalFrame {
	private JTable table;
	java.sql.PreparedStatement insert;
	ResultSet rs;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					CustomerRecord frame = new CustomerRecord();
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
	public CustomerRecord() {
		getContentPane().setBackground(new Color(175, 238, 238));
		setBounds(100, 100, 1217, 643);
		getContentPane().setLayout(null);
		
		JButton btnView = new JButton("View");
		btnView.setFont(new Font("Tahoma", Font.BOLD, 30));
		btnView.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try
				{
					Class.forName("com.mysql.cj.jdbc.Driver");
					Connection conn = DriverManager.getConnection("jdbc:mysql://localhost/axisbanks?serverTimezone=UTC","root","");
					 insert = conn.prepareStatement("select c.cust_id,c.firstname,c.lastname,c.fathername,c.phone,c.pancard,b.branch_name,c.email,c.adharcard,ad.city,ad.state from customer c,address ad,branch b where c.cust_id=ad.cust_id and c.branch_id=b.branch_id");
					rs = insert.executeQuery();
					DefaultTableModel tm =(DefaultTableModel)table.getModel();
					tm.setRowCount(0);
					while(rs.next())
					{
						Object o[] = {rs.getString("c.cust_id"),rs.getString("c.firstname"),rs.getString("c.lastname"),rs.getString("c.fathername"),rs.getString("ad.state"),rs.getLong("c.phone"),rs.getString("ad.city"),rs.getString("c.pancard"),rs.getString("b.branch_name"),rs.getString("c.email"),rs.getLong("c.adharcard")};
						tm.addRow(o);
					}
				}catch(Exception ex)
				{
					System.out.println(ex);
				}
			}
		});
		btnView.setBounds(283, 464, 162, 68);
		getContentPane().add(btnView);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(60, 66, 1131, 348);
		getContentPane().add(scrollPane);
		
		table = new JTable();
		scrollPane.setViewportView(table);
		table.setModel(new DefaultTableModel(
			new Object[][] {
				{null, null, null, null, null, null, null, null, null, null, null},
				{null, null, null, null, null, null, null, null, null, null, null},
				{null, null, null, null, null, null, null, null, null, null, null},
				{null, null, null, null, null, null, null, null, null, null, null},
				{null, null, null, null, null, null, null, null, null, null, null},
				{null, null, null, null, null, null, null, null, null, null, null},
				{null, null, null, null, null, null, null, null, null, null, null},
				{null, null, null, null, null, null, null, null, null, null, null},
				{null, null, null, null, null, null, null, null, null, null, null},
				{null, null, null, null, null, null, null, null, null, null, null},
				{null, null, null, null, null, null, null, null, null, null, null},
				{null, null, null, null, null, null, null, null, null, null, null},
				{null, null, null, null, null, null, null, null, null, null, null},
				{null, null, null, null, null, null, null, null, null, null, null},
				{null, null, null, null, null, null, null, null, null, null, null},
				{null, null, null, null, null, null, null, null, null, null, null},
				{null, null, null, null, null, null, null, null, null, null, null},
				{null, null, null, null, null, null, null, null, null, null, null},
				{null, null, null, null, null, null, null, null, null, null, null},
				{null, null, null, null, null, null, null, null, null, null, null},
			},
			new String[] {
				"Customer ID", "First Name", "Last Name", "Father Name", "State", "Phone", "City", "Pan Card", "Branch", "Email", "Adhar Card"
			}
		));
		table.getColumnModel().getColumn(0).setPreferredWidth(105);
		table.getColumnModel().getColumn(0).setMinWidth(25);
		table.getColumnModel().getColumn(1).setPreferredWidth(85);
		table.getColumnModel().getColumn(1).setMinWidth(25);
		table.getColumnModel().getColumn(2).setPreferredWidth(85);
		table.getColumnModel().getColumn(2).setMinWidth(25);
		table.getColumnModel().getColumn(3).setPreferredWidth(100);
		table.getColumnModel().getColumn(3).setMinWidth(25);
		table.getColumnModel().getColumn(4).setPreferredWidth(100);
		table.getColumnModel().getColumn(4).setMinWidth(25);
		table.getColumnModel().getColumn(5).setPreferredWidth(100);
		table.getColumnModel().getColumn(5).setMinWidth(25);
		table.getColumnModel().getColumn(6).setPreferredWidth(100);
		table.getColumnModel().getColumn(6).setMinWidth(25);
		table.getColumnModel().getColumn(7).setPreferredWidth(105);
		table.getColumnModel().getColumn(7).setMinWidth(25);
		table.getColumnModel().getColumn(8).setMinWidth(25);
		table.getColumnModel().getColumn(9).setPreferredWidth(130);
		table.getColumnModel().getColumn(9).setMinWidth(25);
		table.getColumnModel().getColumn(10).setPreferredWidth(125);
		
		JButton btnCancel = new JButton("Cancel");
		btnCancel.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				setVisible(false);
			}
		});
		btnCancel.setFont(new Font("Tahoma", Font.BOLD, 30));
		btnCancel.setBounds(509, 464, 162, 68);
		getContentPane().add(btnCancel);

	}
}
