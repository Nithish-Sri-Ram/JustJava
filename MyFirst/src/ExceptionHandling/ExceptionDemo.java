package ExceptionHandling;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author nithish
 */

// Exception classes
// Object (mother of all classes) <- Throwable <- [Exception, Error]
// Exception <- (ClassNotFoundException, IOException, InterruptedException, NumberFormatException, [all these are checked exceptions]) RuntimeException
// RuntimeException <- ArithmeticException, IndexOutOfBoundsException, NullPointerException [all these are unchecked exceptions]

// Checked and unchecked exceptions - Java's JVM makes it compulsory to write try and catch blocks for certain exceptions (checked exceptions), 
// but it is not compulsory for unchecked exceptions.

// When there are multiple catch blocks, the hierarchy should be maintained - subClasses should be on the top, and the super classes should be at the bottom.

// Multiple try and catch blocks can be used, and also nested catch blocks can be used.

// Exception class methods - getMessage(), toString(), printStackTrace()
// s.o.p(e.getMessage()), s.o.p(e), e.printStackTrace()

// When defining a custom exception - it should always inherit from the Exception class.

class MinBalException extends Exception {
    public String toString() {
        return "Minimum balance should be 5000";
    }
}

public class ExceptionDemo {
    
    static void fun1() {
        try {
            System.out.println(10 / 0);
        } catch (Exception e) {
            System.out.println(e);
        }
    }

    static void fun2() {
        fun1();
    }

    static void fun3() {
        fun2();
        try {
            throw new MinBalException();
        } catch (MinBalException e) {
            System.out.println(e);
        }
    }

    public static void main(String[] args) {
        fun3();
        int a = 10, b = 0, c;
        try {
            c = a / b;
            System.out.println(c);
        } catch (ArithmeticException e) {
            System.out.println(e);
        }
        System.out.println("Bye");
    }
}
