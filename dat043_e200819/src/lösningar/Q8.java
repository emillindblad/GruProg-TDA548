/*
        Solution to question 8 here.

import java.util.ArrayList;
import java.util.List;

import static java.lang.System.*;

public class Q8 {

    public static void main(String[] args) throws Exception {
        new Q8().program();
    }

    /*
            Write explanations here as comments

    void program() {
        // A a = new C(); a.doIt(1.0);

        // C c = new B(); c.doIt(1.0);

        // A a = new B(); a.doIt(1);

        // Object o = new C();
        // D d = (D) o;
        // d.doIt(1.0);

        //IX i = new C();
        //A a = (A) i;
        //a.doIt(1.0);


        //Object[] os;
        //A[] as = {new A(), new A()};
        //os = as;
        //((A) os[0]).doIt(5);


        /*
        List<Object> os = new ArrayList<>();
        List<A> as = new ArrayList<>();
        os = as;
        os.add(new B());
        ((B) os.get(0)).doIt(5);
    }

    // --- Interfaces and classes
    interface IX {
        void doIt(double d);
    }

    class A implements IX {
        public void doIt(double d) {
            out.println("doIt A");
        }
    }
    class B extends A {
        public void doIt(int i) { out.println("doIt B"); }
    }
    class C extends A {
        public void doIt(double d) { out.println("doIt C"); }
    }
    class D {
        public void doIt(double d) { out.println("doIt D"); }
    }

}
*/