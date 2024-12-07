package support.CodingChallengesPractice;

public class SentenceWordReverse {
    //create method to reverse words in a sentence
    public static String reverseWords(String sentence) {
        //split the sentence into words
        String[] words = sentence.split(" ");

        int left = 0, right = words.length - 1;

        //iterate through the words array using single loop
        while (left < right) {
            //swap the words
            String temp = words[left];
            words[left] = words[right];
            words[right] = temp;
            left++;
            right--;
        }
        //join words back to string
        return String.join(" ", words);

    }

    public static void main(String[] args) {
        String sentence = "Hello World";
        System.out.println("Original sentence: " + sentence);
        //call reverseWords method
        System.out.println("Reversed : " + reverseWords(sentence));
    }
}
