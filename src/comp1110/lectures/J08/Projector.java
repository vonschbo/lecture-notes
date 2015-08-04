package comp1110.lectures.J08;

/**
 * Created by comp1110 on 8/4/15.
 */
public class Projector {
    private String model;
    private boolean hd;
    private LectureTheater room;

    Projector(String model, boolean hd, LectureTheater room) {
        this.model = model;
        this.hd = hd;
        this.room = room;
    }

    @Override
    public String toString() {
        return "Model: "+model+", is HD?: "+hd+", in room: "+room.name;
    }
}
