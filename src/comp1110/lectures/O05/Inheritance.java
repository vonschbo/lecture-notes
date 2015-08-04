package comp1110.lectures.O05;

/**
 * Created by comp1110 on 8/4/15.
 */
public class Inheritance {
    public static void main(String[] args) {
        Human bob = new Human("Bob", Sex.MALE);
        Dog spot = new Dog("Spot", Sex.FEMALE);
        FruitBat fred = new FruitBat("Fred", Sex.MALE);
        Albotross alex = new Albotross("Alex", Sex.FEMALE);
        EasternBrownSnake steph = new EasternBrownSnake("Steph", Sex.FEMALE);
        GreatWhiteShark bruce = new GreatWhiteShark("Bruce", Sex.MALE);
        FunnelWebSpider charolette = new FunnelWebSpider("Charolette", Sex.FEMALE);
        Platypus pat = new Platypus("Pat", Sex.FEMALE);

        Animal[] animals = { bob, spot, fred, alex, steph, bruce, charolette, pat};

        Animal f = new GreatWhiteShark("Jane", Sex.FEMALE);

        Animal x= new Platypus("P", Sex.FEMALE);
        ((Platypus) x).quack();

        System.out.println("Here are the animals we know about:");
        for (Animal a : animals) {
            System.out.println(a);
        }

        System.out.println("These animals are poisonous: ");
        for(Animal a: animals) {
            if (a instanceof Poisonous) {
                Poisonous p = (Poisonous) a;
                if (p.isLethalToAdultHumans()) {
                    System.out.println(p+" can kill you");
                } else {
                    System.out.println(p+" will hurt");
                }
            }
        }

    }
}
