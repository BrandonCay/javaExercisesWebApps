import java.util.Scanner;

/*
Write the definition of the class named Score1 with the following private instance variables:
  first name and last name (objects of the class String); course name (object of class String); 
  and an array of 5 test scores (double). 
*/
public class Score1 {
    private String firstName, lastName, courseName;
    private int arrSz = 5; 
    private double [] testScores = new double[arrSz];

    /*

The default constructor (constructor without parameters) initializes the String instance 
variables to null and the elements of the array to 0.0. 
    */
    Score1(){
        firstName = null;
        lastName = null;
        courseName = null;
        for(int i = 0 ; i<arrSz ; ++i){
            testScores[i] = 0.0d;    
        }
    }

/*
The constructor with parameters Score1( String fname, String lname, String courseNum, double[ ] list) 
initializes the array of test scores with the values of the elements of another array of 5 elements 
that is passed to it as an argument.   
*/
    Score1(String fname, String lname, String courseNum, double[ ] list){
        firstName = fname;
        lastName = lname;
        courseName = courseNum;
        
        for(int i = 0; i < arrSz ; ++i){
            testScores[i] = list[i];
        }
    }

/*
In addition to the constructors, it has the following public instance methods:  
*/

/*
double computeAverage(  ) that computes the average score,  
*/

public double computeAverage(){
    double sum  = 0;
    for(int i = 0 ; i < arrSz ; ++i){
        sum+=testScores[i];
    }
    return sum / arrSz; 
}

/*
void read(Scanner scan ) that uses the Scanner object parameter to read the first name, last name, course name,
and the 5 test scores into the array, 
*/

public void read(Scanner scan){
    firstName = scan.next();
    lastName = scan.next();
    courseName = scan.next();

    for(int i = 0; i < arrSz ; ++i){
        testScores[i] = scan.nextDouble(); 
    } 

}

/*and
void print( ) that outputs the first name, last name, course name, the test scores, and the average test score. 
*/

public void print(){
    System.out.printf("%s\n%s\n%s\n",firstName, lastName, courseName);
    for(double el : testScores){
        System.out.println(el);
    }

    double avg = computeAverage();
    System.out.print(avg +  "\n");
}


}
