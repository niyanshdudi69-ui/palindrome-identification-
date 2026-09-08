import java.util.Scanner;

public class PalindromeNumber {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        // Take input from user
        System.out.print("Enter an integer: ");
        int number = scanner.nextInt();

        // Negative numbers are not considered palindrome
        if (number < 0) {
            System.out.println(number + " is not a palindrome.");
            scanner.close();
            return;
        }

        // Store the original number
        int originalNumber = number;

        // Variable to store the reversed number
        int reverse = 0;

        // Reverse the number
        while (number != 0) {

            // Get the last digit
            int digit = number % 10;

            // Add the digit to the reversed number
            reverse = reverse * 10 + digit;

            // Remove the last digit
            number = number / 10;
        }

        // Compare original and reversed numbers
        if (originalNumber == reverse) {
            System.out.println(originalNumber + " is a palindrome.");
        } else {
            System.out.println(originalNumber + " is not a palindrome.");
        }

        scanner.close();
    }
}

