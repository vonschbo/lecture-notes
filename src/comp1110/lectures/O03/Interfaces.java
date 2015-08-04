package comp1110.lectures.O03;

/**
 * Created by comp1110 on 8/4/15.
 */
public class Interfaces {
    public static void main(String[] args) {
        Poisonous nastyThing = new Cyanide();
        Dog fido = new Dog();
        FunnelWebSpider charlotte = new FunnelWebSpider();

        Object[] things = { nastyThing, fido, charlotte };

        for (Object t: things) {
            if (t instanceof Poisonous) {
                System.out.println(((Poisonous)t).isLethalToAdultHumans());
            }
        }
    }
}
