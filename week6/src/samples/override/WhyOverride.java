package samples.override;

import java.util.Arrays;
import java.util.List;

import static java.lang.System.out;

/*
    This is a motivation for using overriding.

 */
public class WhyOverride {

    public static void main(String[] args) {
        new WhyOverride().program();
    }

    private void program() {
        List<Pet> pets = Arrays.asList(new Cat(), new Dog(), new Dog(), new Cat());

        // Non overriding style, if new Pet added have to change code, add a new else if
        // This could possible spread to many parts of program!
        for (Pet p : pets) {
            if (p instanceof Cat) {   // Is p a Cat or any subtype of?
                out.println("Mjau");
            } else if (p instanceof Dog) {
                out.println("Voff");
            } else {
                out.println("Unknown pet");
            }
        }

        // Using overriding, each Pet know what to say, if new pets no change to code!
        // The objects know how to behave!
        for (Pet p : pets) {
            out.println(p.say());
        }

    }

    // ------------- Classes ---------------------

    class Pet {
        String say() {
            return "Unknown pet";
        }
    }

    class Dog extends Pet {
        @Override
        String say() {
            return "Voff";
        }
    }

    class Cat extends Pet {
        @Override
        String say() {
            return "Mjau";
        }

    }
}
