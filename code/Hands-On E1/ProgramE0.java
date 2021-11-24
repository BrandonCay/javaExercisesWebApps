
/*--------------------------------------ProgramE0-------------------------------------------------*/
/* Read two integer values, and
compute the quotient in the division of the first value by the second */
import java.util.Scanner;

public class ProgramE0 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        for (int i = 0; i < 3; ++i) { //I ADDED A LOOP FOR MULTIPLE INPUTS
             // for standard input
            int numerator, // to hold the numerator
                    denominator; // to hold the denominator
            /*-------------------------------read the numerator -------------------------------*/
            System.out.println("\nPlease enter the numerator:\t");
            numerator = input.nextInt();
            /*-------------------------------- read the denominator ----------------------------*/
            System.out.println("\nPlease enter the denominator:\t");
            denominator = input.nextInt();
            // © 2011 Gilbert Ndjatou Page 237
            /*---------------------------Compute and print the quotient----------------------*/
            int result = quotient(numerator, denominator); // exception may be detected
            System.out.printf("\nThe result of: %d / %d = %d\n", numerator, denominator, result);
        }
    } // end of method main

    public static int quotient(int first, int second) {
        return (first / second); // possible division by zero
    }
} // end of class ProgramE0