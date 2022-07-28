public class ArrayQueue<E> implements Queue<E> {
    private Array<E> array;

    public ArrayQueue(int capacity) {
        array = new Array<>(capacity);
    }

    public ArrayQueue() {
        array = new Array<>();
    }

    public int getCapacity() {
        return array.getCapacity();
    }

    /**
     * Get queue size
     *
     * @return
     */
    @Override
    public int getSize() {
        return array.getSize();
    }

    /**
     * Is the queue empty
     *
     * @return
     */
    @Override
    public boolean isEmpty() {
        return array.isEmpty();
    }

    /**
     * Element enqueue
     *
     * @param e
     */
    @Override
    public void enqueue(E e) {
        array.addLast(e);
    }

    /**
     * Element dequeue
     *
     * @return
     */
    @Override
    public E dequeue() {
        return array.removeFirst();
    }

    /**
     * Get the first element of the queue
     *
     * @return
     */
    @Override
    public E getFront() {
        return array.getFirst();
    }

    @Override
    public String toString() {
        StringBuilder res = new StringBuilder();
        res.append("Queue: ");
        res.append("front [");
        for (int i = 0; i < array.getSize(); i++) {
            res.append(array.get(i));
            if (i != array.getSize() - 1)
                res.append(", ");
        }
        res.append("] tail");
        return res.toString();
    }
}
