/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Generics;

/**
 *
 * @author nithish
 */

// Every class is inheriting from the Object class, which is the mother of all classes - even if we write our classes, 
// they are directly or indirectly inheriting from the Object class. It is in the java.lang package.
// A reference of a child class can be held in the reference of a parent class.
// Object obj = new String("hi");  - We achieve generalization using the Object class in Java.
// String str = obj; (Not allowed) - But we can't directly assign it like this; we have to do typecasting.
// String str = (String) obj;  - This is the limitation.

// In generics, we have to make the class itself generic - then we can use generics.
// Usually, we don't have to write generic classes - we would typically utilize the generic code available in Java.

public class GenericDemo<T> {
    T data[] = (T[]) new Object[3]; // We take help of the Object class to declare generics.
    
    public static void main(String[] args) {
        // At the bottom, I have mentioned the drawbacks of using generics.
        // Generics are similar to Objects - they can store any type of data, but we have to specify the data type.
        
        GenericDemo<String> gd = new GenericDemo<>(); // Here we create an object of this class and use the generic array.
        
        gd.data[0] = "Hi";
        gd.data[1] = "Bye";
        // gd.data[2] = 10;  // Unlike an Object array, generics are type-safe, so we can't assign other data types, and it will show errors at compile time itself, unlike runtime errors for Objects.
        
        String str = gd.data[0]; // This does not need to be typecast when retrieving it back to a String object because the generic array itself is declared as a String array.
        
        // Object obj = new String("Hello");
        // obj = new Integer(10);
        // String str = (String) obj; // This doesn't give an error at compile time, but it gives an error at runtime.
        // So to conclude, objects can be used for generalization, but these are the drawbacks - there is no type safety.
        
        // We can see the problem with the array example below.
        Object objArr[] = new Object[3];
        objArr[0] = "hi";
        objArr[1] = "Bye";
        objArr[2] = new Integer(10); // Here we can see it is not type-safe - we are not storing a particular type of data, and it throws an exception when we try to store any type of data.
    }
}
