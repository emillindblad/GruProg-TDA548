package samples.usestatic;


import static java.lang.System.out;

/*
    Testing class A
 */
public class TestA {

    public static void main(String[] args) {
        A a1 = new A();
        A a2 = new A();

        out.println(a1.getInstVar());
        //out.println(A.getInstVar());   // No, no not a class method

        out.println(a1.getClassVar());
        out.println(a2.getClassVar());
        //out.println(a1.getClassVarS());  // Bad style, don't use object
        out.println(A.getClassVarS());    // Use class when calling static

        a1.setInstVar(0);
        a2.setInstVar(1);
        a1.setClassVar(5);

        out.println(a1.getInstVar() != a2.getInstVar());
        // Changed of one object affects all objects
        out.println(a2.getClassVar() == 5);


    }


}
