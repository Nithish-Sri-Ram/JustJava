/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package myfirst;

/**
 *
 * @author nithish
 */
public class PrintfFlag {
    public static void main(String []args){
        //falg exampels
        int n=10;
        System.out.printf("%5d", n);
        System.out.println();
        System.out.printf("%05d", n);
        System.out.println();
        int m=-10;
        System.out.printf("%(5d", n);
        System.out.println();
        System.out.printf("%+5d\n", n);
        String s="Java";
        System.out.printf("%20s\n",s);
        System.out.printf("%-20s\n",s);
        
        
    }
}
