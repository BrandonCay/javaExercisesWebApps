import java.util.Scanner;
public class ExerciseO9{
    public static void main(String [] main){
        Employee  eemp  = new Employee(   );

        Employee  bemp1  =  new  BonusEmployee(   );
        
        BonusEmployee  bemp2  =  new  BonusEmployee(   );
        
        Scanner scan  = new Scanner( System.in );

        eemp.readPayInfo( scan  );
        
        bemp1.readPayInfo(  scan );
        
        bemp2.readPayInfo( scan  );
        
        System.out.println( "Gross Pay of eemp=\t" +   (eemp.getGpay(  )) );
        
        System.out.println( "Gross Pay of bemp1=\t" +   (bemp1.getGpay(  )) );
        
        System.out.println( "Gross Pay of bemp2=\t" +   (bemp2.getGpay(  )) );
        
        System.out.println( "Tax of eemp=\t" +   (eemp.computeTax(  )) );
        
        System.out.println( "Tax of bemp1=\t" +   (bemp1. computeTax (  )) );
        
        System.out.println( "Tax of bemp2=\t" +   (bemp2. computeTax (  )) );

        //double  bonus  =  bemp1.getBonus(   );  NO, IT IS UNDEFINED
    }
}