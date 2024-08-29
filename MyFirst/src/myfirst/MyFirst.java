/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package myfirst;

/**
 *
 * @author nithish
 */

//Stack Memory - also known as static memeory allocation - where all the function calls, primitive data values to a method, which are specic to methods and references to objects (objects are stored in the heap memory) are stored in the stack memory
//if we want to access the elements of the static memory we have to use the LIFO order
//Heap Memory - it is used for dynamic memory allocation (of what?) - Java objects, JRE class(that are actually created during the execution of the program.
//Heap memory is actually allocated at the runtime and these objects has the global access 

//java programs are compiled and executed in the ram of a computers
//Any memory space which is taken by a java application into the ram is known is - applicion memory (amount of memory depends on -  multiple factors like OS, processor, what JRE)
//JVM - it's memeory is basically divided into (1-Stack, 2-Heap, 3-Class,method area, 4-PCR - Program Counter Register, 5- Native method stack)

//size of stack memory is less compared to heap 
//Access to Stack memory is faster because it follows the FIFO order whereas the heap memory doesn't have any order cause it is allocated dynamically








public class MyFirst {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        System.out.println("Hellp wprld");
        int c=0;
        for(int i=0;i<5;i++)
        {
            for(int j=0;j<5;j++)
            {
                System.out.format("%2d ",c);
                c++;
            }
            System.out.println();
        }
        
        int a[][]={{1,2,3,4,5},
                   {6,7,8,9,10},
                   {11,12,13,14,15}};
        System.out.println("the length: "+a.length);
        for(int i=0;i<a.length;i++)
        {
            for(int j=0;j<a[0].length;j++)
            {
                System.out.format("%3d",a[i][j]);
            }
            System.out.println();
        }
        for(int x[]:a)
        {
            for(int j:x)
            {
                System.out.format("%3d",j);
            }
            System.out.println();
        }
        
        String arr[]={"j","p","J","s","a","basic"};
        
        java.util.Arrays.sort(arr);
        for(String x:arr)
        {
            System.out.println(x);
        }
    }
    
}