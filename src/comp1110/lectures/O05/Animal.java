package comp1110.lectures.O05;

/**
 * Created by comp1110 on 8/4/15.
 */
public abstract class Animal {
    String name;
    Sex sex;

    public Animal(String name, Sex sex) {
        this.name = name;
        this.sex = sex;
    }

    @Override
    public String toString() {
        return name + ", "+sex+" "+getClass().getSimpleName();
    }
}
