package support.CodingChallengesPractice;

import java.util.Scanner;

public class FibonacciSeries {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of terms in the Fibonacci series(n): ");
        int n = sc.nextInt();
        System.out.println("Fibonacci series upto " + n + " terms:");

        int firstNum = 0, secondNum = 1;
        for(int i = 1; i <= n; i++){
            System.out.print(firstNum + " ");
            int nextNum = firstNum + secondNum;
            firstNum = secondNum;
            secondNum = nextNum;
        }
        sc.close();

    }
}
