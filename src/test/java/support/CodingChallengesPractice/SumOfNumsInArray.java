package support.CodingChallengesPractice;

import java.util.Scanner;

public class SumOfNumsInArray {

    //create method to sum all numbers in an array
    public static int sumNums(int[] nums){
        int sum = 0;
        for(int num : nums){
            sum+= num;
        }
        return sum;
    }
    public static void main(String[] args) {
        int[] num = {20,12,3,6,19};
        System.out.println(sumNums(num));

    }
}
