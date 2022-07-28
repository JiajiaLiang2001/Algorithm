public class LinkedList<E> {
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

    private Node dummyHead;
    private int size;

    public LinkedList() {
        dummyHead = new Node();
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
        Node prev = dummyHead;
        for (int i = 0; i < index; i++)
            prev = prev.next;
        prev.next = new Node(e, prev.next);
        size++;
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
        if (index < 0 || index > size)
            throw new IllegalArgumentException("Get failed. Illegal index.");
        Node cur = dummyHead.next;
        for (int i = 0; i < index; i++)
            cur = cur.next;
        return cur.e;
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
            throw new IllegalArgumentException("Set failed. Illegal index.");
        Node cur = dummyHead.next;
        for (int i = 0; i < index; i++)
            cur = cur.next;
        cur.e = e;
    }

    /**
     * Whether the specified element exists in the linked list
     *
     * @param e
     * @return
     */
    public boolean contains(E e) {
        Node cur = dummyHead.next;
        while (cur != null) {
            if (cur.e.equals(e))
                return true;
            cur = cur.next;
        }
        return false;
    }

    @Override
    public String toString() {
        StringBuilder res = new StringBuilder();
        Node cur = dummyHead.next;
        while (cur != null) {
            res.append(cur + "->");
            cur = cur.next;
        }
        res.append("NULL");
        return res.toString();
    }
}
