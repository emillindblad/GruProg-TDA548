package samples.usemoreclasses;

import static java.lang.System.out;

/*
 *   Using a small OO model with two classes, Car and Person
 */
public class TestCarPerson {

    public static void main(String[] args) {
        new TestCarPerson().program();
    }

    void program() {

        // Create the model
        Person p = new Person("Sven", 50,  500_000);
        // NOTE: Car doesn't create the owner, owner is passed in via constructor!
        Car c = new Car("Volvo", "XMM176", 2016, 1.754, p); // Set owner!!!

        // Use the model
        out.println(p.getName());
        out.println(c.getOwner().isRetired(65));
    }
}




