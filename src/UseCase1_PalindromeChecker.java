import java.util.Scanner;
import java.util.Stack;

public class UseCase1_PalindromeChecker {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        Stack<Character> stack = new Stack<>();

        System.out.print("input : ");
        String str = sc.nextLine();

        // Push characters into stack
        for (int i = 0; i < str.length(); i++) {
            stack.push(str.charAt(i));
        }

        // Check palindrome
        boolean isPalindrome = true;

        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) != stack.pop()) {
                isPalindrome = false;
                break;
            }
        }

        if (isPalindrome)
            System.out.println("Is Palindrome ? true");
        else
            System.out.println("Not Palindrome ?False");

        sc.close();
    }
}