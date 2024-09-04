import java.util.*;

/**
 * Demonstrates the use of LinkedList in Java, including adding elements, cloning,
 * and iterating using different methods.
 * 
 * @author nithish
 */
public class LinkedListDemo {

    public static void main(String[] args) {
        // Create a LinkedList with no initial elements
        LinkedList<Integer> ll1 = new LinkedList<>();
        
        // Create a LinkedList with initial elements using List.of()
        LinkedList<Integer> ll2 = new LinkedList<>(List.of(1, 2, 3, 4));
        
        // Add elements to ll1
        ll1.add(10);
        ll1.add(11);
        
        // Add elements to ll2
        ll2.add(12);
        ll2.add(15);
        
        // Add all elements of ll2 to ll1
        ll1.addAll(ll2);

        // Iterate over ll1 using forEach with a lambda expression
        ll1.forEach(x -> System.out.println(x));

        // Another way to use forEach with a lambda expression
        ll1.forEach((x) -> {
            System.out.println(x);
        });

        // Clone ll1 into ll2
        ll2 = (LinkedList<Integer>) ll1.clone();
        
        // Print both lists to see the contents
        System.out.println("LinkedList ll1: " + ll1);
        System.out.println("LinkedList ll2 (cloned from ll1): " + ll2);

        // Iterate over ll1 in reverse order using descendingIterator
        System.out.println("Elements in ll1 in reverse order:");
        Iterator<Integer> it = ll1.descendingIterator();
        while (it.hasNext()) {
            System.out.println(it.next());
        }

        // Use a ListIterator starting at a specific index (3 in this case)
        ListIterator<Integer> li = ll1.listIterator(3);
        
        // Set a new value at index 1
        ll1.set(1, 9);
        
        // Convert ListIterator to a string to display its current state
        System.out.println("ListIterator starting at index 3: " + li.toString());
        
        // Final print of ll1 to see the changes
        System.out.println("Modified LinkedList ll1: " + ll1);
    }
}
