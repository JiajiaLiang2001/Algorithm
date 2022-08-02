public class Main {
    public static void main(String[] args) {
        Integer[] arr = {5, 3, 1, 2, 4, 7, 8, 2};
        MergeSort.sort(arr);
        for (int i = 0; i < arr.length; i++)
            System.out.print(arr[i] + " ");
    }
}
