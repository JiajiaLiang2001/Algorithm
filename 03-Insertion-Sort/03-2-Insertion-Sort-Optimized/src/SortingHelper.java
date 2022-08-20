public class SortingHelper {
    private SortingHelper() {
    }

    public static <E extends Comparable<E>> boolean isSorted(E[] arr) {
        for (int i = 1; i < arr.length; i++)
            if (arr[i - 1].compareTo(arr[i]) > 0)
                return false;
        return true;
    }

    public static <E extends Comparable<E>> void sortTest(String sortName, E[] arr) {
        long startTime = System.nanoTime();
        if (sortName.equals("SelectionSort"))
            SelectionSort.sort(arr);
        else if (sortName.equals("InsertionSort1"))
            InsertionSort.sort1(arr);
        else if(sortName.equals("InsertionSort2"))
            InsertionSort.sort2(arr);
        long endTime = System.nanoTime();
        double time = (endTime - startTime) / 1000000000.0;
        if (!SortingHelper.isSorted(arr))
            throw new RuntimeException(sortName + " failed");
        System.out.println(String.format("%s , n = %d : %f s", sortName, arr.length, time));
    }
}
