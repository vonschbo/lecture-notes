package comp1110.lectures.J13;

import comp1110.lectures.J13.Person;
import comp1110.lectures.O02.Sex;

/**
 * Created by comp1110 on 7/31/15.
 */
public class Student extends Person {
    private String uid;
    public Student(String name, int age, Sex sex, String uid) {
        super(name, age, sex);
        this.uid = uid;
    }

    public String getUid() { return uid; }

    @Override
    public String toString() {
        return super.toString() + ", has uid: "+uid;
    }
}
