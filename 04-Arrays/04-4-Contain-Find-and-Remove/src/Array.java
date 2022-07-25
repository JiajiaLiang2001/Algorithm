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
     * Add an element to the beginning of array
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

    /**
     * Check if an element exists
     *
     * @param e
     * @return
     */
    public boolean contains(int e) {
        for (int i : data) {
            if (i == e) return true;
        }
        return false;
    }

    /**
     * Returns the specified element index
     *
     * @param e
     * @return
     */
    public int find(int e) {
        for (int i = 0; i < size; i++) {
            if (data[i] == e)
                return i;
        }
        return -1;
    }

    /**
     * Remove array element
     *
     * @param index
     * @return
     */
    public int remove(int index) {
        if (index < 0 || index >= size)
            throw new IllegalArgumentException("Remove failed. Index is illegal.");
        int ret = data[index];
        for (int i = index + 1; i < data.length; i++) {
            data[i - 1] = data[i];
        }
        size--;
        return ret;
    }

    /**
     * Remove an element to the beginning of array
     * @return
     */
    public int removeLast() {
        return remove(size - 1);
    }

    /**
     * Remove an element to the end of the array
     * @return
     */
    public int removeFirst() {
        return remove(0);
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
