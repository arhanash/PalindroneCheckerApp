import java.util.*;

class PalindromeChecker {

    // Method to check palindrome
    public boolean checkPalindrome(String input) {

        // Normalize string
        String str = input.replaceAll("\\s+", "").toLowerCase();

        Stack<Character> stack = new Stack<>();

        // Push characters into stack
        for (int i = 0; i < str.length(); i++) {
            stack.push(str.charAt(i));
        }

        // Build reversed string
        String reversed = "";

        while (!stack.isEmpty()) {
            reversed += stack.pop();
        }

        // Compare original and reversed
        return str.equals(reversed);
    }
}

public class UseCase11PalindromeCheckerApp {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a string: ");
        String input = sc.nextLine();

        PalindromeChecker checker = new PalindromeChecker();

        boolean result = checker.checkPalindrome(input);

        if (result) {
            System.out.println("The given string is a Palindrome.");
        } else {
            System.out.println("The given string is NOT a Palindrome.");
        }

        sc.close();
    }
}