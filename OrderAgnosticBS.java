import java.util.*;
public class OrderAgnosticBS {
    public static void main(String[] args) {
        int[] arr = {11, 22, 33, 43, 51, 60, 66, 76, 78, 99};
        int target = 99;
        int ans = OrderAgnosticBS(arr, target);
        System.out.println(ans);

    }

    static int OrderAgnosticBS(int arr[], int target) {
        int start = 0;
        int end = arr.length - 1;
//        boolean isAsc;
//        if (arr[start] < arr[end]) {
//            isAsc = true;
//        } else {
//            isAsc = false;
//        }

//        while (start <= end) {
//            int mid = start + (end - start) / 2;
//            if (arr[mid] == target) {
//                return mid;
//            }
//            if (isAsc) {
//                if (target < arr[mid]) {
//                    end = mid - 1;
//                } else {
//
//                    start = mid + 1;}
//                } else {
//                    if (target > arr[mid]) {
//                        end = mid - 1;
//                    } else {
//                        start = mid + 1;
//                    }
//
//                }
//
//            }
        while (start <= end) {
            int mid = start + (end - start) / 2;
            if (arr[mid] == target) {
                return mid;
            }

            if (target >arr[mid]) {
                start = mid + 1;

            } else {

                end = mid - 1;
            }
        }

        return start;


    }
}

