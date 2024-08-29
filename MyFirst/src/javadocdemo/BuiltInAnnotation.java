/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package javadocdemo;

/**
 *
 * @author nithish
 */

//it is kinda another compiler helping to code effectively while preventing us from making silly mistakes
//Annotations(In-built) - @Override, @Deprecated, @FunctionalInterface, @SuppressWarnings, @SafeVarargs

//BuiltInAnnotations

class Parent
{
    public void display(){}
}

class Child extends Parent
{
    @Override       //if there is a any silly mistake such as some - spelling mistake while overriding then this tag will give an error
    public void display()
    {
        
    }
}

class OldClass      //If suppose this was present in the old version and we dont want to display the show() function in this version and future - we'll use the @Deprecated tag
{
    public void display()
    {
        
    }
    @Deprecated //Restricting a programmer from using a method
    public void show()
    {
        
    }
}

class My<T>     //User defined geniric class
{
    @SafeVarargs
    private void show(T...args)     //geniric type variable argument - ver type arguments are not safe - if we don't include the above statement we'll get unched or unsafe error which van also be handled by  @SuppressWarnings
    {       //For the above - it should be private or final 
        for(T x:args)
            System.out.println(x);
    }
}

@FunctionalInterface    //It will only allow to define one function under functional interface
interface inter
{
    public void show();
//    public int add(int a,int b);
}

public class BuiltInAnnotation {
    @SuppressWarnings("deprication")  //This will ignore the deprecated warnings and will go ahead and compile
//    @SuppressWarnings("unchecked")  //Can also be used on unchecked warnings
    public static void main(String args[])
    {
        
    }
}
