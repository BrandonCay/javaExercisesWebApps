import java.util.Scanner;

/**
 * Exercise O8

Write the definition of the subclass of class Employee (that you defined in Exercise O4) named BonusEmployee 
as follows:
*/
public class BonusEmployee extends Employee {

    /*
    It has one additional private instance variable named bonus (double precision) with the default value $0.0.
    */
    private double bonus = 0.0;
/*
    In addition to the constructors, it has the following public instance methods:
    double getBonus( void )                 that returns the value of the instance variable bonus.
*/
    BonusEmployee(){
        super();

    }

    BonusEmployee(double bns, String fname, String lname, int ID, Date bday, Date dHired, double bPay){
        super(fname,  lname,  ID,  bday,  dHired,  bPay);
        bonus = bns;
    }
/*
Override the toString method of the class BonusEmployee that you defined in Exercise O8:  it returns a string in the following format:
NAME: <lastName  +  ", "  +   firstName>

              ID NUMBER:  <Id-Number>

               BIRTH DAY: <string-birth-day>

DATE HIRED: < string-date-hired >

BASE PAY:  <base-pay>

BONUS:  <bonus>

GROSS PAY:  <gross-pay>

TAX DEDUCTION:  <tax-deduction>

NET PAY:       <net-pay>

*/

public String toString(){
    return getPInfoString() + "\n" + getPayInfoString();
}

    public double getBonus( )    {
        return bonus;
    }   
/*
    Instance method void readPayInfo(Scanner scan ) is overridden in the class BonusEmploye: 
     it now reads the values for the instance variables base pay and bonus.
*/
    @Override
    public void readPayInfo(Scanner scan ){
        super.readPayInfo(scan);
        bonus = scan.nextDouble();
    }

/*
    Instance method double getGpay(   ) is overridden in the class BonusEmploye: 
    it now returns the sum of the value of the instance variable base pay and the value of 
    the instance variable bonus.
*/
    @Override
    public double getGpay(){
        return bonus + super.getGpay();
    }

   
/*
    Instance method String getPayInfoString( ) is overridden in the class BonusEmploye:  it returns a string in the following format:
    BASE PAY:  <base-pay>

    BONUS:  <bonus>

                GROSS PAY: <gross-pay>

                TAX DEDUCTION:  <tax-deduction>

                NET PAY: <Net-pay>
*/
    @Override
    public String getPayInfoString(){
        double basePay = super.getBpay(), bns = bonus, gPay = basePay + bns, 
        taxDeduction = computeTax(), netPay = gPay - gPay * taxDeduction;
        String formatted = String.format(
            "BASEPAY: %f\n BONUS:%f \nGROSS PAY: %f\nTAXDEDUCTION: %f\nNET PAY: %f\n",
            basePay, bns, gPay, taxDeduction, netPay
        );
        return formatted;
    }

    @Override
    public double computeTax(){
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



}
