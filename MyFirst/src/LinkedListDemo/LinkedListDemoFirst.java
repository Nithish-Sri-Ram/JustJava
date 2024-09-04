package LinkedListDemo;

/**
 * Demonstrates a simple implementation of a singly linked list in Java.
 *
 * @author nithish
 */

public class LinkedListDemoFirst {

    // Inner class to represent a node in the linked list
    class Node {
        int data;
        Node next;

        // Constructor to create a new node with the given data
        Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    // Head node of the linked list
    private Node head;

    // Method to insert a new node at the end of the linked list
    public void insert(int data) {
        Node newNode = new Node(data);
        if (head == null) {
            head = newNode; // If the list is empty, make the new node the head
        } else {
            Node temp = head;
            while (temp.next != null) {
                temp = temp.next; // Traverse to the last node
            }
            temp.next = newNode; // Link the new node to the end of the list
        }
    }

    // Method to display the elements of the linked list
    public void display() {
        if (head == null) {
            System.out.println("The linked list is empty.");
        } else {
            Node temp = head;
            while (temp != null) {
                System.out.print(temp.data + " -> ");
                temp = temp.next; // Move to the next node
            }
            System.out.println("null");
        }
    }

    // Main method to test the linked list implementation
    public static void main(String[] args) {
        LinkedListDemoFirst list = new LinkedListDemoFirst();

        // Inserting elements into the linked list
        list.insert(10);
        list.insert(20);
        list.insert(30);
        list.insert(40);

        // Displaying the linked list
        list.display(); // Output: 10 -> 20 -> 30 -> 40 -> null
    }
}
