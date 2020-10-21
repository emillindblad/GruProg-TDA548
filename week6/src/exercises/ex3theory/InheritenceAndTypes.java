package exercises.ex3theory;

/*
    Uncomment each row in turn and explain why the row compiles or not.

 */
public class InheritenceAndTypes {

    public static void main(String[] args) {
        new InheritenceAndTypes().program();
    }

    public void program() {
        IA ia = new A();

        //ia = new B();
        //ia = new C();
        //ia = new D();
        //ia = new E();

        A a = new A();
        //a = new B();
        //a = new C();
        //a = new D();
        //a = new E();

        //B b = new A();
        //B b = new C();
        //C c = new D();
        //C c = new E();
        //D d = new E();
        //E e = new C();
        //E e = new D();

    }

    // -------------  Interfaces and classes ----------------------

    public interface IA {

    }

    public class A implements IA {

    }

    public class B implements IA {

    }

    public class C extends A {
    }

    public class D {

    }

    public class E extends D implements IA {

    }


}
