package LangPackages;

/**
 * Demonstrates the usage of the Object class in Java, which is the parent class of all classes.
 * The Object class is part of the java.lang package, which is imported by default.
 *
 * @author nithish
 */

import java.lang.*; // The java.lang package is imported by default, so this import is optional.

class MyObject {
    @Override
    public String toString() {
        return "My object";
    }

    @Override
    public int hashCode() {
        // Java provides a strong algorithm for generating hash codes, but here we override it.
        return 100;
    }

    @Override
    public boolean equals(Object o) {
        // Compares the hash codes of the two objects for equality.
        return this.hashCode() == o.hashCode();
    }
    // Note: We cannot override the wait() and notify() methods, as they are final methods in the Object class.
}

public class langDemo {
    public static void main(String[] args) {
        Object o1 = new Object();
        Object o2 = new Object();
        Object o3 = o1;

        // Demonstrating the equals() method
        System.out.println(o1.equals(o2));  // false - Different objects
        System.out.println(o1.equals(o3));  // true  - Same reference

        // Using MyObject class with overridden methods
        MyObject ob1 = new MyObject();
        MyObject ob2 = new MyObject();

        System.out.println(ob1);            // Calls the overridden toString() method
        System.out.println(ob1.equals(ob2));  // Returns true because the equals() method was overridden to compare hash codes
    }
}
