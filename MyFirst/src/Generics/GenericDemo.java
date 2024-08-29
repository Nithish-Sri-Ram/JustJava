/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Generics;

/**
 *
 * @author nithish
 */

//Every class is inheriting from the object class which the mohter of all classes - even if we write our classes it is directly or indirecly inheriting from the object class - it is in java.lang package
//Reference of child class can be held in the reference of a parent class 
//Object obj=new String("hi");  - We archive generalization using the object class in java 
//String str=obj; (Not allowed) - But we can't directly asign it like this we have to do typecasting 
//String str=(String)obj;  - this is the limitation 


//In generic we have to make the class itself generic - THen we can use generic
//Usually we don't have to write generic classes - we would have to utilize the generic code available in java

public class GenericDemo<T> {
    T data[]=(T[]) new Object[3];       //We take help of the object class to declare generics
 public static void main(String args[])
 {
     //At the bottom I have mentioned the drawbacks of using generics 
     //geniric is similar to the Objects - it can store any typw of data - but we have to specify the data type 
     
     GenericDemo<String> gd=new GenericDemo();  //Here we create an object of this class and use the generic array
     
     gd.data[0]="Hi";
     gd.data[1]="Bye";
//     gd.data[2]=10;     //Unlike objects array generics are typeSafe so we can't assign other data types and it will show errors in the compile time itself unlike giving runtime errors for Objects
    
    String str=gd.data[0];  //This need not be typeCasted when retriveng back to a String object because the generic array itself is being declared as a String array 
    
     

//     Object obj=new String("Hello");
//     obj=new Integer(10);
//     String str=(String) obj;       //This doesn't give an error in the compiletime rather it gives error in the runtime 
//     //So to conclude objects can be used for generalization but these are the drawbacks - there is no type safety 
//     
//     //We can see the problem with the array example below
//     Object objArr[]=new Object[3];
//     objArr[0]="hi";
//     objArr[1]="Bye";
//     objArr[2]=new Integer(10);     //Here we can see it is not typeSafe    - where we are not storing a particular type of data and it throws exception when we try to store any type of data
 }
 
}
