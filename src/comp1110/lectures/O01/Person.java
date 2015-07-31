package comp1110.lectures.O01;

/**
 * Created by comp1110 on 7/31/15.
 */
public class Person {
    private String name;
    private int age;

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    @Override
    public String toString() {
        return name + ", aged "+ age;
    }
}
