import java.util.Scanner;

public class Multiplication {
    public static void main(String[] args) 
{
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter n: ");
        int n = sc.nextInt();

        for(int i=1; i<=n; i++)
{
            System.out.println("Table of " + i + ":");
            for(int j=1; j<=10; j++) 
{
                System.out.println(i + " x " + j + " = " + (i*j));
}
            System.out.println();
        }
    }
}
