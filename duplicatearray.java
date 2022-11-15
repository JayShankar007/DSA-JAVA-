import java.util.*;
public class duplicatearray{
    public static void main(String[] args){
        int[] arr={1,2,3,4,5,4,2,3,1};
        int n=arr.length;
        List<Integer> list = new ArrayList<Integer>();
        int flag=0;
        int h=0;
        for(int i=0;i<n-1;i++){
            for(int j=i+1;j<n;j++){
                if((arr[j]==arr[i])){
                    flag=1;
                  h=arr[j];
                    list.add(h);
                }}}
        if(flag==1)
            System.out.println(list);
        else
            System.out.println("not d arr");
    }
}


