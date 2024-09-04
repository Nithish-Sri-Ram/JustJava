package LangPackages;

/**
 * Demonstrates the usage of wrapper classes in Java.
 * Wrapper classes allow primitive data types to be treated as objects, enabling them to be used where objects are required.
 *
 * @author nithish
 */
public class WrapperDemo {
    public static void main(String[] args) {

        // Primitive to wrapper conversion (boxing)
        int q = 10; // Primitive int
        Integer i = new Integer(10);  // Boxing - int wrapped into Integer
        // Wrapper classes allow primitive types to be used as objects with properties and methods.

        Integer a = Integer.valueOf(10);
        Integer b = 10; // Autoboxing - automatically converts primitive to Integer

        Byte c = 15;
        Byte d = Byte.valueOf("15");

        short f = Short.valueOf("123");

        Float g = 12.3f;

        Double j = Double.valueOf("11");
        Double k = Double.valueOf(77.5);

        Character l = Character.valueOf('A');

        Boolean m = Boolean.valueOf("true");

        // Boxing example
        Byte bb = 15;
        Byte e = Byte.valueOf(bb); // Boxing (or wrapping) primitive variable into an object

        // Unboxing example
        Float h = Float.valueOf("124.5");
        float x = h.floatValue(); // Unboxing - extracting the primitive value from the wrapper
        float y = h; // Automatic unboxing

        // Static methods and conversions
        int n = 10;
        Integer o = Integer.valueOf(n);
        int p = o; // Unboxing

        int m1 = 15;

        // Static methods of wrapper classes
        Integer m2 = Integer.valueOf("123");
        Integer m3 = Integer.valueOf("A7", 16); // Hexadecimal conversion
        Integer m4 = Integer.valueOf("1010", 2); // Binary conversion with radix 2
        Integer m5 = Integer.valueOf("11111111", 2); // Binary conversion with radix 2
        Integer m6 = Integer.decode("0xA7"); // Decode method for hexadecimal

        // Printing results
        System.out.println(m1); // 15
        System.out.println(m2); // 123
        System.out.println(m3); // 167 (Hex A7 converted to decimal)
        System.out.println(m4); // 10 (Binary 1010 converted to decimal)
        System.out.println(m5); // 255 (Binary 11111111 converted to decimal)
        System.out.println(m6); // 167 (Hex 0xA7 converted to decimal)
        System.out.println(Integer.reverseBytes(128)); // Reverse bytes of the integer 128
        System.out.println(Integer.reverseBytes(128) == Integer.MIN_VALUE); // Check if reversed 128 equals Integer.MIN_VALUE
        System.out.println(Integer.toBinaryString(40)); // Binary representation of 40

        // Floating-point special values
        Float f1 = 12.5f / 0; // Float does not throw divide by zero exception, results in infinity
        Float sq = (float) Math.sqrt(-1); // Square root of a negative number results in NaN

        // Checking special floating-point values
        System.out.println(f1.isInfinite()); // true
        System.out.println(Float.POSITIVE_INFINITY); // Infinity (constant value)
        System.out.println(Float.NEGATIVE_INFINITY); // -Infinity (constant value)
        System.out.println(sq.isNaN()); // true - checks if the value is NaN (Not a Number)
        System.out.println(sq == Float.NaN); // false - NaN is not equal to anything, even itself
        System.out.println(sq != Float.NaN); // true - NaN is not equal to anything, even itself

    }
}
