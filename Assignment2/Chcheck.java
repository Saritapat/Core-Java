import java.util.Scanner;

public class Chcheck {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a character: ");
        char ch = sc.next().charAt(0);

        if (ch >= 48 && ch <= 57) 
         {  
            System.out.println(ch + " is a Digit.");
         }
       else if (ch >= 97 && ch <= 122)
        {  
            System.out.println(ch + " is a Lowercase Letter.");
        } 
       else if (ch >= 65 && ch <= 90)
       {  
            System.out.println(ch + " is an Uppercase Letter.");
       } 
      else 
      {
           System.out.println(ch + " is not a Digit or Alphabet.");
      }

    }
}
