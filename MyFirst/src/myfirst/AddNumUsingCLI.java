/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package myfirst;

/**
 *
 * @author nithish
 */
public class AddNumUsingCLI {
    public static void main(String args[])
    {
        double s=0;
        
        for(String x:args)
        {
            if(x.matches("[0-9\\.]+"))
                s+=Double.parseDouble(x);
        }
        System.out.println("Sum is "+s);
    }
    
}
