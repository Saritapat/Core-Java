import java.util.Scanner;

public class ConvertLetter {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a letter: ");
        char ch = sc.next().charAt(0);

        if (ch >= 'a' && ch <= 'z')
        {
            char upper = (char)(ch - 32);
            System.out.println("Uppercase: " + upper);
        } 
       else if (ch >= 'A' && ch <= 'Z') 
       {
            
            char lower = (char)(ch + 32);
            System.out.println("Lowercase: " + lower);
        } 
      else 
       {
            System.out.println("Not a valid alphabet letter.");
       }

    }
}
