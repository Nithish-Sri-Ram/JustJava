package LangPackages;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author nithish
 */

       
//        normal string classes are immutable 
//        string builder class has append() and insert() methods in the string builder class
//        the initial capacity of the string builder array is 16 but it will automatically increase and decrease the size 
//        It is thread safe - more than 1 thread can't utilize string buffer classes at the same time

//        String builder class is same as the string builder class but is not thread safe - it allows more than 1 thread to access the methods of the class 

public class StringBufferBuilder {
    public static void main(String []args)
    {
        String s1=new String("Hello");
        StringBuffer s2=new StringBuffer("Hello");
        StringBuilder s3=new StringBuilder("Hello");
        
        s1.concat(" World");
        s2.append(" World");
        s3.append(" World");
        
        System.out.println(s1);
        System.out.println(s2);
        System.out.println(s3);
        
    }
}
