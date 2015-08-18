package comp1110.lectures.J13;

import comp1110.lectures.O02.Sex;

/**
 * Created by comp1110 on 7/31/15.
 */
public class Person implements Comparable<Person> {
    private String name;
    private int age;
    private Sex sex;

    public Person(String name, int age, Sex sex) {
        this.name = name;
        this.age = age;
        this.sex = sex;
    }

    public int getAge() {
        return age;
    }
    @Override
    public String toString() {
        return name + ", who is "+sex+", aged "+ age;
    }

    @Override
    public int compareTo(Person other) {
        return name.compareTo(other.name);
    }
}
