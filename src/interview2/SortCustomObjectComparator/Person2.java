package interview2.SortCustomObjectComparator;

import java.util.Objects;

public class Person2{


    private String name;
    private int age;

    public String getName() {
        return name;
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Person2)) return false;
        Person2 person = (Person2) o;
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

    public Person2(String name, int age) {
        this.name = name;
        this.age= age;
    }


}
