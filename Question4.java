import java.util.Scanner;

public class Question4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int choice;

        // Display menu at least once before evaluating exit condition
        do {
            System.out.println("1. Continue");
            System.out.println("2. Exit");
            System.out.print("Enter choice: ");
            choice = scanner.nextInt();
        } while (choice != 2);

        scanner.close();
    }
}