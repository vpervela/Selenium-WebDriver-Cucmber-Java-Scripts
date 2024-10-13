package support;

import java.util.Scanner;

public class advanceAssignment {
    public static void main(String[] args) {
        //no.of counts for mississippi
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number to count word upto: ");
        int target = sc.nextInt();
        countMississippi(target);

        System.out.println();

        //choose either 'Foo' or 'Bar'
        Scanner sc1 = new Scanner(System.in);
        System.out.println("Enter word:");
        String word = sc1.next();
        chooseFooOrBar(word);

        System.out.println();

        //choose character
        Scanner sc2 = new Scanner(System.in);
        System.out.println("Enter your favorite character name from Tom and Jerry: ");
        String character = sc2.nextLine();
        chooseCharacter(character);

    }
    //count Mississippi
    public static void countMississippi(int target) {
        for(int i=1; i <= target; i++) {
            System.out.println(i + " Mississippi");

        }

    }

    //foobar method
    public static void chooseFooOrBar(String word) {
        if(word.equalsIgnoreCase("foo")) {
            System.out.println("You chose Foo! foo is FUN!");
        }else if(word.equalsIgnoreCase("bar")){
            System.out.println("You chose Bar! Bar is ok!");
        }else {
            System.out.println("Invalid input.Please choose either 'Foo' or 'Bar'.");
        }
    }

    //chooseCharacter method

    public static void chooseCharacter(String character) {
        switch(character.toLowerCase()) {

            case "tom" :
                System.out.println("Character: Tom");
                System.out.println("Tom is always chasing Jerry, but he rarely succeeds!");
                break;
            case "jerry" :
                System.out.println("Character: Jerry");
                System.out.println("Jerry is clever and always outsmarts Tom!");
                break;
            case "spike":
                System.out.println("Character: Spike");
                System.out.println("Spike is the tough bulldog who protects Jerry and dislikes Tom.");
                break;
            default:
                System.out.println("No such character found");
                break;
        }


    }

}
