package samples.usemoreclasses;

/*
     The concept of a person
     Part of the OO model
 */
public class Person {

    private final String name;
    private int age;
    private double income;

    public Person(String name, int age, double income) {
        this.name = name;
        this.age = age;
        this.income = income;
    }

    public Person(String name) {
        this(name, 0, 0);
    }

    public String getName() {
        return name;
    } // No setter, name is final

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public double getIncome() {
        return income;
    }

    public void setIncome(double income) {
        this.income = income;
    }

    // Objects has the data to be able to answer questions!
    public boolean isRetired(int retireAge) {
        return age >= retireAge;
    }

    // toString, equals and hashCode omitted
}


