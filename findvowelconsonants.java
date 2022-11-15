import java.util.*;
public class findvowelconsonants {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
//        System.out.println("enter any string:\n");
//        String str=sc.nextLine();
        String str="jAyshankarisageniusguy";
        int vowels=0;
        int consonants=0;
        for(int i=0;i<str.length();i++){
            char c=str.charAt(i);
            if(c== 'a' || c=='e' || c=='i' || c=='o' || c=='u'|| c== 'A' || c=='E' || c=='I' || c=='O' || c=='U')
               vowels++;
            else
                consonants++;
        }
        System.out.println("no of vowels is" + " "+vowels + " "+" and no of consonants is"+" "+consonants);
    }
}
