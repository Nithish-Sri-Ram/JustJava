/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package IO_Stream_Demo;

/**
 *
 * @author nithish
 * 
 */

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.SequenceInputStream;
public class challengeToCopyFromFileToFile {
    public static void main(String args[]) throws Exception
    {
//        try(FileInputStream fis=new FileInputStream("/home/nithish/MyJava/lc.txt")){
//            byte b[]=new byte[fis.available()];
//            fis.read(b);
//            String str=new String(b);
//            System.out.println(str);
//            str=str.toLowerCase();
//            try(FileOutputStream fos=new FileOutputStream("/home/nithish/MyJava/uc.txt")){
//                byte s[]=new byte[str.length()];
//                s=str.getBytes();
//                fos.write(s);
//                fos.close();
//            }
//            fis.close();
//        }
        
        //The below shows how to read 2 files at a same time using SequenceInputStream
        FileInputStream fis1=new FileInputStream("/home/nithish/MyJava/lc.txt");
        FileInputStream fis2=new FileInputStream("/home/nithish/MyJava/uc.txt");
        FileOutputStream fos=new FileOutputStream("/home/nithish/MyJava/destination.txt");
        
        SequenceInputStream sis=new SequenceInputStream(fis1,fis2);
        byte sq[]=new byte[sis.available()];
        sis.read(sq);
        fos.write(sq);
        
        fis1.close();
        fis2.close();
        fos.close();
        sis.close();
    }
}
