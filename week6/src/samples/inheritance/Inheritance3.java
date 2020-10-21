package samples.inheritance;


import static java.lang.System.out;

/*
     Eliminating redundant code using an abstract base class
     and letting base class implement interface (i.e. all sub classes
     must implement)

 */
public class Inheritance3 {

    public static void main(String[] args) {
        new Inheritance3().program();
    }

    void program() {
        //Pet p = new Pet("any", 0);     // NO abstract!

        Dog d = new Dog("Lassie", 4);
        Cat c = new Cat("Misse", 5, false);

        //Use overridden methods
        out.println(d.say());
        out.println(c.say());

    }

    // This class need not to implement method say() because it's
    // abstract (can't create instances, so no problem)
    public abstract class Pet implements ISayable {
        private String name;
        private int age;

        public Pet(String name, int age) {
            this.name = name;
            this.age = age;
        }

        public String getName() {
            return name;
        }

        public int getAge() {
            return age;
        }

    }

    public interface ISayable {
        String say();
    }

    public class Dog extends Pet {
        public Dog(String name, int age) {    // Redundant code gone
            super(name, age);
        }

        @Override
        public String say() {   // This is subtype to Pet and ISayable, must implement method!
            return "Voff";
        }  // Implement interface method

        // getName() and getAge() inherited but invisible
    }

    public class Cat extends Pet {

        private boolean isEvil;

        public Cat(String name, int age, boolean isEvil) { // Redundant code gone
            super(name, age);
            this.isEvil = isEvil;
        }

        public boolean isEvil() {
            return isEvil;
        }

        @Override
        public String say() {
            return "Mjau";
        }

        // getName() and getAge() inherited but invisible

    }


}
