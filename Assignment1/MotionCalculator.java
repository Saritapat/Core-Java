import java.util.Scanner;

public class MotionCalculator{
	public static void main(String[] args){

	Scanner sc = new Scanner(System.in);

	System.out.println("Enter initial velocity (u): ");
	double u = sc.nextDouble();

	System.out.println("Enter acceleration (a): ");
	double a = sc.nextDouble();

	System.out.println("Enter time (t): ");
	double t = sc.nextDouble();

	double v = u + a * t;
	double s = (u * t) + (0.5 * a * t * t);

	System.out.println("Final Velocity (v) = " + v);
	System.out.println("Distance Travelled (s) = " + s);


	}
}

