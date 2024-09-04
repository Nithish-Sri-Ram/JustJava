package myfirst;

/**
 *
 * @author nithish
 */

// Detailed explanation about memory management in Java
// Stack Memory - for static memory allocation, function calls, and primitive data values.
// Heap Memory - for dynamic memory allocation, objects, and runtime data.
// JVM memory is divided into several areas including Stack, Heap, Method Area, etc.

public class MyFirst {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Basic greeting message
        System.out.println("Hello world");

        // Example of nested loops to print a grid of numbers
        int c = 0;
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5; j++) {
                // Format the output to align numbers in columns
                System.out.format("%2d ", c);
                c++;
            }
            System.out.println();  // New line after each row
        }

        // 2D array initialization and printing
        int a[][] = {
            {1, 2, 3, 4, 5},
            {6, 7, 8, 9, 10},
            {11, 12, 13, 14, 15}
        };
        
        System.out.println("The length of array a: " + a.length);

        // Printing the 2D array using traditional for loop
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a[0].length; j++) {
                System.out.format("%3d", a[i][j]);
            }
            System.out.println();
        }

        // Printing the 2D array using enhanced for loop
        for (int[] x : a) {
            for (int j : x) {
                System.out.format("%3d", j);
            }
            System.out.println();
        }

        // Sorting and printing an array of strings
        String arr[] = {"j", "p", "J", "s", "a", "basic"};
        
        // Sort the array
        java.util.Arrays.sort(arr);

        // Print the sorted array
        for (String x : arr) {
            System.out.println(x);
        }
    }
}
