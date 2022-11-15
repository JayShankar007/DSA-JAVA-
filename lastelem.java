import java.util.*;
public class lastelem {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x = 4;
//int last=0,first=0;
//int c=0;
        int[] arr = {1, 2, 4, 3, 4, 5, 4, 4, 4, 7,4,6, 7, 8};
        int n = arr.length;
        for (int i = n - 1; i >=0; i--) {
            if (arr[i] == x) {
                System.out.println(i);
                break;

            }
//                if(c==0)
//                {
//                   last=i;
//                    c=7;
//                }
////             first=i;
//            }
//
//        } System.out.println("first="+ first);
//        System.out.println("last="+ last);


        }
    }
}