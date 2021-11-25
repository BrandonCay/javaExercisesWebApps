import java.util.*;

public class ProgramI1 {
    public static void main(String args[]) {
        // Create an array list and add elements to it
        ArrayList<String> alist = new ArrayList<String>();
        alist.add("C");
        alist.add("A");
        alist.add("E");
        alist.add("B");
        alist.add("D");
        alist.add("F");
        // Use iterator to display contents of the list
        System.out.print("\nOriginal contents of alist: ");
        Iterator<String> itr = alist.iterator();
        while (itr.hasNext()) {
            Object element = itr.next();
            System.out.print(element + " ");
        }
        System.out.println();

        // Modify objects being iterated
        ListIterator<String> litr = alist.listIterator();
        while (litr.hasNext()) {
            Object element = litr.next();
            litr.set(element + "-");
        }
        System.out.print("\nModified contents of alist: ");
        itr = alist.iterator();
        while (itr.hasNext()) {
            Object element = itr.next();
            System.out.print(element + " ");
        }
        System.out.println();
        // Now, display the list backwards
        System.out.print("\nModified list backwards: ");
        while (litr.hasPrevious()) {
            Object element = litr.previous();
            System.out.print(element + " ");
        }
        System.out.println();
    }
}
