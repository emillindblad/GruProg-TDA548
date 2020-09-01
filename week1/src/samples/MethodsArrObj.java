package samples;

import java.util.Arrays;
import java.util.Scanner;

import static java.lang.System.in;
import static java.lang.System.out;

/*
 * This is methods having arrays or class objects as parameters and/or return types
 */
public class MethodsArrObj {

    public static void main(String[] args) {
        new MethodsArrObj().program();
    }

   final Scanner sc = new Scanner(in);

    void program() {
        // Methods with arrays ----------------------

        int[] arr = {1, 4, 7, 3, 9, 2};
        out.println(max(arr) == 9);  // Method calls to max(), argument is arr
        arr = getArrayWith(3, 5);
        out.println(Arrays.toString(arr).equals("[5, 5, 5]"));

        // Methods with class objects ------------------

        Dog d = getDog();
        printDog(d);
    }

    // ----- Method declarations  ------------

    // Class declaration with int return type and array param
    int max(int[] arr) {    // Find biggest value in array
        int m = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] > m) {
                m = arr[i];
            }
        }
        return m;
    }

    // Get an array with some size initialized with some value
    // Array return type!
    int[] getArrayWith(int size, int n) {
        int[] arr = new int[size];        // Create array
        for (int i = 0; i < arr.length; i++) {
            arr[i] = n;
        }
        return arr;  // Return array
    }

    // Class
    class Dog {
        String name;
        int age;
    }

    // Class object as parameter (a dog object)
    void printDog(Dog dog) {
        out.println("Name " + dog.name + " age " + dog.age);
    }

    // Class object as return value
    Dog getDog() {
        Dog d = new Dog();     // Create a dog object using the class
        out.println("What's the name of the dog? >");  // Input data into object
        d.name = sc.nextLine();
        out.println("How unused is the dog? >");
        d.age = sc.nextInt();
        sc.nextLine();  // Read away enter
        return d;       // Return the dog object
    }


}
