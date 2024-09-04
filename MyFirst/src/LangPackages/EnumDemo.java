package LangPackages;

/**
 * Demonstrates the use of enums in Java.
 * 
 * @author nithish
 */

// Enums in Java are user-defined data types that consist of a fixed set of constants.
// Enum constants should be written in uppercase letters.
// Enums are especially useful in switch cases.
enum Dept {
    // Enum constants with associated values.
    CS("John", "Block A"), 
    IT("Rebecca", "Block A"), 
    CIVIL("Smith", "Block C"), 
    ECE("Katie", "Block D");

    // Fields associated with each enum constant.
    private String head;
    private String loc;

    // Parameterized constructor for the enum constants.
    // The constructor is called once for each constant when the enum is loaded.
    private Dept(String head, String loc) {
        this.head = head;
        this.loc = loc;
    }

    // Method to display the name and ordinal (index) of the enum constant.
    public void display() {
        System.out.println(this.name() + " " + this.ordinal());
    }

    // Getter for the head name.
    public String getHeadName() {
        return head;
    }

    // Getter for the location.
    public String getLocation() {
        return loc;
    }
}

public class EnumDemo {
    public static void main(String[] args) {
        // Using an enum constant.
        Dept d = Dept.CS;
        Dept e = Dept.CIVIL;

        // Display the details of the constants.
        d.display();
        e.display();

        // Get and display the ordinal (index) of the constants.
        System.out.println("CS Ordinal: " + d.ordinal());    // Output: 0
        System.out.println("CIVIL Ordinal: " + e.ordinal()); // Output: 2

        // Iterate through all enum constants using values() method.
        Dept[] list = Dept.values();
        for (Dept x : list) {
            System.out.println(x);
        }

        // Get and display the head name and location of a specific enum constant.
        Dept a = Dept.ECE;
        System.out.println("ECE Head: " + a.getHeadName());
        System.out.println("ECE Location: " + a.getLocation());
    }
}
