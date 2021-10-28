import java.util.Scanner;

/*
Write the definition of the derived class of class Employee (that you defined in Exercise O4) named HourlyEmployee as follows:
*/
public class HourlyEmployee extends Employee {

    /*
     * It has three additional instance variables named hours (integer) and payRate
     * (double precision), and overtime (double precision). Their default values are
     * 0 for hours, and $0.00 for payRate and overtime.
     */
    private int hours;
    private double payRate, overtime;

    HourlyEmployee() {
        hours = 0;
        payRate = 0;
        overtime = 0;
    }
    /*
     * The constructor with parameters has the following method header:
     * HourlyEmployee( string fn, string ln, int iD, Date bd, Date hd, int hrs,
     * double prate)
     */

    HourlyEmployee( String fn, String ln, int iD, Date bd, Date hd, int hrs,
    double prate){
        /*
        * Where hrs represents the number of hours of work and prate the pay rate.
        *
        * It calls class Employee’s constructor with 0 as the argument for the data
        * member base pay, and then calls the private instance method
        * computeBaseOvertimePay( ) to set the values of the instance variables base
        * pay and overtime.
        */

        super();
        computeBaseOvertimePay();
   
    }
    

    /*
     * It also has a private instance method void computeBaseOvertimePay( ) that
     * computes the base pay and the overtime pay as follows:
     * 
     */
    private void computeBaseOvertimePay() {
        /**
         * If the value of the instance variable hours is less than or equal to 35, then
         * it does the following:
         */
        double newBpay = 0f;
        if (hours <= 35) {
            newBpay = payRate * hours;
            setBpay(newBpay);
            /*
             * Set the value of the inherited instance variable base pay to payRate times
             * hours.
             */
            overtime = 0;
            /*
             * Set the value of the instance variable overtime to 0.00. Otherwise, it does
             * the following: }
             */} else {
            /**
             * Set the value of the inherited instance variable base pay to payRate times
             * 35. Set the value of the instance variable overtime to payRate times 1.5
             * times (hours – 35).
             */
            newBpay = payRate * 35;
            setBpay(newBpay);
            overtime = payRate * 1.5 * (hours - 35);

        }

    }
     /* 
     * 
     * In addition to the constructors, it has the following public instance
     * methods: int getHours( void ) returns the value of the data member hours.
     */
    public int getHours( ){
        return hours;
    }

    /*
     * double getPayRate( void ) returns the value of the data member payRate.
     */
    public double getPayRate( ){
        return payRate;
    }
    /*
     * double getOvertime( void ) returns the value of the data member overtime.
     */

    public double getOvertime(){
        return overtime;
    }     
    /*
     * Instance method void readPayInfo(Scanner scan ) is overridden in the class HourlyEmployee
     */
    @Override
    public void readPayInfo(Scanner scan ){
        /*
        it now reads the values of the instance variables hours and
     * payRate, and then calls the private instance method computeBaseOvertimePay( )
     * to set the values of the instance variables base pay and overtime. 
        */

        hours = scan.nextInt();
        payRate =  scan.nextDouble();
        computeBaseOvertimePay();        
    }
    @Override
    public double getGpay(){
     /* 
     * Instance method double getGpay( ) is overridden in the class HourlyEmployee: it now
     * returns the sum of the values of the instance variables base pay and
     * overtime.
     */
    return super.getBpay() + overtime;
     
    } 
     /* 
     * 
     * Instance method String getPayInfoString( ) is overridden in the class
     *      /*     * HourlyEmployee: it returns a string in the following format: HOURS: <hours>
     /* PAY RATE: <pay-rate>
     * 
     * BASE PAY: <base-pay>
     * 
     * OVERTIME: <overtime>
     * 
     * GROSS PAY: <gross-pay>
     * 
     * TAX DEDUCTION: <tax-deduction>
     * 
     * NET PAY: <Net-pay>
     * 
     */


    @Override
    public String getPayInfoString( ){
        String formattedStr = String.format("HOURS: %d\nBAY PAY:%f\n", hours, payRate);
        formattedStr += super.getPayInfoString();
        return formattedStr;
    }

}
