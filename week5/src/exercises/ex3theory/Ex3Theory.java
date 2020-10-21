package exercises.ex3theory;

/*
 *  More subclasses and subclasses (objects) connected
 *
 *  See
 *  - useaclass/*
 *  - usemoreclasses/*
 *  - usestatic/*
 */
public class Ex3Theory {

    public static void main(String[] args) {
        new Ex3Theory().program();
    }

    void program() {
        //1. What will be printed? Why?
        /*Pt p1 = new Pt();
        Pt p2 = new Pt();
        Pt p3;

        p1.x = 1;
        p1.y = 2;
        p2.x = 2 * p1.x;
        p2.y = 2 * p1.y;
        p3 = p1;
        p1 = p2;

        out.println(p1 == p2);
        out.println(p2 == p3);
        out.println(p1 == p3);

        out.println(p1.x == p2.x);
        out.println(p2.x == p3.x);
        out.println(p3.y == p1.y);*/

        // 2. What will be printed? Why? See Mth class below
        /*Mth m = new Mth(3);
        m.op(1.5);
        m.op();
        m.op(2);
        out.println(m.i);*/

        // 3. What will be printed? Why? How many objects are involved?
        /*Cainc cc = new Cainc(5);
        out.println(cc.doIt().doIt().doIt().doIt().i);*/

        // 4. What will be printed? Why? How many objects are involved?
        /*CCtor c = new CCtor(new CCtor(new CCtor(8)));
        out.println(c.i);
        */

        // 5. Some rows will give errors. Explain!
        /*
        A.a = A.b;              // 1
        A.a = new A().b;        // 2
        A.b = A.a;              // 3
        new A().b = A.a;        // 4
        new A().a = new A().b;  // 5
        new A().b = new A().a;  // 6
        A a = null;             // 7
        out.println(a.a);       // 8
        */
    }

    // ---------- Classes ----------------------------

    // "static" before class A has nothing to do with the problems, ignore it
    static class A {
        static int a;    // A class variable
        int b;
    }

    class Pt {
        int x;
        int y;
    }

    class Mth {
        int i;

        Mth(int i) {
            this.i = i;
        }

        void op() {
            i = 2 * i;
        }

        void op(double d) {
            i = i + (int) d;
        }

        void op(int i) {
            this.i += i;
        }
    }

    class Cainc {
        final int i;

        Cainc(int i) {
            this.i = i;
        }

        Cainc doIt() {
            return new Cainc(i + 1);
        }

    }

    class CCtor {
        int i;

        CCtor(int i) {
            this.i = i;
        }

        CCtor(CCtor o) {
            i = o.i;
        }
    }
}
