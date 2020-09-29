package samples;

import java.util.*;

import static java.lang.System.out;

/*
   Map is a structure for storing and look up
   values using keys (like old paper telephone book)
   NOTE: One direction is prioritized (given key, find value).
   Otherwise you must do some coding.

   This will NOT show up on any exam but useful for exercises and labs (probably
   used in some given code)

 */
public class UseAMap {

    public static void main(String[] args) {
        new UseAMap().program();
    }

    private void program() {
        // Map is the interface and HashMap is an implementation
        Map<Integer, String> literalNameSV = new HashMap<>();

        // Store key (int) and value (String)
        literalNameSV.put(1, "Ett");
        literalNameSV.put(2, "Två");
        literalNameSV.put(3, "Tre");

        // Retrieve value using key
        out.println(literalNameSV.get(1));
        out.println(literalNameSV.get(3));

        // Access all key's or all values
        Collection<Integer> keys = literalNameSV.keySet();
        Collection<String> values = literalNameSV.values();

        // Possible to traverse
        for(Map.Entry<Integer, String> e : literalNameSV.entrySet()){
            out.println(e.getKey() + "  " + e.getValue());
        }

        // ------ Other Map's  ---------------
        Map<String, Integer> m1;
        Map<String, Animal> m2;
        Map<String, List<String>> m3;


    }


    class Animal {
        // ...
    }

}
