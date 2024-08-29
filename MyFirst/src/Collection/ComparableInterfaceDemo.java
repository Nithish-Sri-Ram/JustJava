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

class Point implements Comparable
{
    int x;
    int y;
    Point(int x,int y)
    {
        this.x=x;
        this.y=y;
    }
    //I should have a toString method for printing this values
    public String toString()
    {
        return "x="+x+"y="+y;
    }
    
    public int compareTo(Object o)
    {
        Point p=(Point)o;
        if(this.x<p.x)
            return -1;
        else if(this.x>p.x)
            return 1;
        else
        {
            if(this.y<p.y)
                return -1;
            else if(this.y>p.y)
                return 1;
            else
                return 0;
        }
    }
}

//Previously in the treeSet example we stored integers but now we'll store objects of our own class 
//If we are storing objects of our own class then we have to implement the comparable interface - so we can compare 2 objects of our class - this can be done by overriding the compare() function of the comparable interface
public class ComparableInterfaceDemo {
    public static void main(String args[])
    {
        TreeSet<Point> ts=new TreeSet<>();
        
        ts.add(new Point(1,1));
        ts.add(new Point(5,5));
        ts.add(new Point(5,2));
        //This will genereally give an error cuz Tree Set is a sorted set and it will require to be specified of how to sort this object
        //To justify the above point the class must implement the comparable interface
        System.out.println(ts);
    }
}
