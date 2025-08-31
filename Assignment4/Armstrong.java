import java.util.Scanner;

public class Armstrong {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int num = sc.nextInt();

        int temp = num;
        int count = 0;

        int t = num;

        while (t > 0)
	 {
            count++;
            t = t / 10;
         }

        int sum = 0;

        while (num > 0) 
	   {
            int digit = num % 10;
            int power = 1;
            for (int i = 1; i <= count; i++) 
	   {
                power *= digit;
            }
            sum += power;
            num = num / 10;
            }

        if (sum == temp)
            System.out.println(temp + " is an Armstrong number");
        else
            System.out.println(temp + " is NOT an Armstrong number");
    }
}
