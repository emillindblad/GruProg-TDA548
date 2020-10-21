package samples.types;


import static java.lang.System.out;

/*
    To examine types in running program operator instanceof or
    method getClass() may be used.

    BUT! Avoid. Better use polymorphism (overriding).
    See: override/WhyOverride

 */
public class InstanceOfGetClass {

    public static void main(String[] args) {
        new InstanceOfGetClass().program();
    }

    private void program() {
        Car c = new Car();
        TalkingCar tc = new TalkingCar();
        ISayable s = tc;

        out.println(c instanceof Car);  // Is c Car or subtype of?
        out.println(tc instanceof Car);
        out.println(s instanceof Car);

        out.println(c instanceof TalkingCar);
        out.println(tc instanceof TalkingCar);
        out.println(s instanceof TalkingCar);

        out.println(c.getClass() == Car.class);  // What's the type of the object?
        out.println(tc.getClass() == TalkingCar.class);
        out.println(s.getClass() == TalkingCar.class);

        c = tc;
        out.println(c.getClass() == TalkingCar.class);

        // out.println(tc.getClass() == Car.class);    // Bad. Incomparable types

    }

    public interface ISayable {
        String say();
    }

    public class Car {

    }

    public class TalkingCar extends Car implements ISayable {
        @Override
        public String say() {
            return "Honk honk";
        }
    }
}
