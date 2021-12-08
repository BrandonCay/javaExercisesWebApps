//class used to define the shared resource
package ExampleT5;

public class Counter {
    private int countValue;

    public Counter() {
        countValue = 0;
    }

    public Counter(int start) {
        countValue = start;
    }

    // Method to increment the value of the instance variable counterValue
    public synchronized void increaseCount() {
        int count = countValue;
        // Simulate slow data processing and updating
        // Removing the synchronized keyword may lead to the race condition.
        // Adjusting the sleep time may be necessary on faster machines.
        try {
            Thread.sleep(5);
        } catch (InterruptedException ie) {
        }
        count++;
        countValue = count;
    }

    // method to return the value of the instance variable counterValue
    public synchronized int getCount() {
        return countValue;
    }
}
