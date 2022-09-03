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
     *
     * @return
     */
    public int size() {
        return size;
    }

    /**
     * Check if BST is empty
     *
     * @return
     */
    public boolean isEmpty() {
        return size == 0;
    }

    /**
     * Add node to BST
     *
     * @param e
     */
    public void add(E e) {
        root = add(root, e);
    }

    private Node add(Node node, E e) {
        if (node == null) {
            size++;
            return new Node(e);
        }
        if (e.compareTo(node.e) < 0)
            node.left = add(node.left, e);
        else if (e.compareTo(node.e) > 0)
            node.right = add(node.right, e);
        return node;
    }
}
