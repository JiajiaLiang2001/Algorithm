import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class BST<E extends Comparable<E>> {
    private class Node {
        public E e;
        public Node left, right;
        public int sz;

        public Node(E e) {
            this.e = e;
            left = null;
            right = null;
            sz = 1;
        }

        @Override
        public String toString() {
            return e.toString();
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
     * Get the size of the specified node in BST
     * @param node
     * @return
     */
    private int size(Node node) {
        return node == null ? 0 : node.sz;
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

    /**
     * Whether the specified element exists in BST
     *
     * @param e
     * @return
     */
    public boolean contains(E e) {
        return contains(root, e);
    }

    private boolean contains(Node node, E e) {
        if (node == null) return false;
        if (e.compareTo(node.e) == 0) return true;
        else if (e.compareTo(node.e) < 0) return contains(node.left, e);
        else return contains(node.right, e);
    }

    /**
     * Preorder traversal of BST
     */
    public void preOrder() {
        preOrder(root);
    }

    private void preOrder(Node node) {
        if (node == null)
            return;
        System.out.println(node);
        preOrder(node.left);
        preOrder(node.right);
    }

    /**
     * Preorder traversal of BST (non-recursive)
     */
    public void preOrderNR() {
        if (root == null)
            return;
        Stack<Node> stack = new Stack<>();
        stack.push(root);
        while (!stack.isEmpty()) {
            Node cur = stack.pop();
            System.out.println(cur);
            if (cur.right != null)
                stack.push(cur.right);
            if (cur.left != null)
                stack.push(cur.left);
        }
    }

    /**
     * Inorder traversal of BST
     */
    public void inOrder() {
        inOrder(root);
    }

    private void inOrder(Node node) {
        if (node == null)
            return;
        inOrder(node.left);
        System.out.println(node);
        inOrder(node.right);
    }

    /**
     * Inorder traversal of BST (non-recursive)
     */
    public void inOrderNR() {
        if (root == null)
            return;
        Stack<Node> stack = new Stack<>();
        stack.push(root);
        while (!stack.isEmpty()) {
            while (stack.peek().left != null)
                stack.push(stack.peek().left);
            while (!stack.isEmpty()) {
                Node cur = stack.pop();
                System.out.println(cur);
                if (cur.right != null) {
                    stack.push(cur.right);
                    break;
                }
            }
        }
    }

    /**
     * Postorder traversal of BST
     */
    public void postOrder() {
        postOrder(root);
    }

    private void postOrder(Node node) {
        if (node == null)
            return;

        postOrder(node.left);
        postOrder(node.right);
        System.out.println(node);
    }

    /**
     * Postorder traversal of BST (non-recursive)
     */
    public void postOrderNR() {
        if (root == null)
            return;
        Stack<Node> stack = new Stack<>();
        stack.push(root);
        Node temp = null;
        while (!stack.isEmpty()) {
            while (stack.peek().left != null)
                stack.push(stack.peek().left);
            while (!stack.isEmpty()) {
                Node cur = stack.peek();
                if (temp == cur.right || cur.right == null) {
                    System.out.println(cur);
                    temp = cur;
                    stack.pop();
                } else if (cur.right != null) {
                    stack.push(cur.right);
                    break;
                }
            }
        }
    }

    /**
     * Level order traversal of BST
     */
    public void levelOrder() {
        if (root == null) return;
        Queue<Node> queue = new LinkedList<>();
        queue.add(root);
        while (!queue.isEmpty()) {
            Node cur = queue.remove();
            System.out.println(cur);
            if (cur.left != null) queue.add(cur.left);
            if (cur.right != null) queue.add(cur.right);
        }
    }

    /**
     * Minimum element of BST
     *
     * @return
     */
    public E minimum() {
        if (size == 0)
            throw new IllegalArgumentException("BST is empty");
        Node minNode = minimum(root);
        return minNode.e;
    }

    private Node minimum(Node node) {
        if (node.left == null)
            return node;
        return minimum(node.left);
    }

    /**
     * Remove the minimum element of BST
     *
     * @return
     */
    public E removeMin() {
        E minimum = minimum();
        root = removeMin(root);
        return minimum;
    }

    private Node removeMin(Node node) {
        if (node.left == null) {
            Node rightNode = node.right;
            node.right = null;
            size--;
            return rightNode;
        }
        node.left = removeMin(node.left);
        return node;
    }

    /**
     * Maximum element of BST
     *
     * @return
     */
    public E maximum() {
        if (size == 0)
            throw new IllegalArgumentException("BST is empty");
        Node maxNode = maximum(root);
        return maxNode.e;
    }

    private Node maximum(Node node) {
        if (node.right == null) return node;
        return maximum(node.right);
    }

    /**
     * Remove the maximum element of BST
     *
     * @return
     */
    public E removeMax() {
        E maximum = maximum();
        root = removeMax(root);
        return maximum;
    }

    private Node removeMax(Node node) {
        if (node.right == null) {
            Node leftNode = node.left;
            node.right = null;
            size--;
            return leftNode;
        }
        node.right = removeMax(node.right);
        return node;
    }

    /**
     * Remove the specified element of the BST
     *
     * @param e
     */
    public void remove(E e) {
        root = remove(root, e);
    }

    private Node remove(Node node, E e) {
        if (node == null)
            return null;
        if (e.compareTo(node.e) < 0) {
            node.left = remove(node.left, e);
            return node;
        } else if (e.compareTo(node.e) > 0) {
            node.right = remove(node.right, e);
            return node;
        } else {   // e.compareTo(node.e) == 0
            if (node.left == null) {
                Node rightNode = node.right;
                node.right = null;
                size--;
                return rightNode;
            }
            if (node.right == null) {
                Node leftNode = node.left;
                node.left = null;
                size--;
                return leftNode;
            }
            Node successor = minimum(node.right);
            successor.right = removeMin(node.right);
            successor.left = node.left;
            node.left = node.right = null;
            return successor;
        }
    }

    /**
     * Floor: < e,maximum
     *
     * @param e
     * @return
     */
    public E floor(E e) {
        if (size == 0 || e.compareTo(minimum()) < 0)
            return null;
        Node floorNode = floor(root, e);
        return floorNode.e;
    }

    private Node floor(Node node, E e) {
        if (node == null)
            return null;
        if (e.compareTo(node.e) == 0)
            return node;
        if (e.compareTo(node.e) < 0)
            return floor(node.left, e);
        Node tempNode = floor(node.right, e);
        if (tempNode != null)
            return tempNode;
        return node;
    }

    /**
     * Ceil: > e，minimum
     *
     * @param e
     * @return
     */
    public E ceil(E e) {
        if (size == 0 || e.compareTo(maximum()) > 0)
            return null;
        Node ceilNode = ceil(root, e);
        return ceilNode.e;
    }

    private Node ceil(Node node, E e) {
        if (node == null)
            return null;
        if (e.compareTo(node.e) == 0)
            return node;
        if (e.compareTo(node.e) > 0)
            return ceil(node.right, e);
        Node tempNode = ceil(node.left, e);
        if (tempNode != null)
            return tempNode;
        return node;
    }

    /**
     * Rank
     * @param e
     * @return
     */
    public int rank(E e) {
        if (!contains(e)) return -1;
        return rank(root, e);
    }

    private int rank(Node node, E e) {
        if (e.compareTo(node.e) == 0)
            return size(node.left) + 1;
        if (e.compareTo(node.e) < 0)
            return rank(node.left, e);
        return size(node.left) + 1 + rank(node.right, e);
    }

    /**
     * Select
     * @param index
     * @return
     */
    public E select(int index) {
        if (index < 0 || index >= size())
            throw new IllegalArgumentException("Index is out of range.");
        return select(root, index);
    }

    private E select(Node node, int index) {
        if (index < size(node.left)) return select(node.left, index);
        if (index == size(node.left)) return node.e;
        return select(node.right, index - size(node.left) - 1);
    }

    @Override
    public String toString() {
        StringBuilder res = new StringBuilder();
        generateBSTString(root, 0, res);
        return res.toString();
    }

    private void generateBSTString(Node node, int depth, StringBuilder res) {
        if (node == null) {
            res.append(generateDepthString(depth) + "null\n");
            return;
        }
        res.append(generateDepthString(depth) + node.e + "\n");
        generateBSTString(node.left, depth + 1, res);
        generateBSTString(node.right, depth + 1, res);
    }

    private String generateDepthString(int depth) {
        StringBuilder res = new StringBuilder();
        for (int i = 0; i < depth; i++)
            res.append("--");
        return res.toString();
    }
}
