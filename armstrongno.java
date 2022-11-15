import java.util.Scanner;

public class armstrongno {

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter any number :\n");
        int number=sc.nextInt();
        int  originalNumber, remainder, result = 0;

        originalNumber = number;

        while (originalNumber != 0)
        {
            remainder = originalNumber % 10;
            result +=remainder*remainder*remainder;
            originalNumber =originalNumber/10;
        }

        if(result == number)
            System.out.println(number + " is an Armstrong number.");
        else
            System.out.println(number + " is not an Armstrong number.");
    }
}