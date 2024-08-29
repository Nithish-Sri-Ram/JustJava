/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package IO_Stream_Demo;

/**
 *
 * @author nithish
 */

//Methods of outputstream
//void write(int b)
//void write(byte[] b)
//void write(byte[] b, int off,  int len) 
//The above 3 methods are as same as the read methods from the input stream
//void flush() - this will not work on all output streams - only work on buffered streams - it will flush data from the buffer to the outputstream/resource - it will forcefully send the data 
//close()  - after finished using the output stream it is a good practice to close it 
//You could google the hirearchy of these stream classes and know all the different types of classes inheriting from them
//
import java.io.*;   //While learnig it is okay to import all the packages with *, but when creating the applications use only the import of those required
public class OutputStreamDemo {
    public static void main(String args[])
    {
        try{
        //The below will throw fileNotFoundException and it is mandatory to catch them
        FileOutputStream fos=new FileOutputStream("/home/nithish/MyJava/Test.txt");  //The path of the file name can be ignored if we declare it in the same file as the .class folder
        //As it is showing the suggestions - we can re create it with - try with resources I've done it in a new file java class
        String str="Learn java programing \n";
        byte b[]=str.getBytes();
        
        for(byte x:b)
            fos.write(x);
        
        //The same for loop can be replaced and written as follows
        fos.write(str.getBytes());   //This is used to get the char array of bytes and write them on the given file object - this will throw IO exception and it is mandatory to catch them
        
        fos.write(str.getBytes(), 6, str.length()-6);       //This will write only from the java programming
        fos.close();
        }
        catch(FileNotFoundException e){
            System.out.println(e);
        }
        catch(IOException e){
            System.out.println(e);
        }
    }
}
