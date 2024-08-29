/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Generics;

/**
 *
 * @author nithish
 */
//Do's and dont's of Generics 
//1.only extends is allowed in generic class defention
//2.exetends us used for interfaces also - can't use implements in this or the previous explaination    -    for eg: though B is an interface we have to decalre it as  class MyArray<T extends B>
//3.EXtends from one class but can have multiple interfaces - eg: class MyArray<T extends A & B & C> - A is a class and B and C are interfaces (we also can't write interface first and class next the order has to followed - we can also just have the intefaces )
//4.extends and super allowed with ? in methods - super is not allowed in class defention 
//5.<?> will accept all types but cannot access it 
//6.Base type of object should be same or ?  - MyArray<Object> ma=new MyArray<Integer>(); - THis is not allowed as we canno't write any super class 


class A{}
class B extends A{}
class C extends A{}

//if I write class MyArray<T extends A> - It will only allow the classes which are exetnding from A - ie:B and C
//THis extends works for even classes and interfaces this means that it will allow all the classes which is implementing interface A
class Data<T>
{
    private T obj;
    
    public void setData(T v){
        obj=v;
    }
    
    public T getData()
    {
        return obj;
    }
}

@SuppressWarnings("unchecked")      //To get rid of the warnings I get from unchecked unsafe operations 
class MyArray<T>
{
    T A[]=(T[])new Object[10];      //We can't directly assign the array of generics, we have to create array of objects and then typeCast it to generic array
    int length=0;
    
    public void append(T v)
    {
       A[length++]=v;
    }
    
    public void display()
    {
        for(int i=0;i<length;i++)
        {
            System.out.println(A[i]);
        }
    }
}

//Subclass
class MyArray2 extends MyArray
{
    //THe type is not mentioned in this subclass so it will take it as object
}

class MyArray3 extends MyArray<String>
{
    //This will allow only the type of strings 
}

class MyArray4<T> extends MyArray<T>
{
    //NOw we have made this class also as generic 
}

//Bounded Types - This below class can have any types but we can put a limit on what are the types 

class MyArray5<T extends Number>        //THis number is a wrapper class which will allow it's own classes which inherits from number like Byte,short, int, long, float and double
{
    
}

public class GenericDemoClassEg {
    //Inside a non generic class we can write a generic method
    
//    Whithin the generic methods too the bound typw works 
//    static <E> void show(E... list)      //We can also define the below as this so we can take any number of arguments
    static <E> void show(E[] list)      //Just before the return type mention that it is a generic type so we don't get an error
    {
        for(E x:list)
        {
            System.out.println(x);
        }
    }
    
    //FOr generic arguments -we use WIldcards 
    static void fun(MyArray<?> obj)         //we can leave it as it is without adding the question mark too it will work same as leaving the array to work normally 
    {                   //THe question mark specifies that we can take any type as the input  the above is also known as unbounded wildcard - as good as with and without <?>
        obj.display();  //We can define an upper bound for the above by making making a small modification - fun(MyArray<? extends Number> obj)
    }                   //If we define it like - fun(MyArray<? super NUmber> obj) - we can use any class which is super clas to Number 
    //lower bound - use super 
    //upper bound - use extends
    public static void main(String args[])
    {
        show(new String[]{"Hi","go","Bye"});
        show(new Integer[]{10,20,30});
        Data<Integer> d=new Data<Integer>();
        d.setData(10);      //Here autoBoxing is happening otherwise I have to write d.setData(new Integer(10))
        
        System.out.println(d.getData());
        
        
        Data<String> s=new Data<String>();
        s.setData("Hi");      
        
        System.out.println(s.getData());
//        System.out.println(d.getData());      //Not possible to execute as the types of the values will calsh
        

        MyArray<Integer> ma=new MyArray<>();
        
        ma.append(10);
        ma.append(20);
        ma.append(30);
        ma.display();
        
        
        MyArray<String> ms=new MyArray<>();
        
        ms.append("Hi");
        ms.append("You are speaking to a former cricketer");
        ms.append("Guess who?");
        ms.display();
        
        fun(ma);
        fun(ms);    //This is for the wildcards - generic arguments 
//No parameters        
        MyArray arr=new MyArray();      //If we declare it without the parameters it will take it as type objects
        
        //Also it can store any dataType into this generic object
        arr.append("HI");
        arr.append(10);
        arr.append("As you can see we can store both integer and string");
        
        arr.display();
 
//Multiple Parameters
//        If the class is - MyArray<T,K> - we can define multiple parameters too eg: MyArray<Integer,String> ma=new MyArray<>();

//Subclass 
//If I have a class generic and it's subclass also becomes generic

    }
}
