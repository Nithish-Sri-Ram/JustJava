/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package LangPackages;

/**
 *
 * @author nithish
 */


public class MathDemo {
    public static void main(String args[])
    {
        System.out.println(Math.abs(-123));
        System.out.println(StrictMath.abs(-123));       //When we work with float values we prefer to get more precise results
        //Strict math is the native method of java and it would be indirectly and may or may not be called by the Math.abs at runtime 
        
        System.out.println(Math.cbrt(27));
        System.out.println(Math.decrementExact(7)); //Will give answer 6
//        System.out.println(Math.decrementExact(Integer.MIN_VALUE)); //by the underflow overflow condition - this should give the max integer value
        //But insted the above gives excepion of integer overflow
        
        System.out.println(Math.getExponent(12.3456));      //it is not stored as it is, it is stored as mantissa exponent form in main memory
        //as output we would get 3
        System.out.println(Math.getExponent(123.45));       //if at all your software needs to manage lots of floating point wou can look into this
    
        System.out.println(Math.floorDiv(50,9));        //floor of division
        
        System.out.println(Math.exp(1));        //e power x
        System.out.println(StrictMath.exp(1));        //e power x
        System.out.println(Math.log10(100));    //log base 10
        
        System.out.println(Math.tan(45*Math.PI/180));       //this method takes radians as input
        System.out.println(Math.atan(1));       //arc tan - inverse of tan
        
        System.out.println(Math.toRadians(90));
        System.out.println(Math.toDegrees(Math.atan(1)));
        System.out.println(StrictMath.toDegrees(StrictMath.tanh(1)));
        
        System.out.println(Math.multiplyExact(100,200));    //If the result gives an overflow answer it throws an arithmetic exception
        System.out.println(Math.nextAfter(12.5,13));    //Next float num in forward direction - 12.52
        System.out.println(Math.nextAfter(12.5,11));    //Next float num in backward direction - 12.49
        
        
    }
}
