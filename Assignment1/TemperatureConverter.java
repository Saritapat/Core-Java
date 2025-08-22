import java.util.Scanner;

public class TemperatureConverter{
	public  static void main(String[] args){

	Scanner sc = new Scanner(System.in);
	
	System.out.println("Enter temperture in Fahrenheit: ");
	double F = sc.nextDouble();
	
	double C = (5.0 / 9.0)* (F - 32);
	double K = C + 273.15;

	System.out.println("Temperture in Celsius :" + C);
	System.out.println("Temperture in Kelvin:" + K);


	}
}