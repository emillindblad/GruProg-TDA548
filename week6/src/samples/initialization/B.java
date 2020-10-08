package samples.initialization;

import static java.lang.System.out;

public class B extends A {

    private static C c = new C(4, "static variable c in B");
    private X x = new X("instance x variable in B");

    public B(int i) {
        super(i, 9);
        out.println("Constructor B " + i);
    }
}

