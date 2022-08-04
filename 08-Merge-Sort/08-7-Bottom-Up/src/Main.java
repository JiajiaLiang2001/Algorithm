import java.util.Arrays;

public class Main {
    private static int[] dataSize = {1000, 10000, 100000};

    public static void main(String[] args) {
        for (Integer n : dataSize) {
            System.out.println("Random Array : ");
            Integer[] arr1 = ArrayGenerator.generateRandomArray(n, n);
            Integer[] arr2 = Arrays.copyOf(arr1, arr1.length);
            SortingHelper.sortTest("MergeSortUB", arr1);
            SortingHelper.sortTest("MergeSortBU", arr2);

            System.out.println("Ordered Array : ");
            arr1 = ArrayGenerator.generateOrderedArray(n);
            arr2 = Arrays.copyOf(arr1, arr1.length);
            SortingHelper.sortTest("MergeSortUB", arr1);
            SortingHelper.sortTest("MergeSortBU", arr2);

            System.out.println("==================================================");
        }
    }
}
