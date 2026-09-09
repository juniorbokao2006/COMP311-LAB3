import java.util.Scanner;

public class Question6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int total = 0;
        int number;

        // Continuously prompt and accumulate until 0 is entered
        do {
            System.out.print("Enter a number (0 to stop): ");
            number = scanner.nextInt();
            total += number;
        } while (number != 0);

        System.out.println("Total: " + total);
        scanner.close();
    }
}