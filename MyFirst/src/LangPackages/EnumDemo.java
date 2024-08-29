/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package LangPackages;

/**
 *
 * @author nithish
 */

//IN enum we can have defined constants = these should be in capital letters only
//User defined data types
//it is mostly usefull in switch cases
enum Dept       //All these are final values so it must be declared in capital letters
{
//    CS,IT,CIVIL,ECE;      //we can also assign values to these enums  
    CS("john","Block A"),IT("Rebecca","Block A"),CIVIL("Smith","Block C"),ECE("Katie","Block D");   //if I give value then the constructor must be a parametrized constructor     
    //the below construcor will be called 4 times as the above objects will have to be created 
    //constructor is called when the enum is loaded and not when it is assigned
//    at loading time for each constant the constructor is called
    
    //constructor can be either private or default 
    
    String head,loc;
    private Dept(String head,String loc)
    {
//        System.out.println(this.name());        //I'm just printing the name of the identifier     
            this.head=head;
            this.loc=loc;
    }
    //the other methods can be public 
    public void display()
    {
        System.out.println(this.name()+" "+this.ordinal());
    }
    
    //WE ARE assigning getters below
    public String getHeadName()
    {
        return head;
    }
    public String getLocation()
    {
        return loc;
    }
}
// all enums will be inheriting from the enum classes of the lang package

public class EnumDemo {
    public static void main(String args[])
    {
//        Dept d=1;   //It wont allow this assignment
        
        Dept d=Dept.CS;
        Dept e=Dept.CIVIL;
        
        d.display();
        e.display();
        
        System.out.println(d.ordinal());    //index as output - 0
        System.out.println(e.ordinal());    //index as output - 2
         
        Dept list[]=Dept.values();
        for(Dept x:list)
           System.out.println(x);
        
        
        Dept a=Dept.ECE;
        System.out.println(a.getHeadName());
        System.out.println(a.getLocation());
    }
}
