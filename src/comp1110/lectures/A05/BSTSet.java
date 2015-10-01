package comp1110.lectures.A05;

/**
 * Created by comp1110 on 9/29/15.
 */
public class BSTSet<T> implements comp1110.lectures.A04.Set<T> {
    BSTree tree;
    int elements;

    class BSTree {
        BSTree left, right;
        T element;

        boolean add(T element) {
            if (this.element == null) {
                this.element = element;
                return true;
            } else if (element.equals(this.element)) {
                return false;
            } else if (element.hashCode() < this.element.hashCode()) { // add to left
                if (left == null)
                    left = new BSTree();
                return left.add(element);
            } else {
                if (right == null)
                    right = new BSTree();
                return right.add(element);
            }
        }

        void add(BSTree tree) {
            if (tree != null && this.element != null) {
                add(tree.element);
                add(tree.left);
                add(tree.right);
            }
        }


        BSTree find(T element) {
            if (this.element == null || element == null) {
                return null;
            } else if (this.element.equals(element)) {
                return this;
            } else if (element.hashCode() < this.element.hashCode()) {
                if (left == null)
                    return null;
                else
                    return left.find(element);
            } else {
                if (right == null)
                    return null;
                else
                    return right.find(element);
            }
        }


        public String toString() {
            if (element == null)
                return "";
            else {
                return ((left == null || left.element == null) ? "" : (left + ", ")) + element + ((right == null || right.element == null) ? "" : (", " + right));
            }
        }
    }

    @Override
    public void add(T element) {
        if (tree == null) {
            tree = new BSTree();
        }
        if (tree.add(element))
            elements++;

    }

    @Override
    public void remove(T element) {
        BSTree root = tree.find(element);
        if (root != null) {
            root.element = null;
            BSTree l = root.left;
            root.left = null;
            BSTree r = root.right;
            root.right = null;
            tree.add(l);
            tree.add(r);
            elements--;
        }

    }

    @Override
    public boolean contains(T element) {
        if (tree == null)
            return false;
        else
            return tree.find(element) != null;
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
