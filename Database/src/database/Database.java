package database;

import java.sql.*;
import java.util.*;

/**
 * Demonstrates database operations using JDBC with SQLite.
 * This includes connecting to a database, executing queries, and retrieving data.
 * 
 * @author nithish
 */
public class Database {

    public static void main(String[] args) throws Exception {
        // Load the SQLite JDBC driver
        Class.forName("org.sqlite.JDBC");

        // Establish a connection to the database
        Connection con = DriverManager.getConnection("jdbc:sqlite:/home/nithish/MyJava/sql/univ.db");

        // Create a statement object for executing SQL queries
        Statement stm = con.createStatement();

        // Execute a query to retrieve all records from the 'dept' table
        ResultSet rs = stm.executeQuery("SELECT * FROM dept");

        int dno;
        String dname;

        // Iterate through the result set and print department details
        while (rs.next()) {
            dno = rs.getInt("deptno");
            dname = rs.getString("dname");
            System.out.println(dno + " " + dname);
        }
        
        // Prepare a statement to retrieve students based on department number
        PreparedStatement stm1 = con.prepareStatement("SELECT * FROM students WHERE deptno = ?");
        Scanner in = new Scanner(System.in);
        System.out.print("Enter the department number: ");
        dno = in.nextInt();
        stm1.setInt(1, dno); // Set the department number in the query

        // Execute the query and retrieve the results
        rs = stm1.executeQuery();

        // Iterate through the result set and print student details
        while (rs.next()) {
            System.out.print(rs.getInt("roll") + " ");
            System.out.print(rs.getString("name") + " ");
            System.out.print(rs.getString("city") + " ");
            System.out.println(rs.getInt(4)); // Access the 4th column directly
        }
        
        // Close resources
        rs.close();
        stm1.close();
        stm.close();
        con.close();
        in.close();
    }
}

/*
 * Notes:
 * 1. `Statement` is used for executing static SQL queries.
 * 2. `PreparedStatement` is used for executing parameterized SQL queries.
 *    It is useful when the same query is executed multiple times with different parameters.
 * 3. `CallableStatement` is used for executing stored procedures.
 */
