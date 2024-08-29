/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package NetworkProgramming;

/**
 *
 * @author nithish
 */

import java.net.*;
import java.io.*;


//Class for server 
public class ReverseEcho {
    public static void main(String []args) throws Exception
    {
        ServerSocket ss= new ServerSocket(2000);        //This only needs port number as Parameter
                
        Socket stk=ss.accept();
        //Here I'm not creating an object of socket I'm just accepting the connection
        
        //we actually get an input stream reader and we are giving that to BufferReader
        BufferedReader br = new BufferedReader(new InputStreamReader(stk.getInputStream()));
        PrintStream ps=new PrintStream(stk.getOutputStream());
        
        String msg;
        StringBuilder sb;
        do{
            msg=br.readLine();
            sb=new StringBuilder(msg);
            sb.reverse();
            msg=sb.toString();
        }while(!msg.equals("dne"));
        
        
        
        //THis is a server which will take the message from the client socket - 
        //reverse it and get it back to a stream format and it will write back in the output stream of the object
        
        
    }
}


//Class for client
class ReverseEcho {
    public static void main(String []args) throws Exception
    {
        Socket stk= new Socket("localhost",2000);        //This needs ip address and port number as Parameter
                
        //we have to read from the keyboard
        BufferedReader keyb = new BufferedReader(new InputStreamReader(System.in));
        
        
        //we actually get an input stream reader and we are giving that to BufferReader
        BufferedReader br = new BufferedReader(new InputStreamReader(stk.getInputStream()));
        PrintStream ps=new PrintStream(stk.getOutputStream());
        
        String msg;
        do{
            msg=keyb.readLine();
            ps.println(msg);    //This sends the message to the server 
            msg=br.readLine();      //This is coming from the server 
            System.out.println("From server: "+msg);
        }while(!msg.equals("dne"));
        
        
        
        //THis is a server which will take the message from the client socket - 
        //reverse it and get it back to a stream format and it will write back in the output stream of the object
        
        
    }
}