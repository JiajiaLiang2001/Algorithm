import java.util.Arrays;

public class Main {
    private static int[] dataSize = {1000, 10000, 100000};

    public static void main(String[] args) {
        int n = dataSize[2];

        System.out.println("Random Array : ");
        Integer[] data1 = ArrayGenerator.generateRandomArray(n, n);
        Integer[] data2 = Arrays.copyOf(data1, data1.length);
        Integer[] data3 = Arrays.copyOf(data1, data1.length);
        SortingHelper.sortTest("QuickSort", data1);
        SortingHelper.sortTest("QuickSort2Ways", data2);
        SortingHelper.sortTest("QuickSort3Ways", data3);


        System.out.println("Ordered Array : ");
        data1 = ArrayGenerator.generateOrderedArray(n);
        data2 = Arrays.copyOf(data1, data1.length);
        data3 = Arrays.copyOf(data1, data1.length);
        SortingHelper.sortTest("QuickSort", data1);
        SortingHelper.sortTest("QuickSort2Ways", data2);
        SortingHelper.sortTest("QuickSort3Ways", data3);


        System.out.println("Same Value Array");
        data1 = ArrayGenerator.generateRandomArray(n, 1);
        data2 = Arrays.copyOf(data1, data1.length);
        data3 = Arrays.copyOf(data1, data1.length);
        SortingHelper.sortTest("QuickSort", data1);
        SortingHelper.sortTest("QuickSort2Ways", data2);
        SortingHelper.sortTest("QuickSort3Ways", data3);

        System.out.println("==================================================");
    }
}
