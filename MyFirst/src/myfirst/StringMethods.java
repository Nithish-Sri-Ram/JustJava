/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package myfirst;

/**
 *
 * @author nithish
 */
public class StringMethods {
    public static void main(String []args)
    {
        String str="Java World";
        
        System.out.println(str.length());
        System.out.println(str.toUpperCase());
        System.out.println(str.toLowerCase());
        System.out.println(str.trim());
        System.out.println(str.substring(4));
        System.out.println(str.substring(4,7));
        System.out.println(str.replace('o','e'));
        System.out.println(str.startsWith("Java"));
        System.out.println(str.startsWith("J"));
        System.out.println(str.startsWith("Hava"));
        System.out.println(str.startsWith("va",2));
        System.out.println(str.indexOf("d"));
        System.out.println(str.lastIndexOf("a"));
        System.out.println(str.equals("Java World"));
        System.out.println(str.equalsIgnoreCase("java world"));
        System.out.println(str.compareTo("Iava World"));
        System.out.println(str.compareTo("Kava World"));
        System.out.println(str.valueOf(4));
        System.out.println(str.indexOf("va"));
        System.out.println(str.lastIndexOf("va"));
        
    }
}
