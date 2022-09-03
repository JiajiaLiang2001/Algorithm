import java.util.Random;

public class QuickSort {
    private QuickSort() {
    }

    public static <E extends Comparable<E>> void sort1(E[] arr) {
        sort1(arr, 0, arr.length - 1);
    }

    public static <E extends Comparable<E>> void sort2(E[] arr) {
        Random rnd = new Random();
        sort2(arr, 0, arr.length - 1, rnd);
    }

    private static <E extends Comparable<E>> void sort1(E[] arr, int l, int r) {
        if (l >= r) return;
        int p = partition1(arr, l, r);
        sort1(arr, l, p - 1);
        sort1(arr, p + 1, r);
    }

    private static <E extends Comparable<E>> int partition1(E[] arr, int l, int r) {
        int p = l + (new Random()).nextInt(r - l + 1);
        swap(arr, l, p);
        // arr[l+1...j] < v ; arr[j+1...i] >= v
        int j = l;
        for (int i = l + 1; i <= r; i++)
            if (arr[i].compareTo(arr[l]) < 0)
                swap(arr, i, ++j);
        swap(arr, l, j);
        return j;
    }

    private static <E extends Comparable<E>> void sort2(E[] arr, int l, int r, Random rnd) {
        if (l >= r) return;
        int p = partition2(arr, l, r, rnd);
        sort2(arr, l, p - 1, rnd);
        sort2(arr, p + 1, r, rnd);
    }

    private static <E extends Comparable<E>> int partition2(E[] arr, int l, int r, Random rnd) {
        int p = l + rnd.nextInt(r - l + 1);
        swap(arr, l, p);
        // arr[l+1...j] < v ; arr[j+1...i] >= v
        int j = l;
        for (int i = l + 1; i <= r; i++)
            if (arr[i].compareTo(arr[l]) < 0)
                swap(arr, i, ++j);
        swap(arr, l, j);
        return j;
    }

    private static <E> void swap(E[] arr, int i, int j) {
        E t = arr[i];
        arr[i] = arr[j];
        arr[j] = t;
    }
}
