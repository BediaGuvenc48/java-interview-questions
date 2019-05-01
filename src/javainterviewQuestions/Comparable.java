package javainterviewQuestions;

import javainterviewQuestions.SortCustomObjectComparable.Person;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
//Once our object class implement Comparable interface they are implementing Compare to method
//you need to write your implemantation and give get a distance another.
public class Comparable<P> {

    public static void main(String[] args) {

        List<Person>allPersons= new ArrayList<>();
        allPersons.add(new Person("Bedia",92));
        allPersons.add(new Person("Bedia",48));
        allPersons.add(new Person("Murat",85));
        allPersons.add(new Person("Yasin",58));
        Collections.sort(allPersons);
//[Person{name='Bedia', age=48}, Person{name='Bedia', age=92}, Person{name='Murat', age=85}, Person{name='Yasin', age=58}]====>return this.age-o.age
        System.out.println(allPersons);
//[Person{name='Yasin', age=58}, Person{name='Murat', age=85}, Person{name='Bedia', age=92}, Person{name='Bedia', age=48}]=====> return o.age.compareTo(this.age)

    }


}
