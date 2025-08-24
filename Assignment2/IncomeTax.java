import java.util.Scanner;

public class IncomeTax {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter annual basic salary: ");
        double salary = sc.nextDouble();
        double tax;

        if (salary < 150000) 
        {
            tax = 0;
        }
       else if (salary <= 300000)
       {
            tax = 0.20 * salary; 
       } 
      else 
       {
            tax = 0.30 * salary; 
       }

        System.out.println("Income Tax = " + tax);

    }
}
