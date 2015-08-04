package comp1110.lectures.O04;

/**
 * Created by comp1110 on 8/4/15.
 */
public class FunnelWebSpider extends Insect implements Poisonous {
    public FunnelWebSpider(String name, Sex sex) {
        super(name, sex);
    }

    @Override
    public boolean isLethalToAdultHumans() {
        return true;
    }
}
