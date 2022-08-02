import java.util.Arrays;

public class MergeSort {
    private MergeSort() {
    }

    public static <E extends Comparable<E>> void sort1(E[] arr) {
        sort1(arr, 0, arr.length - 1);
    }

    private static <E extends Comparable<E>> void sort1(E[] arr, int l, int r) {
        if (l >= r) return;
        int mid = l + (r - l) / 2;
        sort1(arr, l, mid);
        sort1(arr, mid + 1, r);
        merge(arr, l, mid, r);
    }

    public static <E extends Comparable<E>> void sort2(E[] arr) {
        sort2(arr, 0, arr.length - 1);
    }

    private static <E extends Comparable<E>> void sort2(E[] arr, int l, int r) {
        if (l >= r) return;
        int mid = l + (r - l) / 2;
        sort2(arr, l, mid);
        sort2(arr, mid + 1, r);
        if (arr[mid].compareTo(arr[mid + 1]) > 0)// arr[mid] < arr[mid + 1],
            merge(arr, l, mid, r);
    }

    private static <E extends Comparable<E>> void merge(E[] arr, int l, int mid, int r) {
        E[] temp = Arrays.copyOfRange(arr, l, r + 1);
        int i = l, j = mid + 1;
        for (int k = l; k <= r; k++) {
            if (i > mid) {
                arr[k] = temp[j - l];
                j++;
            } else if (j > r) {
                arr[k] = temp[i - l];
                i++;
            } else if (temp[i - l].compareTo(temp[j - l]) <= 0) {
                arr[k] = temp[i - l];
                i++;
            } else {
                arr[k] = temp[j - l];
                j++;
            }
        }
    }
}
