public class WaitForDeath extends Thread {
    // Run method is executed when thread first started
    public void run() {
        System.out.println("This thread feels a little ill....");
        // Sleep for five seconds
        try {
            Thread.sleep(5000);
        } catch (InterruptedException ie) {
        }
    }

    // Main method to create and start threads
    public static void main(String args[]) throws java.lang.InterruptedException {
        // Create and start dying thread
        Thread dying = new WaitForDeath();
        dying.start();
        System.out.println("Waiting for thread death");
        // Wait till death
        dying.join();
        System.out.println("Thread has died");
    }
}
