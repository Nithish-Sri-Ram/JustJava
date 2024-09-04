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

// In multithreading, we saw data being sent from producer to consumer using synchronization, and it was done through a data object shared between them.
// But in piped streams, we use the same concept of sharing the data, but we share it using piped streams in the main method.
// So we need PipedInputStream (for consumer) and PipedOutputStream (for producer).
// The connection of the above streams will be done in the main method.

class Producer extends Thread {
    OutputStream os;

    public Producer(OutputStream o) {
        os = o;
    }
    
    public void run() {
        int count = 1;
        while (true) {
            try {
                os.write(count);
                os.flush(); // This producer will write to the output stream, but there is no guarantee that data is sent on the other side. To make sure that the data is sent, we use flush.
                System.out.println("Producer: " + count);
                System.out.flush(); // This is an output stream object, so we should flush after its use.
                Thread.sleep(10);
                count++;
            } catch (Exception e) {
                System.out.println(e);
            }
        }
    }
}

class Consumer extends Thread {
    InputStream is;

    public Consumer(InputStream s) {
        is = s;
    }
    
    public void run() {
        int x;
        while (true) {
            try {
                x = is.read();
                System.out.println("Consumer: " + x); // This is an output stream object, so we should flush after its use.
                System.out.flush();
                Thread.sleep(10); // The producer is running fast, while the consumer is not consuming the values on time. To make them sync with each other, we put the thread to sleep.
            } catch (Exception e) {
                System.out.println(e);
            }
        }
    }
}

public class PipedStreamDemo {
    public static void main(String[] args) throws Exception {
        PipedInputStream pis = new PipedInputStream();
        PipedOutputStream pos = new PipedOutputStream();
        
        pis.connect(pos); // Here we are connecting the two pipes.
//        pos.connect(pis); // This is also valid.
        
        Producer p = new Producer(pos);
        Consumer c = new Consumer(pis);
        // Two pipes are created in the main method and each is given to producer and consumer accordingly.
        
        // Now we'll start the threads and see the output.
        p.start();
        c.start();
    }
}
