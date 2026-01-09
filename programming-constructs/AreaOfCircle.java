import java.util.Scanner;

public class AreaOfCircle {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input radius
        System.out.print("Enter the radius of the circle: ");
        double radius = scanner.nextDouble();

        // Calculate area
        double area = Math.PI * radius * radius;

        // Output result
        System.out.println("Area of the circle: " + area);

        scanner.close();
    }
}