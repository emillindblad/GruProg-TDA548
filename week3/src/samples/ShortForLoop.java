package samples;

import java.util.Arrays;

import static java.lang.System.out;

/*
   Using a short for loop will save you some typing (but if you
   prefer it's ok to use the ordinary for loop)

   If you need an index for some reason, you can't use short for-loop

   If elements has primitive types can't modify them.
   If references possible to modify object.

 */
public class ShortForLoop {

    public static void main(String[] args) {
        new ShortForLoop().program();
    }

    void program() {
        int[] iArr = {1, 2, 3};
        String sArr[] = {"a", "b", "c"};

        // Nice way to traverse
        for( String s : sArr){
            out.println(s);
        }

        // ------ Can't change values in array --------------------
        for (int i : iArr) {  // Each value in iArr copied to i
            out.print(i);
            i++;             // Senseless i holds a copy
        }
        //i++;     // No scope just in loop
        out.println(Arrays.toString(iArr));

        for (String s : sArr) {
            out.print(s);
            s = "X";       // Senseless
        }
        out.println(Arrays.toString(sArr));

        // ----- Can change referenced objects in array -----------
        Dog[] dogs = {new Dog(), new Dog(), new Dog()};
        for (Dog d : dogs) {
            d.age = 5;     // Will set value!
        }
        out.println(dogs[0].age);
        out.println(dogs[1].age);

    }

    class Dog {
        String name;
        int age;
    }

}
