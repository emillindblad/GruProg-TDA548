package samples.override;

import static java.lang.System.out;

/*
        Possible to make mistakes whn overloading
        See also OverloadingIsCompileTime
 */
public class OverrideMistake {

     public static void main(String[] args) {
        new OverrideMistake().program();
    }

      public void program() {
        A a = new B();
        out.println("Ten times as much is " + a.longAndHardToSpellName(5.0));


    }


    public class A {

        // Possible to override
        public double longAndHardToSpellName(double d) {
            return d;
        }

    }

    public class B extends A {

        // No override! Instead inherited method from A.
        // Should have used @Override!
        public double longAndHardToSpelName(double d) {
            return 10 * d;
        }

    }



}
