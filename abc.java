import java.util.*;

public class abc {
    public static void grade(int marks) {
        if(marks >= 91 && marks < 100) {
            System.out.println("grade AA");
        }
        else if(marks >= 81 && marks <= 90) {
            System.out.println("grade AB");
        }
         else if(marks >= 71 && marks <= 80) {
            System.out.println("grade BB");
        }
        else if(marks >= 61 && marks <= 70) {
            System.out.println("grade BC");
        }
        else if(marks >= 51 && marks <= 60) {
            System.out.println("grade CD");
        }
       else if(marks >= 41 && marks <= 50) {
            System.out.println("grade DD");
        }

        else if(marks >= 0 && marks <= 40) {

            System.out.println("fail");
        }
        else
            System.out.println("bsdk 100 se jada marks kaun lata 69hai");

    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter a: ");
        int marks = sc.nextInt();
        grade(marks);

    }
}





