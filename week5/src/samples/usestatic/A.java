package samples.usestatic;

/*
        A class using class variables and methods (static variables and methods)

        This shows:
        - An instance method can use/call instance and class
        variables and methods.
        - A class method can only call class methods and use
        class variables (no "this" in static methods)
        Class method can't know which object!

 */
public class A {

    // This is a constant in Java (always upper case)
    public static final int CONST = 34;
    // Class variable
    private static int classVar = 1;
    // Instance variable
    private int instVar = 2;

    public int getClassVar() {  // Instance can access classVar
        return classVar;
    }

    public static int getClassVarS() {  // Class method also can
        return classVar;
    }

    public int getInstVar() {  // Instance method, ok
        return instVar;
    }

    /*public static int getInstVarS() {  // No class method can't access instVar
        return instVar;
    }*/

    public static void setClassVarS(int classVar) {
        A.classVar = classVar;
        //this.classVar = classVar;  // No 'this' in class method
    }

    public void setClassVar(int classVar) {  // Instance can access
        this.classVar = classVar;
    }

    public void setInstVar(int instVar) {
        this.instVar = instVar;
    }

    /*
    public static void setInstVarS(int instVar) { // Class can't access
        this.instVar = instVar;
    }*/

}
