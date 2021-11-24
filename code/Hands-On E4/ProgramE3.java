
/*------------------------------------ProgramE3-------------------------------------------------*/
/* This program has an array of five integer values constants. It reads the index of an
array element and makes that element the value of the numerator. It then reads the value
of the denominator and then computes the quotient in the division of the numerator by the
denominator */
import java.util.Scanner;
import java.util.InputMismatchException;

public class ProgramE3 {
    public static void main(String[] args) throws ArithmeticException, IndexOutOfBoundsException {
        Scanner input = new Scanner(System.in); // for standard input
        for (int i = 0; i < 4; ++i) {//ADDED TO LOOP THROUGH INPUT
            int[] numeratorList = { 23, 21, 7, 45, 3 };
            // list of possible values for the numerator
            int numerator, // to hold the numerator
                    denominator, // to hold the denominator
                    index; // to hold an array index value
            try {
                /*----read an index value and
                use it to get the value of the numerator from the array-----*/
                System.out.println("\nPlease enter a value from 0 to 4:\t");
                index = input.nextInt(); // InputMismatchException may be detected
                numerator = numeratorList[index];
                // IndexOutOfBoundsException may be thrown and detected
                /*---------------- read the denominator ---------------------------------------------*/
                System.out.println("\nPlease enter the denominator:\t");
                denominator = input.nextInt(); // InputMismatchException may be detected
                /*------------------Compute and print the quotient--------------------------------*/
                int result = numerator / denominator;
                // ArithmeticException may be thrown and detected
                System.out.printf("\nThe result of: %d / %d = %d\n", numerator, denominator, result);
            }
            // © 2011 Gilbert Ndjatou Page 251
            catch (InputMismatchException e) {
                System.err.printf("\nException: %s\n", e); // display the exception detected
                String line = input.nextLine(); // discard the invalid input data
                System.out.println("\nThe error is: You have entered an invalid input data\n");
            } catch (ArithmeticException e) {
                System.err.printf("\nException: %s\n", e); // display the exception detected
                System.out.println("\nThe error is: division by zero is not feasible\n");
            } catch (IndexOutOfBoundsException e) {
                System.err.printf("\nException: %s\n", e); // display the exception detected
                System.out.println("\nThe error is: you should have entered a value from zero to four\n");
            } finally {
                System.out.println("\nThank you for using this program. \n Bye bye\n");
            }
        }
    } // end of method main
} // end of class ProgramE3