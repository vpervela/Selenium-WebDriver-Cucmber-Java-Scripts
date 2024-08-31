package support;

import java.util.HashMap;

public class ifStatements {
    public static void main(String[] args){
        int age = 16;

        daClub(age);
        daClub(18);
        daClub(21);
        carRater("Ford");
        carRater("Nissan");
        carRater("Tesla");
        carRater("Honda");
    }
    public static void daClub(int age){
        if(age<18){
            System.out.println("You are not allowed to the club.Comeback when you are above 18");
        }else if(age >= 18 && age<21){
            System.out.println("No drinks for you");
        }
        else{
            System.out.println("Welcome to the club");
        }
    }
    public static void carRater(String carMake){
        switch (carMake){
            case "Ford":
                System.out.println("You might like trucks");
                break;
            case "Nissan":
                System.out.println("You might like trucks");
                break;
            case "Tesla":
                System.out.println("You really like cybertrucks");
                break;
            default:
                System.out.println("cannot find your favorite carMake");
        }
    }
}
