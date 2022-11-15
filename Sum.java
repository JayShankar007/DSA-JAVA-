import java.util.Scanner;

public class Sum {
    public static void main(String[] args) {
        int[] arr=new int[10];
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter no of elements\n");
        int n=sc.nextInt();
        System.out.println("enter the elem :");
        for(int i=0;i<n;i++){
           arr[i]=sc.nextInt();
        }
        System.out.println("enter sum ");
        int s=sc.nextInt();
        int flag=0;
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                if(arr[i]+arr[j]==s){
                    System.out.println(i+" hurrey baba hurrey "+j);
                    flag=1;
                    break;
                }
            }
        }
        if(flag==0){
            System.out.println("sum not found");
        }
    }
}
