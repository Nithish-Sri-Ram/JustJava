/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package IO_Stream_Demo;

/**
 *
 * @author nithish
 */

import java.io.*;

class Student {
    int rollno;
    String name;
    String dept;
}

public class PrintStreamDemo {
    // This is for writing the data to a file using PrintStream.
    
    // ps -> fos -> file: Here, PrintStream stores the value as a string (the program is fed into the file via PrintStream).
    
//    public static void main(String args[]) throws Exception {
//        FileOutputStream fos = new FileOutputStream("/home/nithish/MyJava/Test.txt");
//        PrintStream ps = new PrintStream(fos);
//        
//        Student s = new Student();
//        s.rollno = 10;
//        s.name = "Nithish";
//        s.dept = "CSE";
//        
//        ps.println(s.rollno);
//        ps.println(s.name);
//        ps.println(s.dept);
//        
//        ps.close();
//        fos.close();
//    }
    
    // This is for taking input from a file.
    
    // fis <- file: The value here is not stored in its original data type; it is typecast according to the requirement.
    
    public static void main(String[] args) throws Exception {
        FileInputStream fis = new FileInputStream("/home/nithish/MyJava/Test.txt");
        BufferedReader br = new BufferedReader(new InputStreamReader(fis));
        
        Student s = new Student();
        s.rollno = Integer.parseInt(br.readLine());
        s.name = br.readLine();
        s.dept = br.readLine();
        
        System.out.println("Roll No: " + s.rollno);
        System.out.println("Name: " + s.name);
        System.out.println("Department: " + s.dept);
        
        br.close();
        fis.close();
    }
}
