package myfirst;

public class Method {
    // Regular method to find the maximum of two integers
    int max(int x, int y) {
        return x > y ? x : y;
    }

    // Demonstrating parameter passing in Java
    // When primitive types are passed, the changes do not affect the original variables.
    // When objects are passed, the changes affect the original objects because the reference is passed, not the actual value.

    // Method to find the greatest common divisor (GCD) using recursion
    static int gcd(int n, int m) {
        if (n == m)
            return n;
        if (n > m)
            return gcd(n - m, m);
        else
            return gcd(n, m - n);
    }

    // Demonstrating variable arguments (varargs)
    // Varargs allow you to pass a variable number of arguments to a method.
    // Note: The varargs parameter must be the last parameter in the method signature.
    static void show(int... x) {
        // Using a for-each loop to print each element
        // for(int i : x) {
        //     System.out.println(i);
        // }

        // Using a traditional for loop to print each element with its position
        for (int i = 0; i < x.length; i++) {
            System.out.println((i + 1) + ". " + x[i]);
        }
    }

    public static void main(String[] args) {
        // Example usage of max method
        int a = 15, b = 20;
        Method mp = new Method();
        System.out.println("Max of " + a + " and " + b + " is: " + mp.max(a, b));

        // Example usage of gcd method
        System.out.println("GCD of 25 and 15 is: " + gcd(25, 15));

        // Example usage of show method with varargs
        show(); // No arguments
        show(10, 20, 38); // Multiple arguments
        show(new int[] { 3, 5, 7, 9, 11, 13, 15 }); // Array as argument
    }
}
