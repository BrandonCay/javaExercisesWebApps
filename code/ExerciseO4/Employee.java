import java.util.Scanner;

class Employee{
    private String firstName, lastName; 
    private int IDnumber = 999999; 
    private Date birthDay, dateHired;
    private double basePay = 0f;  

    /*
The default constructor initializes the first name to "john", the last name to "Doe", and the
 birth day and hired day to the default date (1/1/1960).
 */

    public Employee(){
        firstName = "john";
        lastName = "Doe";
        birthDay = new Date();
    }
//NOTE GIVEN but necessary for initialize problem
    Employee(String fname, String lname, int ID, Date bday, Date dHired, double bPay)
    {
        firstName = fname; 
        lastName = lname;
        birthDay = bday;
        IDnumber = ID;
        bday = dHired;
        basePay = bPay;
    }



/*
void readPInfo(Scanner scan ) that uses the Scanner object parameter to read the values for the 
instance variables first name, last name, ID number, birth day, and date of hire.
*/

    public void readPInfo(Scanner scan){
        firstName = scan.next();
        lastName = scan.next();
        IDnumber = scan.nextInt();
        birthDay.inputDate(scan);
        dateHired.inputDate(scan);
    }
/*
void readPayInfo(Scanner scan ) that uses the Scanner object parameter to read the value
 for the base pay instance variable. 
 */
    public void readPayInfo(Scanner scan){
        basePay = scan.nextDouble();
    }

/* 
String getPInfoString( ) that returns a string in the following format:
              NAME: <lastName  +  ", "  +   firstName>
              ID NUMBER:  <Id-Number>
               BIRTH DAY: <string-birth-day>
DATE HIRED: < string-date-hired >
*/

    public String getPInfoString(){
        String format = String.format(
            "\tNAME: %s , %s\n\tID NUMBER: %d\n\tBIRTH DAY: %s\nDATE HIRED: %s",
            lastName, firstName, IDnumber, birthDay, dateHired
        );

        return format;
    }
/*
void  setBpay( double newBpay )  that sets the value of the base pay to the new value, newBpay.
*/
    void setBpay(double newBpay){
        basePay = newBpay;
    }

/*
 double getBpay(  )  that returns the value of the base pay instance variable.
*/

    double getBpay(){
        return basePay;
    }

/*
double getGpay(  )  that returns the value of the gross pay (which is the base pay).
*/

double getGpay(  ) {
    return basePay;
}
/*

double computeTax(   )  that computes the tax deduction on the gross pay and returns it as follows:
If gross pay is greater than or equal to 1000, 20% of the gross pay;
If  800 <= gross pay <  1000, 18% of gross pay
If  600 <= gross pay < 800, 15% of gross pay
Otherwise, 10 % of the gross pay.

*/


    double computeTax(){
        double tax=0.10f;
        double gPay = getGpay();
        if( gPay >= 1000f){
            tax = .20f;
        }else if(gPay >= 800f){
            tax =.18f;
        }else if(gPay >= 600f){
            tax = .15f;
        }

        return tax; 
    }

/*
String getPayInfoString( ) that returns a string in the following format:
              GROSS PAY: <gross-pay>
              TAX DEDUCTION:  <tax-deduction>
               NET PAY: <Net-pay>

*/
    public String getPayInfoString(){
        double gPay = getGpay(), taxDeduction = computeTax(), netPay = gPay - gPay * taxDeduction;
        String format = String.format(
            "GROSS PAY: %f\nTAXDEDUCTION: %f\nNET PAY: %f",
            gPay, taxDeduction, netPay
        );
        return format;
    }

}