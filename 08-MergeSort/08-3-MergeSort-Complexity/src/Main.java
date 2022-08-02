import java.util.Arrays;

public class Main {
    private static int[] dataSize = {1000, 10000, 100000};

    public static void main(String[] args) {
        for (Integer n : dataSize) {
            System.out.println("Random Array : ");
            Integer[] data1 = ArrayGenerator.generateRandomArray(n, n);
            Integer[] data2 = Arrays.copyOf(data1, data1.length);
            Integer[] data3 = Arrays.copyOf(data1, data1.length);
            SortingHelper.sortTest("SelectionSort", data1);
            SortingHelper.sortTest("InsertionSort", data2);
            SortingHelper.sortTest("MergeSort", data3);

            System.out.println("==================================================");
        }
    }
}
