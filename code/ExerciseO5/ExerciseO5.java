import java.util.Scanner;

/*
Exercise O5

Define the class named ExerciseO5 with the method main that defines\
 an array of 5 objects of the class Employee that you defined in Exercise O4 and then does the following:

Read the personal and pay information of each object in the array 
(by calling the methods readPInfo(Scanner scan ) and readPayInfo(Scanner scan ))

Output the personal and pay information of each object in 
the array (by calling the instance methods getPInfoString( ) and getPayInfoString( ))
*/

public class ExerciseO5{
    
    public static void main(String args[]){
        int SIZE = 10;

        Employee [] arr = new Employee[SIZE];
        
        Scanner scan = new Scanner(System.in);

        for (int i = 0; i< SIZE ; i++ ){
            arr[i] = new Employee();
            arr[i].readPInfo(scan);
            arr[i].readPayInfo(scan);

            System.out.println(arr[i].getPInfoString());
            System.out.println(arr[i].getPayInfoString());
        }

    }

}
