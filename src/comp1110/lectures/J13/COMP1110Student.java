package comp1110.lectures.J13;

import comp1110.lectures.O02.Grade;
import comp1110.lectures.O02.Sex;

/**
 * Created by comp1110 on 7/31/15.
 */
public class COMP1110Student extends Student {
    private int exam;
    private int lab1;
    private int lab2;
    private int ass1;
    private int ass2;

    public COMP1110Student(String name, int age, Sex sex, String uid, int exam, int lab1, int lab2, int ass1, int ass2) {
        super(name, age, sex, uid);
        this.exam = exam;
        this.lab1 = lab1;
        this.lab2 = lab2;
        this.ass1 = ass1;
        this.ass2 = ass2;
    }

    public int mark() {
        return (exam/2 + Math.max(lab1, exam/10)+ Math.max(lab2, exam/10) + Math.max(ass1, exam/20) + ass2);
    }

    public String toString() {
        return super.toString() + ", with a comp1110 mark of " + mark() + ", which is a grade of "+Grade.fromMark(mark());
    }
}
