package comp1110.lectures.J08;

/**
 * Created by comp1110 on 8/4/15.
 */
public class LectureTheater {
    String name;
    Projector projector;

    public LectureTheater(String name, String projectorModel, boolean projectorHD) {
        this.name = name;
        this.projector = new Projector(projectorModel, projectorHD, this);
    }

    public String toString() {
        return "Romm: "+name+", has projector "+projector;
    }
}
