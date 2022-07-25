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
}
