package comp1110.lectures.A01;

import comp1110.lectures.A01.List;

/**
 * Created by comp1110 on 9/1/15.
 */
public class Lists {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        list.add("The");
        list.add("quick");
        list.add("brown");
        list.add("fox");
        list.add("jumped");
        list.add("over");
        list.add("the");
        list.add("lazy");
        list.add("dog");

        int size = list.size();
        for (int i = 0; i < size; i++) {
            System.out.println(list);
            list.reverse();
            System.out.println(list);
            list.remove(list.size()/2);
        }
    }
}
