package comp1110.lectures.J08;

/**
 * Created by comp1110 on 8/4/15.
 */
public class LectureTheaterStaticNested {


    static public class ProjectorStaticNested {
        private String model;
        private boolean hd;
        private LectureTheaterStaticNested room;

        ProjectorStaticNested(String model, boolean hd, LectureTheaterStaticNested room) {
            this.model = model;
            this.hd = hd;
            this.room = room;
        }

        @Override
        public String toString() {
            return "Model: "+model+", is HD?: "+hd+", in room: "+room.name;
        }
    }


    String name;
    ProjectorStaticNested projector;

    public LectureTheaterStaticNested(String name, String projectorModel, boolean projectorHD) {
        this.name = name;
        this.projector = new ProjectorStaticNested(projectorModel, projectorHD, this);
    }

    public String toString() {
        return "Romm: "+name+", has projector "+projector;
    }
}
