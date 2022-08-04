public class SelectionSort {
    private SelectionSort() {
    }

    public static <E extends Comparable<E>> void sort(E[] arr) {

        for (int i = 0; i < arr.length - 1; i++) {//i < arr.length
            int minIndex = i;
            for (int j = i; j < arr.length; j++) {
                if (arr[j].compareTo(arr[minIndex]) < 0)
                    minIndex = j;
            }
            swap(arr, i, minIndex);
        }
    }

    private static <E> void swap(E[] arr, int i, int j) {

        E t = arr[i];
        arr[i] = arr[j];
        arr[j] = t;
    }
}
