package mypackage.subpackage;

/*----------------------------------Program2 --------------------------------------------*/
/* Read two integer values, compute their product */
import java.util.Scanner;


public class Program2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in); // for standard input
        int first, // to hold the first value
                second; // to hold the second
        /*--------------------read the two values -------------------------------*/
        first = input.nextInt();
        second = input.nextInt();
        /*-----------------Compute and print their product--------------------*/
        int product = computeProd1(first, second);
        System.out.println("Their product is:\t" + product);
    }

    /*------------------------Class Method computeProd( )-------------------------------*/
    /* compute the product of two integer values and returns it */
    static int computeProd1(int num1, int num2) {
        return (num1 * num2);
    }
}
