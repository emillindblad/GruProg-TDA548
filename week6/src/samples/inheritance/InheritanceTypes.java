package samples.inheritance;


/*
     A subclass introduces a subtype!
     See also types/CastClass and CastInterface

 */
public class InheritanceTypes {

    public static void main(String[] args) {
        new InheritanceTypes().program();
    }

    void program() {
        Dog d = new Dog("Lassie", 4);
        Cat c = new Cat("Misse", 5, false);

        Pet p = d;   // Use super/sub established by "extends"
        p = c;

        ISayable s = p;    // Yes, super/sub by implements

        s = d;            // Yes, subtype relation transitive
        s = c;            // Yes, subtype relation transitive

        //d = p;          // No, no super/sub
        //d = s;

    }

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

    public class Dog extends Pet {
        public Dog(String name, int age) {    // Redundant code gone
            super(name, age);
        }

        @Override
        public String say() {   // This is subtype to Pet and ISayable, must implement method!
            return "Voff";
        }


    }

    public class Cat extends Pet {

        private boolean isEvil;

        public Cat(String name, int age, boolean isEvil) {
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

    }

    public interface ISayable {
        String say();
    }

}
