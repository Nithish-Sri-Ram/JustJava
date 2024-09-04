/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Collection;

/**
 *
 * @author nithish
 */

import java.util.*;

class MyComparator implements Comparator<Integer> {
    public int compare(Integer i1, Integer i2) {
        if (i1 < i2)
            return 1;   // Usually, it would be -1 to be in ascending order.
        if (i1 > i2)
            return -1;  // Now we are reversing the order.
        return 0;
    }   // Now if we sort using this comparator, it will sort in descending order. For generic types, we can pass a comparator.
}

public class ComparatorDemo {
    public static void main(String[] args) {
        int a[] = {2, 4, 6, 8, 1, 3, 5, 7};
        int b[] = {2, 4, 6, 8, 1, 3, 5, 7};
        
        // There is a very interesting class called Arrays, and now we'll look at its methods.
        System.out.println(Arrays.compare(a, b)); // This method compares the arrays both by size and the elements present in the array.
                                                  // It will return -1, 0, or 1 according to the values present.
        
        int c[] = Arrays.copyOf(a, a.length); // This will copy all the elements of array a to c.
        Arrays.fill(c, 10);  // This will fill the whole array c with the value 10.
        
        // The Arrays class has binarySearch, mismatch method, and parallelSort (MergeSort using multithreading).
        // If the array is small, use Arrays.sort; if the array is large, use Arrays.parallelSort().
        
        Integer arr[] = {2, 4, 6, 8, 1, 3, 5, 7};  // These are not primitive integers; these are objects of the wrapper class Integer.
        // For sorting, comparison is very important - for comparison, we can write our own comparator.
    
        Arrays.sort(arr, new MyComparator());
        
        for (Integer x : arr)
            System.out.print(x + " ");
    }
}
