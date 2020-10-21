package samples.override;

import static java.lang.System.out;

/*
    Overloading is compile time. Compiler tries to find
    a best match using the **declared** type!

 */
public class OverloadingIsCompiletime {

    public static void main(String[] args) {
        new OverloadingIsCompiletime().program();
    }

    public void program() {
        A a1 = new A();
        A a2 = new B();  // This also could be new C();

        a1.doIt(1);  // Match doIt() in A if 1 -> 1.0 (super to sub allowed)
        a2.doIt(1);  // Optimal method in object type (B) not selected

        B b = new B();
        b.doIt(1.0);   // Method inherited
    }

    // ------------- Types ---------------------
    public class A {

        public void doIt(double i) {
            out.println("A doIt double");
        }
    }

    public class B extends A {

        // NOT overriding, Inheritance and overloading
        public void doIt(int i) {
            out.println("B doIt int");
        }

        /* Inherited */
        /*public double doIt(double i) {
         System.out.println("Do it double");
         return i;
         }*/
    }


}
