public class Main {
    private static int[] dataSize = {1000, 10000, 100000};

    public static void main(String[] args) {
        for (Integer n : dataSize) {
            Integer[] data = ArrayGenerator.generateRandomArray(n, n);
            SortingHelper.sortTest("SelectionSort", data);
        }
    }
}
