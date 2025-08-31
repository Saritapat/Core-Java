import java.util.Scanner;

public class XToY {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter starting number (x): ");
        int x = sc.nextInt();

        System.out.print("Enter ending number (y): ");
        int y = sc.nextInt();

        for (int i = x; i <= y; i++) {
            System.out.println(i);
        }

    }
}
