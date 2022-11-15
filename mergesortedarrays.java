import java.util.*;
public class mergesortedarrays {
    public static void main(String[] args) {
        int[] a1 = {1, 2, 3, 4};
        int m = a1.length;
        int[] a2 = {5, 6, 7};
        int n = a2.length;

        mergearray(a1, a2, m, n);
//        System.out.println(Arrays.toString(a3));
    }

    public static void mergearray(int[] a1, int[] a2, int m, int n) {
//        int[] a3 = new int[m+n];
//        int j = 0;
        for(int i = 0; i < n; i++) {
         a1[i+n]=a2[i];

        }
        Arrays.sort(a1);
//        for(int i = 0; i < n; i++) {
//            a3[j]=a2[i];
//            j++;
//        }
        System.out.println(Arrays.toString(a1));
    }
}
