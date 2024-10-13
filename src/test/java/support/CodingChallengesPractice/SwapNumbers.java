package support.CodingChallengesPractice;

import java.util.Scanner;

public class SwapNumbers {
    public static void swapNums(){
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter First Number: ");
        int a = sc.nextInt();
        System.out.println("Enter Second Number: ");
        int b = sc.nextInt();

        if(a==0 && b==0) {
            System.out.println("Both are Zero No swapping needed");

        }else{
            int temp = a;
            a = b;
            b = temp;
        }
        System.out.println("Numbers after Swapping : a = " + a + ", b = " + b);


    }
    public static void main(String[] args) {
        swapNums();
    }
}
