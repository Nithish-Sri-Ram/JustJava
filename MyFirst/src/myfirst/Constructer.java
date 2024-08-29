/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package myfirst;

/**
 *
 * @author nithish
 */

class Rectangle
{
    private double l;
    private double b;
    public Rectangle()
    {
        b=l=1;
        
    }
    public Rectangle(int s)
    {
        l=b=s;
    }
    public Rectangle(int l,int b)
    {
        this.l=l;
        this.b=b;
    }
}
public class Constructer {
    public static void main(String [] args)
    {
        Rectangle r=new Rectangle(19,5);
    }
}
