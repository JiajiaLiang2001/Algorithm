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

    private Node head;

    private int size;

    public LinkedList() {
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
        if (index == 0) {
            head = new Node(e, head);
        } else {
            Node prev = head;
            for (int i = 0; i < index - 1; i++) {
                prev = prev.next;
            }
            prev.next = new Node(e, prev.next);
        }
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
}
