package interview2.SortCustomObjectComparator;

import interview2.SortCustomObjectComparator.IDComparator;
import interview2.SortCustomObjectComparator.NameComparator;
import interview2.SortCustomObjectComparator.Person2;

import java.util.*;

public class ComparatorSort {

    public static void main(String[] args) {

        List<Person2> allPersons= new ArrayList<>();

        Set<Person2>allPersonsTree= new TreeSet<>(allPersons);
        allPersons.add(new Person2("Bedia",92));
        allPersons.add(new Person2("Bedia",48));
        allPersons.add(new Person2("Murat",85));
        allPersons.add(new Person2("Yasin",58));

        Comparator<Person2>id= new IDComparator();
        Comparator<Person2>name= new NameComparator();
        Comparator<Person2> both= id.thenComparing(name);
////and add your compare logic inside
////sort your list of Students

      //  Collections.sort(allPersons,both);




        System.out.println(allPersonsTree);
    }
}
