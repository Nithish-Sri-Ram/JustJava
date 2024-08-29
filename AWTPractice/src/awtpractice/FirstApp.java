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


//We are defining our own class for frame 
class MyFrames extends Frame
{
    Label l;
    TextField tf;
    Button b;
    
    public MyFrames()
    {
        super("My App");    //Setting the title of the frame 
        
        //This layout arranges the components in the left to right flow
        //By default the layout is border layout and now we are setting this to flow layout
        setLayout(new FlowLayout());
        
        l=new Label("Name");
        tf=new TextField(20);
        b=new Button("Ok");
        
        add(l);
        add(tf);
        add(b);
    }
}

//we can say that MyFrame it itself is a frame on it's own 
//isA frame

//when we create an object it will be known as has a frame
public class FirstApp {
    public static void main(String args[])
    {
        MyFrame f=new MyFrame();
        f.setSize(400, 400);
        f.setVisible(true);
    }
}
