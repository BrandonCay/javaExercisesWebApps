import java.util.*;

public class Freq {
    public static void main(String[] args) {
        Map<String, Integer> m = new HashMap<String, Integer>();
        // Initialize frequency table from command line
        for (String a : args) {
            Integer freq = m.get(a);
            if (freq == null)
                freq = 1;
            else
                freq++;
            m.put(a, freq);
        }
        System.out.println(m.size() + " distinct words:");
        System.out.println(m);
    }
}