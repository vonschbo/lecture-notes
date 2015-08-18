package comp1110.lectures.J14;

import comp1110.lectures.J13.COMP1110Student;
import comp1110.lectures.O02.Grade;
import comp1110.lectures.O02.Sex;

import java.util.*;

/**
 * Created by comp1110 on 8/11/15.
 */
public class ClassList {

    public static void main(String[] args) {

        COMP1110Student stuarray[] = {
                new COMP1110Student("Mary", 20, Sex.FEMALE, "u1234567", 90, 10, 9, 4, 23),
                new COMP1110Student("Bob", 19, Sex.MALE, "u2345658", 50, 7, 9, 4, 23),
                new COMP1110Student("Fred", 21, Sex.MALE, "u3456789", 70, 2, 9, 4, 23),
                new COMP1110Student("Sarah", 23, Sex.FEMALE, "u4567890", 80, 4, 9, 4, 23),
        };

        List<COMP1110Student> students = new ArrayList<>(Arrays.asList(stuarray));

        Map<String, COMP1110Student> uidmap = new HashMap<String, COMP1110Student>();
        for (COMP1110Student student : students) {
            uidmap.put(student.getUid(), student);
        }

        /* do a query */
        String key = "u2345658";
        COMP1110Student value = uidmap.get(key);
        System.out.println("Found: "+value);

        /* print all students in map */
        System.out.println("All students in map:");
        for (COMP1110Student student : uidmap.values()) {
            System.out.println(student);
        }

        uidmap.put("u4567890", new COMP1110Student("Ting", 25, Sex.FEMALE, "u4567891", 60, 8, 9, 4, 22));
         /* print all students in map */
        System.out.println("All students in map:");
        for (COMP1110Student student : uidmap.values()) {
            System.out.println(student);
        }

        uidmap.remove("u4567890");
                 /* print all students in map */
        System.out.println("All students in map:");
        for (COMP1110Student student : uidmap.values()) {
            System.out.println(student);
        }
        uidmap.put("u4567890", new COMP1110Student("Sarah", 23, Sex.FEMALE, "u4567890", 80, 4, 9, 4, 23));
        uidmap.put("u4567891", new COMP1110Student("Ting", 25, Sex.FEMALE, "u4567891", 60, 8, 9, 4, 22));
        //
        /* print all students in map */
        System.out.println("All students in map:");
        for (COMP1110Student student : uidmap.values()) {
            System.out.println(student);
        }

        students = new ArrayList<>(uidmap.values());
        /* print all students in list */
        System.out.println("All students in list:");
        for (COMP1110Student student : students) {
            System.out.println(student);
        }

        /* print all students in list in their natural order */
        System.out.println("All students in list in natural order: ");
        Collections.sort(students);
        students.forEach((student) -> System.out.println(student));

        /* print all students in list according to their mark ordering */
        System.out.println("All students in list in mark order: ");
        Collections.sort(students, (COMP1110Student s1, COMP1110Student s2) -> {return s1.mark() - s2.mark(); });
        students.forEach((student) -> System.out.println(student));

        /* print all students in list according to their age ordering */
        System.out.println("All students in list in age order: ");
        Collections.sort(students, (COMP1110Student s1, COMP1110Student s2) -> {return s1.getAge() - s2.getAge(); });
        students.forEach((student) -> System.out.println(student));

        /* print all students in list according to their grade ordering */
        System.out.println("All students in list in grade order: ");
        Collections.sort(students, (COMP1110Student s1, COMP1110Student s2) -> {return Grade.fromMark(s1.mark()).ordinal() - Grade.fromMark(s2.mark()).ordinal(); });
        students.forEach((student) -> System.out.println(student));

    }
}
