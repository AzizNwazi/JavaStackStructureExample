import java.util.Scanner;
import java.util.Stack;

public class Main {
    public static void main(String[] args) {

        // Creating a Scanner object to read input from the console
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.print("Enter text (or 'q' to quit): ");
            String text = scanner.nextLine(); // Reading the input text from the user

            if (text.equals("q")) {
                System.out.println("Exiting the program.");
                break; // Exit the loop if user enters 'q'
            }

            // Creating a stack to store half of the characters from the input text
            Stack<Character> myStack = new Stack<Character>();

            // Pushing the first half of characters onto the stack
            for (int i = 0; i < text.length() / 2; i++) {
                myStack.push(text.charAt(i));
            }

            // Checking if the input text is a palindrome
            if (isPalindrome(text, myStack)) {
                System.out.println("This sentence is a palindrome.");
            } else {
                System.out.println("This sentence is not a palindrome.");
            }
        }
    }

    // Function to check if the given text is a palindrome
    public static boolean isPalindrome(String text, Stack<Character> myStack) {
        // Iterating over the second half of characters in the text
        for (int i = (text.length() / 2) + 1; i < text.length(); i++) {
            // Comparing each character in the second half with the character popped from the stack
            if (text.charAt(i) != myStack.pop()) {
                return false; // If characters don't match, text is not a palindrome
            }
        }
        return true; // If all characters match, text is a palindrome
    }
}
