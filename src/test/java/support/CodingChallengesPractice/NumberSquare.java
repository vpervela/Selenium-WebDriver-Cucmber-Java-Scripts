package support.CodingChallengesPractice;

import java.util.Scanner;

public class NumberSquare {
    public static int square(int n){
        return n*n;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Number : ");
        int input = sc.nextInt();

        System.out.println("Square of  " + input + " is: " + square(input));
    }
}
