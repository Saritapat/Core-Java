import java.util.Scanner;

public class PositiveNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int num = sc.nextInt();

        if (num > 0) 
            {
            System.out.println(num + " is Positive.");
         }
        else
        {
            System.out.println(num + " is Not Positive.");
        }

    }
}
