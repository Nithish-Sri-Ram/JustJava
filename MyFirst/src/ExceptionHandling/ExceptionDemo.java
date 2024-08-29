package ExceptionHandling;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author nithish
 */

//Exception classes
//object(mother of all exceptions) <- throwable <- [exception,error] 
//exception <- (classNotFoundException, IOException, InterruptedException, NumberFormatException, [all these are checked exception]) RuntimeExeption
//RuntimeException <- ArithmeticException, IndexOutOfBoundException, NullPointerException [all these are unckecked exceptions]

//checked and unckecked exce[tion - java's jvm makes it compelsory to write try and catch blocks for certain exceptions but it is not compulsory for unchecked

//When there are multiple catch blocks the hirarchy should be maintained - subClasses should be on the top and the super classes should be at the bottom

//multiple try and catch blocks can be used, also nested catch blocks can be used

//Exception class methods - getMessage(),toString(), orintStackTree()
// s.o.p(e.getMessage(), s.o.p(e), e.printStackTrees()

//when defining an exception -it always inherits from the class Exception 

class  MinBalException extends Exception
{
    public String toString()
    {
        return "Minimum balance should be 5000";
    }
}

public class ExceptionDemo {
    
    static void fun1()
    {
        try
        {
            System.out.println(10/0);
        }
        catch(Exception e)
        {
            System.out.println(e);
        }
    }
    static void fun2()
    {
        fun1();
    }
    static void fun3()
    {
        fun2();
        try
        {
            throw new MinBalException();
        }
        catch(MinBalException e)
        {
            System.out.println(e);
        }
    }
    public static void main(String []args)
    {
        fun3();
        int a=10,b=0,c;
        try
        {
            c=a/b;
            System.out.println(c);
        }
        catch(ArithmeticException e)
        {
            System.out.println(e);
        }
        System.out.println("Bye");
    }
}
