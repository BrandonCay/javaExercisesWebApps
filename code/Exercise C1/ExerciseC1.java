import java.util.*;

public class ExerciseC1 {
    public static void main(String [] args) {
        Scanner in = new Scanner(System.in);
        int capacity = 10;
        ArrayList<Integer> listOfValues = new ArrayList<Integer>(capacity);

        for (int i = 0; i < capacity; ++i) {
            int val = in.nextInt();
            listOfValues.add(i, val);
        }

        for (int el : listOfValues) {
            System.out.println(el);
        }

        // Insert the value 100 into listOfValues at index 5
        listOfValues.add(5, 100);
        // Remove from the list the value 50
        Integer valToRemove = new Integer(50);
        listOfValues.remove(valToRemove);

        // Output the values in listOfValues by using an Iterator or ListIterator object
        
        ListIterator<Integer> it = listOfValues.listIterator();

        while(it.hasNext()){
            System.out.println(it.next());
        }


    }
}