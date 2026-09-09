import java.util.Scanner;

public class Question8 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a word or sentence: ");
        // Standardize input to lowercase to simplify vowel checks
        String input = scanner.nextLine().toLowerCase();

        int count = 0;
        for (int i = 0; i < input.length(); i++) {
            char ch = input.charAt(i);
            // Match against standard target vowels
            if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
                count++;
            }
        }

        System.out.println("Vowel count: " + count);
        scanner.close();
    }
}