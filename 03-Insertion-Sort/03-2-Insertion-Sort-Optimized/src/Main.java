import java.util.Arrays;

public class Main {
    private static int[] dataSize = {1000, 10000, 100000};

    public static void main(String[] args) {
        for (Integer n : dataSize) {
            Integer[] data1 = ArrayGenerator.generateRandomArray(n, n);
            Integer[] data2 = Arrays.copyOf(data1, data1.length);
            SortingHelper.sortTest("InsertionSort1", data1);
            SortingHelper.sortTest("InsertionSort2", data2);
        }
    }
}
