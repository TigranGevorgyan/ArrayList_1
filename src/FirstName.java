import java.util.Comparator;

/**
 * Created by Taron on 03/30/17.
 */
public class FirstName {

    private static Comparator comparator = new Comparator() {
        @Override
        public int compare(Object o1, Object o2) {
            Person person = (Person) o1;
            Person person1 = (Person) o2;
            return person.firstName.compareTo(person1.firstName);
        }
    };

    public static Comparator getComparator() {
        return comparator;
    }


}
