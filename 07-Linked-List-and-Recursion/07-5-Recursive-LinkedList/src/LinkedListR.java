import javafx.util.Pair;

public class LinkedListR<E> {
    private class Node {
        public E e;
        public Node next;

        public Node(E e, Node next) {
            this.e = e;
            this.next = next;
        }

        public Node(E e) {
            this(e, null);
        }

        public Node() {
            this(null, null);
        }

        @Override
        public String toString() {
            return e.toString();
        }
    }

    private Node head;

    private int size;

    public LinkedListR() {
        head = null;
        size = 0;
    }

    /**
     * Get the size of the linked list
     *
     * @return
     */
    public int getSize() {
        return size;
    }

    /**
     * Check if the linked list is empty
     *
     * @return
     */
    public boolean isEmpty() {
        return size == 0;
    }

    /**
     * Add node to linked list
     *
     * @param index
     * @param e
     */
    public void add(int index, E e) {
        if (index < 0 || index > size)
            throw new IllegalArgumentException("Add failed. Illegal index.");
        head = add(head, index, e);
        size++;
    }

    private Node add(Node node, int index, E e) {
        if (index == 0)
            return new Node(e, node);
        node.next = add(node.next, index - 1, e);
        return node;
    }

    /**
     * Add the first element of the linked list
     *
     * @param e
     */
    public void addFirst(E e) {
        add(0, e);
    }

    /**
     * Add the last element of the linked list
     *
     * @param e
     */
    public void addLast(E e) {
        add(size, e);
    }

    /**
     * Get an element in a linked list
     *
     * @param index
     * @return
     */
    public E get(int index) {
        if (index < 0 || index >= size)
            throw new IllegalArgumentException("Get failed. Illegal index.");
        return get(head, index);
    }

    private E get(Node node, int index) {
        if (index == 0) return node.e;// 1
        return get(node.next, index - 1);// 2
    }

    /**
     * Get the first element in the linked list
     *
     * @return
     */
    public E getFirst() {
        return get(0);
    }

    /**
     * Get the last element in the linked list
     *
     * @return
     */
    public E getLast() {
        return get(size - 1);
    }

    /**
     * Modify an element in a linked list
     *
     * @param index
     * @param e
     */
    public void set(int index, E e) {
        if (index < 0 || index >= size)
            throw new IllegalArgumentException("Update failed. Illegal index.");
        set(head, index, e);
    }

    private void set(Node node, int index, E e) {
        if (index == 0) {
            node.e = e;
            return;
        }
        set(node.next, index - 1, e);
    }

    /**
     * Whether the specified element exists in the linked list
     *
     * @param e
     * @return
     */
    public boolean contains(E e) {
        return contains(head, e);
    }

    private boolean contains(Node node, E e) {
        if (node == null)
            return false;
        if (node.e.equals(e))
            return true;
        return contains(node.next, e);
    }

    /**
     * Delete node to linked list
     *
     * @param index
     * @return
     */
    public E remove(int index) {
        if (index < 0 || index >= size)
            throw new IllegalArgumentException("Remove failed. Index is illegal.");
        Pair<Node, E> res = remove(head, index);
        size--;
        head = res.getKey();
        return res.getValue();
    }

    private Pair<Node, E> remove(Node node, int index) {
        if (index == 0)
            return new Pair<>(node.next, node.e);
        Pair<Node, E> res = remove(node.next, index - 1);
        node.next = res.getKey();
        return new Pair<>(node, res.getValue());
    }

    /**
     * Delete the first element of the linked list
     *
     * @return
     */
    public E removeFirst() {
        return remove(0);
    }

    /**
     * Delete the last element of the linked list
     *
     * @return
     */
    public E removeLast() {
        return remove(size - 1);
    }

    public void removeElement(E e) {
        head = removeElement(head, e);
    }

    /**
     * Delete the specified node in the linked list
     *
     * @param node
     * @param e
     * @return
     */
    private Node removeElement(Node node, E e) {
        if (node == null)
            return null;
        node.next = removeElement(node.next, e);
        if (node.e.equals(e)) {
            size--;
            return node.next;
        }
        return node;
    }

    @Override
    public String toString() {
        StringBuilder res = new StringBuilder();

        Node cur = head;
        while (cur != null) {
            res.append(cur + "->");
            cur = cur.next;
        }
        res.append("NULL");

        return res.toString();
    }
}
