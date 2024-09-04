/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package myfirst;

/**
 *
 * @author nithish
 */

class Rectangle {
    private double l;
    private double b;

    // Default constructor - initializes length and breadth to 1
    public Rectangle() {
        b = l = 1;
    }

    // Constructor to create a square with side s
    public Rectangle(int s) {
        l = b = s;
    }

    // Constructor to create a rectangle with specific length and breadth
    public Rectangle(int l, int b) {
        this.l = l;
        this.b = b;
    }

    // Optionally, you can add getter methods to retrieve the values of l and b
    public double getLength() {
        return l;
    }

    public double getBreadth() {
        return b;
    }
}

public class Constructer {
    public static void main(String[] args) {
        // Create a Rectangle object using the constructor with specific length and breadth
        Rectangle r = new Rectangle(19, 5);
        
        // Optionally, print the dimensions of the rectangle
        System.out.println("Length: " + r.getLength());
        System.out.println("Breadth: " + r.getBreadth());
    }
}
