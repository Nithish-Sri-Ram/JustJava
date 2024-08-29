package AbstractClasses;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author nithish
 */

//Multiple inhetitance is not avilable in java it is archived through interfaces
//Interface is similar to abstract class - but the difference is all the methods of the super classes will be declared as abstract 
//means that there is no method in parent class available which is not abstract
//clases are extended in abstract class and interfaces are implemented 
//Interface is an abstract class with all abstract methods
//purpose of interface is to archive polymorphism
//Super class reference can hold sub class object 
//When using extend - a clas can exetend from only one class - but when a class is implementing interfaces it can implement multiple interfaces


//By default methods are public and abstract - not necessary to declare like this - public abstract void meth1();

//identifier from interfaces must be declare in uppercase char
//identifiers in interfaces are by default final and static
//..Methods inside interface are abstract and they cannot havae body - but a static method can be declared with body in an interface
// public static void meth3(){....} //allowed in inteface
//Can access the static members using interfaces without creating any objects 

//from java 8 - default can also be used eg:- default void meth3(){..} - This can be either overided or not be overrided - the chice is there
//To update or modify existing interfaces without disturbing existing classes we can make use of default classes

//from java-9 we can create private methods which are not abstract - this is used internally using default methods 

//interface can extend from another interface
//Test1 extends Test - where test is an interface 
interface Test
{
    void meth1();
    void meth2();
}

class My implements Test
{
    public void meth1()
    {
        System.out.println("Meth 1 of my class");
    }
    public void meth2()
    {
        System.out.println("Meth 2 of my class");
    }
    public void meth3()
    {
        System.out.println("Meth 3 of my class");
    }
}
//Interfaces are ment only for overriding 
//Interfaces are used for archiving run time polymorphism

class Phone 
{
    public void call()
    {
        System.out.println("Phone Call");
    }
    public void sms()
    {
        System.out.println("Phone sms");
    }   
}
interface ICamera
{
    void click();
    void record();
}
interface IMusicPlayer
{
    void play();
    void stop();
}
class SmartPhone extends Phone implements ICamera,IMusicPlayer
{
    public void videoCall()
    {
        System.out.println("SmartPhone Videocalling");
    }
    public void click()
    {
        System.out.println("SmartPhone click");
    }
    public void record()
    {
        System.out.println("SmartPhone record");
    }
    public void play()
    {
        System.out.println("SmartPhone play");
    }
    public void stop()
    {
        System.out.println("SmartPhone stop");
    }
}


public class Interfaces {
    public static void main(String []args)
    {
        Test t=new My(); //cant create an object of interface 
        t.meth1();
        t.meth2();     //With test class refernce the only objectnof My cant be called
        
        SmartPhone sp=new SmartPhone();
        sp.call();
        sp.stop();  //All the methods of interfaces and classes can be acessed by the smarphone class
        
        Phone s=new SmartPhone();   //This can access only the methods defined in phone interface
        s.call();
        s.sms();
        
        IMusicPlayer mp=new SmartPhone();       //Only associated reference of IMusicPlayer would be called 
        mp.play();
        mp.stop();
        
        ICamera cm=new SmartPhone();        //Only associated reference will be called 
        cm.click();
        cm.record();
        
        
    }
}


