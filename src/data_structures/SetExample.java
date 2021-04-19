package data_structures;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

/**
 * Order of output cannot be guaranteed to be the same as items added to the set.
 */
public class SetExample {

    public static void main(String[] args) {

        Set<String> apples = new HashSet<>();

        apples.add("Golden delicious");
        apples.add("Michigan");
        apples.add("Betsy White");
        apples.add("Red apples");
        apples.add("Caramel");

        Iterator iterator =  apples.iterator();

         while (iterator.hasNext()){
             System.out.println(iterator.next());
         }
    }
}
