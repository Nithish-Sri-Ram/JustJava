/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package IO_Stream_Demo;

/**
 *
 * @author nithish
 */

// Sequential access and random access are the two modes of file access.
// Sequential access only allows either read or write operations, but random access allows both read and write operations in a single go.
// We can use the seek method to change the pointer to point at a particular location, allowing us to randomly move anywhere in the file. 
// (Only possible to use this method when we are fully aware of the whereabouts of the contents of the file.)
// getFilePointer(), readInt(), writeInt()
// This class implements both DataInput and DataOutput interfaces.

import java.io.*;

public class RandomAccessFileDemo {
    public static void main(String[] args) throws Exception {
        RandomAccessFile rf;
        rf = new RandomAccessFile("/home/nithish/MyJava/Data.txt", "rw"); // "rw" mode allows both reading and writing.
        
        // For example, take this txt file which has ABCDEFGH.
        System.out.println((char) rf.read()); // This will read 'A'.
        System.out.println((char) rf.read()); // This will read 'B'.
        System.out.println((char) rf.read()); // This will read 'C'.
        rf.write('d');                        // This will write 'd' at the current position, replacing 'D'.
        System.out.println((char) rf.read()); // This will read 'E'.
        
        // Whatever you are reading, typecast it as char since it is all read as bytes.
        
        rf.close(); // Always close the file after operations.
    }    
}
