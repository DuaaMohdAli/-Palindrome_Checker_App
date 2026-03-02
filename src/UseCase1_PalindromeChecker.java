import java.util.Scanner;
import java.util.Stack;
public class UseCase1_PalindromeChecker {
    public static void main(String[] args){
        String word = "madam";
        boolean isPalindrome = true ;

        for(int i=0 ; i < word.length()/2 ; i++){
            if(word.charAt(i) != word.charAt(word.length()-1-i)){
                isPalindrome = false;
                break;
            }
        }

        if(isPalindrome){
            System.out.println("Is it a Palindrome ? Yes ");
        }else{
            System.out.println("Is it a Palindrome ? No") ;
        }


    }
}
