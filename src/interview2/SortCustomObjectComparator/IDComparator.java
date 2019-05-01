package interview2.SortCustomObjectComparator;

import java.util.Comparator;

public class IDComparator  implements Comparator<Person2> {


    @Override
    public int compare(Person2 o1, Person2 o2) {

        return o1.getAge()-o2.getAge();
    }
}
