/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package singleton;

/**
 *
 * @author nithish
 */

class CoffeeMachine
{
    private float coffeeQty;
    private float waterQty;
    private float milkQty;
    private float sugarQty;
    
    static private CoffeeMachine my=null;
    
    private CoffeeMachine()
    {
        coffeeQty=1;
        waterQty=1;
        milkQty=1;
        sugarQty=1;
    }
    
    public void fillWater(float qty)
    {
        waterQty=qty;
    }
    public void fillSugar(float qty)
    {
        sugarQty=qty;
    }
    public float getCoffee()
    {
        return 0.23f;
    }
    //This is how we create an object and this returns reference - since the construcor is private
    static CoffeeMachine getInstance()
    {
        if(my==null)
            my=new CoffeeMachine();
        return my;
    }
}
//Singleton - we only create one instance of a classs
public class Singleton {
    public static void main(String [] args)
    {
        CoffeeMachine m1=CoffeeMachine.getInstance();       //can't create an object using a new keyword since it is an private constructor
    }
}
