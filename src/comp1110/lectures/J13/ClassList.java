package comp1110.lectures.J13;

import comp1110.lectures.O02.COMP1110Student;
import comp1110.lectures.O02.Sex;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * Created by comp1110 on 8/11/15.
 */
public class ClassList {
    COMP1110Student stuarray[] = {
            new COMP1110Student("Mary", 20, Sex.FEMALE, "u1234567", 90, 10, 9, 4, 23),
            new COMP1110Student("Bob", 19, Sex.MALE, "u2345658", 50, 7, 9, 4, 23),
            new COMP1110Student("Fred", 21, Sex.MALE, "u3456789", 70, 2, 9, 4, 23),
            new COMP1110Student("Sarah", 23, Sex.FEMALE, "u4567890", 80, 4, 9, 4, 23),
    };

    List<COMP1110Student> students = new ArrayList<COMP1110Student>(Arrays.asList(stuarray));


    //  new COMP1110Student("Ting", 25, Sex.FEMALE, "u4567891", 60, 8, 9, 4, 22));
}
