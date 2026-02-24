public class PalindromeCheckerApp {

    public static void main(String[] args) {

        String input = "madam";
        String reverse = "";

        for(int i = input.length() - 1; i >= 0; i--) {
            reverse = reverse + input.charAt(i);
        }

        if(input.equals(reverse)) {
            System.out.println(input + " is Palindrome");
        } else {
            System.out.println(input + " is Not Palindrome");
        }
    }
}
