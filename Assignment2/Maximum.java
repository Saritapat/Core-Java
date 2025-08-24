import java.util.Scanner;

public class Maximum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Take input
        System.out.print("Enter three numbers: ");
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();

        int max1;
        if (a > b && a > c) 
         {
            max1 = a;
         }
        else if (b > c)
        {
            max1 = b;
        } 
       else 
        {
            max1 = c;
        }

        System.out.println("Maximum: " + max1);
    }
 }


       