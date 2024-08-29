/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package database;

/**
 *
 * @author nithish
 */

import java.sql.*;
import java.util.*;

public class Database {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws Exception{
        // TODO code application logic here
        Class.forName("org.sqlite.JDBC");

        Connection con = DriverManager.getConnection("jdbc:sqlite:/home/nithish/MyJava/sql/univ.db");

        Statement stm = con.createStatement();

        ResultSet rs = stm.executeQuery("select * from dept");

        int dno;
        String dname;

        while (rs.next()) {

            dno = rs.getInt("deptno");
            dname = rs.getString("dname");

            System.out.println(dno + " " + dname);

        }
        
        PreparedStatement stm1 = con.prepareStatement("select * from students where deptno=?");
        Scanner in= new Scanner(System.in);
        System.out.println("Enter the dept no: ");
        dno = in.nextInt();
        stm1.setInt(1,dno);     //the first value is placeholder value (starts from 1) and 2nd is the value we are mentioning
        
        rs= stm1.executeQuery();
        
        while(rs.next())
        {
            System.out.print(rs.getInt("roll")+" ");
            System.out.print(rs.getString("name")+" ");
            System.out.print(rs.getString("city")+" ");
            System.out.println(rs.getInt(4) + " ");     //This is the placeholder value - 4 (starting from 1)
        }
        
        stm.close();
        con.close();
    }
    
}

/*
Statement is an interface-we dont create it's object
we create an object of connection which implements statement 

prepared statements are usefull to modify the query with minimal changes in code 


callable statements are used for invoking stored procedures 

*/