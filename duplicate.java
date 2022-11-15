public class duplicate {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4,5,5};
        int n = arr.length;

//        isduplicate(arr, n);
        System.out.println(isduplicate(arr,n));
    }

    public static boolean isduplicate(int[] arr, int n) {
        int flag=0;
        for (int i = 0; i < n - 1; i++) {
            for (int j= i+1; j < n ; j++) {
                if(arr[i]==arr[j])
                    flag=1;
            }
        }
        if(flag==1)
            return true;
        return false;
//            System.out.println("True");

//        else
//            System.out.println("False");

    }
}
