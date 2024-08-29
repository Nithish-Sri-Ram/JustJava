/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package javadocdemo;

/**
 *
 * @author nithish
 * @version 2.0
 * @since 2024
 */

/**
 * 
 * @author nithish
 * class for Library Book
 */
public class Book {
    /**
     * @value 10 default value
     */
    static int val=10;
    
    /**
     * Parametrized Constructor
     * @param s Book Name
     */
    public Book(String s){
    } 
    
    /**
     * Issue a book to a student
     * @param roll roll of a student 
     * @throws Exception if book is not available, throws exception
     */
    public void issue(int roll) throws Exception{
        
    }
    
    /**
     * Check if book is available
     * @param str book name
     * @return if book is available returns true else false
     */
    public boolean available(String str){
        return true;
    }
    
    /**
     * Get Book name 
     * @param id book id 
     * @return returns book name 
     */
    public String getName(int id){
        return "";
    } 
}
