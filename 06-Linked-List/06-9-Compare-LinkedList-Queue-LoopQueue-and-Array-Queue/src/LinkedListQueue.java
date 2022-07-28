public class LinkedListQueue<E> implements Queue<E> {
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

    private Node head, tail;

    private int size;

    public LinkedListQueue() {
        head = null;
        tail = null;
        size = 0;
    }

    /**
     * Get queue size
     *
     * @return
     */
    @Override
    public int getSize() {
        return size;
    }

    /**
     * Is the queue empty
     *
     * @return
     */
    @Override
    public boolean isEmpty() {
        return size == 0;
    }

    /**
     * Element enqueue
     *
     * @param e
     */
    @Override
    public void enqueue(E e) {
        if (tail == null) {
            tail = new Node(e);
            head = tail;
        } else {
            tail.next = new Node(e);
            tail = tail.next;
        }
        size++;
    }

    /**
     * Element dequeue
     *
     * @return
     */
    @Override
    public E dequeue() {
        if (isEmpty())
            throw new IllegalArgumentException("Cannot dequeue from an empty queue.");
        Node retNode = head;
        if (head == tail) {// Other judgment conditions:head.next == null,size == 1
            // Contains only one element
            head = null;
            tail = null;
        } else {
            // Contains more than one element
            head = head.next;
            retNode.next = null;
        }
        size--;
        return retNode.e;
    }

    /**
     * Get the first element of the queue
     *
     * @return
     */
    @Override
    public E getFront() {
        if (isEmpty())
            throw new IllegalArgumentException("Queue is empty.");
        return head.e;
    }

    @Override
    public String toString() {
        StringBuilder res = new StringBuilder();
        res.append("Queue: front ");
        Node cur = head;
        while (cur != null) {
            res.append(cur + "->");
            cur = cur.next;
        }
        res.append("NULL tail");
        return res.toString();
    }
}
