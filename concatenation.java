import java.util.*;
public class concatenation {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int[] arr={0,1,2,3,4};
        int[] array={5,6,7,8,9};
        int x=arr.length;
        int y=array.length;
        int[] result=new int[x+y];
        System.arraycopy(arr, 0, result, 0, x);
        System.arraycopy(array, 0, result,x,y);
        System.out.println(Arrays.toString(result));



    }
}


//
//import java.util.*;
//public class concatenation {
//    public static void main(String[] args) {
//        Scanner sc=new Scanner(System.in);
//        int[] arr=new int[5];
//        int[] temp=new int[5];
//        int j=0;
//        for(int i=0;i<arr.length;i++){
//            temp[j]=arr[i];
//            j++;
//
//        }
//        int x=arr.length;
//        int y=temp.length;
//        int[] result=new int[x+y];
//        System.arraycopy(arr, 0, result, 0, x);
//        System.arraycopy(temp, 0, result,x,y);
//        System.out.println(Arrays.toString(result));
//
//    }
//}