/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package awtpractice;

/**
 *
 * @author nithish
 */

import java.awt.*;
import java.awt.event.*;

class MyFrame extends Frame implements ActionListener
{
    //when implementing the action Listner interface - override methods
    int count=0;
    Label l;
    Button b;
    
    public MyFrame()
    {
        super("Button Demo");
        
        l=new Label("   "+count);
        b=new Button("Click");
        b.addActionListener(this);  //This class is the listner of this button 
        
        setLayout(new FlowLayout());
        add(l);
        add(b);   
    }
    
    public void actionPerformed(ActionEvent ae) {
        count++;
        l.setText(" "+count);
        
    }
}

public class Counter {
    public static void main(String args[])
    {
        MyFrame f=new MyFrame();
        f.setSize(400,400);
        f.setVisible(true);
    }
}
