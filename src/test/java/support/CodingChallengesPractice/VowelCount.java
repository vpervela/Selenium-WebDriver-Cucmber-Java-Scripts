package support.CodingChallengesPractice;

import java.util.Scanner;

public class VowelCount {
    public  static int countVowels(String str){
        int vowelCount = 0;
        for(int i = 0; i < str.length(); i++){
            char myChar = str.charAt(i);
            if(myChar == 'a' || myChar == 'e' || myChar == 'i' || myChar == 'o' || myChar == 'u'){
                vowelCount++;
            }
        }
        return vowelCount;
    }


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a string: ");
        String str = sc.nextLine();
        System.out.println("Number of vowels in the string: " + countVowels(str));

        //another way to do it
//        String vowels = "aeiou";
//        String str2 = "hello";
//        str2 = str2.toLowerCase();
//
//        int count = 0;
//        for(int i = 0; i < str2.length(); i++){
//            char myChar = str2.charAt(i);
//            String str1 = "" + myChar;
//            boolean isVowel = vowels.contains(str1);
//            if(isVowel){
//                count++;
//            }
//        }
//        System.out.println("Number of vowels in the string: " + count);
   }
}
