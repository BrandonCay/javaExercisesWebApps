/*
Write the definition of the class Exercise O13 with the method main that does the following:

*/
public class ExerciseO13 {
    public static void main(String [] args){
    /**
Define an object and initializes it with the default constructor.
*/
        HourlyPay hp =  new HourlyPay();
/*
Call the printDetails(  ) method to print its payroll information.
*/
        hp.printDetails();
/*
Define an object and initializes it with the hours 50 and pay rate $12.
*/
HourlyPay hp2 =  new HourlyPay(50, 12);

/*
Call the printDetails(  ) method to print its payroll information.
 
     *
     */
    hp2.printDetails();
}
}
