package support.CodingChallengesPractice;

import java.util.Scanner;

public class AddElementsTargetSum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of the array: ");
        int size = sc.nextInt();
        //check the array should have atleast 2 elements
        if(size < 2) {

            System.out.println("Array should have atleast 2 elements.");
            return;
        }
        int[] arr = new int[size];
        System.out.println("Enter the elements of the array: ");
        for(int i = 0; i < size; i++) {
            arr[i] = sc.nextInt();
        }
        //input target sum
        System.out.println("Enter the target sum: ");
        int targetSum = sc.nextInt();

        //check for target sum using nested loops
        boolean found = false;
        for(int i = 0; i < size; i++){
            for(int  j = i+1; j < size; j++) {
                //compare if the sum of two elements is equal to target sum
                if(arr[i] + arr[j] == targetSum) {
                    System.out.println("True (Pair: " + arr[i] + ", " + arr[j] + ")");
                    found = true;
                   // break;
                }
            }
        }
        if(!found) {
            System.out.println("False (No pair found)");
        }

    }
}
