public class SelectionSort {
    private SelectionSort() {
    }

    public static void sort(int[] arr) {

        for (int i = 0; i < arr.length - 1; i++) {//i < arr.length
            int minIndex = i;
            for (int j = i; j < arr.length; j++) {
                if (arr[j] < arr[minIndex])
                    minIndex = j;
            }
            swap(arr, i, minIndex);
        }
    }

    private static void swap(int[] arr, int i, int j) {

        int t = arr[i];
        arr[i] = arr[j];
        arr[j] = t;
    }
}
