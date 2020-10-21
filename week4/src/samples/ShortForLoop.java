package samples;

import java.util.Arrays;

import static java.lang.System.out;

/*
   Using a short for loop with arrays.

   If elements has primitive types can't modify them (loop uses a copy of value).
   If references possible to modify object, but not the reference.

   If you need an index for some reason, you can't use short the for-loop

 */
public class ShortForLoop {

    public static void main(String[] args) {
        new ShortForLoop().program();
    }

    void program() {
        int[] iArr = {1, 2, 3};
        String sArr[] = {"a", "b", "c"};

        for (int i : iArr) {  // Each value in iArr copied to i
            out.print(i);
            i++;             // Senseless it's copy
        }
        //i++;     // No, scope just in loop
        out.println(Arrays.toString(iArr));

        for (String s : sArr) {
            out.print(s);
            s = "X";       // Senseless
        }
        out.println(Arrays.toString(sArr));


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
