package samples;

import java.util.ArrayList;
import java.util.List;

import static java.lang.System.out;

/*
  Basic use of ArrayList

  An ArrayList is a Java class to hold collections of objects (NOT primitive types).
  ArrayList is like an dynamic array that grows and shrinks. Empty at start
  (i.e. no positions what so ever).

  ArrayList can handle any typ of references as elements, i.e it's
  a generic class. When declaring a reference variable to an ArrayList,
  must specify the element type in angle brackets

  An ArrayList is an object that is much smarter than an array (i.e. a lot of
  methods to do the work for us).
  See: https://en.wikipedia.org/wiki/List_(abstract_data_type)

  ArrayList is an *implementation* of the List interface (an interface is a contract,
  a collection of methods). There are other implementations fulfilling the contract
  for example LinkedList (not used here).
  ArrayList implements List (i.e. all methods in List are guaranteed to be in ArrayList,
  ArrayList fulfills the contract, we can call methods declared in List on an ArrayList object)

  You don't need to learn all the methods by heart,
  if allowed to use on exam you'll get a list.
 */

public class UseAList {

    public static void main(String[] args) {
        new UseAList().program();
    }

    void program() {
        // Below we use a variable of an interface type (list)
        // We prefer variables of interface type because then we can change the implementation
        // without changing the rest of the program (not applicable here, but in general)
        // See: WhyInterface sample
        List<Integer> list = new ArrayList<>();

        out.println(list.isEmpty());
        out.println(list.size());

        list.add(100);                // Add last in list
        list.add(200);
        list.add(300);
        out.println(list);              // List has a toString method, easy to print out
        out.println(list.size() == 3);
        out.println(list.get(2));        // Use get() for indexing, zero based (can't use []).
        out.println(list.indexOf(300) == 2);

        list.set(0, 500);  // Will overwrite
        out.println(!list.contains(100));
        out.println(list);


        list.add(1, 400);  // Values moved to right, then inserted at 1
        out.println(list);
        // Index 50 doesn't exist, exception!
        //list.add(50, 555);

        list.remove(1);      // Remove using index
        out.println(list);

        List<Integer> l2 = list.subList(1, 3); // This is hazardous, sublist just a view of original!
        out.println(l2);
        list.add(999);      // Modified original ...
        // out.println(l2);  // ... will raise ConcurrentModificationException

        //list.add(null); // Very very Baaaad! Exception some time(!) ...later...

        // ----- Traversing  ----------------------

        for (Integer i : list) {   // Use short for-loop ...
            out.print(i);
        }

        for (int i = 0; i < list.size(); i++) {   // ... or normal for loop
            out.print(list.get(i));
        }

        // ---- Remove many elements (filter)  --------------

        /*for( Integer i : list){   // Can't remove in short for loop
            if( i > 200){
                list.remove(i);  // ConcurrentModificationException
            }
        }*/

        // Simplest way to remove many elements
        List<Integer> toRemove = new ArrayList<>();  // Temp list
        for (Integer i : list) {
            if (i > 200) {
                toRemove.add(i);   // Collect all to remove
            }
        }
        list.removeAll(toRemove);  // Finally remove all
        out.println(list);

        // --- Clear a List  -----------------
        list.add(500);
        list.clear();
        out.println(list.isEmpty());

        //out.println(list.get(0));   // Exception


        // ----- Lists with other element types ---------

        List<String> sList = new ArrayList<>();
        List<Double> dList = new ArrayList<>();
        List<Character> chList = new ArrayList<>();
    }


}
