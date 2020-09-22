package samples;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

/*
 *  One motivation for the use of interfaces
 *
 *  If using an interface as a method argument the exact type
 *  of the object at method call doesn't matter as long
 *  as object implements (fulfills) the interface (contract).
 *
 *  Possible to send in different objects (with same interface) to methods
 *  I.e. program more flexible, easier to modify.
 */
public class WhyInterface {

    public static void main(String[] args) {
        new WhyInterface().program();
    }

    void program() {
        // Two kinds of lists, both implement List<Integer>
        LinkedList<Integer> ll = new LinkedList<>();  // This one is fast to remove element
        ArrayList<Integer> al = new ArrayList<>();    // This one is fast to read

        //Comment/Uncomment different combinations to see
        doIt(al);
        //doIt(ll);    // No wrong type
        doOther(ll);
        //doOther(al);   // No wrong type

        doItForAny(al);   // Works for any!
        doItForAny(ll);
    }

    // Parameter is fixed
    void doIt(ArrayList<Integer> list) {
        // Won't work for LinkedList argument (possibly most rewrite a lot of code)
    }

    // Parameter is fixed
    void doOther(LinkedList<Integer> list) {
        // Won't work for ArrayList argument (possibly most rewrite a lot of code)
    }

    // Argument is interface type!!
    void doItForAny(List<Integer> list) {
        // Will work for any! Both implements List i.e. fulfills contract
        // No need to rewrite code if changing type of list
    }


}
