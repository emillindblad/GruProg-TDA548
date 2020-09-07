package samples;


import javafx.scene.paint.Color;

import static java.lang.System.out;

/*
 * A constructor is a method with same name as the class (and no return type)
 * It's used to initialize an objects instance variables with values from the
 * parameters.
 *
 * Often there is a name clash between instance variables and parameters, prefix instance
 * variables with 'this'
 */

public class UseAConstructor {

    public static void main(String[] args) {
        new UseAConstructor().program();
    }

    void program() {
        Dog dog = new Dog();  // One way to initialize ...
        dog.name = "Fido";
        dog.age = 13;       // Puhhhiii, tiresome ...

        Cat cat = new Cat("Olle", Color.BLACK);  // ... simpler to use a constructor
        out.println(cat.owner);     // owner set by constructor
        out.println(cat.color);     // color set by constructor
    }

    // ------- Classes ----------------------

    class Dog {
        String name;
        int age;
        // There is a no-args constructor here (invisible)
    }

    class Cat {
        String owner;   // Instance variable
        Color color;

        // Add an own constructor (method). Two params!
        Cat(String owner, Color color) {
            this.owner = owner;  // 'this' used because of name clashes, owner/owner
            this.color = color;  // this.color is the instance variable, color is the parameter
        }
        // The no-args constructor is gone because we added an own.

    }  // End class Cat

}



