package support.CodingChallengesPractice;

import java.lang.reflect.Array;
import java.util.Arrays;

public class BubbleSort {
    public static void main(String[] args) {
        int[] arr = {5, 2, 9, 1, 5, 6};
        bubbleSort(arr);
//        for(int num : arr) {
//            System.out.print(num + " ");
//        }
    }
    public static void bubbleSort(int[] arr) {
        int n = arr.length;
        //Outer loop ensures multiple passes through the array.
        for(int i = 0; i < n-1; i++) {
            boolean swapped = false;
            //Inner loop performs comparisons and swaps for each pass
            for(int j = 0; j < n-i-1; j++) {
                if(arr[j] > arr[j+1]) {
                    //Swap
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                    swapped = true;
                }
            }
            if(!swapped){
                break;
            }
        }
        System.out.println("sorted array : " + Arrays.toString(arr));
    }
}
