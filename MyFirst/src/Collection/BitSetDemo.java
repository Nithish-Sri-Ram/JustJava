/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Collection;

/**
 *
 * @author nithish
 */

import java.util.*;

// This class is provided by Java for performing bitwise operations.
public class BitSetDemo {
    public static void main(String[] args) {
        // This class will create an array of elements that will store data in bitwise order.
        // If we set any bit, it will be 1 (true) - by default, it will be 0.
        // If we clear it, it will be set to zero.
        // It has methods like flip - all the bits will be flipped - complement.
        // There are methods with which we can operate on two BitSets - AND, OR, XOR.
        // bs1.and(bs2) - this will perform an AND operation on both.
        // Use cases - with OR we can find the union of two objects.
        
        BitSet bs1 = new BitSet();
        bs1.set(0);
        bs1.set(2);
        bs1.set(4);
        bs1.set(6);
        bs1.set(0);
        
        System.out.println(bs1);
        bs1.flip(0, bs1.length());   // Flip from the specified index to the specified index.
        System.out.println(bs1);
    }
}
