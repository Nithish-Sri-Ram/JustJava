/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Collection;

/**
 *
 * @author nithish
 */

// In the constructor of HashSet, along with the initial capacity, we can specify the load factor too. 
// For example, if out of 100 free spaces we want to store only 50 elements, then the load factor is 0.5.
// By default, the load factor will be 0.75 - we can modify it between 0 and 1.

// If and only if you need to add and remove in constant time, then use HashSet. 
// Otherwise, don't, because they use a lot of memory - which can be controlled by using the load factor.

import java.util.*;

public class HashSetDemo {
    public static void main(String[] args) {
        // A hash table, when printed, will not be in the same order as they are inserted.
        // HashSet<Integer> hs = new HashSet<>(20, 0.25f);  // Here we mention that only 5 elements of the initial size 20 will be filled. 
                                                            // If required, the size will be increased automatically.
        HashSet<Integer> hs = new HashSet<>();
    }
}
