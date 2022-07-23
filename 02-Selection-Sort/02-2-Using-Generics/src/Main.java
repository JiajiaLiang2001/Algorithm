public class Main {
    public static void main(String[] args) {
        Integer[] arr = {6, 4, 2, 3, 1, 5};
        SelectionSort.sort(arr);
        for (Integer e : arr)
            System.out.print(e + " ");
        System.out.println();
    }
}
