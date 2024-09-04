package Multithreading;

/**
 * Simulates an ATM usage scenario where two customers attempt to access the ATM concurrently.
 * Synchronization is used to ensure that the critical sections are accessed by one thread at a time.
 *
 * @author nithish
 */

class ATM {
    // Synchronized method to check the balance
    synchronized void checkBalance(String name, int amt) {
        System.out.print(name + " is checking balance.");
        try {
            Thread.sleep(1000); // Simulate time taken to check balance
        } catch (InterruptedException e) {
            System.out.println(e);
        }
        System.out.println(" Balance: " + amt);
    }

    // Synchronized method to withdraw money
    synchronized void withdraw(int amt) {
        System.out.println("Remaining balance is: " + (amt - 1000)); // Simulating a withdrawal of 1000 units
    }
}

class Customer extends Thread {
    ATM atm;
    String name;
    int amt;

    Customer(String name, int amt, ATM atm) {
        this.atm = atm;
        this.name = name;
        this.amt = amt;
    }

    // Method for using the ATM
    void useATM() {
        atm.checkBalance(name, amt);
        atm.withdraw(amt);
        try {
            Thread.sleep(1000); // Simulate time taken to complete the transaction
        } catch (InterruptedException e) {
            System.out.println(e);
        }
    }

    // Override run method to execute the ATM usage in a separate thread
    public void run() {
        useATM();
    }
}

public class ChallengeATM {
    public static void main(String[] args) {
        // Create a single ATM object to be shared by both customers
        ATM atm = new ATM();

        // Create two customers who will use the same ATM
        Customer one = new Customer("Nithish", 9_000_000, atm);
        Customer two = new Customer("Thangamani", 9_999_000, atm);

        // Start both customer threads
        one.start();
        two.start();
    }
}
