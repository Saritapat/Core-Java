import java.util.Scanner;

  public class Swapping{
    public static void main(String[] args){
      Scanner sc = new Scanner(System.in);

     System.out.print("Enter first number (p):");
     int p = sc.nextInt();
     System.out.print("Enter second number (q):");
     int q = sc.nextInt();

     System.out.println("Before numbers: p = " + p + ", q = " + q);

     int temp = p;
     p = q;
     q = temp;
     System.out.println("\nAfter numbers: p = " + p + " , q = " + q);

    System.out.println("\nEnter first number: ");
    p = sc.nextInt();
    System.out.println("\nEnter second number: ");
    q = sc.nextInt();

    p = p + q;
    q = p - q;
    p = p - q;
    System.out.println("\nBefore numbers : p = " + q + " , q = " + q);

    System.out.print("\nEnter first number: ");
    p = sc.nextInt();
    System.out.print("\nEnter second number: ");
    q = sc.nextInt();

    
    p = p * q;
    p = p / q;
    p = p / q;
    System.out.println("\nAfter numbers : q = " + q + " , q = " + q);

  }
}













    
