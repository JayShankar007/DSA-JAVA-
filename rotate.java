import java.util.*;
public class rotate {
    public static void main(String[] args) {
     int[] nums={1,2,3,4,5,6,7,8};
     int k=3;
        rotatearray(nums,k);
        System.out.println(Arrays.toString(nums));
    }

    public static void rotatearray(int[] nums, int k) {
        k = k % nums.length;
        if(k<0){
            k=k+nums.length;
        }
        reversearray(nums, 0, nums.length - k - 1);
        reversearray(nums, nums.length - k, nums.length - 1);
        reversearray(nums, 0, nums.length - 1);
    }

    public static void reversearray(int[] nums, int start, int end) {
        while (start < end) {
            int temp = nums[start];
            nums[start] = nums[end];
            nums[end] = temp;
            start++;
            end--;
        }
    }
}