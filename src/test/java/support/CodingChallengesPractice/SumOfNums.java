package support.CodingChallengesPractice;

import java.util.Scanner;

public class SumOfNums {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number to find the sum of all digits: ");
        int num = sc.nextInt();
        System.out.println("Sum of all digits is: " + sumOfDigits(num));
        sc.close();
    }

        //create method to calculate sum of all digits until sum is single digit
        public static int sumOfDigits(int num) {
            while(num >= 10) {
                int sum = 0;
                while(num > 0) {
                    sum += num % 10;
                    num /= 10;
                }
                num = sum;
            }
            return num;
        }



}
