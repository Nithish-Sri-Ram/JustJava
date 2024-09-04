/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ExceptionHandling;

/**
 *
 * @author nithish
 */

class NegativeDimensionException extends Exception {
    public String toString() {
        return "Radius can't be negative";
    }
}

public class ThrowThrows {
    static int check(int r) throws Exception {
        if (r < 0) {
            throw new NegativeDimensionException();
        }
        return r;
    }

    static int area(int l, int b) throws Exception {
        if (l < 0 || b < 0) {
            throw new Exception();
        }
        return l * b;
    }

    static int meth1() throws Exception {
        return area(-10, 100);
    }

    static int fun1() {
        return 10 / 2;
    }

    static void fun2() {
        fun1();
    }

    static void fun3() {
        fun2();
    }

    public static void main(String[] args) throws Exception {
        try {
            fun3();
        } catch (Exception e) {
            System.out.println(e);
        }
        try {
            meth1();
        } catch (Exception e) {
            System.out.println(e);
        }
        try {
            check(-11);
        } catch (NegativeDimensionException e) {
            System.out.println(e);
        }
    }
}
