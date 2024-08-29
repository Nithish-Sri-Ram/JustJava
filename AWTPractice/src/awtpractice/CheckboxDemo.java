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

class MyFrame extends Frame implements ItemListener
{
    Label l;
    Checkbox c1,c2,c3;
    /*
    The logic for creating the radio button is same as the check box,
    now create a new object of- CheckBoxGroup and assign it to the 
    checkbox items and set their state as true or false accordingly
    */
    CheckboxGroup cgb;
    
    public MyFrame(){
        super("Checkbox demo");
        
        l=new Label("Nothing is selected");
        
        cgb=new CheckboxGroup();
        
        c1=new Checkbox("Java",false,cgb);
        c2=new Checkbox("Python",false,cgb);
        c3=new Checkbox("C#",false,cgb);

        c1.addItemListener(this);
        c2.addItemListener(this);
        c3.addItemListener(this);
        
        setLayout(new FlowLayout());
        
        add(l);
        add(c1);
        add(c2);
        add(c3);
    }
    
    @Override
    public void itemStateChanged(ItemEvent e)
    {
        String str="";
        
        if(c1.getState())
            str+=" "+c1.getLabel();
        if(c2.getState())
            str+=" "+c2.getLabel();
        if(c3.getState())
            str+=" "+c3.getLabel();
        if(str.isEmpty())
            str="Nothing is selected";
        
        l.setText(str);
    }
}

public class CheckboxDemo {
    public static void main(String [] args){
        MyFrame f=new MyFrame();
        f.setSize(400,400);
        f.setVisible(true);
    }
}
