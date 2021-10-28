import java.util.Scanner;
/*
    Define the class Exercise O8 with the method main(  ) that is used to test your class as follows:
    Method main first defines an object of the class Employee with the default values for 
    its instance variables, and then prints its personal and pay information.
*/
    public class ExerciseO8{
        public static void main(String args[]){
            Scanner scan = new Scanner(System.in);
            /*
    It defines an object of the class BonusEmployee with the default values for its instance variables, and 
    then prints its personal and pay information.
    */
        BonusEmployee beO1 = new BonusEmployee();
        System.out.println(beO1.getPInfoString());
        System.out.println(beO1.getPayInfoString());


    /*
    It initializes an object of the class Employee  as follows: 
    first name: "John";  last name: "Doe"; ID #: 111111; Date of birth: 10/ 25/1991;
     Date of hire: 5/10/2010; and base pay: $1250; and
    then prints its personal and pay information.
    
    */
    Date johnB = new Date(25,10,1991);
    Date johnH = new Date(10,5,2010);
    int ID = 111111;
    double basePay = 1250d;
    String johnFn = "John", johnLn = "Doe";

    Employee john= new Employee(johnFn, johnLn, ID, johnB, johnH, basePay);
    System.out.println(john.getPInfoString());
    System.out.println(john.getPayInfoString());

    /*
    It initializes an object of the class BonusEmployee as follows: 
    first name: "Jobe"; last name: "Daly"; ID #: 222222; Date of birth: 1/ 5/1990; Date of hire: 6/30/2011;
     base pay: $850; and bonus: $250; then prints its personal and pay information.
*/
     johnB = new Date(5,1,1990); //swapped because days/month/years. INstructions writing monthy/day/year 
     johnH = new Date(30,6,2011);
     ID = 222222;
     basePay = 850d;
     double bns = 250d;
     johnFn = "Jobe"; johnLn = "Daly";

    BonusEmployee Jobe =  new BonusEmployee(bns, johnFn, johnLn, ID, johnB, johnH, basePay);
    System.out.println(Jobe.getPInfoString());
    System.out.println(Jobe.getPayInfoString());


/*
It reads the personal and pay information of an object of the class Employee, and 
then outputs its personal and pay information.
*/

    Employee obj3 = new Employee();
    obj3.readPInfo(scan);
    obj3.readPayInfo(scan);
    System.out.println(obj3.getPInfoString());
    System.out.println(obj3.getPayInfoString());

/*
It then reads the personal and pay information of an object of the class BonusEmployee and then outputs its personal and pay information.
*/
    BonusEmployee beO2 = new BonusEmployee();
    beO2.readPInfo(scan);
    beO2.readPayInfo(scan);
    System.out.println(beO2.getPInfoString());
    System.out.println(beO2.getPayInfoString());

 
        }
}
