import java.util.Scanner;

public class palindrome {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter any number");
        int n=sc.nextInt();
        int t=n;
        int sum=0;
        while(n!=0){
            int r=n%10;
            sum=sum*10+r;
            n=n/10;
        }
        if(t==sum){
            System.out.println("palindrome number");
        }
        else
            System.out.println("not p");
    }
    }