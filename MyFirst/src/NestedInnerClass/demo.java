/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package NestedInnerClass;

/**
 *
 * @author nithish
 */

abstract class My
{
    abstract void display();
}
interface IMy
{
    abstract void display();
}

class Outer
{
    static int a=11;
    int x=10;
    Inner j=new Inner();
    class Inner
    {
        
        int y=20;
        public void innerDisplay()
        {
            System.out.println(x+" "+y);
            //We can access outer class members from inside the class
            //We can access static members also from the inner class
        }
    }
    public void outerDisplay()
    {
        //To access the inner class from outer is not possible
        //It becomes possible with the creation of object of inner class 
        Inner i=new Inner();
        i.innerDisplay();
        System.out.println(i.y);
        System.out.println(j.y);
    }
    
    void display()
    {
    //If you want any class to inherit from existing class or implement an interface and that class id only useful inside this method then you can define a local inner class
        
        class inr
        {
            void inrDisplay()
            {
                System.out.println("Hello");
            }
        }
        inr obj=new inr();
        obj.inrDisplay();
        new inr().inrDisplay();         //this is an anonymous object
    }   
    
    public void meth()
    {
    //Anonymous classes are useful for interfaces and abstract classes
    //anonymous inner class can be defined at the creation of the object itself
        My m=new My(){      //Here a nameless class is defined and the the method of abstract class is overrided
            public void display()
            {
                System.out.println("Hello");
            }
        };
        m.display();
        
        new My(){void display(){System.out.print("This is an anonymous object");}}.display();
        
//      The same thing can be done to an inteface too
        IMy n=new IMy(){      //Here a nameless class is defined and the the method of abstract class is overrided
            public void display()
            {
                System.out.println("Hello");
            }
        };
        n.display();
    }
    
    static class Sinner
    {
        void display()
        {
//            cant access non static members as we can see below
//            System.out.println(x);
            System.out.println(a);
        }
    }
}

public class demo {
    public static void main(String [] args)
    {
        Outer o=new Outer();
        o.outerDisplay();
        
        //To access the inner class do the below 
        Outer.Inner oi=new Outer().new Inner();
        oi.innerDisplay();
        
//        But to access static inner classes an has need not be created and it only acces static members and wont allow to access not static members of the class
        Outer.Sinner ob=new Outer.Sinner();
        ob.display();
    }
}
