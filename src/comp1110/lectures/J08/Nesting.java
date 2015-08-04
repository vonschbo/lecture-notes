package comp1110.lectures.J08;

/**
 * Created by comp1110 on 8/4/15.
 */
public class Nesting {
    public static void main(String[] args) {
        LectureTheater a = new LectureTheater("ChemT1", "Hitachi", true);
        LectureTheaterStaticNested b = new LectureTheaterStaticNested("ChemT1", "Hitachi", true);
        LectureTheaterInner c = new LectureTheaterInner("ChemT1", "Hitachi", true);

        System.out.println("Two classes: "+a);
        System.out.println("Two classes nested statically: "+b);
        System.out.println("Two classes inner: "+c);
    }
}
