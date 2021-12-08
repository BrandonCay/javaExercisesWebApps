public class Creator {
    public static void main(String [] args){
        FirstThreadT thread1 = new FirstThreadT(1);
        System.out.println("start");
        thread1.start();

    }
}
