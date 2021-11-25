import java.util.*;

import javax.swing.text.html.StyleSheet;

/*
Write a program that consists of the class named ExerciseC2 with the method main that does the following:
*/
public class ExerciseC2 {
    public static void main(String args[]) {
        /*
         * Create an HashMap with a String key and an Integer value with an initial
         * capacity of 16 named mapC2.
         */

        int capacity = 16;
        HashMap<String, Integer> mapC2 = new HashMap<String, Integer>(capacity);

        /*
         * Read ten pairs of names and integer values and add them into mapC2 
         */
         
         Scanner in =  new Scanner(System.in);
         int totalNumOfPairs = 10;
         for(int i =0; i< totalNumOfPairs; ++i){
             //first block of inputs
            String key = in.next();
            int val = in.nextInt(); 
            mapC2.put(key, val);
         }

         /*
         * Read a
         * name and output its corresponding value. 
         */
        
        String name = in.next();
        int resVal  = mapC2.get(name);
         
         /*Output the list of the key-value
         * pairs by using an enhanced for-loop on the set of keys
         */

        for (String el : mapC2.keySet()){
            int val  = mapC2.get(el);
            System.out.printf("%s,%d\n",el,val);
        }

        
         /*  Output the list of the
         * key-value pairs by using an Iterator object on the set of keys
         */

        Iterator<String> iterator = mapC2.keySet().iterator( );

        while(iterator.hasNext()){
            String key = iterator.next();
            int val = mapC2.get(key);
            System.out.printf("%s,%d\n",key ,val);
        }

        
        
         /* Remove from
         * the map all the pairs with an even value
         */
        


        for (String el : mapC2.keySet()){
            int val  = mapC2.get(el);
            if(val%2 == 0){
                mapC2.remove(el);
            }
        }

         /* Output the list of the key-value
         * pairs by using an Iterator object on the set of keys.
         */
iterator = mapC2.keySet().iterator( );

        while(iterator.hasNext()){
            String key = iterator.next();
            int val = mapC2.get(key);
            System.out.printf("%s,%d\n",key ,val);
        }

        

    }
}
