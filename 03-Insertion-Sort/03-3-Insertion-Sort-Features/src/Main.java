import java.util.Arrays;

public class Main {
    private static int[] dataSize = {1000, 10000, 100000};

    public static void main(String[] args) {
        for (Integer n : dataSize) {
            System.out.println("Random Array : ");
            Integer[] data1 = ArrayGenerator.generateRandomArray(n, n);
            Integer[] data2 = Arrays.copyOf(data1, data1.length);
            SortingHelper.sortTest("SelectionSort", data1);
            SortingHelper.sortTest("InsertionSort", data2);

            System.out.println("Ordered Array : ");
            data1 = ArrayGenerator.generateOrderedArray(n);
            data2 = Arrays.copyOf(data1, data1.length);
            SortingHelper.sortTest("SelectionSort", data1);
            SortingHelper.sortTest("InsertionSort", data2);

            System.out.println("==================================================");
        }
    }
}
