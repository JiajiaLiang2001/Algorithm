import java.util.Arrays;

public class MergeSort {
    private static final int K = 15;

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
        merge1(arr, l, mid, r);
    }

    public static <E extends Comparable<E>> void sort2(E[] arr) {
        E[] temp = Arrays.copyOf(arr, arr.length);// 3.Temporary storage array
        sort2(arr, 0, arr.length - 1, temp);
    }

    private static <E extends Comparable<E>> void sort2(E[] arr, int l, int r, E[] temp) {
        if (r - l <= K) {
            InsertionSort.sort(arr, l, r);// 2.Insertion sort for small arrays
            return;
        }
        int mid = l + (r - l) / 2;
        sort2(arr, l, mid, temp);
        sort2(arr, mid + 1, r, temp);
        if (arr[mid].compareTo(arr[mid + 1]) > 0)// 1.The previous array interval is less than the next array interval : arr[mid] < arr[mid + 1]
            merge2(arr, l, mid, r, temp);
    }

    private static <E extends Comparable<E>> void merge1(E[] arr, int l, int mid, int r) {
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

    private static <E extends Comparable<E>> void merge2(E[] arr, int l, int mid, int r, E[] temp) {
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
