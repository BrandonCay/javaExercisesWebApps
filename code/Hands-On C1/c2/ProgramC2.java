import java.util.List;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

public class ProgramC2 {
    public static void main(String[] args) {
        // create an array of objects to be added into an ArrayList named list
        String[] colors = { "MAGENTA", "RED", "WHITE", "BLUE", "CYAN" };
        List<String> list = new ArrayList<String>();
        for (String color : colors)
            list.add(color); // adds the colors in the array colors to the list
        // create an array of objects to be added into an ArrayList named removeList
        String[] removeColors = { "RED", "WHITE", "BLUE" };
        List<String> removeList = new ArrayList<String>();
        for (String color : removeColors)
            removeList.add(color);
        // output the elements of the ArrayList list
        System.out.println("ArrayList: ");
        for (int count = 0; count < list.size(); count++)
            System.out.printf("%s\n ", list.get(count));
        // remove from ArrayList list the colors contained in the ArrayList removeList
        removeColors(list, removeList);
        // output the elements of ArrayList list
        System.out.println("\n\nArrayList after calling removeColors: ");
        for (String color : list)
            System.out.printf("%s ", color);
    } // end main
      // remove colors specified in collection2 from collection1

    private static void removeColors(Collection<String> collection1, Collection<String> collection2) {
        collection1.removeAll(collection2);
    } // end method removeColors
} // end class ProgramC2