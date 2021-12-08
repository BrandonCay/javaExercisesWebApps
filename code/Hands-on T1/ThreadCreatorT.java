/*------------ create three threads: 
the first two executing the code defined in the class FirstThreadT, and 
the last one executing the code defined in the class SecondThreadT _______*/
public class ThreadCreatorT {
    public static void main(String[] args) {
        System.out.println("I am about to create threads");
        /*--------- create three threads ------------------------ */
        FirstThreadT thread1 = new FirstThreadT();
        FirstThreadT thread2 = new FirstThreadT();
        SecondThreadT thread3 = new SecondThreadT();
        System.out.println(" Threads are created and will start soon");
        /*------------- start all three threads-----------------*/
        thread1.start();
        thread2.start();
        thread3.start();
        System.out.println(" main is done");
    }
}
