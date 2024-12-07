package support.CodingChallengesPractice;

import java.util.Scanner;

public class PalindromeCheck {
    //create method to check string palindrome
    public static boolean isPalindrome(String str) {
        //remove all non-alphanumeric characters
        str = str.replaceAll("\\s+", "").toLowerCase();
        int length = str.length();
        //iterate through the string
        for (int i = 0; i < length / 2; i++) {
            //compare first and last characters, second and second last characters and so on
            if (str.charAt(i) != str.charAt(length - i - 1)) {
                return false;
            }
        }

        return true;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a string to check if it is a palindrome: ");
        String str = sc.nextLine();
        //call isPalindrome method
        if (isPalindrome(str)){
            System.out.println(str + " is a palindrome.");
        } else {
            System.out.println(str + " is not a palindrome.");
        }
    }
}
