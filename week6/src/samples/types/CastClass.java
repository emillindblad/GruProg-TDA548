package samples.types;


import java.util.Random;

/*
 *
 *     When class cast exception?
 *
 *     Compilers always allows casting between super/sub
 *     because it *may* work (remember: when casting we have the responsibility)
 *
 *     Types are checked during execution (in general we can't know the type of the object
 *     (could have been created randomly)
 *
 */
public class CastClass {

    public static void main(String[] args) {
        new CastClass().program();
    }

    void program() {
        A a = new A();
        C c = (C) a;     // Class cast exception! Type of object not sub!
        c.doIt();

        a = new D();
        c = (C) a;     // ... NO Class cast exception. Object typ is sub!
        c.doIt();

        a = getIt();  // Compiler can't know object type in the general case
        c = (C) a;
        c.doIt();
    }

    class A {
    }

    class B extends A {
    }

    class C extends B {
        void doIt() {
        }
    }

    class D extends C {
    }

    // NOTE: A method may return any subtype of return type
    A getIt() {
        Random rand = new Random();
        int r = rand.nextInt(4);   // We don't know type of object!
        switch (r) {
            case 0:
                return new A();
            case 1:
                return new B();
            case 2:
                return new C();
            default:
                return new D();
        }
    }
}
