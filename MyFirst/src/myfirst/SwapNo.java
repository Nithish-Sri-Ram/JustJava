package myfirst;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author nithish
 */
public class SwapNo {
    public static void main(String [] args)
    {
        int a=12,b=9;
        System.out.println("Before Swap: "+a+" "+b);
        a=a+b;
        b=a-b;
        a=a-b;
        System.out.println("After Swap: "+a+" "+b);
        
        //The below is example using xor
        a=a^b;
        b=a^b;
        a=a^b;
        System.out.println("After xor Swap: "+a+" "+b);
    }
    
}
