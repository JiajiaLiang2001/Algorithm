public class BST<E extends Comparable<E>> {
    private class Node {
        public E e;
        public Node left, right;

        public Node(E e) {
            this.e = e;
            left = null;
            right = null;
        }
    }

    private Node root;
    private int size;

    public BST() {
        root = null;
        size = 0;
    }

    /**
     * Get the size of BST
     * @return
     */
    public int size() {
        return size;
    }

    /**
     * Check if BST is empty
     * @return
     */
    public boolean isEmpty() {
        return size == 0;
    }

    /**
     * Add node to BST
     * @param e
     */
    public void add(E e) {
        if (root == null) {
            root = new Node(e);
            size++;
        } else
            add(root, e);
    }

    private void add(Node node, E e) {
        if (e.equals(node.e))
            return;
        else if (e.compareTo(node.e) < 0 && node.left == null) {
            node.left = new Node(e);
            size++;
            return;
        } else if (e.compareTo(node.e) > 0 && node.right == null) {
            node.right = new Node(e);
            size++;
            return;
        }
        if (e.compareTo(node.e) < 0)
            add(node.left, e);
        else // e.compareTo(node.e) > 0
            add(node.right, e);
    }
}
