import java.util.Scanner;

public class CircleOperation {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        
        System.out.print("Enter radius: ");
        double r = sc.nextDouble();

        
        System.out.println("\nChoose an option:");
        System.out.println("1: Area of Circle");
        System.out.println("2: Circumference of Circle");
        System.out.println("3: Volume of Sphere");

        System.out.print("Enter your choice: ");
        int choice = sc.nextInt();

        switch (choice) {
            case 1: 
                double area = Math.PI * r * r;
                System.out.println("Area of Circle = " + area);
                break;

            case 2: 
                double circumference = 2 * Math.PI * r;
                System.out.println("Circumference of Circle = " + circumference);
                break;

            case 3: 
                double volume = (4.0 / 3.0) * Math.PI * r * r * r;
                System.out.println("Volume of Sphere = " + volume);
                break;

            default:
                System.out.println("Invalid choice!");
        }

    }
}
