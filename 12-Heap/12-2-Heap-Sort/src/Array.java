public class Array<E> {
    private E[] data;
    private int size;

    public Array() {
        this(10);
    }

    public Array(int capacity) {
        data = (E[]) new Object[capacity];
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
    public void add(int index, E e) {
        if (index < 0 || index > size)
            throw new IllegalArgumentException("Add failed. Require index >= 0 and index <= size.");
        if (size == data.length)
            resize(2 * data.length);
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
    public void addLast(E e) {
        add(size, e);
    }

    /**
     * Add an element to the beginning of array
     *
     * @param e
     */
    public void addFirst(E e) {
        add(0, e);
    }

    /**
     * Get the element at the specified index
     *
     * @param index
     * @return
     */
    public E getElement(int index) {
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
    public void setElement(int index, E e) {
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
    public boolean contains(E e) {
        for (E i : data)
            if (i.equals(e)) return true;
        return false;
    }

    /**
     * Returns the specified element index
     *
     * @param e
     * @return
     */
    public int find(E e) {
        for (int i = 0; i < size; i++)
            if (data[i].equals(e))
                return i;
        return -1;
    }

    /**
     * Remove array element
     *
     * @param index
     * @return
     */
    public E remove(int index) {
        if (index < 0 || index >= size)
            throw new IllegalArgumentException("Remove failed. Index is illegal.");
        E ret = data[index];
        for (int i = index + 1; i < data.length; i++) {
            data[i - 1] = data[i];
        }
        size--;
        data[size] = null;
        if (size == data.length / 2)
            resize(data.length / 2);
        return ret;
    }

    /**
     * Remove an element to the end of the array
     *
     * @return
     */
    public E removeLast() {
        return remove(size - 1);
    }

    /**
     * Remove an element to the beginning of array
     *
     * @return
     */
    public E removeFirst() {
        return remove(0);
    }

    /**
     * Swap two elements of an array
     *
     * @param i
     * @param j
     */
    public void swap(int i, int j) {
        if (i < 0 || i >= size || j < 0 || j >= size)
            throw new IllegalArgumentException("Index is illegal.");
        E t = data[i];
        data[i] = data[j];
        data[j] = t;
    }

    /**
     * Redefine array size
     *
     * @param newCapacity
     */
    private void resize(int newCapacity) {
        E[] newData = (E[]) new Object[newCapacity];
        for (int i = 0; i < size; i++)
            newData[i] = data[i];
        data = newData;
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
