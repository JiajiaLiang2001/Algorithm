public class MaxHeap<E extends Comparable<E>> {
    private Array<E> data;

    public MaxHeap() {
        data = new Array<>();
    }

    public MaxHeap(int capacity) {
        data = new Array<>(capacity);
    }

    public MaxHeap(E[] arr) {
        heapify(arr);
    }

    /**
     * Get heap size
     *
     * @return
     */
    public int size() {
        return data.getSize();
    }

    /**
     * Is the heap empty
     *
     * @return
     */
    public boolean isEmpty() {
        return data.isEmpty();
    }

    /**
     * Get node parent index
     *
     * @param index
     * @return
     */
    public int parent(int index) {
        if (index == 0)
            throw new IllegalArgumentException("Index-0 doesn't have parent.");
        return (index - 1) / 2;
    }

    /**
     * Get the index of the left child of the node
     *
     * @param index
     * @return
     */
    public int leftChild(int index) {
        return index * 2 + 1;
    }

    /**
     * Get the index of the left child of the node
     *
     * @param index
     * @return
     */
    public int rightChild(int index) {
        return (index + 1) * 2;
    }

    /**
     * Add an element to the Heap
     *
     * @param e
     */
    public void add(E e) {
        data.addLast(e);
        siftUp(data.getSize() - 1);
    }

    /**
     * Element sift UP
     *
     * @param k
     */
    private void siftUp(int k) {
        while (k > 0 && data.getElement(parent(k)).compareTo(data.getElement(k)) < 0) {
            data.swap(k, parent(k));
            k = parent(k);
        }
    }

    /**
     * View the largest element in the heap
     *
     * @return
     */
    public E findMax() {
        if (data.getSize() == 0)
            throw new IllegalArgumentException("Can not findMax when heap is empty.");
        return data.getElement(0);
    }

    /**
     * Fetch the largest element of the heap
     *
     * @return
     */
    public E extractMax() {
        E ret = findMax();
        data.swap(0, data.getSize() - 1);
        data.removeLast();
        siftDown(0);
        return ret;
    }

    /**
     * Elements sift down
     *
     * @param k
     */
    private void siftDown(int k) {
        while (leftChild(k) < data.getSize()) {
            int maxChildIndex = leftChild(k);
            if (rightChild(k) < data.getSize() && data.getElement(rightChild(k)).compareTo(data.getElement(leftChild(k))) > 0) { // Right child > left child
                maxChildIndex = rightChild(k);
            }
            if (data.getElement(k).compareTo(data.getElement(maxChildIndex)) >= 0) break;
            data.swap(k, maxChildIndex);
            k = maxChildIndex;
        }
    }

    /**
     * Remove the top element of the heap and put in the new element
     *
     * @param e
     * @return
     */
    public E replace(E e) {
        E ret = findMax();
        data.setElement(0, e);
        siftDown(0);
        return ret;
    }

    /**
     * Convert any array to a heap array
     *
     * @param arr
     */
    public void heapify(E[] arr) {
        data = new Array<>(arr);
        if (arr.length != 1)
            for (int i = parent(arr.length - 1); i >= 0; i--)
                siftDown(i);
    }
}
