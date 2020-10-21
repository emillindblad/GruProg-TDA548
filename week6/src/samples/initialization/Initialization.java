package samples.initialization;

import static java.lang.System.out;

/*
 *   This is the (close) to full process of initializing
 *   when inheritance and static is involved
 *
 *   Order of initialization:
 *   - Any static initialization (for class) in written order
 *   - Any instance variable initialization in written order
 *   - Finally constructor (if inheritance call super class constructor first)
 */
public class Initialization {

    public static void main(String[] args) throws NoSuchFieldException {
        new Initialization().program();
    }

    void program() {
        out.println("Progam starts");
        C c = new C(3, "Created in program");
    }
}

