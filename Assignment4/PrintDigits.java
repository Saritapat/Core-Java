import java.util.Scanner;

public class PrintDigits {
    public static void main(String[] args) 
       {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = sc.nextInt();

        System.out.println("Digits:");
        while (num > 0) 
	{
            int digit = num % 10;
            System.out.println(digit);
            num = num / 10;
        }
    }
}
