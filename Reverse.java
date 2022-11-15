import java.util.*;
public class Reverse {
    public static void main(String[] args) {
        int[] arr = {1, 34, 23, 53, 2,7};

        reverse(arr);
        System.out.println(Arrays.toString(arr));
    }

    private static void reverse(int[] arr) {
        int start = 0;
        int end = arr.length - 1;
        while (start < end) {
           swap(arr, start, end);
            start++;
            end--;
        }
    }

    public static void swap(int[] arr, int index0, int index2) {
        int temp = arr[index0];
        arr[index0] = arr[index2];
        arr[index2] = temp;
    }

}

//import java.util.*;
//public class Reverse {
//    public static void main(String[] args) {
//
//       int[] arr={1,2,3,45};
//        reverse(arr);
//        System.out.println(Arrays.toString(arr));
//
//    }
//    public static void reverse(int[] arr, int start, int end){
//         start=0;
//        end=arr.length-1;
//        while (start < end) {
//            int temp=arr[start];
//            arr[start]=arr[end];
//            arr[end]=temp;
//            start++;
//            end--;
//        }
//    }
//}


