public class InsertionSort {
    private InsertionSort() {
    }

    public static <E extends Comparable<E>> void sort(E[] arr) {
        sort(arr, 0, arr.length - 1);
    }

    public static <E extends Comparable<E>> void sort(E[] arr, int l, int r) {
        for (int i = l; i <= r; i++) {
            E t = arr[i];
            int j;
            for (j = i; j - 1 >= l; j--) {
                if (t.compareTo(arr[j - 1]) < 0)
                    arr[j] = arr[j - 1];
                else
                    break;
            }
            arr[j] = t;
        }
    }
}
