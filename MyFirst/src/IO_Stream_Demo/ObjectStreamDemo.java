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


//when we want to use object stream we have to implement the Serializable interface
class Student implements Serializable
{
    private int rollno;
    private String name;
    private float avg;
    private String dept;
    public static int Data=10;
    public transient int t;
    //Static and transient data won't be available to write in the ObjectStream 
    public Student()
    {
        
    }
    public Student(int r, String n,float a,String d)
    {
        rollno=r;
        name=n;
        avg=a;
        dept=d;
        Data=500;
        t=500;
    }
    
    public String toString()
    {
        return "\nStudent Details\n"+
                "\nRoll "+rollno+
                "\nName "+name+
                "\nAverage"+avg+
                "\nDept"+dept+
                "\nData "+Data+
                "\nTransient "+t+'\n';
    }
}

public class ObjectStreamDemo {
    public static void main(String args[])throws Exception
    {
//        FileOutputStream fos=new FileOutputStream("/home/nithish/MyJava/TestObjectStream.txt");
//        ObjectOutputStream oos=new ObjectOutputStream(fos);
//        
//        Student s=new Student(10,"John",89.9f,"CSE");
//        oos.writeObject(s);
//        fos.close();
//        oos.close();
        
        FileInputStream fis=new FileInputStream("/home/nithish/MyJava/TestObjectStream.txt");
        ObjectInputStream ois=new ObjectInputStream(fis);
        
        Student s=(Student)ois.readObject();
        
        System.out.println(s);
        
        fis.close();
        ois.close();
        
    }
}
