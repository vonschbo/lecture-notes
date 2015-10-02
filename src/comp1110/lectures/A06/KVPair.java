package comp1110.lectures.A06;

/**
 * Created by comp1110 on 10/2/15.
 */
public class KVPair<K, V> {
    K key;
    V value;
    KVPair(K key, V value) {
        this.key = key;
        this.value = value;
    }

    @Override
    public String toString() {
        return "("+key+", "+value+")";
    }
}
