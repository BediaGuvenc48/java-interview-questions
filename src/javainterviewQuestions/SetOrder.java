package javainterviewQuestions;

import javainterviewQuestions.SortCustomObjectComparable.Person;

import java.util.*;

public class SetOrder {
    public static void main(String[] args) {


       Set<Person> list= new HashSet<>();//====> you are overriding hashcode and equality
//List<Person> list= new ArrayList<>();

        list.add(new Person("Bedia",92));
        list.add(new Person("Bedia",92));

        list.add(new Person("Murat",88));

        list.add(new Person("Busra", 96));

        System.out.println(list);

    }
}
