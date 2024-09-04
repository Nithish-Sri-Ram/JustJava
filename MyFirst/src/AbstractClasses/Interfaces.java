package AbstractClasses;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author nithish
 */

// Multiple inheritance is not available in Java. It is achieved through interfaces.
// An interface is similar to an abstract class, but the difference is that all the methods of the superclasses will be declared as abstract, 
// meaning that there is no method in the parent class that is not abstract.
// Classes are extended in abstract classes, and interfaces are implemented.
// An interface is an abstract class with all abstract methods.
// The purpose of an interface is to achieve polymorphism.
// A superclass reference can hold a subclass object.
// When using `extends`, a class can extend from only one class, but when a class is implementing interfaces, it can implement multiple interfaces.

// By default, methods are public and abstract, so it is not necessary to declare them like this: public abstract void meth1();

// Identifiers from interfaces must be declared in uppercase characters.
// Identifiers in interfaces are by default final and static.
// Methods inside an interface are abstract and cannot have a body, but a static method can be declared with a body in an interface.
// public static void meth3(){....} //allowed in interface
// Static members can be accessed using interfaces without creating any objects.

// From Java 8, `default` can also be used, e.g., default void meth3(){..}. This can either be overridden or not overridden - the choice is there.
// To update or modify existing interfaces without disturbing existing classes, we can make use of default methods.

// From Java 9, we can create private methods that are not abstract - these are used internally by default methods.

// An interface can extend another interface.
// Test1 extends Test - where Test is an interface.
interface Test {
    void meth1();
    void meth2();
}

class My implements Test {
    public void meth1() {
        System.out.println("Meth 1 of my class");
    }

    public void meth2() {
        System.out.println("Meth 2 of my class");
    }

    public void meth3() {
        System.out.println("Meth 3 of my class");
    }
}

// Interfaces are meant only for overriding.
// Interfaces are used for achieving runtime polymorphism.

class Phone {
    public void call() {
        System.out.println("Phone Call");
    }

    public void sms() {
        System.out.println("Phone SMS");
    }   
}

interface ICamera {
    void click();
    void record();
}

interface IMusicPlayer {
    void play();
    void stop();
}

class SmartPhone extends Phone implements ICamera, IMusicPlayer {
    public void videoCall() {
        System.out.println("SmartPhone Video Calling");
    }

    public void click() {
        System.out.println("SmartPhone Click");
    }

    public void record() {
        System.out.println("SmartPhone Record");
    }

    public void play() {
        System.out.println("SmartPhone Play");
    }

    public void stop() {
        System.out.println("SmartPhone Stop");
    }
}

public class Interfaces {
    public static void main(String[] args) {
        Test t = new My(); // Can't create an object of interface 
        t.meth1();
        t.meth2();     // With Test class reference, only the methods of My can be called
        
        SmartPhone sp = new SmartPhone();
        sp.call();
        sp.stop();  // All the methods of interfaces and classes can be accessed by the SmartPhone class
        
        Phone s = new SmartPhone();   // This can access only the methods defined in Phone class
        s.call();
        s.sms();
        
        IMusicPlayer mp = new SmartPhone();       // Only associated reference of IMusicPlayer would be called 
        mp.play();
        mp.stop();
        
        ICamera cm = new SmartPhone();        // Only associated reference will be called 
        cm.click();
        cm.record();
    }
}
