package Static_Final;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author nithish
 */

class Test {
    static { // This static block runs when the class is loaded
        System.out.println("Block 1 inside the Test class");
    }

    static { // This static block also runs when the class is loaded, after the previous block
        System.out.println("Block 2 inside Test class");
    }
}

public class staticDemo {
    
    final float PI = 3.14f;   // Final variable initialized at declaration
    final float a;            // Final variable initialized in an instance block
    static final float b;     // Static final variable, initialized in a static block
    final float con;          // Final variable initialized in the constructor
    
    staticDemo() {
        con = 5; // Final variable initialized in the constructor
    }

    { // Instance block, used to initialize instance variables
        a = 1;  // Final variable 'a' is initialized here
    }

    static { // Static block used for class-level initialization
        b = 2;  // Static final variable 'b' is initialized here
    }

    static { // Static block 1 for class-level initialization
        System.out.println("Static Block 1 in staticDemo");
    }

    public static void main(String[] args) {
        Test t = new Test(); // Creating an instance of Test class, which triggers static blocks in Test class
        System.out.println("This is main method in staticDemo");
    }

    static { // Static block 2 for class-level initialization
        System.out.println("Static Block 2 in staticDemo");
    }
}
