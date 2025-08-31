import java.util.Scanner;

public class OneToNEven {
    public static void main(String[] args)
	 {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter N: ");
        int n = sc.nextInt();

        System.out.println("Even numbers from 1 to " + n + ":");
        for (int i = 1; i <= n; i++) 
	{
            if (i % 2 == 0)
                System.out.print(i + " ");
        }
    }
}
