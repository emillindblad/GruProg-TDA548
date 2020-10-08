package samples.override;


import static java.lang.System.out;

/*
    Overriding Vs Overloading

 */
public class OverrideVsOverload {

    public static void main(String[] args) {
        new OverrideVsOverload().program();
    }

    private void program() {
        doIt(5);      // Parameter govern (try to find exact match)
        doIt(5.0);   // If not found try type conversion to find


        A a = new B();   // Overloading
        a.doIt(5);    // Declared (static) type govern!
                         // i.e. A.doIt(). Exact match in B not chosen.

        C c = new D();    // Overriding
        c.doIt(5.0);   // Type of objects govern! I.e. D.doIt()

    }

    // ------ Overloading same class ----------
    void doIt(double d) {
        out.println("doIt double");
    }

    void doIt(int i) {
        out.println("doIt int");
    }

    // ------ Overload between classes (BAD avoid) ----------
    class A {
        void doIt(double d) {
            out.println("doIt A");
        }
    }

    class B extends A {
        void doIt(int i) {        // NOT override
            out.println("doIt B");
        }
    }

    // ------ Overriding----------
    class C {
        void doIt(double d) {
            out.println("doIt C");
        }
    }

    class D extends C {
        @Override
        void doIt(double d) {      // Exactly same method head
            out.println("doIt D");
        }
    }

}
