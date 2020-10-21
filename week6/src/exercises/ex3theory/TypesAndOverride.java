package exercises.ex3theory;

/*
      Uncomment a)-h) one at the time and explain
      what happens and why.
      If no errors, what is printed out, explain why.

      Remember: Static/declared type is type of variable. Type of object
      (=runtime type/dynamic type) may differ!

      A a = new A();      // Declared and object type the same
      A a = new B()       // Not the same (B must be subtype)

      Declared type decides what is possibly (at all) to do with the
      variable (i.e. which methods to call, checked compile time)

      Object type decides which version of method (if overriding) should be called
      (decided runtime)

 */
public class TypesAndOverride {

    public static void main(String[] args) {
        new TypesAndOverride().program();
    }

    void program() {
        // a
        /*D d = new D();
        C c = d;
        c.doIt();
        */

        // b
        /*IY iy = new D();
        C c1 = (C) iy;
        c1.doOther();
        */

        // c
        /*A a = new B();
        a.doIt(1);
        */

        // d
        /*IX ix = new B();
        IY iy3 = new C();
        ix = (IX) iy3;
        ix.doIt();
        */

        // e
        /*A a4 = new C();
        D d1 = (D) a4;
        d1.doIt(1.0);
        */


        // f
        /*C c2 = new D();
        B b = (B) c2;
        */

        // g
        /*C c3 = new C();
        A a1 = c3;
        a1.doOther();
        */

        // h
        /*IY iy2 = new C() {  // Anonymous subclass to C created
            @Override
            public void doOther() {
                super.doOther();
            }
        };
        iy2.doOther();
        */

    }


    // ---------- Interfaces and classes -------------------------

    public interface IX {
        void doIt();
    }

    public interface IY {
        void doOther();
    }

    public class A {
        public void doIt(double d) {
            System.out.println("Doit A " + d);
        }
    }

    public class B extends A implements IX {
        public void doIt() {
            System.out.println("Doit B");
        }

        public void doIt(int i) {
            System.out.println("Doit B " + i);
        }
    }

    public class C extends A implements IY {
        public void doIt() {
            System.out.println("Doit C");
        }

        public void doOther() {
            System.out.println("DoOther " + this.getClass().getSimpleName());
        }
    }

    public class D extends C {
        public void doIt() {
            System.out.println("Doit D");
        }
    }

}
