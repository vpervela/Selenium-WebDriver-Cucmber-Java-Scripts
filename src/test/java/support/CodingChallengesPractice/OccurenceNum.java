package support.CodingChallengesPractice;

import java.util.HashMap;

public class OccurenceNum {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5, 6, 1, 8, 9, 1, 2, 3};
        HashMap<Integer,Integer> num = new HashMap<>();
        for(int i = 0; i < arr.length; i++){
            if(num.containsKey(arr[i])){
                num.put(arr[i], num.get(arr[i]) + 1);
            }else{
                num.put(arr[i], 1);
            }
        }
    }
}
