/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package IO_Stream_Demo;

import java.io.FileOutputStream;

/**
 *
 * @author nithish
 */
public class tryWithRecourcesNetbeansSuggestion {
 public static void main(String args[]) throws Exception
    {
        //we can do it like this too to make the code much more readable - though it is not recomended
            try (FileOutputStream fos = new FileOutputStream("/home/nithish/MyJava/TestTryWithResource.txt")){  //This will throw any kind of exception and we can catch it by definng the throws exception at the top of the main class
                
                String str="Learn java programing \n";
                
                fos.write(str.getBytes());
            }
    }
}
