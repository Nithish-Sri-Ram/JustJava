/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package javadocdemo;

/**
 * Class representing a Library Book.
 * 
 * @author nithish
 * @version 2.0
 * @since 2024
 */
public class Book {
    
    /**
     * Default value for the book, set to 10.
     */
    static int val = 10;
    
    /**
     * Parametrized Constructor to create a Book object.
     * 
     * @param s the name of the book
     */
    public Book(String s) {
        // Constructor implementation
    } 
    
    /**
     * Issues a book to a student.
     * 
     * @param roll the roll number of the student
     * @throws Exception if the book is not available
     */
    public void issue(int roll) throws Exception {
        // Method implementation
    }
    
    /**
     * Checks if a book is available in the library.
     * 
     * @param str the name of the book
     * @return true if the book is available, otherwise false
     */
    public boolean available(String str) {
        return true;
    }
    
    /**
     * Retrieves the name of a book based on its ID.
     * 
     * @param id the ID of the book
     * @return the name of the book
     */
    public String getName(int id) {
        return "";
    } 
}
