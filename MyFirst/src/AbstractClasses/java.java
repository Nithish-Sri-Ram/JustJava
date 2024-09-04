/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package AbstractClasses;

/**
 *
 * @author nithish
 */

// Abstract classes can have references but not objects.
// The other ones which we have worked with until now are known as concrete classes.

// If a program has abstract functions, then that class must be made abstract.

// Objects can't be created for abstract classes but can have just the reference of the abstract classes - 
// this reference can hold the object of the subclass.
// An abstract class is like a skeleton - it provides a structure on which the subclasses will be built.

// Abstract classes cannot be final.
// When we declare a class as final, it can't be inherited.
// When we declare a method as final, it can't be overridden - so abstract classes don't support final as they do both.
// An abstract method can't be static.

abstract class Super {
    public Super() {
        System.out.println("Super class constructor");
    }

    public void meth1() {
        System.out.println("Meth 1 of super");
    }

    abstract public void meth2();   // If a class has even a single method as abstract, then the class must be declared as abstract.
}

class Sub extends Super {
    // Since it extends an abstract class, it has to be declared abstract or the methods must be overridden.
    @Override
    public void meth2() {
        System.out.println("Sub Meth2");
    }
}

public class java {
    public static void main(String[] args) {
        Super s = new Sub();
        Sub x = new Sub();
        s.meth1();
        s.meth2();
        x.meth1();
        x.meth2();
    }
}

// Below is a nice example of an abstract class.
abstract class KFC {
    KFC() {
        // It has its own constructor.
    }

    void makeItem() {
        // KFC has its own procedure to make its items.
    }

    abstract void billing();    // These two methods must be overridden by the derived class.
    abstract void offer();      // KFC provides full freedom to the franchise to decide how to bill according to their country.
                                 // It also allows the franchises to decide on the offers they can give according to their economic feasibility.
}

abstract class Shape {
    abstract float perimeter();
    abstract float area();
}

class Circle extends Shape {
    @Override
    public float perimeter() {
        return 3 * 5;
    }

    @Override
    public float area() {
        return 3 * 5 * 5;
    }
}

class Rectangle extends Shape {
    @Override
    public float perimeter() {
        return 2 * 5 + 2 * 10;
    }

    @Override
    public float area() {
        return 5 * 10;
    }
}
