import java.util.Scanner;

public class Question2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a positive whole number: ");
        int number = scanner.nextInt();

        int sum = 0;
        int current = 1;

        // Accumulate total from 1 up to the target number
        while (current <= number) {
            sum += current;
            current++;
        }

        System.out.println("Sum: " + sum);
        scanner.close();
    }
}