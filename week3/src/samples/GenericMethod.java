package samples;

import java.util.Random;

import static java.lang.System.out;

/*
    Generic methods, i.e. methods taking "any" reference type parameter
 *
 *  Useful if we would like to do the same thing but have data of different reference
 *  types and don't want to use overloading (overloading may be impractical, possible
 *  type is not known).
 *
 *  Generic methods only works with reference types!
 *  If using primitive types convert to corresponding wrapper type
 *
 *  NOTE: Normally we can't do anything with the object, just the references!
 *
 */

public class GenericMethod {

    public static void main(String[] args) {
        new GenericMethod().program();
    }

    enum Color {
        RED, BLUE, YELLOW, GREEN, BLACK
    }


    void program() {
        Color[] colors = {Color.BLACK, Color.BLUE, Color.GREEN, Color.RED, Color.YELLOW};
        Integer[] ints = {1, 4, 6, 2, 7, 0, -1};  // Will convert elements to wrapper type
        String[] strs = {"aaa", "xxx", "fff", "ccc", "ddd"};

        // Could use overloading, but if many (possibly unknown) types!
        out.println(find(colors, Color.BLACK) == 0);
        out.println(find(strs, "aaa") == 0);
        out.println(find(ints, 7) == 4);     // Parameters boxed to Integer

    }

    // This method has an type parameter <T> i.e. it's a generic method.
    // T stands for any *reference* type, which one is later figured out by Java.
    // So here T is replaced by Color or Integer or String
    // NOTE: Method don't touch the objects (i.e. call any method), just uses the reference
    <T> int find(T[] arr, T value) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == value) {    // Note: This is reference identity!
                return i;
            }
        }
        return -1;
    }
}



