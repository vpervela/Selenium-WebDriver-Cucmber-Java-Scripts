package support.CodingChallengesPractice;

public class CharOccurences {
    public static void main(String[] args) {
        //print  2 or more occurences
        char[] arr = {'a','b','z','a','b','w'};
        int[] res = new int[26];
        for(char c : arr){
            res[c-'a']++;
        }
        for(int i=0;i<res.length;i++){
            if(res[i]>1){
                System.out.println((char)(i+'a')+" "+res[i]);
            }
        }
    }
}
