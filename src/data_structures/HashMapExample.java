package data_structures;

import java.util.HashMap;
import java.util.Map;

public class HashMapExample {

    public static void main(String[] args) {


        Map<String, String> people = new HashMap<>();
        people.put("dan", "Daniel");
        people.put("ig", "Igor");
        //...blah, blah...

        for(String key: people.keySet()){
            System.out.println(key + " = " + people.get(key));
        }


    }
}
