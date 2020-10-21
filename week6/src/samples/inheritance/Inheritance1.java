package samples.inheritance;




/*
     Problem!  Classes have same instance variables and methods.
     Duplicated code!

     To be continued: See Inheritance2
 */
public class Inheritance1 {

    public static void main(String[] args) {
        new Inheritance1().program();
    }

    void program() {
        Dog d = new Dog("Lassie", 4);
        Cat c = new Cat("Misse", 5, false);
    }

    public class Dog {
        private String name;     // <------ Duplicate
        private int age;

        public Dog(String name, int age) {
            this.name = name;
            this.age = age;
        }

        public String getName() {  // <-------- Duplicate
            return name;
        }

        public int getAge() {    // <-------- Duplicate
            return age;
        }
    }

    public class Cat {

        private String name;      // <-------- Duplicate
        private int age;
        private boolean isEvil;

        public Cat(String name, int age, boolean isEvil) {
            this.isEvil = isEvil;
        }

        public boolean isEvil() {
            return isEvil;
        }

        public String getName() {  // <--------- Duplicate
            return name;
        }

        public int getAge() {     // <-------- Duplicate
            return age;
        }
    }



}
