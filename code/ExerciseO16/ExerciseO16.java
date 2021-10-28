/*
          Define a class named Exercise O16A with the method main that doe the following:
*/
class ExerciseO16{
    public static void main(String[] args) {
        
/*
Define the object obj1 by using an anonymous class that extends the abstract class ChangeMaker as follows:
This object is initialized with the default constructor.

*/
    ChangeMaker obj1 = new ChangeMaker(){
        //Method makeChanges is defined as follows:  It increments the value of each instance variable by 1.
        @Override
        public void makeChanges() {
            setValues(getVal1() +1
            , getVal2() + 1);
        }
    };

    /**
     * Call the method makeChanges( ) on this object and then print it.
     */
    obj1.makeChanges();
    System.out.println(obj1);

/*

Define the object obj2 by using an anonymous class that extends the abstract class ChangeMaker as follows:
*/

/*
This object is initialized with the value 3 for val1, and 4 for val2.
Method makeChanges is defined as follows:  It increments the value of each instance variable by 5.
*/
    ChangeMaker obj2 = new ChangeMaker(3, 5){

        @Override
        public void makeChanges() {
            setValues(getVal1() +5
            , getVal2() + 5);
        }
    };

/*
Call the method makeChanges( ) on this object and then print it.
*/

obj2.makeChanges();
System.out.println(obj2);
    }
}