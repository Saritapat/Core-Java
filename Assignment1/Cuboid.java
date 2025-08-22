import java.util.Scanner;

public class Cuboid{
	public static void main(String [] args){

	Scanner sc = new Scanner(System.in);

	System.out.println("Enter length: ");
	double l = sc.nextDouble();

	System.out.println("Enter breadth: ");
	double b = sc.nextDouble();

	System.out.println("Enter height: ");
	double h = sc.nextDouble();

	double surfaceArea = 2 * (l * b + l * h + b * h);
	double volume = l * b * h;

	System.out.println("SurfaceArea = " +surfaceArea);
	System.out.println("Volume = " + volume);


	}
}
