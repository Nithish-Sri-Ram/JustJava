/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ExceptionHandling;

/**
 *
 * @author nithish
 */

// Use the AutoCloseable interface to automatically close resources within the try block.
// `finally` will definitely get executed, whether there is an exception or not.

public class FinallyDemo {
    static void meth1() throws Exception {
        try {
            throw new Exception();
        } finally {
            System.out.println("final message");
        }
    }

    public static void main(String[] args) throws Exception {
        try {
            System.out.println(10 / 5);
        } finally {  // This can be written even without a catch block.
            System.out.println("final message");
        }
    }
}
