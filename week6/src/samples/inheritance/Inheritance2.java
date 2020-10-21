package samples.inheritance;


import static java.lang.System.out;

/*
     Eliminating redundant code using an abstract base class
     This is the correct use of "extends" in Java!

     See also Inheritance3

 */
public class Inheritance2 {

    public static void main(String[] args) {
        new Inheritance2().program();
    }

    void program() {
        //Pet p = new Pet("any", 0);     // Ok, but senseless
        Dog d = new Dog("Lassie", 4);
        Cat c = new Cat("Misse", 5, false);

        // Use inherited methods
        out.println(d.getName() + ":" + d.getAge());
        out.println(c.getName() + ":" + c.getAge());

        //Pet p = new Pet();   // Probably senseless
    }


    public class Pet {
        private String name;         // Everything common for Cat and Dog here
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

    // Dog is subclass to Pet, will inherit all from super type (privates non visible)
    public class Dog extends Pet {    // Redundant code gone
        public Dog(String name, int age) {    // Redundant code gone
            super(name, age);   // Must call constructor of superclass (first of all)
        }

        // getName() and getAge() inherited but invisible
    }

    // Cat is subclass too
    public class Cat extends Pet {

        private boolean isEvil;

        public Cat(String name, int age, boolean isEvil) { // Redundant code gone
            super(name, age);
            this.isEvil = isEvil;
        }

        public boolean isEvil() {
            return isEvil;
        }

        // getName() and getAge() inherited but invisible

    }


}
