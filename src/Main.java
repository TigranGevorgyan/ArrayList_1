import java.util.*;

/**
 * Created by Taron on 03/15/17.
 */
public class Main {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter number. 1 or 2 or 3 or 4.");
        int numberId = scanner.nextInt();
        ArrayList<Person> arrayList = new ArrayList<>();
        boolean answer = true;
        arrayList.add(new Person("Tigran","Gevorgyan",22));
        arrayList.add(new Person("Aurgen","Sargsyan",61));
        arrayList.add(new Person("Toros","Rosilis",16));
        arrayList.add(new Person("Mnacakan","Abajyan",20));
        arrayList.add(new Person("Hakob","Minoyan",5));
        arrayList.add(new Employee("Anna","Galstyan",36,200000));
        arrayList.add(new Employee("Anna","Galstyan",36,200100));
        arrayList.add(new Employee("Lilit","Grigoryan",56,120000));
        arrayList.add(new Employee("Narine","Poxosyan",25,80000));
        arrayList.add(new Employee("Gvenik","Petrosyan",55,250000));
        arrayList.add(new Employee("Nina","Mkrtchyan",29,100000));
        switch (numberId){
            case 1:
                System.out.println("Sorting by first name.");
                Collections.sort(arrayList,FirstName.getComparator());
                break;
            case 2:
                System.out.println("Sorting by last name.");
                Collections.sort(arrayList,LastName.getComparator());
                break;
            case 3:
                System.out.println("Sorting by age.");
                Collections.sort(arrayList,Age.getComparator());
                break;
            case 4:
                System.out.println("Sorting by salaries.");
                Collections.sort(arrayList,Collections.reverseOrder(Salary.getComparator()));
                break;
            default:
                answer = false;
                System.out.println("Fault number.");
        }
        if(answer) {
            for (Person p : arrayList)
                System.out.println(p);
        }










    }
}
