
/*-------------------------------------------------------ProgramW2 -------------------------------------------------*/
/* Read two integer values and print the quotient in the division of the largest value by the smallest */
import java.util.Scanner;

public class ProgramW2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in); // for standard input
        Integer objFirst, // object for the first value
                objSecond; // object for the second value
        /*-------------------------------read the two values -------------------------------*/
        objFirst = input.nextInt();
        objSecond = input.nextInt();
        /*----Compute and print the difference of the largest value minus the smallest------*/
        computeQuot(objFirst, objSecond);
    } // end of method main
    /*--------------------Class Method computeQuot( )---------------------*/
    /* compute the quotient in the division of the largest value by the small one */

    static void computeQuot(Integer obj1, Integer obj2) {
        if (obj1.compareTo(obj2) < 0) {
            Integer temp = obj1;
            obj1 = obj2;
            obj2 = temp;
        }
        System.out.printf("The quotient in the division of the largest value by the smallest is:\t%d", obj1 / obj2);
    }
}