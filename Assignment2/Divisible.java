import java.util.Scanner;

public class Divisible {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the number: ");
        int num = sc.nextInt();

            if (num % 5 == 0) 
	    {
            if (num % 7 == 0)
	    {
                System.out.println(num + " is divisible by both 5 and 7");
            } 
           else 
            {
                System.out.println(num + " is divisible by 5 but not by 7");
            }
            } 
          else
           {
           if (num % 7 == 0) 
           {
               System.out.println(num + " is divisible by 7 but not by 5");
           } 
          else 
           {
                System.out.println(num + " is not divisible by  5 or 7");
           }
        }
    }
}
