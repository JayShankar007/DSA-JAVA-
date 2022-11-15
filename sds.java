public class sds {
    public static void main(String[] args) {
        int[] a= new int[10];
        a= new int[]{1, 1, 1, 2, 2, 2, 2, 3, 4};
        int l=0;
        int t=4;
        int start=0;
        int h=a.length-1;
        while(l<=h){
            int m=l+(h-l)/2;
            if(a[m]==t){

                if(a[m-1]==t) {
                    h = m;
                    start=m-1;
                    continue;
                }
                else{
                    System.out.println(m);
                    break;
                }

//                else{
//                    start=m;
//                    System.out.println(m);
//               }
            }
            else if(a[m]<t){
                l=m;
            }
            else
                h=m;
            System.out.println(start);
            break;
        }

    }
        }
