import java.util.Scanner;

public class YoungestAndTallestArray {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // Friend names
        String[] friends = {"Amar", "Akbar", "Anthony"};

        int[] age = new int[3];
        double[] height = new double[3];

        for (int i = 0; i < 3; i++) {
            System.out.println("\nEnter details for " + friends[i]);

            System.out.print("Age: ");
            age[i] = sc.nextInt();

            System.out.print("Height: ");
            height[i] = sc.nextDouble();
        }

        int youngest = 0;
        int tallest = 0;

        for (int i = 1; i < 3; i++) {
            if (age[i] < age[youngest]) {
                youngest = i;
            }

            if (height[i] > height[tallest]) {
                tallest = i;
            }
        }

        System.out.println("\n===== Result =====");
        System.out.println("Youngest Friend: " + friends[youngest] +
                " (Age: " + age[youngest] + ")");
        System.out.println("Tallest Friend: " + friends[tallest] +
                " (Height: " + height[tallest] + ")");

    }
}