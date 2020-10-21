package samples.inheritance;


import static java.lang.System.out;

/*
     Abstract method

 */
public class Inheritance4 {

    public static void main(String[] args) {
        new Inheritance4().program();
    }

    void program() {
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

        public abstract void doIt();  // Abstract method ok, in abstract class

    }

    public interface ISayable {
        String say();
    }

    // Must implement doIt() alse class must be abstract
    public class Dog extends Pet {
        public Dog(String name, int age) {    // Redundant code gone
            super(name, age);
        }

        @Override
        public void doIt() {
            // ...
        }


        @Override
        public String say() {   // This is subtype to Pet and ISayable, must implement method!
            return "Voff";
        }

    }

    // Must implement doIt
    public class Cat extends Pet {

        private boolean isEvil;

        public Cat(String name, int age, boolean isEvil) {
            super(name, age);
            this.isEvil = isEvil;
        }

        @Override
        public void doIt() {
            // ...
        }

        public boolean isEvil() {
            return isEvil;
        }

        @Override
        public String say() {
            return "Mjau";
        }


    }


}
