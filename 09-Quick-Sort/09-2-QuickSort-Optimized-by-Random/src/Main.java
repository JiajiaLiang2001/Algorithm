import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Integer[] arr1 = {5, 3, 1, 2, 4, 7, 8, 2};
        Integer[] arr2 = Arrays.copyOf(arr1, arr1.length);
        QuickSort.sort1(arr1);
        for (int i = 0; i < arr1.length; i++)
            System.out.print(arr1[i] + " ");
        System.out.println();
        QuickSort.sort2(arr2);
        for (int i = 0; i < arr1.length; i++)
            System.out.print(arr2[i] + " ");
    }
}
