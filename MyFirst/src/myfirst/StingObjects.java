/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package myfirst;

/**
 *
 * @author nithish
 */
public class StingObjects {
    public static void main(String [] args){
        
        //String formatter
        String s1=String.format("The name is %.2f", 24.7765);
        System.out.println(s1);
        
        char[] arr={'a','b','c','d'};
        String str1=new String(arr);
        System.out.println(str1);
        
        int[] numbers={1,3,35,6,7,8};
        
//        String num=new String(numbers);
        
        byte[] ba={75,76,77,78,79};
        String bs=new String(ba);
        String bi=new String(ba,1,2);   //This specifies start from this index and how many elements to take
        System.out.println(bs+"     "+bi);
        
        
        //A basic concept in java pooling
        //The below 2 variables have the exact same literals so they point to the same reference in the heap-no new object is created
        String ss1="Java";
        String ss2="Java";
        System.out.println(ss1==ss2);   //Prints true
        //To have to point to a new reference use the new keyword
        String ss3=new String("Java");
        System.out.println(ss1==ss3);   //Prints false
        
        //The above example is checking references to check the objects use .equals method
        System.out.println(ss1.equals(ss3));     //This prints true
    }
    
}
