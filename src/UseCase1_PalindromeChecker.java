import java.util.Scanner;
import java.util.Stack;
public class UseCase1_PalindromeChecker {
    public static void main(String[] args){

        String word = "madam";
        String reversed="";

        for(int i=word.length()-1;i>=0;i--){
            reversed = reversed + word.charAt(i);
        }

        if(word.equals(reversed)){
            System.out.println("It is a Palindrome ? : True");
        }else{
            System.out.println("It is a Palindrome ? : False");
        }
    }
}
