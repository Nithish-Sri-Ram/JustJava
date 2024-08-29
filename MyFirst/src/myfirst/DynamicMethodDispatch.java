/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package myfirst;
import java.util.*;
/**
 *
 * @author nithish
 */

//Overloading is compile time polymorphism
//Overriding is run time Polimorphism


class Super
{
    void method1()
    {
        System.out.println("Super meth 1");
    }
    
    void method2()
    {
        System.out.println("Super meth 2");
    }
    
}
class Sub extends Super
{
    void method2()
    {
        System.out.println("Sub meth 2");
    }
    
    void method3()
    {
        System.out.println("SUb meth 2");
    }
    
}
public class DynamicMethodDispatch {
    public static void main(String [] args)
    {
        //Super class has reference to sub class 
        //But a sub class can't have reference to subclass
        Super s=new Sub();
        //The above condition is know as dynamic method dispatch - super clas holding onject of sub class and calling overrided method 
        //The method are called depending on the object not on reference
        s.method1();    //Prints output of super class
        s.method2();    //It will print the output of the sub class 
//        s.method3();    //It is not aware of the existance of the subclass since it is holding refence from the super class
        
        
    }
}
