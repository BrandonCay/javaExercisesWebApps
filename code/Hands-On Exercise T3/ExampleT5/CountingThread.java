package ExampleT5;

public class CountingThread extends Thread {
    private Counter myCounter;
    private int countAmount;

    // the number of times a thread will enter its critical section
    /*
     * Construct a Thread object to increment the instance variable countValue
     * of object counter amount times -----------
     */
    public CountingThread(Counter counter, int amount) {
        myCounter = counter;
        countAmount = amount;
    }

    public void run() {
        // Increase the value of the instance variable countValue of object counter
        // the specified number of times
        for (int i = 1; i <= countAmount; i++) {
            // Increase the counter
            myCounter.increaseCount();
        }
    }

    public static void main(String args[]) throws Exception {
        // Create a new thread-safe counter
        Counter c = new Counter();
        /* Three Thread instance will increase the Counter object c 10 times */
        System.out.println("Starting counting threads");
        Thread t1 = new CountingThread(c, 10);
        Thread t2 = new CountingThread(c, 10);
        Thread t3 = new CountingThread(c, 10);
        t1.start();
        t2.start();
        t3.start();
        // Wait for all three threads to finish
        t1.join();
        t2.join();
        t3.join();
        System.out.println("Counter value is " + c.getCount());
    }
}
