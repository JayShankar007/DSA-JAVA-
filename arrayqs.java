import java.util.*;
public class arrayqs {
    public static void main(String[] args) {
        int[] arr = new int[10];
        arr = new int[]{1, 2, 34, 56, 78, 90};
        int target = 91;
        int ans=binarysearch(arr,target);
        System.out.println(ans);
    }
    public static int binarysearch(int[] arr, int target){
        int start=0;
        int end=arr.length-1;
        while(start<=end){
            int mid=start+(end-start)/2;
            if(arr[mid] == target){
                return mid;
            }
            if(target>arr[mid]){
                start=mid+1;

            }
            else if(target<arr[mid]){
                end=mid-1;
            }
            else
                return mid;
        }
return -1;
    }
}
