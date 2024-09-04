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

public class ArrayInputStreamDemo {
    public static void main(String[] args) throws Exception {
        byte b[] = {'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j'};
        // The above array can be treated as a stream with the help of the ByteArrayInputStream.
        
        ByteArrayInputStream bis = new ByteArrayInputStream(b);
        ByteArrayInputStream bis1 = new ByteArrayInputStream(b);
        ByteArrayInputStream bis2 = new ByteArrayInputStream(b);
        
        System.out.println(bis.markSupported()); // This is mark supported, whereas a file is not.
        String str = new String(bis1.readAllBytes());
        System.out.println(str);
        
        int x;
        while ((x = bis.read()) != -1) {
            System.out.print((char) x);
        } 
        bis.close();
        
        // The above is for the input stream, and now the below is for the output stream.
        
        ByteArrayOutputStream bos = new ByteArrayOutputStream(20);
        bos.write('a');
        bos.write('b');
        bos.write('c');
        bos.write('d');
        
        // Now I want to see the array elements.
        byte ba[] = bos.toByteArray();
        
        for (byte xx : ba) {
            System.out.println((char) xx);
        }
        
        // Now I want to write all those in a file.
        bos.writeTo(new FileOutputStream("/home/nithish/MyJava/charArray.txt"));
        
        // CharArrayReader and CharArrayWriter are similar to the above - all the methods are the same as the ones used above.
        char c[] = {'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j'};
        CharArrayReader cr = new CharArrayReader(c);
    }
}
