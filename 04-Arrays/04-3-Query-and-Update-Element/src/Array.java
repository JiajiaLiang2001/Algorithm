public class Array {
    private int[] data;
    private int size;

    public Array() {
        this(10);
    }

    public Array(int capacity) {
        data = new int[capacity];
        size = 0;
    }

    /**
     * Get array capacity
     *
     * @return
     */
    public int getCapacity() {
        return data.length;
    }

    /**
     * Get array size
     *
     * @return
     */
    public int getSize() {
        return size;
    }

    /**
     * Is the array empty
     *
     * @return
     */
    public boolean isEmpty() {
        return size == 0;
    }

    /**
     * Add array element
     *
     * @param index
     * @param e
     */
    public void add(int index, int e) {
        if (size == data.length)
            throw new IllegalArgumentException("Add failed. Array is full.");
        if (index < 0 || index > size)
            throw new IllegalArgumentException("Add failed. Require index >= 0 and index <= size.");
        for (int i = size - 1; i >= index; i--)
            data[i + 1] = data[i];
        data[index] = e;
        size++;
    }

    /**
     * Add an element to the end of the array
     *
     * @param e
     */
    public void addLast(int e) {
        add(size, e);
    }

    /**
     * Add an element to the array head
     *
     * @param e
     */
    public void addFirst(int e) {
        add(0, e);
    }

    /**
     * Get the element at the specified index
     *
     * @param index
     * @return
     */
    public int getElement(int index) {
        if (index < 0 || index >= size)
            throw new IllegalArgumentException("Get failed. Index is illegal.");
        return data[index];
    }

    /**
     * Modify the element at the specified index
     *
     * @param index
     * @param e
     */
    public void setElement(int index, int e) {
        if (index < 0 || index >= size)
            throw new IllegalArgumentException("Set failed. Index is illegal.");
        data[index] = e;
    }

    @Override
    public String toString() {
        StringBuilder res = new StringBuilder();
        res.append(String.format("Array: size = %d , capacity = %d\n", size, data.length));
        res.append('[');
        for (int i = 0; i < size; i++) {
            res.append(data[i]);
            if (i != size - 1)
                res.append(", ");
        }
        res.append(']');
        return res.toString();
    }
}
