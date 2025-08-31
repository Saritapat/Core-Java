import java.util.Scanner;

public class Palindrome {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int num = sc.nextInt();

        int temp = num, rev = 0;

        while (num > 0) 
	{
            int digit = num % 10;
            rev = rev * 10 + digit;
            num = num / 10;
        }

        if (temp == rev)
            System.out.println(temp + " is a Palindrome number");
        else
            System.out.println(temp + " is NOT a Palindrome number");
    }
}
