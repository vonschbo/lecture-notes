package comp1110.lectures.J08;

/**
 * Created by comp1110 on 8/4/15.
 */
public class LectureTheaterInner {
    public class ProjectorInner {
        private String model;
        private boolean hd;

        ProjectorInner(String model, boolean hd) {
            this.model = model;
            this.hd = hd;
        }

        @Override
        public String toString() {
            return "Model: "+model+", is HD?: "+hd+", in room: "+name;
        }
    }

    String name;
    ProjectorInner projector;

    public LectureTheaterInner(String name, String projectorModel, boolean projectorHD) {
        this.name = name;
        this.projector = new ProjectorInner(projectorModel, projectorHD);
    }

    public String toString() {
        return "Room: "+name+", has projector "+projector;
    }
}
