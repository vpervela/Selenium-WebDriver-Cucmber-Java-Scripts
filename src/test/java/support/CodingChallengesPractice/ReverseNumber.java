package support.CodingChallengesPractice;

import java.util.Scanner;

public class ReverseNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number to reverse: ");
        int num = sc.nextInt();
        int reverseNum = 0;
        while (num != 0) {
            reverseNum = reverseNum * 10 + num % 10;
            num/=  10;
        }
        System.out.println("Reversed number is: " + reverseNum);
        sc.close();

    }
}
