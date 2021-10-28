//Exercise O14

//Complete and execute the following program as specified by the inserted comments.

public class ExerciseO14

{

    public static void main(String[] args)

    {

        /*--- 1 ------ write the sequence of statements to call the method outerMethod ------------*/
OuterClass objO = new OuterClass();
objO.outerMethod();
        /*--- 2 ------ write the sequence of statements to call the method innerMethod2 ------------*/
OuterClass.NestedClass objN = new OuterClass.NestedClass();
objN.innerMethod2();
    }

}

class OuterClass

{

    public void outerMethod()

    {

        System.out.println("outer class");
        NestedClass objN = new NestedClass();
        /*---- 3 ----- write the sequence of statements to call the method innerMethod1 ------------*/
        objN.innerMethod1();

    }

    static class NestedClass

    {

        public void innerMethod1()

        {

            System.out.println("nested class Method1");

        }

        public void innerMethod2()

        {

            System.out.println("nested class Method2");
            OuterClass objM = new OuterClass();
            objM.outerMethod();
            /*---- 4 ----- write the sequence of statements to call the method outerMethod------------*/

        }

    } // end of class StaticNestedClass

} // end of class OuterClass
