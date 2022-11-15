import java.util.*;
public class adduniqueelem {
    public static void main(String[] args) {
        int[] s = {1, 2, 3, 2, 4, 3};
        sumunique(s);

    }

    public static void sumunique(int[] s) {
        ArrayList<Integer> list = new ArrayList<>();
        int n=s.length;
        Arrays.sort(s);
        HashMap<Integer,Integer> hm=new HashMap<>();
        for(int i=0;i<s.length;i++){
            if(hm.containsKey(s[i])){
                hm.put(s[i],hm.get(s[i])+1);
            }else{
                hm.put(s[i],1);
            }
        }
        int sum=0;
        for(int i=0;i<s.length;i++){
            if(hm.get(s[i])==1){
                sum=sum+s[i];
            }
        }

        System.out.println(sum);


        }
    }


