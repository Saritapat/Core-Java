import java.util.Scanner;

public class MeanCalculator{

	public static void main(String[] args){

	Scanner sc = new Scanner(System.in);

	System.out.print("Enter First Number :");
	double a = sc.nextDouble();

	System.out.print("Enter second number:");
	double b = sc.nextDouble();

	double AM = (a + b ) / 2;
	double HM = (a * b) / (a + b);

	System.out.println("Arithmetic Mean = " + AM);
	System.out.println("Harmonic Mean = " + HM);

	}
}
