/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package myfirst;

/**
 *
 * @author nithish
 */

// Overloading is compile-time polymorphism
// Overriding is run-time polymorphism

class Super {
    void method1() {
        System.out.println("Super method 1");
    }
    
    void method2() {
        System.out.println("Super method 2");
    }
}

class Sub extends Super {
    @Override
    void method2() {
        System.out.println("Sub method 2");
    }
    
    void method3() {
        System.out.println("Sub method 3");
    }
}

public class DynamicMethodDispatch {
    public static void main(String[] args) {
        // Superclass reference holding an object of the subclass
        // This is dynamic method dispatch - the method to be executed is determined at runtime based on the actual object
        Super s = new Sub();
        
        // The method calls are resolved at runtime depending on the object the reference is pointing to
        s.method1();    // Calls the method from the superclass
        s.method2();    // Calls the overridden method in the subclass

        // The following line would cause a compile-time error because the reference type (Super) doesn't have method3()
        // s.method3();  // Uncommenting this line will cause a compilation error
    }
}
