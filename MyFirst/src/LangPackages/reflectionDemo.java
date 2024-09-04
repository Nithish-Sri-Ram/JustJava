package LangPackages;

/**
 * Demonstrates the use of Java Reflection API to inspect the details of a class at runtime.
 * Reflection is an advanced topic in Java that allows for introspection of classes, methods, fields, and constructors.
 *
 * @author nithish
 */

import java.lang.reflect.*;

class My {
    private int a;
    protected int b;
    public int c;
    int d;

    public My() {}
    public My(int x, int y) {}
    public void display(String s1, String s2) {}
    public int show(int x, int y) { return 0; }
}

public class ReflectionDemo {
    public static void main(String[] args) {
        // Getting the Class object for the My class using the class literal.
        Class<?> c = My.class;

        // Alternate way to get the Class object using an instance of the class.
        My m = new My();
        Class<?> c1 = m.getClass();  // We can get the class object with or without creating an instance.

        // Printing the name of the class.
        System.out.println("Class Name: " + c.getName());

        // Retrieving and printing all declared fields in the My class.
        Field[] fields = c.getDeclaredFields();
        System.out.println("\nFields:");
        for (Field f : fields) {
            System.out.println(f);
        }

        // Retrieving and printing all constructors in the My class.
        Constructor<?>[] constructors = c.getConstructors();
        System.out.println("\nConstructors:");
        for (Constructor<?> con : constructors) {
            System.out.println(con);
        }

        // Retrieving and printing all methods in the My class (including inherited methods).
        Method[] methods = c.getMethods();
        System.out.println("\nMethods:");
        for (Method meth : methods) {
            System.out.println(meth);
        }

        // Retrieving and printing the parameters of the first method.
        if (methods.length > 0) {
            Parameter[] params = methods[0].getParameters();
            System.out.println("\nParameters of the first method:");
            for (Parameter param : params) {
                System.out.println(param);
            }
        }
    }
}
