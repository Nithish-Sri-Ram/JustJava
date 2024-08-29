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

class MyFrame1 extends Frame 
{

    Label l1, l2;
    TextField tf;

    MyFrame1() {
        super("TextField Demo");

        l1 = new Label("No text is entered yet");
        l2 = new Label("Enter key is not yet hit!");
        tf = new TextField(20);

        Handler h= new Handler();
        //intead of reffering to this class we could refer to the handler class object
        /*
        during the construction of this object the TextListener and the ActionListener 
        is not ready - it is ready only after the creation of this object, and until then
        the below pointer will be pointed to an empty reference and to avoid that we 
        initially create an handler class for the listners so we dont have an incomplete object
        */
        
        tf.addTextListener(h);
        tf.addActionListener(h);

        setLayout(new FlowLayout());
        add(l1);
        add(tf);
        add(l2);
    }

    //To handle events we could use inner classes
    class Handler implements TextListener, ActionListener 
    {
        
        public void textValueChanged(TextEvent te) 
        {
            l1.setText(tf.getText());
        }
        
        public void actionPerformed(ActionEvent ae) 
        {
            l2.setText(tf.getText());
        }
    }

//    @Override
//    public void textValueChanged(TextEvent te)
//    {
//        l1.setText(tf.getText());
//    }
//    
//    @Override
//    public void actionPerformed(ActionEvent ae)
//    {
//        l2.setText(tf.getText());
//    }
}

public class TextFieldDemo {

    public static void main(String[] args) {
        MyFrame1 f = new MyFrame1();
        f.setSize(500, 500);
        f.setVisible(true);
    }
}
