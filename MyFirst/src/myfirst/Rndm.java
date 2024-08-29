/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package myfirst;

import java.util.*;


/**
 *
 * @author nithish
 */
public class Rndm {
    public static void main(String [] args)
    {
        Random gen=new Random();
        for(int i=0;i<10;i++)
        {
//            System.out.println(gen.nextInt());      //Random number of integer type
//            System.out.println(gen.nextInt(500));      //Random number from the erange of [0,n)
//            System.out.println(-88+gen.nextInt(99));      //Random number from the erange of [-88,99)
            System.out.println(10*gen.nextDouble());      //nextFloat(), nextDouble() Returns a random float or double value in the range [0.0,1.0) 
        }
    }
}
