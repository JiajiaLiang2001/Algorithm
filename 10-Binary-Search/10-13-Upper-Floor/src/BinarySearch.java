public class BinarySearch {
    private BinarySearch() {
    }

    public static <E extends Comparable<E>> int search(E[] data, E target) {
        int l = 0, r = data.length - 1;
        while (l <= r) {
            int mid = l + (r - l) / 2;
            if (data[mid].compareTo(target) == 0)
                return mid;
            if (data[mid].compareTo(target) < 0)
                l = mid + 1;
            else
                r = mid - 1;
        }
        return -1;
    }

    public static <E extends Comparable<E>> int searchR(E[] data, E target) {
        return searchR(data, 0, data.length - 1, target);
    }

    private static <E extends Comparable<E>> int searchR(E[] data, int l, int r, E target) {
        if (l > r) return -1;
        int mid = l + (r - l) / 2;
        if (data[mid].compareTo(target) == 0)
            return mid;
        if (data[mid].compareTo(target) < 0)
            return searchR(data, mid + 1, r, target);
        return searchR(data, l, mid - 1, target);
    }

    /**
     * > target, returns the minimum index
     *
     * @param data
     * @param target
     * @param <E>
     * @return
     */
    public static <E extends Comparable<E>> int upper(E[] data, E target) {
        int l = 0, r = data.length;
        while (l < r) {
            int mid = l + (r - l) / 2;
            if (data[mid].compareTo(target) <= 0)
                l = mid + 1;
            else
                r = mid;
        }
        return l;
    }

    /**
     * = target, returns the maximum index
     * > target, returns the minimum index(upper)
     *
     * @param data
     * @param target
     * @param <E>
     * @return
     */
    public static <E extends Comparable<E>> int upper_ceil(E[] data, E target) {
        int u = upper(data, target);
        if (u - 1 >= 0 && data[u - 1].compareTo(target) == 0)
            return u - 1;
        else return u;
    }

    /**
     * = target, returns the minimum index
     * > target, returns the minimum index(upper)
     *
     * @param data
     * @param target
     * @param <E>
     * @return
     */
    public static <E extends Comparable<E>> int lower_ceil(E[] data, E target) {
        int l = 0, r = data.length;
        while (l < r) {
            int mid = l + (r - l) / 2;
            if (data[mid].compareTo(target) < 0)
                l = mid + 1;
            else
                r = mid;
        }
        return l;
    }

    /**
     * < target, returns the maximum index
     *
     * @param data
     * @param target
     * @param <E>
     * @return
     */
    public static <E extends Comparable<E>> int lower(E[] data, E target) {
        int l = -1, r = data.length - 1;
        while (l < r) {
            int mid = l + (r - l + 1) / 2;// Rounded up!
            if (data[mid].compareTo(target) < 0)
                l = mid;
            else
                r = mid - 1;
        }
        return l;
    }

    /**
     * = target, returns the minimum index
     * < target, returns the maximum index(lower)
     *
     * @param data
     * @param target
     * @param <E>
     * @return
     */
    public static <E extends Comparable<E>> int lower_floor(E[] data, E target) {
        int l = lower(data, target);
        if (l + 1 <= data.length - 1 && data[l + 1].compareTo(target) == 0)
            return l + 1;
        else return l;
    }

    /**
     * = target, returns the maximum index
     * < target, returns the maximum index(lower)
     *
     * @param data
     * @param target
     * @param <E>
     * @return
     */
    public static <E extends Comparable<E>> int upper_floor(E[] data, E target) {
        int l = -1, r = data.length - 1;
        while (l < r) {
            int mid = l + (r - l + 1) / 2;
            if (data[mid].compareTo(target) <= 0)
                l = mid;
            else
                r = mid - 1;
        }
        return l;
    }
}
