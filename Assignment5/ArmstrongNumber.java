import java.util.Scanner;

public class ArmstrongNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter n: ");
        int n = sc.nextInt();

        for(int i=1; i<=n; i++)
{
        int num = i, sum = 0, temp = num;
        int digits = String.valueOf(num).length();

        while(temp > 0)
{
        int d = temp % 10;
        sum += Math.pow(d, digits);
        temp /= 10;
}

        if(sum == num)
       System.out.println(num);
        }
    }
}
