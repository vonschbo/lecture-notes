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
    COMP1110Student sarray[] = {
            new COMP1110Student("Mary", 20, Sex.FEMALE, "u12344567", 90, 10, 9, 4, 23),
            new COMP1110Student("Bob", 19, Sex.MALE, "u23445678", 90, 10, 9, 4, 23),
    };

    List<COMP1110Student> students = new ArrayList<COMP1110Student>(Arrays.asList(sarray));

}
