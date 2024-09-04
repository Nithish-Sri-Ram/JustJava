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

public class TryWithResourcesNetbeansSuggestion {
    public static void main(String[] args) throws Exception {
        // We can do it like this too, to make the code much more readable - though it is not recommended in all cases.
        try (FileOutputStream fos = new FileOutputStream("/home/nithish/MyJava/TestTryWithResource.txt")) {  
            // This will throw any kind of exception, and we can catch it by defining the throws Exception at the top of the main method.
            
            String str = "Learn Java programming \n";
            fos.write(str.getBytes());
        }
    }
}
