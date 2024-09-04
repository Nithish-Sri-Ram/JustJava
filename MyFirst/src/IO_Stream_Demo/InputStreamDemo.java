/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package IO_Stream_Demo;

import java.io.FileInputStream;

/**
 *
 * @author nithish
 */

// Program <- receiving data from the source via input stream
// Methods available are as follows:
// int read() - It returns an int type because the data is read in bytes. It will read character by character from the source, and at the end, it will return (-1) if it does not find any more characters.
// int read(byte[] b) - It reads a collection of bytes into the program according to the size available.
// int read(byte[] b, int off, int len) - Same as the above, but we can specify the offset value (from which index of the array the read elements should be stored?) and also the length of chars to be read.
// int available() - Before reading, we can find out how many bytes of data are available in the resource.
// long skip(long n) - It will skip the elements - it will not read them and basically discard them, so they will also not be available in the source anymore.
// void mark() and reset() - Once we read, it is consumed in the program, and it is not there in the source, but we can set a mark and come back to the same point later and reread the same set of elements. It is like a checkpoint that we can go back to using reset(). We can also set the limit for the mark for which it will be valid - int mark(int limit).
// boolean markSupported() - Not every input stream supports mark() - it is only possible if a stream is a buffered stream because a buffer is used to store the memory.
// close() - After using a resource or stream, we should close it.

public class InputStreamDemo {
    public static void main(String[] args) throws Exception {
        try (FileInputStream fis = new FileInputStream("/home/nithish/MyJava/TestTryWithResource.txt")) {  
            // This will throw any kind of exception, and we can catch it by defining throws Exception at the top of the main class.
            
//            byte b[] = new byte[fis.available()]; // It will check for the total characters present in the file and create a byte array of that exact size.
//            fis.read(b);
//            String str = new String(b);
//            System.out.println(str); // This is a direct method to read and display the characters.
            
            // Now we'll read the bytes letter by letter.
            int x;
//            do {
//                x = fis.read();
//                if (x != -1)
//                    System.out.print((char) x);
//            } while (x != -1); // While the file is not empty, which is represented by -1.
            
            while ((x = fis.read()) != -1) {
                System.out.print((char) x);
            }
        }
        
        // Below is an example of the implementation of FileReader, which also uses the same methods. 
        // Also, for the previous example, you could try using FileReader instead of FileInputStream.
        
//        try (FileReader fr = new FileReader("/home/nithish/MyJava/TestTryWithResource.txt")) {  
//            // This will throw any kind of exception, and we can catch it by defining throws Exception at the top of the main class.
            
//            char[] cbuf = new char[100]; // Read characters using FileReader.
//            fr.read(cbuf);
//            String str = new String(cbuf);
//            System.out.println(str); // This is a direct method to read and display the characters.
//        }
    }
}
