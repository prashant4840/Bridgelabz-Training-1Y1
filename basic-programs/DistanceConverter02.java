import java.util.Scanner;

public class DistanceConverter02 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);


        System.out.print("Enter distance in feet: ");
        double distanceInFeet = scanner.nextDouble();


        double distanceInYards = distanceInFeet / 3;
        double distanceInMiles = distanceInYards / 1760;

        
        System.out.println("Distance in feet is " + distanceInFeet);
        System.out.println("Distance in yards is " + distanceInYards);
        System.out.println("Distance in miles is " + distanceInMiles);

        scanner.close();
    }
    
}