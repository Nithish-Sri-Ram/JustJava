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
        double s = 0;
        
        // Loop through each command-line argument
        for(String x : args)
        {
            // Check if the argument is a number (supports digits and a decimal point)
            if(x.matches("[0-9\\.]+"))
                s += Double.parseDouble(x); // Convert to double and add to the sum
        }
        // Print the sum of all numeric arguments
        System.out.println("Sum is " + s);
    }
}
