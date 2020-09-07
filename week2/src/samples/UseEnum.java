package samples;

import static java.lang.System.out;

/*
 *  Enum (enumeration) is a type for some small set of values (a class type).
 *  All values that belong to type is explicitly written out when enum declared
 *  (so set must be small). By convention upper case is used for the values,
 *
 *  Enum's introduce a reference type, the values are (final) reference variables
 *  referencing unique objects. Equality is by reference '==' (in fact it's identity)
 *
 *  Enums are used because they are type safe (using String or int for days
 *  is not safe, i.e. compiler can't catch misspellings or invalid numbers)
 *
 */

public class UseEnum {

    public static void main(String[] args) {
        new UseEnum().program();
    }

    // Declare the enum type
    enum WeekDay {
        MON, TUE, WED, THU, FRI, SAT, SUN  // List all values that belong to type
    }

    void program() {
        WeekDay d1 = WeekDay.FRI;   // Declare variable of enum type and assign value
        WeekDay d2 = WeekDay.THU;

        //d2 = 0;        // No 0 is a int, wrong type
        //d2 = "SUN";    // No SUN is a string, wrong type

        WeekDay d4 = WeekDay.FRI;

        out.println(d1 != d2);  // Not equal (by reference)
        out.println(d1 == d4);  // Equals, same object (FRI), identity.

        out.println( d1.ordinal() );  // Values are numbered, starting at 0
        out.println( d2.ordinal() );

        WeekDay[] days = WeekDay.values();  // Possible to loop through all
        for (int i = 0; i < days.length; i++) {
            out.println(days[i]);  // Will automatically convert to String
        }

        // Conversion from String
        WeekDay d5 = WeekDay.valueOf("SUN");  // String must be exactly as enum  "SUN" <-> SUN
        out.println( d5 );
    }
}



