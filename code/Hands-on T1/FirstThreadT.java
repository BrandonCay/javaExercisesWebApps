
//This class is defines a thread by extending the class Thread.
import java.lang.Thread;

public class FirstThreadT extends Thread {
    // This method will be executed when this thread is started
    public void run() {
        /* get the name of the current thread */
        String treadName = (Thread.currentThread()).getName();
        // Looping from 1 to 5 to display numbers from 1 to 5
        for (int i = 1; i <= 5; i++) {
            // Displaying the numbers from this thread
            System.out.println("Messag from Thread : " + treadName + "\t:" + i);

            // taking a delay of one second before displaying next number
            try {
                Thread.sleep(1000);
            } catch (InterruptedException interruptedException) {
                /*
                 * Interrupted exception will be thrown
                 * when a sleeping or waiting thread is interrupted.
                 */
                System.out.println(
                        "First Thread is interrupted when it is sleeping" +
                                interruptedException);
            }
        }
    }
}
