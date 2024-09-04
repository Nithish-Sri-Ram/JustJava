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

// It is similar to HashTable and HashSet, but this class only stores strings as their keys and values.
public class PropertyClassDemo {
    public static void main(String[] args) throws Exception {
        // load, loadFromXML, store, and storeToXML are some additional methods available.
        Properties p = new Properties();
        // Commonly, a property is known as a key-value pair.
        p.setProperty("Brand", "Dell");
        p.setProperty("Processor", "i7");
        p.setProperty("OS", "Windows10");
        p.setProperty("Model", "Latitude");
        
        System.out.println(p);
        
        // Store the properties to a text file and an XML file.
        p.store(new FileOutputStream("/home/nithish/MyJava/propertyClass.txt"), "Laptop");
        p.storeToXML(new FileOutputStream("/home/nithish/MyJava/propertyClass.xml"), "Laptop");
        
        Properties q = new Properties();
        // The below method loads from an XML file, while the method q.load loads from a text file.
        q.loadFromXML(new FileInputStream("/home/nithish/MyJava/propertyClass.xml"));
        System.out.println(q.getProperty("Name"));
        System.out.println(q);
    }
}
