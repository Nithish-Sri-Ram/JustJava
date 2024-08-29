/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package IO_Stream_Demo;

/**
 *
 * @author nithish
 */

//File input stream is to attach to a source but buffered input stream is used to attach to a substring
//SO we need file input stream over that we'll atach buffered input Stream
//Buffer is usually used to match the speed between your source and destination

import java.io.*;

public class BufferedStreamDemo {
    public static void main(String []args) throws Exception
    {
        FileInputStream fis=new FileInputStream("/home/nithish/MyJava/Test.txt");
        BufferedInputStream bis=new BufferedInputStream(fis);
        
        int x;
        while((x=bis.read())!=-1){
            System.out.print((char)x);
        }
        //Now what is the use of buffered stream?
        FileInputStream fis1=new FileInputStream("/home/nithish/MyJava/Test.txt");
        System.out.println("File: "+fis1.markSupported());
        BufferedInputStream bis1=new BufferedInputStream(fis1);      //false
        System.out.println("Buffer: "+bis1.markSupported());        //true
        
        //Using file we can't move backward but we can go backward with the buffer input stream 
        System.out.print((char)bis1.read());
        System.out.print((char)bis1.read());
        System.out.print((char)bis1.read());        
        bis1.mark(10);      //After reading the abvove 3 chars we are setting a mark which is valid for 10 char's
        System.out.print((char)bis1.read());        
        System.out.print((char)bis1.read());        
        bis1.reset();
        System.out.print((char)bis1.read());        //It will repeat the same char's after reset() is called from where it was set as mark
        System.out.print((char)bis1.read());        //Here we can see the rn in repeated again and again it is because th mark wa s set on r
        
        
        //The above set of things can be done using a filereader and BufferedReader too
        //We can also read an entire string or stream of chars using the below approach because buffered reader reads a  char - set of chars
//        System.out.println(bis1.readLine());        //This is only possible with file reader
        
        
    }
}
