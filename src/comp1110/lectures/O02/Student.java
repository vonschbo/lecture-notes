package comp1110.lectures.O02;

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
