import java.util.Random;

public class QuickSort {
    private QuickSort() {
    }

    public static <E extends Comparable<E>> void sort(E[] arr) {
        Random rnd = new Random();
        sort(arr, 0, arr.length - 1, rnd);
    }

    public static <E extends Comparable<E>> void sort2ways(E[] arr) {
        Random rnd = new Random();
        sort2ways(arr, 0, arr.length - 1, rnd);
    }

    private static <E extends Comparable<E>> void sort(E[] arr, int l, int r, Random rnd) {
        if (l >= r) return;
        int p = partition(arr, l, r, rnd);
        sort(arr, l, p - 1, rnd);
        sort(arr, p + 1, r, rnd);
    }

    private static <E extends Comparable<E>> void sort2ways(E[] arr, int l, int r, Random rnd) {
        if (l >= r) return;
        int p = partition2ways(arr, l, r, rnd);
        sort2ways(arr, l, p - 1, rnd);
        sort2ways(arr, p + 1, r, rnd);
    }


    private static <E extends Comparable<E>> int partition(E[] arr, int l, int r, Random rnd) {
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

    private static <E extends Comparable<E>> int partition2ways(E[] arr, int l, int r, Random rnd) {
        int p = l + rnd.nextInt(r - l + 1);
        swap(arr, l, p);
        // arr[l+1...i-1] <= v; arr[j+1...r] >= v
        int i = l + 1, j = r;
        while (true) {
            while (i <= j && arr[i].compareTo(arr[l]) < 0)
                i++;
            while (j >= i && arr[j].compareTo(arr[l]) > 0)
                j--;
            if (i >= j) break;
            swap(arr, i++, j--);
        }
        swap(arr, l, j);
        return j;
    }

    private static <E> void swap(E[] arr, int i, int j) {
        E t = arr[i];
        arr[i] = arr[j];
        arr[j] = t;
    }
}
