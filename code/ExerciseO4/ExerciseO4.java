import java.util.Scanner;

/*
Define another class named ExerciseO4 that contains the method main that does the following:

*/

public class ExerciseO4{
    
    public static void main(String args[]){

        /*
Define an object and instantiate it with the default constructor,
 then output its personal information (by calling the instance methods getPInfoString( ).

        */
        Employee obj1 = new Employee();
        
        System.out.println(obj1.getPInfoString());
        

        /*
Define an object and initialize its instance variables as follows:
John   Doe   111111   10/25/1990   11/15/2010  750.00*/
    Date bday1= new Date(25, 10, 1990);
    Date dHired1 = new Date(25, 10, 1990);

    Employee obj2 = new Employee("John",   "Doe",   111111, bday1, dHired1,   750.00d);

    Scanner scan = new Scanner(System.in);
        /*
And then output its personal and pay information (by calling the instance methods getPInfoString( ) 
and getPayInfoString( )).

*/
    
    System.out.println(obj2.getPInfoString());
    System.out.println(obj2.getPayInfoString());


/*
Define an object, read its personal and pay information (by calling the methods readPInfo(Scanner scan ) 
and readPayInfo(Scanner scan )) , 
and then output its personal and pay information
 (by calling the instance methods getPInfoString( ) and getPayInfoString( ))
 */
    
    Employee obj3 = new Employee();
    obj3.readPInfo(scan);
    obj3.readPayInfo(scan);

/*
Define an object and instantiate it (or read the values for its instance variables) 
with an invalid date (date of birth or date of hire).
*/

    Date failDate = new Date(0,0,0);//fail here
    Employee obj4 = new Employee("b", "c", 111111, failDate, failDate, 750.00);
    System.out.println("Program termiantes successfully:\n" +     obj4.getPInfoString());//doesn't print out if invalid date

    }

}
