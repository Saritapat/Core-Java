import java.util.Scanner;

public class Cylinder{
	public static void main(String[] args){
	Scanner sc = new Scanner(System.in);

	System.out.println("Enter redius of cylinder");
	double r = sc.nextDouble();
	System.out.println("Enter height of cylinder: ");
	double h = sc.nextDouble();

	double surfaceArea = 2 * Math.PI * r * r + 2 * Math.PI * r * h;
	double volume = Math.PI * r * r * h;

	System.out.println("Surface Area of Cylinder = " + surfaceArea);
	System.out.println("Volume of Cylinder = " + volume);

	sc.close();
    }
}

	
	
	