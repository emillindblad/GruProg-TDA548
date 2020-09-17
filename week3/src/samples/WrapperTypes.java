package samples;

import java.util.Arrays;
import java.util.Random;

import static java.lang.System.out;

/*
 *  Wrapper types
 *
 *  A wrapper type is a reference version of a primitive type i.e an object
 *  holding a single immutable primitive value. Conversion between primitive
 *  type and reference type is done automatically (boxing).
 *
 *  Boxing conversion = from primitive to reference
 *  Unboxing conversion = from reference to primitive
 *
 */
public class WrapperTypes {

    public static void main(String[] args) {
        new WrapperTypes().program();
    }

    final Random rand = new Random();

    void program() {
        Integer i = 4;   // Conversion from int (4) to Integer object (boxing)...
        int j = i;        // ... and back (unboxing)

        out.println(i.equals(4));    // Wrapper type objects have methods
        //out.println(j.equals(4));  // No method! j is primitive type

        // Other wrapper types
        Boolean b = true;
        Character c = 'q';
        Double d = 3.4;

        // No type conversion as with primitive types!
        // d = i;
        // d = 6;

    }


}
