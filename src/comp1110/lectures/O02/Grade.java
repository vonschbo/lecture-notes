package comp1110.lectures.O02;

/**
 * Created by comp1110 on 7/31/15.
 */
public enum Grade {
    HD(80), D(70), C(60), P(50), N(0);

    int lower;

    Grade(int lower) {
        this.lower = lower;
    }

    public static Grade fromMark(double mark) {
        for (Grade g : Grade.values()) {
            if (mark >= g.lower)
                return g;
        }
        return N;
    }
}
