package samples;

import java.util.Scanner;

import static java.lang.System.in;
import static java.lang.System.out;

/*
 *   Using methods with parameters or return types of array of class objects.
 */
public class ObjectArrMeth {
    public static void main(String[] args) {
        new ObjectArrMeth().program();
    }

    final Scanner sc = new Scanner(in);

    void program() {

        // Use own type Dog to create an array of dogs
        Dog[] dogs = getDogs();  // Call method to create and set data for all dogs

        for (int i = 0; i < dogs.length; i++) {
            out.println("Name " + dogs[i].name + " age " + dogs[i].age);  // Print selected variables
        }

        Dog oldest = findOldest(dogs);
        out.println("Oldest is " + oldest.name);

    }

    // --- A class -----
    // This class captures the concept of a dog
    class Dog {
        String name;   // A Dog has a name and...
        int age;       // ... and age
    }

    // Method returning an array of dog objects
    Dog[] getDogs() {
        out.print("How many dogs? > ");
        int nDogs = sc.nextInt();
        sc.nextLine();                 // Read away enter code last in input
        Dog[] dogs = new Dog[nDogs];    // Create array for dog objects (no objects so far, just the array)
        for (int i = 0; i < nDogs; i++) {
            Dog d = new Dog();               // Create new dog object
            out.print("What's the name of the dog? > ");  // Fill in data
            d.name = sc.nextLine();
            out.print("How old is the dog? > ");
            d.age = sc.nextInt();
            dogs[i] = d;                   // Store object in array
            sc.nextLine();                 // Read away enter code
        }
        return dogs;
    }

    // Find oldest dog in array of dogs
    // Array of objects as parameter, returning single objects
    Dog findOldest(Dog[] dogs) {
        int index = 0;
        int maxAge = dogs[index].age;  // Assume first is oldest ...
        for (int i = 0; i < dogs.length; i++) {
            if (dogs[i].age > maxAge) {  // ... if not store index of elder
                index = i;
                maxAge = dogs[i].age;   // .. and age.
            }
        }
        return dogs[index];
    }
}
