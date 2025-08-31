import java.util.Scanner;

public class SumOneToN {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter N: ");
        int n = sc.nextInt();

        int evenSum = 0, oddSum = 0;

        for (int i = 1; i <= n; i++) 
	{
            if (i % 2 == 0)
                evenSum += i;
            else
                oddSum += i;
        }

        System.out.println("Sum of even numbers = " + evenSum);
        System.out.println("Sum of odd numbers = " + oddSum);
    }
}
