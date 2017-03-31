import java.util.Comparator;

/**
 * Created by Taron on 03/31/17.
 */
public class Salary {
    static int count;

    static Comparator comparator = new Comparator() {
        @Override
        public int compare(Object o1, Object o2) {
            if(o1 instanceof Employee && o2 instanceof  Employee) {
                Employee employee = (Employee) o1;
                Employee employee1 = (Employee) o2;
                return employee.salary - employee1.salary;
            }
            else {
                Person person = (Person) o1;
                Person person1 = (Person) o2;
                return person.salary - person1.salary;
            }
        }
    };

    public static Comparator getComparator() {
        return comparator;
    }
}
