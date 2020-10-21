package samples.initialization;

import static java.lang.System.out;

public class C extends B {

    public C(int i, String str) {
        super(i);
        out.println("Constructor C " + str);
    }


}

