import java.util.Scanner;

public class Question5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number;

        // Loop until user enters a number inside the valid range [1, 10]
        do {
            System.out.print("Enter a number between 1 and 10 (inclusive): ");
            number = scanner.nextInt();
        } while (number < 1 || number > 10);

        System.out.println("Valid entry: " + number);
        scanner.close();
    }
}