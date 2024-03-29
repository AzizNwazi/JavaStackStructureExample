
Palindrome Checker using Stack in Java

This repository contains a Java program that checks whether a given sentence is a palindrome or not using the stack data structure.

How it Works
Input: The program prompts the user to enter a text string. It then proceeds to check if the entered text is a palindrome.
Palindrome Definition: A palindrome is a word, phrase, number, or other sequences of characters that reads the same forward and backward (ignoring spaces, punctuation, and capitalization).
Stack Usage: The program uses a stack to store half of the characters from the input text. It then compares the second half of the text with the characters popped from the stack to determine if it's a palindrome.
Understanding the Code
Main Class: The Main class contains the main method where the program execution starts. It utilizes a Scanner object to read input from the console.
Stack Usage: A stack (myStack) is initialized to store half of the characters from the input text.
Palindrome Checking: The isPalindrome function checks if the given text is a palindrome by comparing the second half of characters with the characters popped from the stack.
Loop: The program continues to prompt the user for input until they enter 'q' to quit.

Running the Program
To run the program:

1.Clone the repository to your local machine.
2.Compile the Main.java file using javac Main.java.
3.Run the compiled program using java Main.
4.Follow the instructions to enter text or enter 'q' to quit.

Contribution Guidelines
Contributions to this repository are welcome. If you have any suggestions for improvements, bug fixes, or feature enhancements, feel free to open an issue or submit a pull request.
