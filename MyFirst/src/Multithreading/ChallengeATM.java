/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Multithreading;

/**
 *
 * @author nithish
 */

class ATM
{
    synchronized void checkBalance(String name,int amt)
    {
        System.out.print(name+": is checking balance.");
        try{Thread.sleep(1000);}catch(InterruptedException e){}
        System.out.println("balance: "+amt);
        
    }
    synchronized void withdraw(int amt)
    {
        System.out.println("Remaining balance is: "+amt);
    }
}
class Customer extends Thread
{
    ATM a;
    String name;
    int amt;
    Customer(String name,int amt,ATM a)
    {
        this.a=a;
        this.name=name;
        this.amt=amt;
    }
    synchronized void useATM()
    {
        a.checkBalance(name,amt);
        a.withdraw(amt);
        try{Thread.sleep(1000);}catch(InterruptedException e){}
    }
    public void run()
    {
        useATM();
    }
}
public class ChallengeATM {
    public static void main(String []args)
    {
        ATM a=new ATM();
        Customer one=new Customer("Nithish",9_000_0000,a);
        Customer two=new Customer("Thangamani",9_999_0000,a);
        one.start();
        two.start();
    }
}
