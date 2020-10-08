package samples.initialization;

import static java.lang.System.out;

public class A {

    private int i;
    private int j;
    private static X x = new X("static variable x in A");

    public A(int i, int j ) {
        this.i = i;
        this.j = j;
        out.println("Constructor A i = " + i + ", j = " + j);
    }


}
