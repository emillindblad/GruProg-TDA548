package samples.types;

/*
        Any class may have multiple super or subtypes
        Nothing to run here

 */
public class MultipleSuperSubTypes {

    public interface IX {

    }

    public interface IY {

    }

    public class A {

    }

    // Multiple supertypes (A, IX, IY)
    public class B extends A implements IX, IY {

    }

    // Multiple subtypes to IX
    public class C1 implements IX {

    }

    public class C2 implements IX {

    }

    public class C3 implements IX {

    }

    // Multiple subtypes to A
    public class D1 extends A {

    }

    public class D2 extends A {

    }
}
