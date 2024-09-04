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

public class FileHandling {
    public static void main(String[] args) {
        File f = new File("/home/nithish/MyJava");
        
        System.out.println(f.isDirectory());
        File list[] = f.listFiles();
        
        for (File x : list) {
            System.out.print(x.getName() + "  ");
            System.out.println(x.getPath());
//            System.out.println(x.getParent());
        }
    }
}
