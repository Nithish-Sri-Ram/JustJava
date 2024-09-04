/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package myfirst;

/**
 *
 * @author nithish
 */

class Subject {
    private String subID, name;
    private int maxMarks, marksObtain;
    
    // Constructor to initialize the Subject object
    public Subject(String subID, String name, int maxMarks) {
        this.subID = subID;
        this.name = name;
        this.maxMarks = maxMarks;
    }

    // Getter methods for private fields
    public String getSubID() {
        return subID;
    }

    public String getName() {
        return name;
    }

    public int getMaxMarks() {
        return maxMarks;
    }

    public int getMarksObtained() {
        return marksObtain;
    }

    // Setter methods for modifying private fields
    public void setMarks(int m) {
        maxMarks = m;
    }

    public void setMarksObtain(int m) {
        marksObtain = m;
    }

    // Method to check if the student has qualified based on marks obtained
    boolean isQualified(int m) {
        return m > maxMarks;
    }

    // Override the toString() method to display the Subject details
    public String toString() {
        return "\nSubject ID: " + subID + "\nName: " + name + "\nMarks Obtained: " + marksObtain;
    }
}

public class ArrayOfObjects {
    public static void main(String[] args) {
        // Create an array of Subject objects
        Subject subs[] = new Subject[3];
        
        // Initialize each Subject object in the array
        subs[0] = new Subject("s101", "DS", 100);
        subs[1] = new Subject("s102", "Algorithms", 100);
        subs[2] = new Subject("s103", "OS", 0);
        
        // Print the details of each Subject in the array
        for (Subject s : subs) {
            System.out.println(s);
        }
    }
}
