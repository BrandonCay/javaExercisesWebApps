/*
Write the definition of the class ExerciseO7 with the main method that does the following:
*/
import java.util.Scanner;

public class ExerciseO7 {
    ExerciseO7(){
        
    }   
    
    
    public static void main(String [] args){
        
/*
Define an object of the class Score2 and instantiate it with the default constructor.
*/

        Score2 sO1 = new Score2();
        Scanner scan = new Scanner(System.in);
     /*
/*
Read values into the instance variables of this object.
*/
        sO1.read(scan);
    /*
/*
Output the first name, last name, course name, the test scores, and the average test score of this object.
*/
        sO1.print();
    /*
Read the number of test scores and use it to define an object of the class Score2 that is instantiated with the constructor with an integer value parameter.
*/
    int sz = 6;
    Score2 sO2 = new Score2(6);

/*Read values into the instance variables of this object.
*/
        sO2.read(scan);

/*
Output the first name, last name, course name, the test scores, and the average test score of this object.
*/
        sO2.print();
/*
Read the last name, first name, course name, and 10 test scores into an array and use this information to 
define and instantiate an object of the class Score2. 
*/
        
        double [] arr  =new double[sz];
        for(int i = 0 ; i < sz  ; ++i){
            arr[i] = scan.nextDouble();
        }
        String fName = scan.next();
        String lName = scan.next();
        String cName = scan.next(); 
        Score2 sO3 = new Score2(fName , lName , cName, arr);

        
    /*
/*
Output the last name, first name, course name, the test scores, and the average test score of this object.
*/
        
        sO3.print();
    }
}






