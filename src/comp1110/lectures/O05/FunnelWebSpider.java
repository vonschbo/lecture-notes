package comp1110.lectures.O05;

/**
 * Created by comp1110 on 8/4/15.
 */
public final class FunnelWebSpider extends Insect implements Poisonous {
    public FunnelWebSpider(String name, Sex sex) {
        super(name, sex);
    }

    @Override
    public boolean isLethalToAdultHumans() {
        return true;
    }
}
