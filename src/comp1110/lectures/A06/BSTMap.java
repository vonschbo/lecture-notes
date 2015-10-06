package comp1110.lectures.A06;

/**
 * Created by comp1110 on 10/6/15.
 */
public class BSTMap<K,V> implements Map<K, V> {
    BSTree tree;
    int elements;

    class BSTree {
        BSTree left, right;
        KVPair<K,V> kv;

        boolean add(KVPair<K,V> kv) {
            if (this.kv == null) {
                this.kv = kv;
                return true;
            } else {
                assert(kv != null);
                assert(kv.key != null);
                if (kv.key.equals(this.kv.key)) {
                    return false;
                } else if (kv.key.hashCode() < this.kv.key.hashCode()) { // add to left
                    if (left == null)
                        left = new BSTree();
                    return left.add(kv);
                } else {
                    if (right == null)
                        right = new BSTree();
                    return right.add(kv);
                }
            }
        }

        void add(BSTree tree) {
            if (tree != null && this.kv != null) {
                if (tree.kv != null) add(tree.kv);
                add(tree.left);
                add(tree.right);
            }
        }


        BSTree find(K key) {
            if (this.kv == null || key == null) {
                return null;
            } else if (this.kv.key.equals(key)) {
                return this;
            } else if (key.hashCode() < this.kv.key.hashCode()) {
                if (left == null)
                    return null;
                else
                    return left.find(key);
            } else {
                if (right == null)
                    return null;
                else
                    return right.find(key);
            }
        }


        public String toString() {
            if (kv == null)
                return "";
            else {
                return ((left == null || left.kv == null) ? "" : (left + ", ")) + kv + ((right == null || right.kv == null) ? "" : (", " + right));
            }
        }
    }



    @Override
    public void add(K key, V value) {
        if (tree == null) {
            tree = new BSTree();
        }
        BSTree t = tree.find(key);
        if (t == null) {
            tree.add(new KVPair<K,V>(key, value));
            elements++;
        } else {
            t.kv.value = value;
        }
    }

    @Override
    public void remove(K key) {
        if (tree == null)
            return;
        BSTree t = tree.find(key);
        if (t != null) {
            t.kv = null;
            BSTree l = t.left;
            t.left = null;
            BSTree r = t.right;
            t.right = null;
            tree.add(l);
            tree.add(r);
            elements--;
        }

    }

    @Override
    public V get(K key) {
        if (tree == null)
            return null;
        BSTree t = tree.find(key);
        if (t == null)
            return null;
        else
            return t.kv.value;
    }

    @Override
    public int size() {
        return elements;
    }

    @Override
    public String toString() {
        return (tree == null) ? "" : tree.toString();
    }
}
