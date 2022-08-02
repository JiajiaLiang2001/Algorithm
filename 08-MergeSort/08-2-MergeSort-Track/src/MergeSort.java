import java.util.Arrays;

public class MergeSort {
    private MergeSort() {
    }

    public static <E extends Comparable<E>> void sort(E[] arr) {
        sort(arr, 0, arr.length - 1, 0);
    }

    private static <E extends Comparable<E>> void sort(E[] arr, int l, int r, int depth) {
        String depthString = generateDepthString(depth);

        System.out.print(depthString);
        System.out.println(String.format("mergesort arr[%d, %d]", l, r));

        if (l >= r) return;
        int mid = l + (r - l) / 2;
        sort(arr, l, mid, depth);
        sort(arr, mid + 1, r, depth);

        System.out.print(depthString);
        System.out.println(String.format("merge arr[%d, %d] and arr[%d, %d]", l, mid, mid + 1, r));

        merge(arr, l, mid, r);

        System.out.print(depthString);
        System.out.print(String.format("after mergesort arr[%d, %d] :", l, r));
        for (E e : arr)
            System.out.print(e + " ");
        System.out.println();
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

    private static String generateDepthString(int depth) {
        StringBuilder res = new StringBuilder();
        for (int i = 0; i < depth; i++)
            res.append("--");
        return res.toString();
    }
}
