/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package AbstractClasses;

/**
 *
 * @author nithish
 */
    //Abstract clsss can have reference but not a objects
    //The other one which we did until now are are known as cconcrete classes
    
    //If a program is having abstract functions then that class must be made into private}
    
    //objects can't be created for abstract clsses but can just have the reference of the abstract classes - this also can hold the object of the sub class
    //Abstract class is like a skeleton - to provide structure on which the sub classes will be created

//Abstract classes cannot be final
//when we declare a class as final it can't be inherited 
//When we declare a method as final it can't be overrided - so abstract classes doesnt support final as it does both
//Abstract method can't be static

abstract class Super
{
    public Super()
    {
        System.out.println("Super class constructer");
    }
    public void meth1()
    {
        System.out.println("Meth 1 of super");
    }
    abstract public void meth2();   //If the class is having even a single method as abstract then the class must be declared as abstract 
}
class Sub extends Super
{
    //Since it extends from an abstract class it has to be declared abstract or the methods must be overrided
    @Override
    public void meth2()
    {
        System.out.println("Sub Meth2");
    }
}
public class java {
    public static void main(String [] args)
    {
        Super s=new Sub();
        Sub x=new Sub();
        s.meth1();
        s.meth2();
        x.meth1();
        x.meth2();
        
    }
}
//Below is a nice example of abstract class
abstract class KFC
{
    KFC()
    {
        //It has it's pwn constructor
    }
    void makeItem()
    {
        //KFC has it's own procedure to make its items
    }
    abstract void billing();    //These 2 methods must be overrided by the derived class 
    abstract void offer();  //KFC provides full freedom to the franchise to decide how to bill according to their contry
    //And also allows the franchises to decide on the offers they can give according to their economical feasability
    
}


abstract class shape
{
    abstract float perimeter();
    abstract float area();
}

class circle extends shape
{
    @Override
    public float perimeter()
    {
        return 3*5;
    }
    @Override
    public float area()
    {
        return 3*5*5;
    }
}
class Rectangle extends shape
{
    @Override
    public float perimeter()
    {
        return 2*5+2*10;
    }
    @Override
    public float area()
    {
        return 5*10;
    }
}