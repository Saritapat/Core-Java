import java.util.Scanner;

public class MultipleOperation {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        
        System.out.print("Enter first number (x): ");
        int x = sc.nextInt();

        System.out.print("Enter second number (y): ");
        int y = sc.nextInt();

        
        System.out.println("\nChoose an option:");
        System.out.println("1: Equality (Check if x is equal to y)");
        System.out.println("2: Less Than (Check if x is less than y)");
        System.out.println("3: Quotient and Remainder (x / y)");
        System.out.println("4: Range (Check if a number lies between x and y)");
        System.out.println("5: Swap (Interchange x and y)");

        System.out.print("Enter your choice: ");
        int choice = sc.nextInt();

        switch (choice) {
            case 1: 
                if (x == y)
                    System.out.println("x is equal to y");
                else
                    System.out.println("x is not equal to y");
                break;

            case 2: 
                if (x < y)
                    System.out.println("x is less than y");
                else
                    System.out.println("x is not less than y");
                break;

            case 3: 
                if (y != 0) {
                    System.out.println("Quotient = " + (x / y));
                    System.out.println("Remainder = " + (x % y));
                } else {
                    System.out.println("Error: Division by zero!");
                }
                break;

            case 4: 
                System.out.print("Enter a number to check: ");
                int num = sc.nextInt();
                if (num >= x && num <= y)
                    System.out.println(num + " lies between " + x + " and " + y);
                else
                    System.out.println(num + " does not lie between " + x + " and " + y);
                break;

            case 5: 
                int temp = x;
                x = y;
                y = temp;
                System.out.println("After swapping: x = " + x + ", y = " + y);
                break;

            default:
                System.out.println("Invalid choice!");
        }

    }
}
