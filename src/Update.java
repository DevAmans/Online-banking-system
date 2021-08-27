
import java.sql.DriverManager;
import java.sql.PreparedStatement;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author kg223
 */
import java.sql.*;
public class Update {
    public static void main(String[] args)
    {try {
     Class.forName("com.mysql.jdbc.Driver");
            Connection conn= DriverManager.getConnection("jdbc:mysql://localhost:3306/axisbank","root","");
            conn.setAutoCommit(false);
            //int balance=balan-amount;
          //  System.out.print(balance);
            //Statement stm=conn1.createStatement();
            String query="UPDATE customer set phone = 45445 where cust_id='CS005'";   
            //PreparedStatement ps=conn.prepareStatement(query);
            //ps.setInt(1,5000);
            //ps.setString(2,"A005");
           // ps.executeQuery();
            Statement stm=conn.createStatement();
            stm.execute(query);
            System.out.print("added");
    }
    catch(Exception e)
    {System.out.print(e);}
}
}