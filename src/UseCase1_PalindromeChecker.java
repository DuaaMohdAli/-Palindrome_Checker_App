import java.util.Scanner;
import java.util.Stack;
public class UseCase1_PalindromeChecker {
    public static void main(String[] args){
       String word = "radar";
       char[] characters = word.toCharArray();
       int left = 0;
       int right = characters.length-1;
       boolean isPalindrome = true ;
       while(left<right){
           if(characters[left]!=characters[right]){
               isPalindrome = false ;
               break;
           }
           left++;
           right--;
       }
       System.out.println("Word: " + word);
       System.out.println("Is it a Palindrome? " + isPalindrome);
    }
}
