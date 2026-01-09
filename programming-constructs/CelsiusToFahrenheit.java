import java.util.Scanner;

public class CelsiusToFahrenheit {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input temperature in Celsius
        System.out.print("Enter temperature in Celsius: ");
        double celsius = scanner.nextDouble();

        // Convert to Fahrenheit
        double fahrenheit = (celsius * 9.0 / 5.0) + 32;

        // Output result
        System.out.println("Temperature in Fahrenheit: " + fahrenheit);

        scanner.close();
    }
}