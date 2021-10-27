import java.util.Scanner;

public class ExerciseO3{
    
    public static void main(String args[]){
        Scanner scan = new Scanner(System.in);
        Date obj = new Date();
        
        obj.inputDate(scan);//todays date is invalid
        System.out.println("Today's the day " + obj.getStringDate());
    
        Date dueDate = new Date();

        dueDate.inputDate(scan);


        String message;

        if(obj.isEqualTo(dueDate))
            message = "Your project is on time";
        else if(Date.isGreaterThan(obj, dueDate)){
            message="Your project is late";
        }else
            message="Your project is early";

        System.out.print(message);


        Date invalid = new Date();
        invalid.inputDate(scan);
        System.out.println("Program successfully finished"); //doesn't print when invalid date is inputted
        
        
    }

}

class Date{
    int month, day, year;

    Date(){
        day = 1;
        month = 1;
        year = 1960;
    }

    /*
    values for the instance variables,
     day, 
     month, and 
     year, and 
     then calls function checkDate( ) to check the date
    */
    public void inputDate(Scanner scan){
        day = scan.nextInt();
        month = scan.nextInt();
        year = scan.nextInt();

        checkDate(year, month, day);
        
    }

    public Boolean isEqualTo(Date obj){

        return (day == obj.day && month == obj.month && year == obj.year);
    }

    public String getStringDate(){
        return String.format("%d/%d/%d", month, day, year);
    }
    

    int getMonth(  ){
        return month;
    } 
    
    int getDay(  ){
        return day;
    } 

    int getYear(  ){
        return year;
    }

    /*
The class also has the public static (class) method boolean isGreaterThan(Date obj1, Date obj2 ) 
that returns true if obj1.year > obj2.year, and if they are equal, if obj1.month > obj2.month, 
and if they are equal, if obj1.day > obj2.day.  Otherwise, it returns false.
    */

    public static Boolean isGreaterThan(Date obj1, Date obj2){
        Boolean res=false;
        if(obj1.year > obj2.year)
            res = true;
        else if(obj1.year == obj2.year){
            if(obj1.month > obj2.month)
                res = true;
            else if(obj1.month == obj2.month){
                if(obj1.day > obj1.day)
                    res = true;
            }
        }
        return res;
    }
    private void checkDate(int year, int month, int day){
        if(!(isValidYear(year) && isValidMonth(month) && isValidDay(month, day, year))){
            System.exit(1);
        }
    }

    //self-made helper functions for readability
    private Boolean isValidYear(int year){
        return (year >= 1960 && year <= 2019);
    }
    private Boolean isValidMonth(int month){
        return (month>=1 && month<=12 );
    }

    private Boolean isValidDay(int month , int day, int year){
        //does not account for leap uears 
        int febMaxDay = 28;
        if(day < 1){
            return false;
        }

        if(isLeapYear(year)){
            febMaxDay = 29;
        }

        if(month ==  2){
            return (day <= febMaxDay);
        }else{
            if(month % 2 == 0){
                return (day <= 31);
            }else{
                return (day <= 30);
            }

        }
    }

    private Boolean isLeapYear(int year){
        return ((year % 4 == 0) && (year % 100!= 0)) || (year%400 == 0);//leap year formula
    }
}


