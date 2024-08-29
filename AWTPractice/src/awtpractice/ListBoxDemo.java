/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package awtpractice;

/**
 *
 * @author nithish
 */

//If we have multiple radio buttons we could use choice, it is like a dropdown button - we could only choose one
//if we have multiple checkboxes we could show 


/*
in the List constructor we give the values which should be shown the rest will be scrollable - 
true: multiple items can be selected and false: only one item can be selected
*/

import java.awt.*;
import java.awt.event.*;

class MyFrame4 extends Frame implements ItemListener,ActionListener
{
    List l;
    Choice c;
    TextArea ta;
    
    MyFrame4()
    {
        super("Listbox Demo");
        
        l=new List(4,true);
        c=new Choice();
        ta=new TextArea(20,30);
        
        l.add("Monday");
        l.add("Tuesday");
        l.add("Wednesday");
        l.add("Thursday");
        l.add("Friday");
        l.add("Saturday");
        l.add("Sunday");
        
        c.add("January");
        c.add("February");
        c.add("March");
        c.add("April");
//        c.add("May");
//        c.add("June");
//        c.add("July");
//        c.add("August");
//        c.add("September");
//        c.add("October");
//        c.add("November");
//        c.add("December");

         setLayout(new FlowLayout());
         add(l);
         add(c);
         add(ta);
         
         l.addItemListener(this);
         c.addItemListener(this);
         l.addActionListener(this);

    }
    
    public void itemStateChanged(ItemEvent ie)
    {
        if(ie.getSource()==l)
            ta.setText(l.getSelectedItem());
        else
            ta.setText(c.getSelectedItem());
    }
    
    public void actionPerformed(ActionEvent ae)
    {
        String list[]=l.getSelectedItems();
        
        String txt="";
        
        for(String x:list)
            txt+=x+"\n";
        
        ta.setText(txt);
    }
}

public class ListBoxDemo {
    public static void main(String args[]){
        MyFrame4 f=new MyFrame4();
        f.setSize(500,500);
        f.setVisible(true);
    }
}
