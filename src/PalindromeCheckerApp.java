public class PalindromeCheckerApp {

    public static void main(String[] args) {

        // UC5 — Stack Based Palindrome
        String wordUC5 = "radar";

        java.util.Stack<Character> stack = new java.util.Stack<>();

// Push characters
        for (int i = 0; i < wordUC5.length(); i++) {
            stack.push(wordUC5.charAt(i));
        }

// Build reversed word using stack
        String reversed = "";

        while (!stack.isEmpty()) {
            reversed += stack.pop();
        }

// Compare
        if (wordUC5.equals(reversed)) {
            System.out.println(wordUC5 + " is a Palindrome (Stack Method)");
        } else {
            System.out.println(wordUC5 + " is NOT a Palindrome (Stack Method)");
        }

}