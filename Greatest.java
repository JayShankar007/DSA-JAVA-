import java.util.*;
public class Greatest {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr = {1, 2, 3, 4, 5, 25};
        minVal(arr);
    }
        public static void minVal(int arr[]){


            int minVal=arr[0];
            for (int i = 1; i <arr.length; i++) {
                if (arr[i] < minVal) {

                    minVal = arr[i];
                }

            }
            System.out.println(minVal);
        }
    }
