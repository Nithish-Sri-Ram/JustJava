package JavaMasteryCourse;

import java.util.Scanner;

/**
 *
 * @author nithish
 */
public class Patterns {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int n = in.nextInt();
        int stars = 1;
        int spaces = n - 2;

        // First pattern: Diamond-like pattern
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= stars; j++) {
                System.out.print("* ");
            }

            for (int j = 1; j <= spaces; j++) {
                System.out.print("  ");
            }

            int s = stars;
            if ((n / 2) + 1 == i) {
                s--; // Adjust the middle row to avoid duplication of the center star
            }
            for (int j = 1; j <= s; j++) {
                System.out.print("* ");
            }

            System.out.println();

            if (i <= n / 2) {
                stars++;
                spaces -= 2;
            } else {
                stars--;
                spaces += 2;
            }
        }

        // Example pattern output:
//        Enter a number: 7
//              * 
//            * * * 
//          * * * * * 
//        * * * * * * * 
//          * * * * * 
//            * * * 
//              * 

        // Second pattern: Pyramid pattern
//        int n = in.nextInt();
//        int stars = 1;
//        int spaces = n / 2;
//        for (int i = 1; i <= n; i++) {
//            for (int j = 1; j <= spaces; j++) {
//                System.out.print("  ");
//            }
//            for (int j = 1; j <= stars; j++) {
//                System.out.print("* ");
//            }
//
//            System.out.println();
//            if (i <= n / 2) {
//                stars += 2;
//                spaces--;
//            } else {
//                stars -= 2;
//                spaces++;
//            }
//        }

        // Example pattern output:
//        7
//        * 
//        * * 
//        * * * 
//        * * * * 
//        * * * 
//        * * 
//        * 

        // Third pattern: Simple increasing and decreasing star pattern
//        int n = in.nextInt();
//        int stars = 1;
//        for (int i = 1; i <= n; i++) {
//            for (int j = 1; j <= stars; j++) {
//                System.out.print("* ");
//            }
//            System.out.println();
//            if (i <= (n / 2)) {
//                stars++;
//            } else {
//                stars--;
//            }
//        }
    }
}
