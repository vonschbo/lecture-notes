package comp1110.lectures.A06;

import java.util.LinkedList;

/**
 * Created by comp1110 on 10/2/15.
 */
public class HashMap<K, V> implements Map<K, V> {

    final static private int DEFAULT_SIZE = 2;
    Object[] table;
    int entries = 0;

    public HashMap() {
        table = new Object[DEFAULT_SIZE];
    }

    private int hash(K key) {
        return Math.abs(key.hashCode()) % table.length;
    }

    /**
     * Search linked list for kv pair that contains the key
     * @param list  The linked list
     * @param key The key we're looking for
     * @return The KV pair that holds our key, or null if none found
     */
    private KVPair<K,V> find (LinkedList<KVPair<K, V>> list, K key) {
        for (KVPair<K,V> kv : list) {
            if (kv.key.equals(key))
                return kv;
        }
        return null;
    }

    @Override
    public void add(K key, V value) {
        int bkt = hash(key);
        if (table[bkt] == null)
            table[bkt] = new LinkedList<>();
        LinkedList<KVPair<K, V>> ll = (LinkedList<KVPair<K, V>>) table[bkt];
        KVPair<K,V> kv = find(ll, key);
        if (kv == null) {
            ll.add(new KVPair<K, V>(key, value));
            entries++;
        } else
            kv.value = value;
    }

    @Override
    public void remove(K key) {
        int bkt = hash(key);
        LinkedList<KVPair<K,V>> ll = (LinkedList<KVPair<K,V>>) table[bkt];
        if (ll != null) {
            KVPair<K, V> kv = find((LinkedList<KVPair<K, V>>) table[bkt], key);
            if (kv != null) {
                ll.remove(kv);
                entries--;
            }
        }

    }

    @Override
    public V get(K key) {
        int bkt = hash(key);
        if (table[bkt] == null)
            return null;
        else {
            KVPair<K,V> kv = find((LinkedList<KVPair<K,V>>) table[bkt], key);
            if (kv == null) return null;
            else return kv.value;
        }
    }

    @Override
    public int size() {
        return entries;
    }

    @Override
    public String toString() {
        String rtn = "";
        for (int i = 0; i < table.length; i++) {
            if (table[i] != null) {
                LinkedList<KVPair<K, V>> ll = (LinkedList<KVPair<K,V>>) table[i];
                for (KVPair<K, V> kv : ll) {
                    rtn += (rtn.equals("") ? "" : ", ")+kv.toString();
                }
            }
        }
        return rtn;
    }
}
