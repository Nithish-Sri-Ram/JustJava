/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package LangPackages;

/**
 *
 * @author nithish
 */
public class WrapperDemo {
    public static void main(String args[]) {

        int q=10;           //This is a primitive not an object
        Integer i = new Integer(10);  //int is a primitive data type,it doesn't have any properties and methods like objects do
        //wrapper around the primotives enable to declare primitive data types as classes 
        //integwe is a child class of nuiber class
        Integer a = Integer.valueOf(10);
        Integer b = 10;

        Byte c = 15;
        Byte d = Byte.valueOf("15");

        short f = Short.valueOf("123");

        Float g = 12.3f;

        Double j = Double.valueOf("11");
        Double k = Double.valueOf(77.5);

        Character l = Character.valueOf('A');       

        Boolean m = Boolean.valueOf("true");

        Byte bb = 15;
        Byte e = Byte.valueOf(bb);      //here we can see this process is known as boxong or wrapping around this primitive variable

        Float h = Float.valueOf("124.5");
        float x = h.floatValue();       //this is called unboxing - from object we are getting a primitive
        float y = h;    //automatic unboxing

        int n = 10;
        Integer o = Integer.valueOf(n);
        int p = o;

        int m1 = 15;
            
        //below are some static methods 
        
        Integer m2 = Integer.valueOf("123");
        Integer m3 = Integer.valueOf("A7", 16);     //hexadecimal
        Integer m4 = Integer.valueOf("1010",2);     //This is in binary so we should mention the radix as 2
        Integer m5 = Integer.valueOf("11111111",2);
        Integer m6 = Integer.decode("0xA7");
        
        System.out.println(m1);
        System.out.println(m2);
        System.out.println(m3);
        System.out.println(m4);
        System.out.println(m5);
        System.out.println(m6);
        System.out.println(Integer.reverseBytes(128));
        System.out.println(Integer.reverseBytes(128)==Integer.MIN_VALUE);
        System.out.println(Integer.toBinaryString(40));     //will give a binary representation of 40
        
        
        float a1=12.5f;
        Float f1=12.5f/0;       //float does not give divide by zero exception
        Float sq=(float)Math.sqrt(-1);
        
        System.out.println(f1.isInfinite());    //true
        System.out.println(f1.POSITIVE_INFINITY);    //true - here I have used a static method to check
        System.out.println(f1.NEGATIVE_INFINITY);    //false
        System.out.println(sq.isNaN());    //false - checks if not a number
        System.out.println(sq==Float.NaN);    //false 
        System.out.println(sq!=Float.NaN);    //true

    }
}
