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

public class LinkedHashSetDemo {
    public static void main(String[] args) {
        // HashSet and LinkedHashSet are similar, but LinkedHashSet will maintain the order of the insertion of the elements.
        LinkedHashSet<String> lhs = new LinkedHashSet<>();
        
        lhs.add("A");
        lhs.add("B");
        lhs.add("C");
        lhs.add("D");
        lhs.add("E");
        lhs.add("F");
        
        lhs.forEach(System.out::println);
    }
}
