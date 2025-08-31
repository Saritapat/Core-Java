import java.util.Scanner;

public class EvenOddXtoY {
    public static void main(String[] args) 
	{
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter x: ");
        int x = sc.nextInt();
        System.out.print("Enter y: ");
        int y = sc.nextInt();

        System.out.println("Even numbers:");
        for (int i = x; i <= y; i++) 
	{
            if (i % 2 == 0)
                System.out.print(i + " ");
        }

        System.out.println("\nOdd numbers:");
        for (int i = x; i <= y; i++) 
	{
            if (i % 2 != 0)
                System.out.print(i + " ");
        }
    }
}
