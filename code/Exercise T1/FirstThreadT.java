import java.lang.Thread;

class FirstThreadT extends Thread {

    /*
     * A.
     * 1. The code to be executed by a thread has an array defined as follows:
     * char [ ] list = {'A', 'B', 'C', 'D', 'E'};
     * A thread that executes this code outputs in a loop the string "I am thread #"
     * followed by its assigned number, which is followed by an element of this
     * array. It
     * takes a delay of 2 seconds before displaying the next element.
     * Write this code by defining the subclass ExerciseT1A1 of the class Thread as
     * follows:
     * ⎯ This class has the instance variable: int threadNum; to hold the thread
     * number.
     * ⎯ The constructor ExerciseT1A1( int number ) is used to instantiate a thread
     * object and also to set its number.
     * 
     */
    char[] list = { 'A', 'B', 'C', 'D', 'E' };
    int threadNum;

    FirstThreadT(int number) {
        this.threadNum = number;
    }

    public void run() {
        for (char x : list) {
            System.out.printf("I am thread %d: %c\n", threadNum, x);
        }

        try {
            Thread.sleep(1000);
        } catch (InterruptedException interruptedException) {
            System.out.println(
                    "First Thread is interrupted when it is sleeping" +
                            interruptedException);
        }
    }

}

/*
 * 2. The code to be executed by a thread outputs in a loop the string "I am
 * thread #"
 * followed by its assigned number, which is followed by 10, then 20, then 30,
 * then
 * 40, and 50 with a delay of 3 second before displaying the next value.
 * Write this code by defining the subclass ExerciseT1A2 of the class Thread as
 * follows:
 * ⎯ This class has the instance variable: int threadNum; to hold the thread
 * number.
 * ⎯ The constructor ExerciseT1A2( int number ) is used to instantiate a thread
 * object and also set its number.
 * 3. Using the class ExerciseT1A, write a program that runs a thread that
 * executes the
 * code in the class ExerciseT1A1, and another thread that executes the code in
 * the
 * class ExerciseT1A2
 * B.
 * 1. Write the code in question A.1 by using the class ExerciseT1B1 that
 * implements
 * the interface Runnable.
 * 2. Write the code in question A.2 by using the class ExerciseT1B2 that
 * implements
 * the interface Runnable.
 * 3. Using the class ExerciseT1B, write a program that runs a thread that
 * executes the
 * code in the class ExerciseT1B1, and another thread that executes the code in
 * the
 * class ExerciseT1B2
 */