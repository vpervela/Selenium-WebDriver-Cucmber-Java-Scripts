package support.CodingChallengesPractice;

public class SecondLargestNum {
    //method to find second largest number of array
    public static String findSecondLargestNum(int[] nums){
        if(nums.length < 2){
            return "Array must have at least 2 numbers";
        }
        int largest = Integer.MIN_VALUE;
        int secondLargest = Integer.MIN_VALUE;
        boolean hasSecondLargest = false;
        for(int num : nums){
            if(num > largest){
                secondLargest = largest;
                largest = num;
                hasSecondLargest = true;
            }else if(num > secondLargest && num < largest){
                secondLargest = num;
                hasSecondLargest = true;
            }
        }
        if(!hasSecondLargest){
            return "There is no second largest number";
        }
        return "The Second largest number is " + secondLargest;
    }

    public static void main(String[] args) {
        int[] num = {20,12,3,6,19};
        System.out.println(findSecondLargestNum(num));

    }
}
