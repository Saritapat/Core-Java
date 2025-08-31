import java.util.Scanner;

public class HelloN {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        
        System.out.print("Enter N times to print Hello: ");
        int N = sc.nextInt();

        for (int i = 1; i <= N; i++) {
            System.out.println("Hello");
        }

    }
}
