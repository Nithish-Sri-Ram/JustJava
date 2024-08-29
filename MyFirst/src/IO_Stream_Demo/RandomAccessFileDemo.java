/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package IO_Stream_Demo;


/**
 *
 * @author nithish
 */

//Sequencial access and random files are the two modes of access 
//Sequencitial access only allows either read or write operation - but the Random access allowes both read and write access in a single go 
//We can use the seek method to use the change the pointer to point at a particular location - randomly move anywhere in the file  (ONly possible to use the method when we are fully aware of the wherabouts of the contents of the file)
//getFilePointer(), readInt(),writeInt()
//This class is implementing both dataInput and dataOutput interface
import java.io.*;

public class RandomAccessFileDemo {
    public static void main(String args[]) throws Exception
    {
        RandomAccessFile rf;
        rf = new RandomAccessFile("/home/nithish/MyJava/Data.txt");
        //For eg take this txt file which has ABCDEFGH
        System.out.println((char)rf.read());    //this will read at A
        System.out.println((char)rf.read());    //this will read at B
        System.out.println((char)rf.read());    //this will read at C
        rf.write('d');                          //this write at D
        System.out.println((char)rf.read());    //this will read at D
        //Whatever you are reading typecast as char as it is all read as bytes 
    }    
}
