import java.util.List;

class GenericUtils {
    public static <T extends Comparable<T>> T findMax(T[] arr) {
        T max = arr[0];
        for (T x : arr)
            if (x.compareTo(max) > 0)
                max = x;
        return max;
    }

    public static void printList(List<?> list) {
        for (Object x : list)
            System.out.println(x);
    }
}
