
/*------------------------------------ProgramE1c-------------------------------------------------*/
/* Read two integer values, and compute the quotient in the division of the first value by
the second */
/* The program will repeatedly read the second value until the user enters a non-zero
value */
import java.util.Scanner;

public class ProgramE1c {
    public static void main(String[] args) throws ArithmeticException {
        Scanner input = new Scanner(System.in); // for standard input
        int numerator, // to hold the numerator
                denominator; // to hold the denominator
        boolean continueLoop = true; // set to false if the user enter a non-zero value
        /*-------------------------------read the numerator -------------------------------*/
        System.out.println("\nPlease enter the numerator:\t");
        numerator = input.nextInt();
        // © 2011 Gilbert Ndjatou Page 245
        while (continueLoop) {
            /*-------------------------------- read the denominator --------------------------*/
            System.out.println("\nPlease enter the denominator:\t");
            denominator = input.nextInt();
            try {
                /*---------------------------Compute and print the quotient------------------*/
                int result = numerator / denominator;
                // exception may be thrown and detected
                System.out.printf("\nThe result of: %d / %d = %d\n", numerator, denominator, result);
                continueLoop = false;
                // stop the repetition of the loop with a non-zero value
            } catch (ArithmeticException e) {
                System.err.printf("\nException: %s\n", e);
                // display the exception detected
                System.out.println("\nThe error is:" + e.getMessage() + ". Please try again\n");
            }
        }
    } // end of method main
} // end of class ProgramE1c