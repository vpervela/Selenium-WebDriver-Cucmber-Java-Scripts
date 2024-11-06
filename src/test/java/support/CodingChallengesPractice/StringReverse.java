package support.CodingChallengesPractice;

public class StringReverse {
    public static String reverseString(String origStr){
        String reversedStr = "";
        //iterate through the string in reverse order
        for(int i = origStr.length()-1; i >= 0; i--){
            reversedStr += origStr.charAt(i); //append each character to the reversed string
        }
        return reversedStr;
    }

    public static void main(String[] args) {
        String str = "Hello World!";
        System.out.println("Original string: " + str);
        System.out.println("Reversed string: " + reverseString(str));
    }
}
