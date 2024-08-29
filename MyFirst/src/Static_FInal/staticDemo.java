package Static_FInal;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author nithish
 */



//Static keyword is used to represent metadata of a class
//Static values are shared data between objects of classes
//use static methods when there are some calculatoions to be made
//static methods can acces only static variables
//can't use this or syper kewords with static methods
//Outer classes can't be static only the inner classes are static 

//we can write set of staements as block and declare it as static 

//Final variables have to use only upper case alphabets
//3 Ways fto initialize these variables - direct, inside a staic block, inside the constructor of a class
//oncle initialized final variable can't be modified
//method declared as final can't be overrided
//a final class can't be inherited by other classes



class Test{
    static      //These are static blocks inside this class will only execute when this class is used
    {
        System.out.println("Block 1 inside the test class");
    }
    static 
    {
        System.out.println("Block 2 inside test class");
    }
}


public class staticDemo {
    
    final float PI=3.14f;   //PI can't be initialized later - it has to be initialized at the time of declaration
    final float a;
    static final float b;
    final float con;
    staticDemo()
    {
        con=5;
    }
    {
        a=1;        //This is an instance block and the final variable can be initialized here
    }
    static
    {
        b=2;        //static final elements can be instatintiated in the static block
    }
    static      //These are static blocks - The main method executes after executing static blocks
    {
        System.out.println("Block");
    }
    public static void main(String []args)
    {
        Test t=new Test();
        System.out.println("This is main");
    }
    static 
    {
        System.out.println("Block 2");
    }
}
