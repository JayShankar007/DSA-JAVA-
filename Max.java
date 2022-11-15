////import java.util.*;
////public class Max {
////    public static void main(String[] args) {
////        int[] arr = {1, 34, 23, 53, 2};
////        max(arr);
////
////    }
////
////    public static void max(int[] arr) {
////        int maxVal = arr[0];
////        for (int i = 1; i < arr.length; i++) {
////            if (arr[i] > maxVal) {
////                maxVal = arr[i];
////
////            }
////        }
////        System.out.println(maxVal);
////    }
////}
//import java.util.*;
//public class Max{
//    public static void main(String[] args) {
//        int[] arr={1,2,3,4,5};
//        int target=1;
//        for(int i=0; i<arr.length;i++){
//            if(arr[i]==target){
//                System.out.println(i);
//            }
//        }
//    }
//}
import java.util.*;
public class Max {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);

        System.out.println("enter any number:\n");
        int n=sc.nextInt();
        int flag=0;
        if(n==0 || n==1)
            flag=1;
        for(int i=2;i<n/2;i++) {
            if (n % i == 0) {
                flag = 1;
            break;
            }
        }
            if(flag==0)
                System.out.println("prime");
            else
                System.out.println("not a prime");



        }
    }
