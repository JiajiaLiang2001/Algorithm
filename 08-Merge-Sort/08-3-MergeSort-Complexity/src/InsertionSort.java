public class InsertionSort {
    private InsertionSort() {
    }

    public static <E extends Comparable<E>> void sort(E[] arr) {
        for (int i = 1; i < arr.length; i++) {// i = 0
            E t = arr[i];
            int j;
            for (j = i; j - 1 >= 0; j--) {
                if (t.compareTo(arr[j - 1]) < 0)
                    arr[j] = arr[j - 1];
                else
                    break;
            }
            arr[j] = t;
        }
    }
}
