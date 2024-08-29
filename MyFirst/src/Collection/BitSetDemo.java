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
//This class is provided by java for performing Bitwise operations 
public class BitSetDemo {
    public static void main(String args[])
    {
        //This class will create array of elements which will store data in bitwise order 
        //If we set any bit it will be 1 (true) - usually it will be 0
        //If we clear it, it will be set to zero
        //It has methods - flip -all the bits will be flipped - complement
        //There are methods whith which we can operate on two bits - AND, OR, XOR
        //bis1.add(bis2) - this wiil do AND opereation on both 
        //Use cases - with or we can find the union of 2 objects 
        
        BitSet bs1=new BitSet();
        bs1.set(0);
        bs1.set(2);
        bs1.set(4);
        bs1.set(6);
        bs1.set(0);
        
        System.out.println(bs1);
        bs1.flip(0,bs1.length());   //Flip from which index to which index 
        System.out.println(bs1);
    }
}
