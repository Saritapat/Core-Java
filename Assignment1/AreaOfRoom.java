import java.util.Scanner;

public class AreaOfRoom {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter room length: ");
        double length = sc.nextDouble();
        System.out.print("Enter room breadth: ");
        double breadth = sc.nextDouble();
        System.out.print("Enter room height: ");
        double height = sc.nextDouble();

        System.out.print("Enter door height: ");
        double doorHeight = sc.nextDouble();
        System.out.print("Enter door width: ");
        double doorWidth = sc.nextDouble();

        System.out.print("Enter window height: ");
        double windowHeight = sc.nextDouble();
        System.out.print("Enter window width: ");
        double windowWidth = sc.nextDouble();

        double wallArea = 2 * (h * l + h * b);
        double doorArea = doorH * doorW;
        double windowArea = windowH * windowW;

        double paintedArea = wallArea - (doorArea + 2 * windowArea);
        double roofArea = l * b;

        System.out.println("\nTotal wall area: " + wallArea);
        System.out.println( "painted area : " + paintedArea);
        System.out.println( "roof area: " + roofArea);

       
    }
}
