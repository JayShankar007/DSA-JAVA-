import java.util.*;

public class anagram {
    public static void main(String[] args) {
isanagram();
    }
    public static void isanagram(){
        String a="tac";
        char[] arr1=new char[a.length()];



        for(int i=0;i<a.length();i++){
             arr1[i]=a.charAt(i);

        }
        String b="cat";
        char[] arr2=new char[b.length()];

        for(int i=0;i<b.length();i++){
            arr2[i]=b.charAt(i);

        }
        Arrays.sort(arr1);
        Arrays.sort(arr2);

        System.out.println(Arrays.equals(arr1, arr2));

    }
}
