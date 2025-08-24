import java.util.Scanner;

public class PreviousNextCh {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a character: ");
        char ch = sc.next().charAt(0);

        char prev = (char)(ch - 1);
        char next = (char)(ch + 1);

        System.out.println("The previous character is " + prev);
        System.out.println("The next character is " + next);

    }
}
