package ExampleT3;
public class SleepyHead extends Thread {
    public void run() {
        System.out.println("I feel sleepy. Wake me in eight hours");
        try {
            // Sleep for eight hours
            Thread.sleep(1000 * 60 * 60 * 8);
            System.out.println("That was a nice nap");
        } catch (InterruptedException ie) {
            System.err.println("Just five more minutes....");
        }
    }

    // Main method to create and start threads
    public static void main(String args[]) throws java.io.IOException {
        // Create a 'sleepy' thread
        Thread sleepy = new SleepyHead();
        // Start thread sleeping
        sleepy.start();
        // Prompt user and wait for input
        System.out.println("Press enter to interrupt the thread");
        System.in.read();
        // Interrupt the thread
        sleepy.interrupt();
    }
}
