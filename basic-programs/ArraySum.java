import java.util.Scanner;

public class ArraySum {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        double[] numbers = new double[10];
        double total = 0.0;
        int index = 0;

        while (true) {

            System.out.print("Enter a number: ");
            double value = sc.nextDouble();

            if (value <= 0) {
                break;
            }

            if (index == 10) {
                break;
            }

            numbers[index] = value;
            index++;
        }

        System.out.println("\nEntered numbers:");
        for (int i = 0; i < index; i++) {
            System.out.println(numbers[i]);
            total += numbers[i];
        }

        System.out.println("\nTotal sum: " + total);

    }
}