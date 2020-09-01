package samples;

import static java.lang.System.out;

/*
 *  To package data of different types we use class objects (remember: arrays may only
 *  use same type of data). The data should in some sense "belong together".
 *  I.e. an objects is a package of variables of possibly different types
 *  describing some concept (a car, a dog, a hero, ... any noun ...)
 *
 *  To create class objects we first must declare a class describing the variables packaged (the
 *  instance variables). I.e. a class is a blue print of the objects to be created.
 *
 *  When the class is declared we may create objects, using the new-operator.
 *
 *  When declaring a class we also automatically define a new type (so we can declare a variable
 *  for a class object, remember, must specify type at variable declaration).
 *
 */
public class ClassObjects {
    public static void main(String[] args) {
        new ClassObjects().program();
    }

    void program() {
        // A class also introduces a new typ (Dog). Use type to declare variable
        Dog d1 = new Dog();  // Must instantiate, i.e. create a dog object named d1 (using operator new and class)

        out.println(d1.age);  // Get value of contained variable using '.' "dot"-notation and variable name.

        d1.name = "Fido";    // Assign values to variables in dog object, use "dot"-notation
        d1.age = 3;
        d1.age++;   // Getting older ...

        out.println(d1.name + " " + d1.age);

        Dog d2 = new Dog(); // Create another dog. Same class used (class is a blue print)!
        d2.name = "Lassie";
        d2.age = 14;

        if( d1.age > d2.age){
            out.println(d1.name + " is older");
        }else {
            out.println(d2.name + " is older");
        }
    }

    // --- A class -----
    // Class declaration specifies a name and instance variables.
    // This class captures the concept of a dog
    class Dog {
        // Two instance variables
        String name;   // A Dog has a name and... (default value null)
        int age;       // ... and age (default value 0)
    }

}
