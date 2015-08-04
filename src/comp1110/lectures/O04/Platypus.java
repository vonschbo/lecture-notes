package comp1110.lectures.O04;

/**
 * Created by comp1110 on 8/4/15.
 */
public class Platypus extends Monotrene implements Poisonous {
    public Platypus(String name, Sex sex) {
        super(name, sex);
    }

    @Override
    public boolean isLethalToAdultHumans() {
        return false;
    }
}
