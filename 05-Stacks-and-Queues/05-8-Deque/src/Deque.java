public class Deque<E> {
    private E[] data;
    private int front, tail;
    private int size;

    public Deque(int capacity) {
        data = (E[]) new Object[capacity];
        front = 0;
        tail = 0;
        size = 0;
    }

    public Deque() {
        this(10);
    }

    public int getCapacity() {
        return data.length;
    }

    /**
     * Get queue size
     *
     * @return
     */
    public int getSize() {
        return size;
    }

    /**
     * Is the queue empty
     *
     * @return
     */
    public boolean isEmpty() {
        return size == 0;
    }

    /**
     * Add an element at the end of the queue
     *
     * @param e
     */
    public void addLast(E e) {
        if (size == getCapacity()) resize(2 * getCapacity());
        data[tail] = e;
        tail = (tail + 1) % data.length;
        size++;
    }

    /**
     * Add an element at the head of the queue
     *
     * @param e
     */
    public void addFirst(E e) {
        if (size == getCapacity()) resize(2 * getCapacity());
        front = front == 0 ? data.length - 1 : front - 1;
        data[front] = e;
        size++;
    }

    /**
     * Delete the element at the end of the queue
     *
     * @return
     */
    public E removeLast() {
        if (isEmpty())
            throw new IllegalArgumentException("Cannot dequeue from an empty queue.");
        tail = tail == 0 ? data.length - 1 : tail - 1;
        E ret = data[tail];
        data[tail] = null;
        size--;
        if (getSize() == getCapacity() / 4 && getCapacity() / 2 != 0)
            resize(getCapacity() / 2);
        return ret;
    }

    /**
     * Delete element at the head of the queue
     *
     * @return
     */
    public E removeFirst() {
        if (isEmpty())
            throw new IllegalArgumentException("Cannot dequeue from an empty queue.");
        E ret = data[front];
        data[front] = null;
        front = (front + 1) % data.length;
        size--;
        if (getSize() == getCapacity() / 4 && getCapacity() / 2 != 0)
            resize(getCapacity() / 2);
        return ret;
    }

    /**
     * Get the element at the head of the queue
     *
     * @return
     */
    public E getFront() {
        if (isEmpty())
            throw new IllegalArgumentException("Queue is empty.");
        return data[front];
    }

    /**
     * Get the element at the end of the queue
     *
     * @return
     */
    public E getLast() {
        if (isEmpty())
            throw new IllegalArgumentException("Queue is empty.");
        int index = tail == 0 ? data.length - 1 : tail - 1;
        return data[index];
    }

    private void resize(int newCapacity) {
        E[] newData = (E[]) new Object[newCapacity];
        for (int i = 0; i < size; i++)
            newData[i] = data[(i + front) % data.length];
        data = newData;
        front = 0;
        tail = size;
    }

    @Override
    public String toString() {
        StringBuilder res = new StringBuilder();
        res.append(String.format("Queue: size = %d , capacity = %d\n", getSize(), getCapacity()));
        res.append("front [");
        for (int i = 0; i < size; i++) {
            res.append(data[(i + front) % data.length]);
            if (i != size - 1)
                res.append(", ");
        }
        res.append("] tail");
        return res.toString();
    }
}
