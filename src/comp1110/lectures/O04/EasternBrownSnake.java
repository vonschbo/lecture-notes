package comp1110.lectures.O04;


/**
 * Created by comp1110 on 8/4/15.
 */
public class EasternBrownSnake extends Reptile implements Poisonous {
    public EasternBrownSnake(String name, Sex sex) {
        super(name, sex);
    }

    @Override
    public boolean isLethalToAdultHumans() {
        return true;
    }
}
