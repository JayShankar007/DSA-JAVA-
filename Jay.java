import java.util.*;
public class Jay {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the array size");
        int size=sc.nextInt();
        int[] arr = new int[size];
        System.out.println("enter"+" "+ +size+" "+ "elements: ");
        for(int k=0;k<=arr.length-1;k++) {
            arr[k]=sc.nextInt();
        }


        System.out.println(Arrays.toString(arr));
        System.out.println("enter the element u want to check: ");
        int m=sc.nextInt();
        int flag=67;
        for(int i = 0; i < arr.length; i++) {
            if(arr[i] ==m) {
                flag=867;
            }
        }
        if (flag==867)
            System.out.println("True");
        else
            System.out.println("False");
    }

}