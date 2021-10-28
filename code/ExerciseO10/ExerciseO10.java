import java.util.Scanner;
/*
Define the class Exercise O10 with the method main that is used to test your class as follows:
*/ 
public class ExerciseO10 {
    public static void main(String [] args){
        Scanner scan = new Scanner(System.in);
    /*
    Function main first defines an object of the class HourlyEmployee with the default values for its instance variables, and
     then prints its personal and pay information.
     */

     HourlyEmployee he1 = new HourlyEmployee();
    System.out.println(he1.getPInfoString());
    System.out.println(he1.getPayInfoString());

    /*
It initializes an object of the class HourlyEmployee as follows: first name: "Mark"; last name: "Peter"; ID #: 333333;
 Date of birth: 1/10/1995; Date of hire: 7/10/2012; hours: 50; and pay rate: $25; then prints its personal and pay information.
 */
Date d1 = new Date(10,1,1995);
Date d2 = new Date(10,7,2012);

HourlyEmployee he2 = new HourlyEmployee("Mark", "Peter", 333333, d1, d2, 50, 25 );
System.out.println(he2.getPInfoString());
System.out.println(he2.getPayInfoString());

/*
It initializes an object of the class HourlyEmployee as follows: first name: "Jane"; last name: "Doe"; ID #: 444444; Date of birth: 10/1/1998;
 Date of hire: 5/10/2011; hours: 30; and pay rate: $20; then prints its personal and pay information.
*/

Date d3 = new Date(1,10,1998);
Date d4 = new Date(7,10,2011);

HourlyEmployee he3 = new HourlyEmployee("Jane", "Doe", 444444, d3, d4, 30, 20 );
System.out.println(he3.getPInfoString());
System.out.println(he3.getPayInfoString());
/*
It then reads the personal and pay information of an object of the class HourlyEmployee and then outputs its personal and pay information.
*/
he3.readPInfo(scan);
he3.readPayInfo(scan);

    }
}
