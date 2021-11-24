import java.util.Scanner;

public class ProgramE1a {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in); // for standard input
        int numerator, // to hold the numerator
                denominator; // to hold the denominator
        boolean continueLoop = true; // set to false if the user enter a non-zero value
        /*-------------------------------read the numerator -------------------------------*/
        System.out.println("\nPlease enter the numerator:\t");
        numerator = input.nextInt();
        while (continueLoop) {
            /*------------- read the denominator -------------------------------------*/
            System.out.println("\nPlease enter the denominator:\t");
            denominator = input.nextInt();
            try {
                /*------------Compute and print the quotient-------------------------*/
                int result = quotient(numerator, denominator);
                // exception may be detected
                System.out.printf("\nThe result of: %d / %d = %d\n", numerator, denominator, result);
                continueLoop = false;
                // stop the repetition of the loop with a non-zero value
            }
            // © 2011 Gilbert Ndjatou Page 242
            catch (ArithmeticException e) {
                System.err.printf("\nException: %s\n", e);
                // display the exception detected
                System.out.println("zero is an invalid denominator.Please try again\n");
            }
        }
    } // end of method main

    public static int quotient(int first, int second) throws ArithmeticException {
        return (first / second); // possible division by zero
    }
} // end of class ProgramE1a