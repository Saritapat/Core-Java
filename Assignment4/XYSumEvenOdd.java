import java.util.Scanner;

public class XYSumEvenOdd {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter x: ");
        int x = sc.nextInt();

        System.out.print("Enter y: ");
        int y = sc.nextInt();

        int evenSum = 0, oddSum = 0;

        for (int i = x; i <= y; i++) 
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
