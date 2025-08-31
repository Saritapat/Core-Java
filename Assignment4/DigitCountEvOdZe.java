import java.util.Scanner;

public class DigitCountEvOdZe {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int num = sc.nextInt();

        int even = 0, odd = 0, zero = 0;

        while (num > 0) 
          {
            int digit = num % 10;
            if      (digit == 0)
                     zero++;
            else if (digit % 2 == 0)
                     even++;
            else
                    odd++;
                    num = num / 10;
         }

       	 System.out.println("Even digits = " + even);
         System.out.println("Odd digits = " + odd);
         System.out.println("Zero digits = " + zero);
    }
}
