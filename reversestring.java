//
//import java.util.*;
//public class reversestring {
//    public static void main(String[] args) {
//        Scanner sc=new Scanner(System.in);
//        System.out.println("enter any string u want to reverse : \n");
//        String str=sc.nextLine();
//        reverse(str);
//    }
//    static void reverse(String str){
//
//        int j=str.length()-1;
//
//        while(j>=0) {
//            System.out.print(str.charAt(j));
//            j--;
//        }
//
//    }
//}
import java.util.*;
public class reversestring {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = "id ataM iaJ";
        String rev="";
        for (int i = str.length() - 1; i >= 0; i--) {
            rev+=str.charAt(i);
        }
        System.out.println(rev);
    }
}