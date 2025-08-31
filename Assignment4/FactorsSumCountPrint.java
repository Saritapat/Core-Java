import java.util.Scanner;

public class FactorsSumCountPrint {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int num = sc.nextInt();

        int sum = 0, count = 0;
        System.out.println("Factors of " + num + ":");

        for (int i = 1; i <= num; i++) {
            if (num % i == 0) {
                System.out.print(i + " ");
                sum += i;
                count++;
            }
        }

        System.out.println("\nCount of factors = " + count);
        System.out.println("Sum of factors = " + sum);
    }
}
