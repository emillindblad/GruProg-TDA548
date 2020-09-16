package samples;

import static java.lang.System.out;

/*
 *  Side effect
 *
 *  When an expression is evaluated it produces a value (which has a type)
 *  That's the normal way but, ... some expression, besides, producing
 *  a value does something more (alter memory).
 *  This is called as side effect.
 *
 *  Some side effects
 *  - Assignment ( value is "the assigned" value, side effect is memory altered)
 * -  Increments/decrement (Side effect is change of memory. Value is value before or after
 *    depending on placement of ++/--)
 */
public class SideEffect {

    public static void main(String[] args) {
        new SideEffect().program();
    }


    void program() {
        int a = 1;
        int b = 2;

        out.println(a++);     // Side effect a incremented, value is old value
        out.println(a);

        out.println(++a);   // Side effect a incremented, value is new value

        out.println(a = b);  // Side effect value in b copied to a, value is b
        out.println(a);

        int c = a = b;
        out.println(a + " " + b + " " + c);

        out.println( getANumber(0) - getANumber(0) == 0);   // Or??

        Dog d = new Dog(); // Value is ref. to Dog, side effect memory allocated
    }




    // Method with side effect. Not referentially transparent
    int n = 0;
    int getANumber(int i){
        n++;
        return n + i;

    }

    class Dog{
        String name;
        int age;
    }
}






