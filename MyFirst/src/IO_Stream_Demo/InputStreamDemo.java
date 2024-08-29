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


//Programme <- reciving data from the source via input stream
//Methods available are as follows
// int read()   -   It returns int type because the data is read in bytes - It will read charecter by character from the source and at the end it will return (-1) if it does not find any more charectars
//int read(byte[] b) - It reads a collection of bytes in the program according to the size available 
//int read(byte[] b,int off,int len) - Same as the above but we can specify the offset value(from which index of the array must the read elements stored?) and also we can specify the length of chars to be read.
//int available() - before reading we can find out how many bytes of data is available in the resource
//long skip(long n) - it will skip the elements and - it will not read them and basically discard them so they will also be not available in the source too
//void mark() and reset()- once we read - it is consumed in the programm and it is not there in the source but we can set mark and come back to the same point after some time and reread the same set of elements - it is like a checkpoint which we can go back using reset() - we can also set the limit for the mark for which it will be valid - int mark(int limit)
//boolean markSupported() - every input stream doesn't support mark() - it is only possible if a stream is a buffered stream - because buffer is used to store the memory
//close() - after using a resource or stream we should close it

public class InputStreamDemo {
 public static void main(String args[]) throws Exception
    {
            try (FileInputStream fis = new FileInputStream("/home/nithish/MyJava/TestTryWithResource.txt")){  //This will throw any kind of exception and we can catch it by definng the throws exception at the top of the main class
                
//                byte b[]=new byte[fis.available()];     //It will check for the total characters present in the file and create a byte array for that exact size
//                fis.read(b);
//                String str=new String(b);
//                System.out.println(str);              //This is a direct method to read and display the charecters
                
                //Now we'll read the bytes letter by letter
                int x;
//                do{
//                    x=fis.read();
//                    if(x!=-1)
//                        System.out.print((char)x);
//                }while(x!=-1);      //While the file is not empty which is represented by -1
                
                while((x=fis.read())!=-1)
                {
                    System.out.print((char)x);
                }
                
            }
            
            
            //Below is an exeample of implementation of filereader - which also uses same methods also for the previous example you could also try for the file input stream as file reader
//            
//            try (FileReader fis = new FileReader("/home/nithish/MyJava/TestTryWithResource.txt")){  //This will throw any kind of exception and we can catch it by definng the throws exception at the top of the main class
//                
////                byte b[]=new byte[fis.available()];     //It will check for the total characters present in the file and create a byte array for that exact size
////                fis.read(b);
////                String str=new String(b);
////                System.out.println(str);              //This is a direct method to read and display the charecters                
//            }
    }
}
