import java.util.*;
public class noelemarray {
    public static void main(String[] args) {
        int target=3;
        int count=0;
        int i=0;
        int[] arr={1,2,3,4,5,3,4,3};
        for(i=0;i<=arr.length-1;i++){
            if(arr[i]==target)
                count++;

        }
       System.out.println(i);

        System.out.println(count);
    }
}
