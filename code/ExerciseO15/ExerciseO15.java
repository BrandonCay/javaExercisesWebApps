//Exercise O15

//Complete and execute the following program as specified by the inserted comments.

public class ExerciseO15

{

    public static void main(String[] args)

    {
         
        /*--- 1 ------ write the sequence of statements to call the method outerMethod -------------*/
        OuterClass outer1= new OuterClass();
        outer1.outerMethod();

        /*--- 2 ------ write the sequence of statements to call the method innerMethod2 ------------*/
        OuterClass.InnerClass inner1 =  outer1.new InnerClass();
        inner1.innerMethod2();

    }

}

class OuterClass

{

    private int outerNum;

    public OuterClass()

    {

        outerNum = 20;

    }

    public int getOuterNum()

    {

        return (outerNum);

    }

    public void outerMethod()

    {

        System.out.println("outer class");

        /*---- 3 ----- write the sequence of statements to call the method innerMethod1 ------------*/
        InnerClass inner = new InnerClass();
        inner.innerMethod1();

        /*-- 4 -- write the sequence of statements to output the value of instance variable innerNum -*/
        System.out.println(inner.getInnerNum());

    }

    class InnerClass

    {

        private int innerNum;

        public InnerClass()

        {

            innerNum = 15;

        }

        public int getInnerNum()

        {

            return (innerNum);

        }

        public void innerMethod1()

        {

            System.out.println("nested class 1");

        }

        public void innerMethod2()

        {

            System.out.println("nested class 2");

            /*---- 5 ----- write the sequence of statements to call the method outerMethod------------*/
            outerMethod();
            /*
             * 6 - write the sequence of statements to output the value of instance variable
             * outerNum -
             */
            System.out.println(outerNum);

        }

    } // end of class InnerClass

} // end of class OuterClass