package samples.types;


import static java.lang.System.out;

/*
 *    Casting to interface type is always allowed, even if NO super sub relation!
 */
public class CastInterface {

    public static void main(String[] args) {
        new CastInterface().program();
    }

    private void program() {

        Car car = new Car();
        ISayable s1 = (ISayable) car;  // Allowed but runtime error ... Car not subtype

        car = new TalkingCar();
        ISayable s2 = (ISayable) car;   // ... because it could be like this, TalkingCar is subtype
        out.println(s2.say());


        IDummmy d = (IDummmy) s1;    // Yes, same reason as above.
        ISayable s3 = (ISayable) d;

    }

    public interface ISayable {
        String say();
    }

    public class Car {
        // Class has **nothing** to do with ISayable!!!
    }

    // Subtype to Car and ISayable
    public class TalkingCar extends Car implements ISayable {
        @Override
        public String say() {
            return "Honk honk";
        }
    }

    public interface IDummmy {
        // No super sub to any
    }
}
