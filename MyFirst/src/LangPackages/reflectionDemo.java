/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package LangPackages;

/**
 *
 * @author nithish
 */

//It is kinda an advanced topic in java

import java.lang.reflect.*;

class My
{
    private int a;
    protected int b;
    public int c;
    int d;
    
    public My(){}
    public My(int x, int y){}
    public void display(String s1,String s2){}
    public int show(int x,int y){return 0;}
}

public class reflectionDemo {
    public static void main(String args[])
    {
        //loooking inside the class and giving the details of the class - done using the reflection package - set of classes there in the package will help us get defenition of the class
        Class c=My.class;        //This class c is a class for getting defenition of any particular class 
        //Once we compile the program, along with the .java file we'll get a .class file
        
        //below is an alternate way to get the class details 
        My m=new My();
        Class c1=m.getClass();  //we can do this with or without creating an object
        
        System.out.println(c.getName());
        
        Field field[]=c.getDeclaredFields();        //4 fields are declared for the above program
        for(Field f:field)
            System.out.println(f);
        
        Constructor con[]=c.getConstructors();
        
        Method meth[]=c.getMethods();
        
        Parameter param[]= meth[0].getParameters();
        
    }
}
