public class HeapSort {
    private HeapSort() {
    }

    public static <E extends Comparable<E>> void sort1(E[] data) {

        MaxHeap<E> maxHeap = new MaxHeap<>();
        for (E e : data)
            maxHeap.add(e);

        for (int i = data.length - 1; i >= 0; i--)
            data[i] = maxHeap.extractMax();
    }

    public static <E extends Comparable<E>> void sort2(E[] data) {
        if (data.length <= 1) return;
        for (int i = (data.length - 1 - 1) / 2; i >= 0; i--)
            siftDown(data, i, data.length);
        for (int i = data.length - 1; i >= 0; i--) {
            swap(data, 0, i);
            siftDown(data, 0, i);
        }
    }

    private static <E extends Comparable<E>> void siftDown(E[] data, int k, int n) {
        while (2 * k + 1 < n) {
            int leftChildIndex = 2 * k + 1;
            int rightChildIndex = 2 * (k + 1);
            int maxChildIndex = leftChildIndex;
            if (rightChildIndex < n && data[rightChildIndex].compareTo(data[leftChildIndex]) > 0) // Right child > left child
                maxChildIndex = rightChildIndex;
            if (data[k].compareTo(data[maxChildIndex]) >= 0) break;
            swap(data, k, maxChildIndex);
            k = maxChildIndex;
        }
    }

    private static <E> void swap(E[] arr, int i, int j) {
        if (i < 0 || i >= arr.length || j < 0 || j >= arr.length)
            throw new IllegalArgumentException("Index is illegal.");
        E t = arr[i];
        arr[i] = arr[j];
        arr[j] = t;
    }
}
