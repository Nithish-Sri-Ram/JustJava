package LangPackages;

/**
 * Demonstrates the usage of various methods in the Math and StrictMath classes.
 *
 * @author nithish
 */

public class MathDemo {
    public static void main(String[] args) {
        // Absolute value methods
        System.out.println(Math.abs(-123));
        System.out.println(StrictMath.abs(-123)); // Preferred for more precise results with floating-point numbers.
        // StrictMath is the native method of Java and may or may not be called indirectly by Math.abs at runtime.

        // Cube root calculation
        System.out.println(Math.cbrt(27));

        // Decrement operations
        System.out.println(Math.decrementExact(7)); // Will give answer 6
//        System.out.println(Math.decrementExact(Integer.MIN_VALUE)); // This would throw an ArithmeticException due to integer overflow.

        // Exponent retrieval
        System.out.println(Math.getExponent(12.3456)); // Retrieves the exponent part of a floating-point number in memory.
        System.out.println(Math.getExponent(123.45));

        // Floor division
        System.out.println(Math.floorDiv(50, 9)); // Floor of the division

        // Exponential and logarithmic calculations
        System.out.println(Math.exp(1)); // e^1
        System.out.println(StrictMath.exp(1)); // e^1 (using StrictMath)
        System.out.println(Math.log10(100)); // log base 10

        // Trigonometric functions
        System.out.println(Math.tan(45 * Math.PI / 180)); // Takes radians as input
        System.out.println(Math.atan(1)); // Arc tangent (inverse of tan)

        // Conversion between degrees and radians
        System.out.println(Math.toRadians(90));
        System.out.println(Math.toDegrees(Math.atan(1)));
        System.out.println(StrictMath.toDegrees(StrictMath.tanh(1))); // Hyperbolic tangent

        // Multiplication with overflow check
        System.out.println(Math.multiplyExact(100, 200)); // Throws ArithmeticException on overflow

        // Next floating-point number in a specified direction
        System.out.println(Math.nextAfter(12.5, 13)); // Next float number in forward direction
        System.out.println(Math.nextAfter(12.5, 11)); // Next float number in backward direction
    }
}
