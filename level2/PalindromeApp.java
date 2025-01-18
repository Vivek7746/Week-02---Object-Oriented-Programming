import java.util.*;

class PalindromeChecker {

    // Attribute to hold the text
    String text;

    // Constructor to assign the text
    PalindromeChecker(String text) {
        this.text = text;
    }

    // Method to check if the text is a palindrome
    boolean isPalindrome() {
        // Converting the text to lowercase and removing spaces for accurate comparison
        String processedText = text.toLowerCase().replaceAll("\\s+", "");
        int length = processedText.length();

        // Comparing characters from start and end
        for (int i = 0; i < length / 2; i++) {
            if (processedText.charAt(i) != processedText.charAt(length - i - 1)) {
                return false;
            }
        }
        return true;
    }

    // Method to display the result
    void displayResult() {
        if (isPalindrome()) {
            System.out.println("\"" + text + "\" is a palindrome.");
        } else {
            System.out.println("\"" + text + "\" is not a palindrome.");
        }
    }
}

class PalindromeApp {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        while (true) {
            // Taking input from the user
            System.out.print("Enter a text to check for palindrome (or type 'exit' to quit): ");
            String text = input.nextLine();

            // Exit condition
            if (text.equalsIgnoreCase("exit")) {
                System.out.println("Program has been successfully executed");
                break;
            }

            // Creating a PalindromeChecker object
            PalindromeChecker checker = new PalindromeChecker(text);

            // Displaying the result
            checker.displayResult();
        }

        input.close();
    }
}
