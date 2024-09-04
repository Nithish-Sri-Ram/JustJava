/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package javadocdemo;

/**
 *
 * @author nithish
 */

// Annotations help in coding effectively while preventing us from making silly mistakes.
// Common Built-In Annotations: @Override, @Deprecated, @FunctionalInterface, @SuppressWarnings, @SafeVarargs.

class Parent {
    public void display() {}
}

class Child extends Parent {
    @Override // If there's any mistake, such as a spelling mistake while overriding, this tag will give an error.
    public void display() {
        // Overridden method implementation
    }
}

class OldClass { // If this was present in the old version and we don't want to display the show() function in this version and future ones, we'll use the @Deprecated tag.
    public void display() {
        // Method implementation
    }

    @Deprecated // Restricting a programmer from using this method.
    public void show() {
        // Deprecated method implementation
    }
}

class My<T> { // User-defined generic class.
    @SafeVarargs
    private void show(T... args) { // Generic type variable argument - var type arguments are not safe. If we don't include the above annotation, we'll get an unchecked or unsafe warning, which can also be handled by @SuppressWarnings.
        // For @SafeVarargs - the method should be private or final.
        for (T x : args)
            System.out.println(x);
    }
}

@FunctionalInterface // It will only allow defining one abstract method under this interface.
interface inter {
    public void show();
//    public int add(int a, int b); // Uncommenting this will cause an error since @FunctionalInterface allows only one abstract method.
}

public class BuiltInAnnotation {
    @SuppressWarnings("deprecation") // This will ignore the deprecated warnings and will proceed to compile.
//    @SuppressWarnings("unchecked")  // Can also be used to suppress unchecked warnings.
    public static void main(String[] args) {
        // Main method implementation
    }
}
