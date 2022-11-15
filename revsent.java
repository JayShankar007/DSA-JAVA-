import java.util.Scanner;

public class revsent {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String[] str="I Love Programming".split(" ");
        String ans="";
        for(int i=str.length-1;i>=0;i--){
            ans=ans+str[i]+" ";
        }
        System.out.println(ans.trim());
    }
}
