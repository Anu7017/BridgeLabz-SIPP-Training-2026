package SortingAlgorithms;


import java.util.Arrays;

public class CoutingSort {
    public static int[] countingSort(int[] arr) {
        int n = arr.length;
        if (n == 0) return arr;
        int[] output = new int[n];
        int max = arr[0];
        for (int num : arr) {
            if (num > max) {
                max = num;
            }
        }
        int[] count = new int[max + 1];
        // freq of each element in count arr
        for (int i = 0; i < arr.length; i++) {
            count[arr[i]]++;
        }
        // prefix sum
        for (int i = 1; i < count.length; i++) {
            count[i] += count[i - 1];
        }
        for (int i = n - 1; i >= 0; i--) {
            output[count[arr[i]] - 1] = arr[i];
            count[arr[i]]--;
        }

        for (int i = 0; i < n; i++) {
            arr[i] = output[i];
        }
        return arr;
    }

    public static void main() {
        int[] arr = {3, 4, 2, 6, 7, 1, 8, 3, 9};
        System.out.print(Arrays.toString(countingSort(arr)));
    }
}
