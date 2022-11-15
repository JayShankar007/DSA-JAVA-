import javax.swing.*;
import java.util.*;
public class removeduplicate {
    public static void main(String[] args) {
        int[] arr={1,2,3,4,5,6};
        int n=arr.length;

        duplicate(arr,n);
    }
    static void duplicate(int[] arr, int n) {
        Arrays.sort(arr);
        int f=0;
        for (int i = 0; i < n - 1; i++) {
            if (arr[i] == arr[i + 1])
                f=1;
        }
        if(f==1)
            System.out.println("duplicate array");
            else
            System.out.println("not duplicate array");

    }
    }

