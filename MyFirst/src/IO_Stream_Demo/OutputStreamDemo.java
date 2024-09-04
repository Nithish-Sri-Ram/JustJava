/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package IO_Stream_Demo;

/**
 *
 * @author nithish
 */

// Methods of OutputStream:
// void write(int b)
// void write(byte[] b)
// void write(byte[] b, int off, int len)
// The above 3 methods are similar to the read methods from the InputStream.
// void flush() - This will not work on all output streams; it only works on buffered streams. It will flush data from the buffer to the output stream/resource, forcefully sending the data.
// close() - After finishing using the output stream, it is a good practice to close it.
// You can google the hierarchy of these stream classes to learn about the different types of classes inheriting from them.

import java.io.*; // While learning, it is okay to import all the packages with *, but when creating applications, use only the imports required.

public class OutputStreamDemo {
    public static void main(String[] args) {
        try {
            // The following will throw FileNotFoundException, and it is mandatory to catch it.
            FileOutputStream fos = new FileOutputStream("/home/nithish/MyJava/Test.txt"); // The path of the file name can be ignored if we declare it in the same directory as the .class folder.
            // As it suggests, we can recreate it with a try-with-resources block, which I've done in another Java class.
            String str = "Learn Java programming \n";
            byte[] b = str.getBytes();
            
            for (byte x : b)
                fos.write(x);
            
            // The same for loop can be replaced and written as follows:
            fos.write(str.getBytes()); // This is used to get the char array of bytes and write them to the given file object. This will throw IOException, and it is mandatory to catch it.
            
            fos.write(str.getBytes(), 6, str.length() - 6); // This will write only "Java programming".
            fos.close();
        } catch (FileNotFoundException e) {
            System.out.println(e);
        } catch (IOException e) {
            System.out.println(e);
        }
    }
}
