import java.util.*;
public class noofduplicate {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5, 4,7,8,1,2,3};
        int count = 0;

        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[j] == arr[i])
                    count++;

            }
        }
        System.out.println(count);
    }
}