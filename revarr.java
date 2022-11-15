import java.util.*;
public class revarr {
    public static void main(String[] args) {
        int[] arr = {1, 34, 23, 53, 2, 7};

        reverset(arr);
        System.out.println(Arrays.toString(arr));
    }

    public static void reverset(int[] arr) {
        int start = 0;
        int end = arr.length - 1;
        while (start < end) {
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
            start++;
            end--;
        }
    }
}
