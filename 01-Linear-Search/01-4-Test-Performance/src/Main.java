public class Main {
    private static int[] dataSize = {100000, 1000000, 10000000};

    private static int count = 100;

    public static void main(String[] args) {
        for (int n : dataSize) {
            Integer[] data = ArrayGenerator.generateOrderedArray(n);

            long startTime = System.nanoTime();
            for (int k = 0; k < count; k++)
                LinearSearch.search(data, n);
            long endTime = System.nanoTime();

            double time = (endTime - startTime) / 1000000000.0;
            System.out.println("n = " + n + ", " + count + " runs : " + time + "s");
        }
    }
}
