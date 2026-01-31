import java.util.Scanner;

public class NumberCheckArray {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int[] numbers = new int[5];

        for (int i = 0; i < numbers.length; i++) {
            System.out.print("Enter number " + (i + 1) + ": ");
            numbers[i] = sc.nextInt();
        }

        System.out.println("\nNumber Analysis:");

        for (int i = 0; i < numbers.length; i++) {

            if (numbers[i] > 0) {
                if (numbers[i] % 2 == 0) {
                    System.out.println(numbers[i] + " is a positive even number.");
                } else {
                    System.out.println(numbers[i] + " is a positive odd number.");
                }
            } 
            else if (numbers[i] < 0) {
                System.out.println(numbers[i] + " is a negative number.");
            } 
            else {
                System.out.println(numbers[i] + " is zero.");
            }
        }

        System.out.println("\nComparison of first and last elements:");

        if (numbers[0] == numbers[numbers.length - 1]) {
            System.out.println("First and last elements are equal.");
        } 
        else if (numbers[0] > numbers[numbers.length - 1]) {
            System.out.println("First element is greater than last element.");
        } 
        else {
            System.out.println("First element is less than last element.");
        }

        
    }
}