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

class MyFrame2 extends Frame implements ActionListener
{
    TextArea ta;
    TextField tf;
    Label l;
    Button b;
    
    MyFrame2()
    {
        super("Textarea Demo");
        
        l=new Label("               ");
        ta=new TextArea(10,30); //Rows and cols
        tf=new TextField(20);
        b=new Button("Click");
        
        //The text area is similar to the notepad
        setLayout(new FlowLayout());
        add(ta);
        add(l);
        add(tf);
        add(b);
        b.addActionListener(this);
    }
    
    public void actionPerformed(ActionEvent ae){
//        l.setText(ta.getSelectedText());
          ta.append(tf.getText());
          //Here the cursor is know as caret
          ta.insert(tf.getText(),ta.getCaretPosition());
    }
}


public class TextAreaDemo {
    public static void main(String []args){
        MyFrame2 f=new MyFrame2();
        f.setVisible(true);
        f.setSize(500,500);
    }
}
