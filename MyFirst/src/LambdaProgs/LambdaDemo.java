package LambdaProgs;

/**
 * Demonstrates the usage of Lambda expressions in Java.
 * Lambda expressions are used to define anonymous methods or nameless methods,
 * and are typically associated with functional interfaces.
 *
 * @author nithish
 */

@FunctionalInterface
interface MyLambda {
    void display();
}

@FunctionalInterface
interface MyLambdas {
    void display(String str);
}

@FunctionalInterface
interface MyLambdaex {
    int display(String str1, String str2);
}

@FunctionalInterface
interface MyLambda2 {
    void add(int x, int y);
}

@FunctionalInterface
interface MyLambda3 {
    int add(int x, int y);
}

// Lambda expressions can be passed as parameters to methods. 
class UseLambda {
    public void callLambda(MyLambda ml) {
        ml.display();
    }
}

class Demo {
    // Only instance variables or class members can be modified inside a lambda expression, not local variables.
    int temp = 10;

    public void method1() {
        // Lambda expressions can access local variables only if they are final or effectively final.
        int count = 0;
        MyLambda ml = () -> {
            int x = 0;
            System.out.println("Hi");
            System.out.println("Bye: " + (x++) + (++temp) + count); // Can't modify the count value
        };
        ml.display();

        UseLambda ul = new UseLambda();
        ul.callLambda(() -> System.out.println("Hello"));
    }
}

class My implements MyLambda {
    public void display() {
        System.out.println("Hello world");
    }
}

public class LambdaDemo {

    public LambdaDemo() {
    }

    public LambdaDemo(String s) {
        System.out.println(s.toUpperCase());
    }

    public static void reverse(String str) {
        StringBuffer sb = new StringBuffer(str);
        sb.reverse();
        System.out.println(sb);
    }

    public void con(String str) {
        System.out.println("This is added: " + str);
    }

    public static void main(String[] args) {
        // Demonstrating traditional approach
        MyLambda m = new My(); // Using reference to MyLambda interface
        MyLambda x = new MyLambda() { // Anonymous inner class
            public void display() {
                System.out.println("Hello World");
            }
        };
        m.display();
        x.display();

        // Using Lambda expression
        MyLambda l = () -> {
            System.out.println("Hello World");
        }; // Referring to the display method of MyLambda interface
        l.display();

        // Lambda expression with parameters
        MyLambda2 a = (p, q) -> {
            System.out.println(p + q);
        };
        a.add(10, 20);

        MyLambda3 c = (p, q) -> p + q;
        System.out.println(c.add(10, 20));

        // Method reference examples
        MyLambdas ml = System.out::println; // Method reference to println
        ml.display("Hello");

        MyLambdas st = LambdaDemo::reverse; // Method reference to a static method
        st.display("Hello");

        LambdaDemo ld1 = new LambdaDemo();
        MyLambdas mld = ld1::con; // Method reference to a non-static method
        mld.display("Hello Guys");

        // Constructor reference
        MyLambdas constructor = LambdaDemo::new; // Constructor reference
        constructor.display("nithish");

        // Method reference to compare strings
        MyLambdaex ct = String::compareTo;
        System.out.println(ct.display("Hello", "Hell"));

        // The above concept is similar to polymorphism where a parent class reference
        // holds a child class object and calls the overridden method.
    }
}
