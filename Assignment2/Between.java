import java.util.Scanner;

public class Between {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter three numbers: ");
        int first = sc.nextInt();
        int second = sc.nextInt();
        int third = sc.nextInt();

        if ((first < second && first > third) || (first < third && first > second)) 
        {
            System.out.println(first + " is between " + second + " and " + third);
        }
	 else
        {
            System.out.println(first + " is NOT between " + second + " and " + third);
        }

    }
}
