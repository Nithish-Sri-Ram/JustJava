/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package IO_Stream_Demo;

/**
 *
 * @author nithish
 */

// FileInputStream is used to attach to a source, but BufferedInputStream is used to attach to a substring.
// So, we need FileInputStream, and over that, we'll attach BufferedInputStream.
// A buffer is usually used to match the speed between your source and destination.

import java.io.*;

public class BufferedStreamDemo {
    public static void main(String[] args) throws Exception {
        FileInputStream fis = new FileInputStream("/home/nithish/MyJava/Test.txt");
        BufferedInputStream bis = new BufferedInputStream(fis);
        
        int x;
        while ((x = bis.read()) != -1) {
            System.out.print((char) x);
        }
        
        // Now, what is the use of a buffered stream?
        FileInputStream fis1 = new FileInputStream("/home/nithish/MyJava/Test.txt");
        System.out.println("File: " + fis1.markSupported());
        BufferedInputStream bis1 = new BufferedInputStream(fis1); // BufferedInputStream supports marking, whereas FileInputStream does not.
        System.out.println("Buffer: " + bis1.markSupported());
        
        // Using FileInputStream, we can't move backward, but we can go backward with BufferedInputStream.
        System.out.print((char) bis1.read());
        System.out.print((char) bis1.read());
        System.out.print((char) bis1.read());
        
        bis1.mark(10); // After reading the above 3 chars, we are setting a mark which is valid for 10 chars.
        System.out.print((char) bis1.read());
        System.out.print((char) bis1.read());
        
        bis1.reset();
        System.out.print((char) bis1.read()); // It will repeat the same chars after reset() is called from where the mark was set.
        System.out.print((char) bis1.read()); // Here we can see the repeated chars because the mark was set earlier.
        
        // The above set of actions can be done using a FileReader and BufferedReader too.
        // We can also read an entire string or stream of chars using the below approach because BufferedReader reads a char - set of chars.
//        System.out.println(bis1.readLine()); // This is only possible with FileReader.
    }
}
