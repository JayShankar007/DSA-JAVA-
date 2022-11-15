import java.util.*;
public class findoccuranceofchar {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("enter any string:\n");
        String str=sc.nextLine();
        char search='a';
        int count=0;
        for(int i=0;i<str.length();i++){
            if(str.charAt(i)==search)
                count ++;
        }
        System.out.println(count);
    }
}
