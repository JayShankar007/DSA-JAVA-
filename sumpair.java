import java.util.*;
public class sumpair {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int[] arr = {1, 2, 34, 7, 5, 6};
        System.out.println("enter the target element:\n");
        int n=sc.nextInt();
//        int target=7;
        gettargetpair(arr, n);
    }

    public static void gettargetpair(int[] arr, int n) {

       for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] + arr[j] == n)



                    System.out.println("[" + i + "," + j + "]");




            }
        }


    }
}
