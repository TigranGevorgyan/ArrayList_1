/**
 * Created by Taron on 03/31/17.
 */
public class Employee extends Person {

//    public Employee(String firstName, String lastName, int age) {
//        super(firstName, lastName, age);
//    }

    public Employee(String firstName, String lastName, int age, int salary) {
        super(firstName, lastName, age);
        if (salary == 0)
            this.salary = 0;
        else
            this.salary = salary;
    }

    @Override
    public String toString() {
        return super.toString() + String.format(", salary: %d.",salary);
    }
}
