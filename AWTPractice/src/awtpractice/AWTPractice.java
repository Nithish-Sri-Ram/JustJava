/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package awtpractice;

/**
 *
 * @author nithish
 */

import java.awt.*;

/*
All the components ie:Button, will have their own properties, Methods and Event(like onClick, select)
components - generate events and these should be handles by listeners(Reciver)
Some important event classes and interfaces are 
ActionEvent
MouseEvent
KeyEvent
ItemEvent
TextEvent
MouseWheelEvent
WindowEvent
ComponentEven
ContainerEvent
*/

public class AWTPractice {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Frame f= new Frame("Myfirst app");
        
        //when we initialize and set a button it will cover the entire screen - we have to set layouts to handle that
        f.setLayout(new FlowLayout());
        Button b=new Button("Ok");
        Label l= new Label("Name");
        TextField tf = new TextField(20);
        
        f.add(l);
        f.add(tf);
        f.add(b);
        f.setSize(300, 300);
        f.setVisible(true);
    }
    
}
