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

class Point implements Comparable<Point> {
    int x;
    int y;

    Point(int x, int y) {
        this.x = x;
        this.y = y;
    }

    // I should have a toString method for printing these values
    public String toString() {
        return "x=" + x + " y=" + y;
    }

    public int compareTo(Point p) {
        if (this.x < p.x)
            return -1;
        else if (this.x > p.x)
            return 1;
        else {
            if (this.y < p.y)
                return -1;
            else if (this.y > p.y)
                return 1;
            else
                return 0;
        }
    }
}

// Previously in the TreeSet example, we stored integers, but now we'll store objects of our own class.
// If we are storing objects of our own class, then we have to implement the Comparable interface so that we can compare two objects of our class.
// This can be done by overriding the compareTo() function of the Comparable interface.
public class ComparableInterfaceDemo {
    public static void main(String[] args) {
        TreeSet<Point> ts = new TreeSet<>();

        ts.add(new Point(1, 1));
        ts.add(new Point(5, 5));
        ts.add(new Point(5, 2));

        // This will generally give an error because TreeSet is a sorted set and it requires a way to sort these objects.
        // To resolve this issue, the class must implement the Comparable interface.
        System.out.println(ts);
    }
}
