import java.util.Arrays;

public class MergeSort {
    private static final int K = 15;

    private MergeSort() {
    }

    public static <E extends Comparable<E>> void sortUB(E[] arr) {
        E[] temp = Arrays.copyOf(arr, arr.length);
        sort(arr, 0, arr.length - 1, temp);
    }

    private static <E extends Comparable<E>> void sort(E[] arr, int l, int r, E[] temp) {
        if (r - l <= K) {
            InsertionSort.sort(arr, l, r);
            return;
        }
        int mid = l + (r - l) / 2;
        sort(arr, l, mid, temp);
        sort(arr, mid + 1, r, temp);
        if (arr[mid].compareTo(arr[mid + 1]) > 0)
            merge(arr, l, mid, r, temp);
    }

    public static <E extends Comparable<E>> void sortBU(E[] arr) {
        int n = arr.length;
        E[] temp = Arrays.copyOf(arr, n);
        for (int size = 1; size < n; size += size) {
            // Merge [i , i + sz -1] and [i + sz , min(i + 2 * sz -1 , n - 1)]
            for (int i = 0; i + size < n; i += 2 * size) {
                int l = i, mid = i + size - 1, r = Math.min(i + 2 * size - 1, n - 1);
                merge(arr, l, mid, r, temp);
            }
        }
    }

    private static <E extends Comparable<E>> void merge(E[] arr, int l, int mid, int r, E[] temp) {
        System.arraycopy(arr, l, temp, l, r - l + 1);
        int i = l, j = mid + 1;
        for (int k = l; k <= r; k++) {
            if (i > mid)
                arr[k] = temp[j++];
            else if (j > r)
                arr[k] = temp[i++];
            else if (temp[i].compareTo(temp[j]) <= 0)
                arr[k] = temp[i++];
            else
                arr[k] = temp[j++];
        }
    }
}
