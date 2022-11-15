//import java.util.Scanner;
//
//public class prime {
//    public static void main(String[] args) {
//        Scanner sc=new Scanner(System.in);
//        System.out.println("enter any no: ");
//        int n=sc.nextInt();
//        int flag=0;
//        if(n==0 || n==1)
//            flag=1;
//        for(int i=2;i<=n/2;i++){
//            if(n%i==0){
//                flag=1;
//                break;
//            }
//
//        }
//        if(flag==0)
//            System.out.println("prime h bhai");
//        else
//            System.out.println("prime n h");
//
//
//    }
//
//    }


import java.util.Scanner;

public class prime {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter any no: ");
        int n = sc.nextInt();
        System.out.println(isPrime(n));

    }

    public static boolean isPrime(int n) {


        if (n == 0 || n == 1) {

            return false;

        }

//        if (n == 2) {
//
//            return true;
//
//        }

        for (int i = 2; i <= n / 2; i++) {

            if (n % i == 0) {

                return false;


            }

        }

      return true;

    }
}
