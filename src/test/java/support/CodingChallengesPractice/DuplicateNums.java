package support.CodingChallengesPractice;

public class DuplicateNums {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5, 6, 1, 8, 9, 1, 2, 3};
        for(int i = 0; i < arr.length; i++){
            for(int j = i + 1; j < arr.length; j++){
                if(arr[i] == arr[j]){
                    System.out.println("Duplicate number: " + arr[j]);
                    break;
                }
            }
        }
    }
}
