import java.util.Scanner;

/*
Write the definition of the class named Score2 with the following private instance variables:  
first name and last name (objects of the class String); course name (object of class String); the number of test scores (integer); and an array variable to hold the test scores (double). 
*/
public class Score2 {
    private String firstName, lastName, courseName;
    private int sz;
    private double[] testScores;
/*
The default constructor (constructor without parameters) initializes the String instance variables to
the null string and set the number of test scores to 5, allocates memory locations for 
5 array elements and initializes them to 0.0.
*/
    Score2(){
        firstName = null;
        lastName = null;
        courseName = null;
        sz = 5;
        testScores = new double [sz];
        for(int i = 0 ; i< sz ; ++i){
            testScores[i] = 0.0;
        }
    }

/*
The constructor Score2(int numElt) initializes the String instance variables to 
the null string, sets the number of test scores to numElt, allocates memory locations for 
numElt array elements and initializes them to 0.0.  
*/
Score2(int numElt){
    firstName = null;
    lastName = null;
    courseName = null;
    sz = numElt;
    testScores = new double [sz];
    for(int i = 0 ; i< sz ; ++i){
        testScores[i] = 0.0;
    }
}

/*
The constructor with parameters Score2( String fname, String lname, String courseNum, double[ ] list)  
initializes the array of test scores with the parameter array, and sets the number of 
test scores to its size. 
*/

Score2( String fname, String lname, String courseNum, double[ ] list){
    firstName = fname;
    lastName = lname;
    courseName = courseNum;
    sz = list.length;
    testScores = new double [sz];

    for(int i = 0 ; i< sz ; ++i){
        testScores[i] = list[i];
    }
}

/*
In addition to the constructors, it has the following public instance methods: 
double computeAverage(  ) that computes the average score, 
*/
public double computeAverage(){
    double sum  = 0;
    for(int i = 0 ; i < sz ; ++i){
        sum+=testScores[i];
    }
    return sum / sz; 
}

/*
void read(Scanner scan ) that uses the Scanner object parameter to read the first name, last name, 
course name, and the test scores into the array, and
*/
public void read(Scanner scan){
    firstName = scan.next();
    lastName = scan.next();
    courseName = scan.next();

    for(int i = 0; i < sz ; ++i){
        testScores[i] = scan.nextDouble(); 
    } 

}

/*
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
