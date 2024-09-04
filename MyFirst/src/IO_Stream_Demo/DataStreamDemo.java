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
    float avg;
    String dept;
}

public class DataStreamDemo {
    public static void main(String[] args) throws Exception {
        // In the PrintStream demo, we had to typecast the elements to the required data type, 
        // but in the DataStream, the data will be stored in their own data type.

//        FileOutputStream fos = new FileOutputStream("/home/nithish/MyJava/TestDataOutputStream.txt");
//        DataOutputStream dos = new DataOutputStream(fos);
//        
//        Student s = new Student();
//        s.rollno = 10;
//        s.name = "John";
////        s.avg = 80.5f;
//        s.dept = "CSE";
//        
//        dos.writeInt(s.rollno);
//        dos.writeUTF(s.name);
//        dos.writeFloat(s.avg);
//        dos.writeUTF(s.dept);
//        
//        dos.close();
//        fos.close();
        
        // The below is for the DataInputStream.
        FileInputStream fis = new FileInputStream("/home/nithish/MyJava/TestDataOutputStream.txt");
        DataInputStream dis = new DataInputStream(fis);
        
        Student s = new Student();
        
        s.rollno = dis.readInt();
//        s.avg = dis.readFloat();
        s.name = dis.readUTF();
        s.dept = dis.readUTF();
        
        System.out.println("Roll no: " + s.rollno);
        System.out.println("Name: " + s.name);
        System.out.println("Dept: " + s.dept);
        
        dis.close();
        fis.close();
    }
}
