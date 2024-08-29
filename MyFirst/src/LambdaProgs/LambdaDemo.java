/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package LambdaProgs;

/**
 *
 * @author nithish
 */
//lambda expressions are used for defining anonymous methods or nameless methods - defined with the help of interfaces 
//If a interface is having a single abstract method - it is a Functional Interface
@FunctionalInterface
interface MyLambda {
    
    public void display();
}

@FunctionalInterface
interface MyLambdas {
    
    public void display(String str);
}

@FunctionalInterface
interface MyLambdaex {
    
    public int display(String str1,String str2);
}

@FunctionalInterface
interface MyLambda2 {
    
    public void add(int x, int y);
}

@FunctionalInterface
interface MyLambda3 {
    
    public int add(int x, int y);
}

//can we pass lambda expression as a parameter? - Yes lambda expression can be passed as a method as an object 
class UseLambda {

    public void callLambda(MyLambda ml) {
        ml.display();
    }
}

class Demo {

    //only you cant modify the variables which are local to the method - you can modify the this instance variable or member of a class like this temp
    int temp = 10;

    public void method1() {
        //lambda expressions can access values only if they are final or they are never modified inside the method
        int count = 0;
        MyLambda ml = () -> {
            int x = 0;
            System.out.println("Hi");
            System.out.println("Bye: " + (x++) + (++temp) + count);       //can't modify the count value
        };
        ml.display();
        
        UseLambda ul = new UseLambda();
        
        ul.callLambda(() -> {System.out.println("Hello");});
    

    }
}


class My implements MyLambda {
    
    public void display() {
        System.out.println("Hello world");
    }
}

public class LambdaDemo {
    public LambdaDemo()
    {
        
    }
    public LambdaDemo(String s)
    {
        System.out.println(s.toUpperCase());
    }
    public static void reverse(String str)
    {
        StringBuffer sb=new StringBuffer(str);
        sb.reverse();
        System.out.println(sb);
    }
    public void con(String str)
    {
        System.out.println("This is added: "+str);
    }
    public static void main(String args[]) {
//        My m=new My();
        MyLambda m = new My();        //Instead of taking reference to My we can take refrence to MyLambda - it works
        MyLambda x = new MyLambda() {      //We can also create an anonymous inner class like this
            public void display() {
                System.out.println("Hello World");
            }
        };
        m.display();
        x.display();

        //The above were what we learnt till now - Lambda expressions are similar to that - below is an example
        MyLambda l = () -> {
            System.out.println("Hello World");
        };      //It is refering to the display method because it has only one method in MyLambda for which it has the reference object
        //Lambda expression makes our lives easy when we have to override functional interfaces

        //Taking parameters in lambda expressions
        MyLambda2 a = (p, q) -> {
            System.out.println(p + q);
        };
        a.add(10, 20);
        
        MyLambda3 c = (p, q) -> {
            return p + q;
        };
        
        MyLambda3 s = (p, q) -> p + q;
        
        //we can also assign reference to a method 
        MyLambdas ml=System.out::println;        //System is a class and System.out is an object inside that and there is a static method which is println
        //This println is assigned to the display method - so the display method will act like the println method - whatever string I pass it will print
        ml.display("Hello");
        
        MyLambdas st=LambdaDemo::reverse;
        //Now here display has become reverse, we can assign static methods as method reference to the lambda
        //for reference we use a scope resolution like opereator
        st.display("Hello");
        
        //If the method is static we can reference with the class name if not static we can refernce with the object name
        LambdaDemo ld1=new LambdaDemo();
        MyLambdas mld=ld1::con;
        
        mld.display("Hello GUys");
        
//        can we assign a constructor of a class as method reference? - yes 
        MyLambdas constructor=LambdaDemo::new;
        //Now for the above if we call display - the constructor will be called 
        constructor.display("nithish");
        
        MyLambdaex ct=String::compareTo;
        System.out.println(ct.display("Hello", "Hell"));
        
        //The above concept it more like polymorphism where parent class element having an object of child class and calling override method
        //So method of object will be called 
    }
}
