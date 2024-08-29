/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package LangPackages;

/**
 *
 * @author nithish
 */

import java.lang.*;         //It is a Package imported by deffault even if not manually initiatiated
 //object class is the parent class of all the other classes in java
//every class is directly or indirectly inheriting from the object class 

class MyObject
{
    public String toString ()
    {
        return "My object";
    }
    public int hashCode()       //java has a strong algorithm to assign hashcode
    {
        return 100;
    }
    public boolean equals(Object o)
    {
        return this.hashCode()==o.hashCode();
    }
    //we would not be able to override wait() and notify() - method since it is declared as final
}

public class langDemo {
    public static void main(String args[])
    {
            Object o1=new Object();
            Object o2=new Object();
            Object o3=o1;
            
            System.out.println(o1.equals(o2));  //false 
            System.out.println(o1.equals(o3));  //true
            //if both the objects are holding the same reference then it will return true
            
            MyObject ob1=new MyObject();
            MyObject ob2=new MyObject();
            
            System.out.println(ob1);        //This will call the overrided toString() method 
            System.out.println(ob1.equals(ob2));  //generally it should return false since we overrided the equals() function it is returning true
            
            
    }
}
