import java.util.Scanner;

public class ExerciseO2{
    
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        Demo item = new Demo();
        
        int val1 = sc.nextInt();
        int val2 = sc.nextInt();
        
        item.setValues(val1, val2);
        int ave = item.getAverage();

        System.out.println(ave);
        
        Demo obj1 = new Demo();
        Demo obj2 = new Demo();

        obj1.setValues(5, 7);
        obj2.setValues(14, 9);

        Demo objR = new Demo();
        
        objR = addDemo(obj1, obj2);

        incrDemo2(obj1);

        System.out.println(obj1.getValue1() + " " + obj1.getValue2());
        System.out.println(obj2.getValue1() + " " + obj2.getValue2()); 

    }

    static Demo addDemo(Demo obj1, Demo obj2){
        int sumOfVal1 = obj1.getValue1() + obj2.getValue2(); 
        int sumOfVal2 = obj1.getValue2() + obj2.getValue2();

        Demo res = new Demo();
        res.setValues(sumOfVal1, sumOfVal2);
        return res;
    }
    
    static void incrDemo2(Demo obj1){
        obj1.setValues(obj1.getValue1() + 5 , obj1.getValue2() + 5);

    }

}


class  Demo
{
          private  int val1;                                                    // the first data member
          private         int val2;                                                      // the second data member
 
          public void  setValues(int num1, int num2)
          {
                   val1 = num1;
                   val2 = num2;
          }
          public int getValue1( )
          {
                return (val1);
          }
          public int getValue2( )
          {
                return (val2);
          }
          public int  getAverage( )
          {
             return(  (val1 + val2) / 2);
          }
}