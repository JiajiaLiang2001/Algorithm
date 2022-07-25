public class InsertionSort {
    private InsertionSort() {
    }

    public static <E extends Comparable<E>> void sort1(E[] arr) {

        for (int i = 1; i < arr.length; i++) {// i = 0
            for (int j = i; j - 1 >= 0; j--) {
                if (arr[j].compareTo(arr[j - 1]) < 0)
                    swap(arr, j - 1, j);
                else break;
            }
        }
    }

    public static <E extends Comparable<E>> void sort2(E[] arr) {

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

    private static <E> void swap(E[] arr, int i, int j) {

        E t = arr[i];
        arr[i] = arr[j];
        arr[j] = t;
    }
}
