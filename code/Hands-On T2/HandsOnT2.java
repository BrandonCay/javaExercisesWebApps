import java.lang.*;

/*------------ create two threads: 
the first one executes the code defined in the class FirstThreadT, and 
the second one executes the code defined in the class SecondThreadT------*/
public class HandsOnT2 extends Thread {
    public static void main(String[] args) {
        System.out.println("I am about to create threads");
        /*--------- create both threads ------------------------ */
        FirstThreadT thread1 = new FirstThreadT();
        SecondThreadT thread2 = new SecondThreadT();
        System.out.println(" Threads are created and will start soon");
        /*------------- start both threads-----------------*/
        thread1.start();
        thread2.start();

        // Looping from 1 to 5 to display numbers from 1 to 5
        for (int i = 1; i <= 5; i++) {
            // Displaying the numbers from the thread that executes method main
            System.out.println("Messag from Thread : " + this.getName() + "\t:");
            // taking a delay of one second before displaying next number
            try {
                Thread.sleep(4000);
            } catch (InterruptedException interruptedE) {
                /* Interrupted exception: a sleeping or waiting thread is interrupted. */
                System.out.println("Thread is interrupted when it is sleeping" + interruptedE);
            }
        }
    }
}
