import java.util.*;
public class Array {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
       int[] arr= {1,2,4,5,6};
       int max=arr[0];
      for(int i=1; i<arr.length; i++){
          if(arr[i]>max ){
              max=arr[i];
              continue;

      }
      else
          continue;
      }
        System.out.println(max);
    }
}
