public class LinearSearch {
    private LinearSearch() {
    }

    public static int search(int[] data, int target) {
        for (int i = 0; i < data.length; i++)
            if (data[i] == target) return i;
        return -1;
    }
}
