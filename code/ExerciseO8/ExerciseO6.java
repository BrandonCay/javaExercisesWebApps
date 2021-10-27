import java.util.Scanner;

/*
Write the definition of the class ExerciseO6 with the main method that does the following:
Define an object of the class Score1 and initialize it with the default constructor.
*/

public class ExerciseO6 {
    ExerciseO6(){
        
    }   
    
    public static void main(String [] args){
        Score1 sO1 = new Score1();
        Scanner scan = new Scanner(System.in);
     /*
        Use the read method to read values into the instance variables of this object.
    */
        sO1.read(scan);
    /*
        Use the print method to output the first name, last name, course name, the test scores,
        and the average test score of this object.
    */
        sO1.print();
    /*
        Read the last name, first name, course name, and the 5 test scores into an array 
        and use this information to define and instantiate an object of the class Score1. 
    */
        int sz = 5;
        
        double [] arr  =new double[sz];
        for(int i = 0 ; i < sz  ; ++i){
            arr[i] = scan.nextDouble();
        }
        String fName = scan.next();
        String lName = scan.next();
        String cName = scan.next(); 
        Score1 sO2 = new Score1(fName , lName , cName, arr);

        
    /*
        Use the print method to output the last name, first name, course name, the test scores, 
        and the average test score of this object.
        */
        
        sO2.print();
    }
}





