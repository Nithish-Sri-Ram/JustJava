/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Collection;

/**
 *
 * @author nithish
 */


import java.util.*;
import java.io.*;
//It is same as the hashTable and HashSet but this class only stores string as their keys and values 
public class PropertyClassDemo {
    public static void main(String args[])throws Exception
    {
        //Load, loadFromXML, store and storeToXML are some additional methods available 
        Properties p=new Properties();
        //Commenly property is known as key value pair 
        p.setProperty("Brand", "Dell");
        p.setProperty("Processor", "i7");
        p.setProperty("OS", "Wiondows10");
        p.setProperty("Model", "Latitude");
        
        System.out.println(p);
        
        //
        p.store(new FileOutputStream("/home/nithish/MyJava/propertyClass.txt"), "Laptop");
        p.storeToXML(new FileOutputStream("/home/nithish/MyJava/propertyClass.xml"), "Laptop");
        
        Properties q=new Properties();
        //THis below one loads from xml file and the method - q.load - loads from txt file 
        q.loadFromXML(new FileInputStream("/home/nithish/MyJava/propertyClass.xml"));
        System.out.println(q.getProperty("Name"));
        System.out.println(q);
    }
}
