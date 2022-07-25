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
     * Add an element to the beginning of array
     *
     * @param e
     */
    public void addFirst(int e) {
        add(0, e);
    }
}
