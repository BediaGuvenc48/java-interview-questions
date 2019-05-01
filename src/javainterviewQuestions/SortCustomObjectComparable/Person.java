package javainterviewQuestions.SortCustomObjectComparable;

import java.util.Objects;

public class Person  implements java.lang.Comparable<Person> {


    private String name;
    private int age;

    public String getName() {
        return name;
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Person)) return false;
        Person person = (Person) o;
        return getAge() == person.getAge() &&
                Objects.equals(getName(), person.getName());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getName(), getAge());
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public Person(String name,int age) {
        this.name = name;
        this.age= age;
    }


    @Override
    public int compareTo(Person o) {

//        if (this.name.equals(o.name)){
//
//            return this.age-o.age;
//        }else{
//
//            return this.name.compareTo(o.name);
//        }



        if (this.name.equals(o.name)){

            return o.age-this.age;
        }else{

            return o.name.compareTo(this.name);
        }
    }




}
