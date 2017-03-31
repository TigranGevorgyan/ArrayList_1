import java.util.Comparator;

/**
 * Created by Taron on 03/30/17.
 */
public class Person {
    public String firstName;
    public String lastName;
    public int age;
    public int salary;

    public Person(String firstName, String lastName, int age) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
    }

    @Override
    public String toString() {
        return String.format("Name; %s, lastname: %s, age: %d",firstName,lastName,age);
    }

}
