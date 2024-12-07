package support.CodingChallengesPractice;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class MergeArrayRemoveDuplicate {
    public static void main(String[] args) {
        int[] arr1 = {1, 2, 3, 4, 5};
        int[] arr2 = {4, 5, 6, 7};

        //use set to store unique elements
        Set<Integer> uniqueElements = new HashSet<>();

        //Add elements from arr1 to set
        for(int num : arr1) {
            uniqueElements.add(num);
        }

        //Add elements from arr2 to set
        for(int num : arr2) {
            uniqueElements.add(num);
        }

        //convert set to array
        int[] result = new int[uniqueElements.size()];
        int index = 0;
        for(int num : uniqueElements) {
            result[index++] = num;
        }

        //print result array
        System.out.println("Result: " + Arrays.toString(result));
    }
}
