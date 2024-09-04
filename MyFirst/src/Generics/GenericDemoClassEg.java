/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Generics;

/**
 *
 * @author nithish
 */

// Do's and Don'ts of Generics 
// 1. Only extends is allowed in generic class definition.
// 2. Extends is used for interfaces as well - we can't use implements in this context. 
//    For example: even though B is an interface, we have to declare it as class MyArray<T extends B>.
// 3. Extends from one class but can have multiple interfaces - e.g., class MyArray<T extends A & B & C> - A is a class and B and C are interfaces. 
//    (We also can't write the interface first and class next; the order has to be followed - we can also just have the interfaces.)
// 4. Extends and super are allowed with ? in methods - super is not allowed in class definition.
// 5. <?> will accept all types but cannot access it.
// 6. Base type of object should be the same or ? - MyArray<Object> ma = new MyArray<Integer>(); - This is not allowed as we can't write any super class.

class A {}
class B extends A {}
class C extends A {}

// If I write class MyArray<T extends A> - It will only allow the classes which are extending from A - i.e., B and C.
// This extends works for both classes and interfaces, which means that it will allow all the classes that implement interface A.
class Data<T> {
    private T obj;
    
    public void setData(T v) {
        obj = v;
    }
    
    public T getData() {
        return obj;
    }
}

@SuppressWarnings("unchecked") // To get rid of the warnings I get from unchecked unsafe operations.
class MyArray<T> {
    T A[] = (T[]) new Object[10]; // We can't directly assign the array of generics; we have to create an array of objects and then typecast it to a generic array.
    int length = 0;
    
    public void append(T v) {
        A[length++] = v;
    }
    
    public void display() {
        for (int i = 0; i < length; i++) {
            System.out.println(A[i]);
        }
    }
}

// Subclass
class MyArray2 extends MyArray {
    // The type is not mentioned in this subclass, so it will take it as Object.
}

class MyArray3 extends MyArray<String> {
    // This will allow only the type of Strings.
}

class MyArray4<T> extends MyArray<T> {
    // Now we have made this class also generic.
}

// Bounded Types - This below class can have any types, but we can put a limit on what the types are.

class MyArray5<T extends Number> { // This Number is a wrapper class that will allow its own classes which inherit from Number like Byte, Short, Integer, Long, Float, and Double.
}

public class GenericDemoClassEg {
    // Inside a non-generic class, we can write a generic method.
    
    // Within the generic methods too, the bound type works.
    // static <E> void show(E... list) // We can also define the below as this so we can take any number of arguments.
    static <E> void show(E[] list) { // Just before the return type, mention that it is a generic type so we don't get an error.
        for (E x : list) {
            System.out.println(x);
        }
    }
    
    // For generic arguments - we use Wildcards.
    static void fun(MyArray<?> obj) { // We can leave it as it is without adding the question mark too; it will work the same as leaving the array to work normally.
        // The question mark specifies that we can take any type as the input. The above is also known as an unbounded wildcard - as good as with and without <?>.
        obj.display(); // We can define an upper bound for the above by making a small modification - fun(MyArray<? extends Number> obj).
    } // If we define it like - fun(MyArray<? super Number> obj) - we can use any class which is a superclass to Number.
    // Lower bound - use super.
    // Upper bound - use extends.
    
    public static void main(String[] args) {
        show(new String[] { "Hi", "Go", "Bye" });
        show(new Integer[] { 10, 20, 30 });
        
        Data<Integer> d = new Data<>();
        d.setData(10); // Here auto-boxing is happening; otherwise, I would have to write d.setData(new Integer(10)).
        System.out.println(d.getData());
        
        Data<String> s = new Data<>();
        s.setData("Hi");
        System.out.println(s.getData());
        // System.out.println(d.getData()); // Not possible to execute as the types of the values will clash.
        
        MyArray<Integer> ma = new MyArray<>();
        ma.append(10);
        ma.append(20);
        ma.append(30);
        ma.display();
        
        MyArray<String> ms = new MyArray<>();
        ms.append("Hi");
        ms.append("You are speaking to a former cricketer");
        ms.append("Guess who?");
        ms.display();
        
        fun(ma);
        fun(ms); // This is for the wildcards - generic arguments.
        
        // No parameters.
        MyArray arr = new MyArray(); // If we declare it without the parameters, it will take it as type Object.
        
        // It can also store any data type into this generic object.
        arr.append("Hi");
        arr.append(10);
        arr.append("As you can see, we can store both integer and string");
        arr.display();
 
        // Multiple Parameters
        // If the class is - MyArray<T, K> - we can define multiple parameters too, e.g., MyArray<Integer, String> ma = new MyArray<>();
        
        // Subclass
        // If I have a class that is generic, its subclass also becomes generic.
    }
}
