/**
 * 
 Write the definition of the class HourlyPay that implements the interface Payroll as follows:

 */
public class HourlyPay implements Payroll {
    /**
It has two private instance variables hours (double) and payRate (double).
*/
private double hours, payRate;

/*
The constructor without parameters initializes the instance variable hours to 40 and payRate to 10.00
*/
HourlyPay(){
    hours = 40;
    payRate = 10;
}

HourlyPay(double h, double p){
    hours = h;
    payRate = p;

}
/*
It has an additional private instance method  double getOverTime(  )  that does the following:  
it returns     1.5 *(hours – 40) * payRate if the value of the instance method hours is greater than 40; and 0 otherwise.
*/
private double getOverTime(  ){
    if(hours > 40)
        return 1.5 *(hours - 40) * payRate;
    else
        return 0;
}
/*
Instance method getGrossPay(   )  returns hours * payRate + overtime.
*/
public double getGrossPay(){
    return hours * payRate + getOverTime();
}

/*
Instance method getDeduction(  ) returns TAXRATE * gross pay.
*/
public double getDeductions(  ){
    return TAXRATE * getGrossPay();
}

/*
Override the toString method of this class as follows:  it uses the String.format(  )  static method to create and return the following string:
PAY RATE:                   <pay rate>

HOURS:                                  <hours>

OVERTIME:                           <overtime>

GROSS PAY:                          <gross-pay>

TAX DEDUCTION:      <tax-deduction>

NET PAY:                               <net-pay>
*/
public String toString(){
    double pr = payRate, h = hours, gp = getGrossPay(), td = getDeductions(), np = gp - td;
    String formattedStr = String.format(
        "PAY RATE:\t%f\nHOURS:\t%f\nGROSS PAY:\t%f\nTAX DEDUCTIONS:\t%f\nNET PAY:\t%f\n",
        pr,h,gp,td,np
        
    );
    return formattedStr;
}
/*
Public instance method printDetails(  )  prints the payroll information above.

     */

public void printDetails(){
    System.out.println(toString());
}
}
