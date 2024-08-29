/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package IO_Stream_Demo;

/**
 *
 * @author nithish
 */

import java.io.*;

//in multithreading we saw the data being send from producer to the consumer using synchronization and it was done through a data object which was shared in between both of them
//But in pipped stream we we use the same concept of sharing the data but we share it using piped streams in the main method 
//So we need piped input stream(for consumer) and piped output stream (for producer)
//The connection of the above streams will be done in main method

class Producer extends Thread
{
    OutputStream os;
    public Producer(OutputStream o)
    {
        os=o;
    }
    
    public void run()
    {
        int count=1;
        while(true)
        {
            try{
                os.write(count);
                os.flush();         //this producer will write down in the output stream but there is no guarentee that data is sent ob the other side - th make sure that the data is sent on the other side we use flush 
                System.out.println("Producer: "+count);
                System.out.flush();     //This is an output stream object so we should flush after it's use
                Thread.sleep(10);
                count++;
            }
            catch(Exception e)
            {
                System.out.println(e);
            }
        }
    }
}

class Consumer extends Thread
{
    InputStream is;
    public Consumer(InputStream s)
    {
        is=s;
    }
    
    public void run()
    {
        int x;
        while(true)
        {
            try{
                x=is.read();      
                System.out.println("Consumer: "+x);         //This is an output stream object so we should flush after it's use
                System.out.flush();
                Thread.sleep(10);       //The producer is running fast while the consumer is not consuming the values on time to make them sync with each other we put the thread to sleep
            }
            catch(Exception e)
            {
                System.out.println(e);
            }
        }
    }
}

public class PipedStreamDemo {
    public static void main(String arge[])throws Exception
    {
        PipedInputStream pis=new PipedInputStream();
        PipedOutputStream pos=new PipedOutputStream();
        
        pis.connect(pos);       //Here we are commincting the two pipes 
//        pos.connect(pis);       //Even this is valid
        
        Producer p=new Producer(pos);
        Consumer c=new Consumer(pis);
        //Two pipes are created in main and each is given to producer and consummer accordingly 
        
        //NOw we'll start the threads and see the output 
        p.start();
        c.start();
    }
}
